package backend;

/**
 *
 * @author alekc
 */
public class Project {
    private int id;
    private String title, description;
    private Sprint backlog;
    
    public Project(String title, String description) {
        this.title = title;
        this.description = description;
        this.backlog = new Sprint("Backlog", title + "'s backlog");
    }

    public void addTask(Task userStory) {
        backlog.addTask(userStory);
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
    
    //Cola sprints
}
