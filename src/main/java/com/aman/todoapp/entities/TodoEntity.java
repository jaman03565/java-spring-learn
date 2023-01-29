package com.aman.todoapp.entities;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.annotation.Id;

@EntityScan
public class TodoEntity {
    @Id
    private String id;
    private String title;
    private String description;

    public TodoEntity(String title, String description) {
        super();
        this.id = id;
        this.title = title;
        this.description = description;
    }

    @Override
    public String toString() {
        return "TodoEntity{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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
