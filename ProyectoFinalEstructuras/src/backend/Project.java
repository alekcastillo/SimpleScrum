package backend;

import stack.Stack;

/**
 *
 * @author alekc
 */
public class Project {
    private int id;
    private String title, description;
    private Sprint backlog;
    private Stack sprints;
    
    public Project(String title, String description) {
        this.title = title;
        this.description = description;
        this.backlog = new Sprint("Backlog", title + "'s backlog");
        this.sprints = new Stack();
    }

    public void addTask(Task userStory) {
        backlog.addTask(userStory);
    }
    
    public String[] getTableRow() {
        String[] output = {title, String.valueOf(sprints.length()), "0"}; //String.valueOf(backlog.tasks.length())};
        return output;
    }
    
    //Setters & Getters
    
    public int getId() {
        return id;
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
}
