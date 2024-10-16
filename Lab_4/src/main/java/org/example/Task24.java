package org.example;

import java.util.LinkedList;

public class Task24 {
    private LinkedList<StackMember> stack;

    public Task24() {
        stack = new LinkedList<>();
    }

    public void addProgram(StackMember program) {
        int index = 0;
        while (index < stack.size() && program.getPriority() <= stack.get(index).getPriority()) {
            index++;
        }
        stack.add(index, program);
    }

    public StackMember popProgram() {
        if (!stack.isEmpty()) {
            return stack.pop();
        }
        return null;
    }

    public LinkedList<StackMember> getAllPrograms() {
        return new LinkedList<>(stack);
    }
}

class StackMember implements Comparable<StackMember> {
    private String programName;
    private int memorySize;
    private int priority;

    public StackMember(String programName, int memorySize, int priority) {
        this.programName = programName;
        this.memorySize = memorySize;
        this.priority = priority;
    }

    public String getProgramName() {
        return programName;
    }

    public int getMemorySize() {
        return memorySize;
    }

    public int getPriority() {
        return priority;
    }

    @Override
    public int compareTo(StackMember other) {
        return Integer.compare(other.priority, this.priority); // Сортування за спаданням пріоритету
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        StackMember that = (StackMember) o;

        if (memorySize != that.memorySize) return false;
        if (priority != that.priority) return false;
        return programName.equals(that.programName);
    }

    @Override
    public int hashCode() {
        int result = programName.hashCode();
        result = 31 * result + memorySize;
        result = 31 * result + priority;
        return result;
    }
}