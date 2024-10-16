package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

public class Task10 {
    private Map<String, Image> imageMap = new HashMap<>();
    private TreeSet<String> imageNames = new TreeSet<>();

    public void addImage(String name, Image image) {
        String uniqueName = name;
        int suffix = 1;

        while (!imageNames.add(uniqueName)) {
            uniqueName = name + "_" + suffix;
            suffix++;
        }

        imageMap.put(uniqueName, image);
    }

    public Image searchImage(String name) {
        return imageMap.get(name);
    }
}

class Image {
    private String description;

    public Image(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Image image = (Image) o;
        return description.equals(image.description);
    }

    @Override
    public int hashCode() {
        return description.hashCode();
    }
}