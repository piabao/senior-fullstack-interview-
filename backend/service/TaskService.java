@service
public class TaskService {
    private final List<Task> tasks = new ArrayList<>();

    public Task createTask(Task task) {
        task.setId(System.currentTimeMillis());
        tasks.add(task);
        return task;
    }

    public List<Task> getAllTasks() {
        return tasks;
    }   
}