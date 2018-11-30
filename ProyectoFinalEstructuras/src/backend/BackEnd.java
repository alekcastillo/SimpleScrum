package backend;

import data.JsonHandler;
import list.List;
import queue.Queue;

/**
 *
 * @author alekc
 */
public class BackEnd {

    Queue users;
    List projects;
    JsonHandler helper = new JsonHandler();

    public BackEnd() {

    }

    public void addProject() {

    }

    public void saveAll() {
        helper.save(projects);
        helper.save(users);

    }
}
