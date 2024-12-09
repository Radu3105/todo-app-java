package main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TodoList todoList = new TodoList();
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        System.out.println("Welcome to the Todo List Application!");

        while (!exit) {
            System.out.println("\nMenu:");
            System.out.println("1. Add Todo");
            System.out.println("2. Remove Todo");
            System.out.println("3. Mark Todo as Completed");
            System.out.println("4. Show All Todos");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter the title of the new todo: ");
                    String title = scanner.nextLine();
                    todoList.addItem(title);
                    System.out.println("Todo added!");
                    break;
                case 2:
                    System.out.print("Enter the ID of the todo to remove: ");
                    int idToRemove = scanner.nextInt();
                    todoList.removeItem(idToRemove);
                    System.out.println("Todo removed!");
                    break;
                case 3:
                    System.out.print("Enter the ID of the todo to mark as completed: ");
                    int idToMark = scanner.nextInt();
                    todoList.markItemAsCompleted(idToMark);
                    System.out.println("Todo marked as completed!");
                    break;
                case 4:
                    System.out.println("Todo List:");
                    todoList.showAllItems();
                    break;
                case 5:
                    exit = true;
                    System.out.println("Exiting... Goodbye!");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
        scanner.close();
    }
}
