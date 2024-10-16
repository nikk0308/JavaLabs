package org.example;

import java.util.HashMap;

public class Task30 {
    private HashMap<String, TextFile> fileMap;

    public Task30() {
        fileMap = new HashMap<>();
    }

    public void addFile(String fileName, TextFile file) {
        fileMap.put(fileName, file);
    }

    public TextFile searchFile(String fileName) {
        return fileMap.get(fileName);
    }

    public boolean deleteFile(String fileName) {
        return fileMap.remove(fileName) != null;
    }
}

class TextFile {
    private String filePath; // Абсолютний шлях до файлу
    private String description; // Опис вмісту файлу

    public TextFile(String filePath, String description) {
        this.filePath = filePath;
        this.description = description;
    }

    public String getFilePath() {
        return filePath;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TextFile textFile = (TextFile) o;

        if (!filePath.equals(textFile.filePath)) return false;
        return description.equals(textFile.description);
    }

    @Override
    public int hashCode() {
        int result = filePath.hashCode();
        result = 31 * result + description.hashCode();
        return result;
    }
}