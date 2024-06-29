import java.util.ArrayList;
import java.util.Scanner;

class Task 
{
    private String description;
    private boolean isDone;

    public Task(String description) {
        this.description = description;
        this.isDone = false;
    }

    public String getDescription() {
        return description;
    }

    public boolean isDone() {
        return isDone;
    }

    public void markAsDone() {
        isDone = true;
    }

    @Override
    public String toString() {
        return (isDone ? "[✓] " : "[ ] ") + description;
    }
}

public class ToDoList
{

    private ArrayList<Task> tasks;
    private Scanner scanner;

    public ToDoList() {
        tasks = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    public void displayMenu() {
        System.out.println("===== ToDo List Menu =====");
        System.out.println("1. Add Task");
        System.out.println("2. Mark Task as Done");
        System.out.println("3. Remove Task");
        System.out.println("4. List All Tasks");
        System.out.println("5. Exit");
        System.out.print("Choose an option: ");
    }

    public void addTask(String description) {
        tasks.add(new Task(description));
        System.out.println("Task added successfully!");
    }

    public void markTaskAsDone(int index) {
        if (index >= 0 && index < tasks.size()) {
            tasks.get(index).markAsDone();
            System.out.println("Task marked as done!");
        } else {
            System.out.println("Invalid task index.");
        }
    }

    public void removeTask(int index) {
        if (index >= 0 && index < tasks.size()) {
            tasks.remove(index);
            System.out.println("Task removed successfully!");
        } else {
            System.out.println("Invalid task index.");
        }
    }

    public void listAllTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks found.");
        } else {
            System.out.println("===== Tasks List =====");
            for (Task t: tasks) {
				int x=1;
                System.out.println(x+". "+t);
				x++;
            }
        }
    }

    public void run() {
        int choice;
        do {
            displayMenu();
			
            choice = scanner.nextInt();
            scanner.nextLine();
			
            switch (choice)
			{
                case 1:
                    System.out.print("Enter task description: ");
                    String description = scanner.nextLine();
                    addTask(description);
                    break;
                case 2:
                    System.out.print("Enter task index to mark as done: ");
                    int markIndex = scanner.nextInt() - 1;
                    markTaskAsDone(markIndex);
                    break;
                case 3:
                    System.out.print("Enter task index to remove: ");
                    int removeIndex = scanner.nextInt() - 1;
                    removeTask(removeIndex);
                    break;
                case 4:
                    listAllTasks();
                    break;
                case 5:
                    System.out.println("Exiting ToDo List. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please choose again.");
                    break;
            }
            System.out.println(); 
        } while (choice != 5);

        scanner.close();
    }

    public static void main(String[] args) {
        ToDoList todoList = new ToDoList();
        todoList.run();
    }
}
