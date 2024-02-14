/* Que.1) Write a java program to read ‘N’ names of your friends, store it into HashSet and
display them in ascending order. */

import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class FriendNames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of friends (N): ");
        int n = scanner.nextInt();

        // Using TreeSet to automatically sort the names in ascending order
        TreeSet<String> friendSet = new TreeSet<>();

        // Reading and storing names in HashSet
        for (int i = 1; i <= n; i++) {
            System.out.print("Enter the name of friend " + i + ": ");
            String friendName = scanner.next();
            friendSet.add(friendName);
        }

        // Displaying names in ascending order
        System.out.println("\nFriends in ascending order:");
        for (String name : friendSet) {
            System.out.println(name);
        }

        scanner.close();
    }
}
import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class FriendNames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of friends (N): ");
        int n = scanner.nextInt();

        // Using TreeSet to automatically sort the names in ascending order
        TreeSet<String> friendSet = new TreeSet<>();

        // Reading and storing names in HashSet
        for (int i = 1; i <= n; i++) {
            System.out.print("Enter the name of friend " + i + ": ");
            String friendName = scanner.next();
            friendSet.add(friendName);
        }

        // Displaying names in ascending order
        System.out.println("\nFriends in ascending order:");
        for (String name : friendSet) {
            System.out.println(name);
        }

        scanner.close();
    }
}


// Watch Full Setup on YouTube @S2CoderZ link in the Bio.
