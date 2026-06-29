public class TaskManagementSystem {

    private Task head;

    public void addTask(Task task) {

        if (head == null) {
            head = task;
            return;
        }

        Task current = head;

        while (current.next != null) {
            current = current.next;
        }

        current.next = task;
    }

    public Task searchTask(int id) {

        Task current = head;

        while (current != null) {

            if (current.taskId == id)
                return current;

            current = current.next;
        }

        return null;
    }

    public void traverseTasks() {

        Task current = head;

        while (current != null) {
            System.out.println(current);
            current = current.next;
        }
    }

    public void deleteTask(int id) {

        if (head == null)
            return;

        if (head.taskId == id) {
            head = head.next;
            return;
        }

        Task current = head;

        while (current.next != null && current.next.taskId != id) {
            current = current.next;
        }

        if (current.next != null) {
            current.next = current.next.next;
        }
    }

    public static void main(String[] args) {

        TaskManagementSystem tms = new TaskManagementSystem();

        tms.addTask(new Task(1, "Design UI", "Pending"));
        tms.addTask(new Task(2, "Develop Backend", "In Progress"));
        tms.addTask(new Task(3, "Testing", "Pending"));

        System.out.println("Tasks:");

        tms.traverseTasks();

        System.out.println("\nSearch:");

        System.out.println(tms.searchTask(2));

        tms.deleteTask(2);

        System.out.println("\nAfter Delete:");

        tms.traverseTasks();
    }
}