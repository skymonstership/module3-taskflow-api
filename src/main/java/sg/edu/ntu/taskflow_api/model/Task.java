package sg.edu.ntu.taskflow_api.model;
import lombok.Data;
import lombok.NoArgsConstructor;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@Data
@NoArgsConstructor
@JsonPropertyOrder({"id", "title", "description", "priority", "completed"})

public class Task {
    private Long id;
    private String title;
    private String description;
    private String priority;
    private Boolean completed;

    public Task(String title, String description,
        String priority, Boolean completed) {
        this.title = title;
        this.description = description;
        this.priority = priority;
        this.completed = completed;
    }
}