import java.util.ArrayList;
import java.util.Scanner;

public class ToDoListApp {
    public static void main(String[] args) {
        ArrayList<String> tasks = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n====== TO-DO LIST MENU ======");
            System.out.println("1. Add Task");
            System.out.println("2. View Tasks");
            System.out.println("3. Remove Task");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            choice = scanner.nextInt();
            scanner.nextLine();  // Clear newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter your task: ");
                    String task = scanner.nextLine();
                    tasks.add(task);
                    System.out.println("✅ Task added!");
                    break;

                case 2:
                    System.out.println("\n📋 Your Tasks:");
                    if (tasks.isEmpty()) {
                        System.out.println("No tasks yet!");
                    } else {
                        for (int i = 0; i < tasks.size(); i++) {
                            System.out.println((i + 1) + ". " + tasks.get(i));
                        }
                    }
                    break;

                case 3:
                    System.out.println("\n🗑️ Remove Task:");
                    if (tasks.isEmpty()) {
                        System.out.println("No tasks to remove.");
                    } else {
                        for (int i = 0; i < tasks.size(); i++) {
                            System.out.println((i + 1) + ". " + tasks.get(i));
                        }
                        System.out.print("Enter the task number to remove: ");
                        int removeIndex = scanner.nextInt();
                        scanner.nextLine(); // Clear newline
                        if (removeIndex >= 1 && removeIndex <= tasks.size()) {
                            tasks.remove(removeIndex - 1);
                            System.out.println("❌ Task removed.");
                        } else {
                            System.out.println("⚠️ Invalid task number.");
                        }
                    }
                    break;

                case 4:
                    System.out.println("👋 Exiting... Goodbye!");
                    break;

                default:
                    System.out.println("❗ Invalid choice. Try again.");
            }
        } while (choice != 4);
    }
}
