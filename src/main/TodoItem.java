package main;

public class TodoItem {
    private int id;
    private String title;
    private boolean isCompleted;

    public TodoItem(int id, String title) {
        this.id = id;
        this.title = title;
        this.isCompleted = false;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public void setCompleted(boolean completed) {
        isCompleted = completed;
    }

    @Override
    public String toString() {
        return "[" + (isCompleted ? "X" : " ") + "] " + id + ". " + title;
    }
}
