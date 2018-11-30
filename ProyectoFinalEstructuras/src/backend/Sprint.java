package backend;

import java.util.Date;
import tree.Tree;

/**
 *
 * @author alekc
 */
public class Sprint {
    private int id;
    private String title, description;
    private Date startDate, endDate;
    private Tree tasks;
    
    public Sprint(String title, String description) {
        this.title = title;
        this.description = description;
    }
    
    public Sprint(String title, String description, Date startDate, Date endDate) {
        this.title = title;
        this.description = description;
        this.startDate = startDate;
        this.endDate = endDate;
    }
    
    public void addTask(Task task) {
        tasks.add(task);
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

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }
}
