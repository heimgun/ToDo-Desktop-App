import java.util.List;

public class Task {

    public int operatorID;
    public int customerID;
    public String description;
    public String status;

    static List<Task> tasks;


    public int getOperatorID() { return operatorID; }
    public int getCustomerID() { return customerID; }
    public String getDescription() { return description; }
    public String getStatus() { return status; }
    public static List<Task> getTasks() { return tasks; }

    public void setOperatorID(int operatorID) { this.operatorID = operatorID; }
    public void setCustomerID(int customerID) { this.customerID = customerID; }
    public void setDescription(String description) { this.description = description; }
    public void setStatus(String status) { this.status = status; }
    public static void setTasks(List<Task> tasks) { Task.tasks = tasks; }

    public String toString(){ return operatorID + " " + customerID + " " + description + " " + status; }
}
