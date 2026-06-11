package ProjectDemo;

import java.util.*;

/*Build a System that:
=> Fetches users from a database (we'll mock it ).
=> Each user has Roles (unique).
We want to:
=> Remove inactive users
=> List all active users
=>Count users per role
 */

public class UserManagement {

    public static void main(String args[]) {
        List<UserDemo> users = new ArrayList<>();
        users.add(new UserDemo("deepak", true, new HashSet<>(Arrays.asList("Admin", "User"))));
        users.add(new UserDemo("Shiv", true, new HashSet<>(Arrays.asList("Co-founder", "User"))));
        users.add(new UserDemo("Saurabh", true, new HashSet<>(Arrays.asList("Manager", "User"))));
        users.add(new UserDemo("Rahul", false, new HashSet<>(Arrays.asList("CA", "User"))));
        users.add(new UserDemo("karan", false, new HashSet<>(Arrays.asList("Graphic Designer", "User"))));
        users.add(new UserDemo("Riya", true, new HashSet<>(Arrays.asList("Hr", "User"))));

        // remove inactive users
        Iterator<UserDemo> iterator = users.iterator();
        while (iterator.hasNext()) {
            if (!iterator.next().isActive()) {
                iterator.remove();

            }

        }
        // print active users
        System.out.println("Active Users :");
        for (UserDemo user : users) {
            System.out.println(user.getName());

        }

        // count Users per role

        HashMap<String, Integer> roleCount = new HashMap<>();
        for (UserDemo user : users) {
            for (String role : user.getRoles()) {
                roleCount.put(role, roleCount.getOrDefault(role, 0) + 1);

            }

        }
        for (HashMap.Entry<String, Integer> entry : roleCount.entrySet()) {
            System.out.println(entry);
        }
    }

}
