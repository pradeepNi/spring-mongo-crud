package com.Package.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "tasks")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Task {
     @Id
    private String taskId;
    private String description;
    private int severity;
    private String assignee;
    private int storyPoint ;

    private String helper(String key, String value, int c) {

        if(c == 0) return "{\"" + key + "\":"  + "\"" + value + "\",";
        if(c == 1) return "\"" + key + "\":"  + "\"" + value + "\",";
        if(c == 2) return "\"" + key + "\":"  + "\"" + value + "\"}";
        return  "";
    }

    private String helper(String key, int value, int c) {
        if(c == 0) return "{\"" + key + "\":"  +   value + ",";
        if(c == 1) return "\"" + key + "\":"  +   value + ",";
        if(c == 2) return "\"" + key + "\":"  +   value + "}";
        return  "";
    }
    @Override
    public String toString() {
        return  helper("taskId", this.taskId, 0) + helper("description", this.description, 1) + helper("severity", this.severity, 1) + helper("assignee", this.assignee, 1) + helper("storyPoint", this.storyPoint, 2);
    }

}
