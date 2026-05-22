package project;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<User> userList = new ArrayList<>();
//        Set<String> user1Role = new HashSet<>(Arrays.asList("ADMIN", "USER"));
//        User user1 = new User("Jackey", true, user1Role);

        userList.add(new User("Rohit", true,
                new HashSet<>(Arrays.asList("ADMIN", "USER"))
        ));

        userList.add(new User("Ishan", true,
                new HashSet<>(Arrays.asList("USER"))
        ));

        userList.add(new User("Dhoni", false,
                new HashSet<>(Arrays.asList("Manager", "USER"))
        ));

        userList.add(new User("Vijay", false,
                new HashSet<>(Arrays.asList("ADMIN"))
        ));

        userList.add(new User("Rishabh", true,
                new HashSet<>(Arrays.asList("ADMIN"))
        ));


        // Remove inactive users:
        Iterator<User> iterator = userList.iterator();
        while (iterator.hasNext()){
            if (!iterator.next().isActive()){
                iterator.remove();
            }
        }

        // Print Active Users:
        System.out.println("ACTIVE USERS");
        for (User user : userList){
            System.out.println(user.getName() + " ");
        }

        // Count Users Per Role:
        Map<String, Integer> roleCount = new HashMap<>();
//        roleCount.getOrDefault("gsiljkns", 0);

        for (User user : userList){
            for (String role : user.getRoles()){
                roleCount.put(role, roleCount.getOrDefault(role, 0) + 1);
            }
        }

        System.out.println("Role Count");
        for (Map.Entry<String, Integer> entry : roleCount.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
