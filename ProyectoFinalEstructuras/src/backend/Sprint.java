package backend;

import java.text.SimpleDateFormat;
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
    public Tree tasks;
    
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
    
    public static String dateToString(Date date) {
        return new SimpleDateFormat("dd-mm-yyyy").format(date);  
    }
    
    public void addTask(Task task) {
        tasks.add(task);
    }
    
    public String[] getTableRow() {
        String[] output = {title, dateToString(startDate), dateToString(endDate)}; //String.valueOf(backlog.tasks.length())};
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
