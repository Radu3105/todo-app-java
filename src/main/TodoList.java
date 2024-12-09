package main;

import java.util.ArrayList;
import java.util.List;

public class TodoList {
    private List<TodoItem> items;
    private int nextId;

    public TodoList() {
        items = new ArrayList<>();
        nextId = 1;
    }

    public void addItem(String title) {
        items.add(new TodoItem(nextId++, title));
    }

    public void removeItem(int id) {
    	TodoItem toRemoveTodo = items.get(id - 1);
    	if (toRemoveTodo != null) {
    		items.remove(id - 1);
    	}
    }

    public void markItemAsCompleted(int id) {
        for (TodoItem item : items) {
            if (item.getId() == id) {
                item.setCompleted(true);
                break;
            }
        }
    }

    public void showAllItems() {
        if (items.isEmpty()) {
            System.out.println("No items in the todo list.");
        } else {
            for (TodoItem item : items) {
                System.out.println(item);
            }
        }
    }
}
