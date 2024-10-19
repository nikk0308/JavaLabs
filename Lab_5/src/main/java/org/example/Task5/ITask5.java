package org.example.Task5;

import java.time.LocalDateTime;

public interface ITask5 {
    public String getAuthor();
    public String getTopic();
    public String getText();
    public LocalDateTime getCreationTime();
    public LocalDateTime getEditTime();
    public void editText(String newText);
    public String getPostInfo();
}
