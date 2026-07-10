import java.sql.*;

public class TransactionDemo {
    private static final String URL = "jdbc:mysql://localhost:3306/demo_db";
    private static final String USER = "root";
    private static final String PASSWORD = "Jack@1234";

    public static void main(String[] args) {
        try(Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);) {
            System.out.println("Connected to the database");

            // TURNED OFF AUTO COMMIT == NO AUTO SAVE
            conn.setAutoCommit(false);

            try {
                // Order, OrderItems
                // INSERT INTO ORDER
                int orderId = insertOrder(conn, 101, "Alice", 2000.00);

                // INSERT INTO ORDER ITEM
                insertOrderItem(conn, orderId, "Laptop01", 1, 2000.00);

                // MANUAL COMMIT
                conn.commit();
                System.out.println("Transaction Commited Successfully");
            }catch (Exception e){
                e.printStackTrace();
                conn.rollback();
                System.out.println("Operation rollBack Successful");
            }finally {
                conn.setAutoCommit(true);
            }

        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    private static void insertOrderItem(Connection conn, int orderId, String productName, int quantity, double price) {
        String sql = "INSERT INTO order_items (order_id, product_name, quantity, price) VALUES (?, ?, ?, ?)";
        try (PreparedStatement pStmt = conn.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS)){
            pStmt.setInt(1,orderId);
            pStmt.setString(2,productName);
            pStmt.setInt(3,quantity);
            pStmt.setDouble(4,price);
//            int x = 10/0;
            int rows = pStmt.executeUpdate();
            System.out.println("INSERTED into order_items: " + rows);

        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    private static int insertOrder(Connection conn, int customerId, String customerName, double price) {
        String sql = "INSERT INTO orders(user_id, customer_name, total_amount) VALUES (?, ?, ?)";
        try (PreparedStatement pStmt = conn.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS)){
            pStmt.setInt(1,customerId);
            pStmt.setString(2,customerName);
            pStmt.setDouble(3,price);
            int rows = pStmt.executeUpdate();
            System.out.println("INSERTED into orders: " + rows);

            try (ResultSet rs = pStmt.getGeneratedKeys()){
                if(rs.next()){
                    int orderId = rs.getInt(1);
                    System.out.println("ORDER ID: " + orderId);
                    return orderId;
                }else {
                    throw new SQLException("Order ID not generated");
                }
            }catch (SQLException e){
                throw new RuntimeException(e);
            }

        }catch (SQLException e){
            e.printStackTrace();
        }
        return -1;
    }
}
