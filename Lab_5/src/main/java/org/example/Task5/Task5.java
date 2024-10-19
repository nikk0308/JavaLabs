package org.example.Task5;

import java.time.LocalDateTime;
import java.util.Objects;

public class Task5 implements ITask5 {
    private String author;
    private String topic;
    private String text;
    private LocalDateTime creationTime;
    private LocalDateTime editTime;

    public Task5(String author, String topic, String text) {
        this.author = author;
        this.topic = topic;
        this.text = text;
        this.creationTime = LocalDateTime.now();
        this.editTime = creationTime;
    }

    public String getAuthor() {
        return author;
    }

    public String getTopic() {
        return topic;
    }

    public String getText() {
        return text;
    }

    public LocalDateTime getCreationTime() {
        return creationTime;
    }

    public LocalDateTime getEditTime() {
        return editTime;
    }

    public void editText(String newText) {
        this.text = newText;
        this.editTime = LocalDateTime.now();
    }

    public String getPostInfo() {
        return "Author: " + author + ", Topic: " + topic + ", Text: " + text;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Task5 that = (Task5) o;
        return Objects.equals(author, that.author) && Objects.equals(topic, that.topic)
                && Objects.equals(text, that.text) && Objects.equals(creationTime, that.creationTime)
                && Objects.equals(editTime, that.editTime);
    }
}