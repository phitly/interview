// identiy 
// description 
// current status
// estimated hours 

enum TaskStatus {
    NOT_STARTED,
    STARTED,
    COMPLETED
}

public class Task{
    private int id;
    private String description;
    private TaskStatus status;
    private int estHour;

    // getters and setters
    public int getId(){
    return id;
}
    public String getDescription(){
        return description;
    }
    public void setDescription(String description){
        this.description=description;
    }
    public TaskStatus getStatus(){
        return status;
    }
    public void setStatus(TaskStatus status){
        this.status=status;
    }
    public int getEstHour(){
        return estHour;
    }
    public void setEstHour(int estHour){
        this.estHour=estHour;
    }


    //methods
    // updating the description 
    public void updateDescription(String newDescription){
        this.description=newDescription;
    }
    
    // marking the task as started
    public void markAsStarted(){
        this.status = TaskStatus.STARTED;
    }
    
    // marking it as completed
    public void markAsCompleted(){
        this.status = TaskStatus.COMPLETED;
    }
    
    // adjusting the estimated hours while preventing invalids states. 
    public void updateEstHour(int newEstHour){
        if(newEstHour<0){
            System.out.println("Error: Estimated hours cannot be negative");
            return;
        }
        if(this.status == TaskStatus.COMPLETED){
            System.out.println("Error: Cannot update hours for a completed task");
            return;
        }
        this.estHour = newEstHour;
    }

}


