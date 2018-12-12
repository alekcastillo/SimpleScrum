/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend;

/**
 *
 * @author alekc
 */
public class Task {
    private int id, priority, status;
    private String title, description;
    private User assignee;
    private static final String[] statuses = {"Defined", "In-Progress", "Completed", "Accepted"};
    
    public Task(int id, int status, int priority, String title, String description) {
        this.id = id;
        this.status = status;
        this.priority = priority;
        this.title = title;
        this.description = description;
    }
    
    public static String[] getStatuses() {
        return statuses;
    }
    
    //Setters & Getters
    
    public int getId() {
        return id;
    }
    
    public int getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return "Task{" + "id=" + id + ", priority=" + priority + ", title=" + title + ", description=" + description + ", status=" + status + ", assignee=" + assignee + '}';
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public User getAssignee() {
        return assignee;
    }

    public void setAssignee(User assignee) {
        this.assignee = assignee;
    }
}
