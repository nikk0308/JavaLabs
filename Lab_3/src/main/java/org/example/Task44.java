package org.example;

import java.util.ArrayList;
import java.util.List;

public class Task44 {
    private String determineType(String arg) {
        if (arg.matches("\\d+")) {
            return "Integer";
        } else if (arg.matches("\\d+\\.\\d+")) {
            return "Real";
        } else if (arg.matches("'[a-zA-Z]'")) {
            return "Character";
        } else if (arg.matches("\".*\"")) {
            return "String";
        } else {
            return "Identifier";
        }
    }

    public int analyzeArguments(String input, List<String> arguments) {
        List<String> args = new ArrayList<>();
        StringBuilder currentArg = new StringBuilder();
        boolean inQuotes = false;

        for (char c : input.toCharArray()) {
            if (c == '\'' || c == '\"') {
                inQuotes = !inQuotes;
            }
            currentArg.append(c);
            if (c == ' ' && !inQuotes) {
                args.add(currentArg.toString().trim());
                currentArg.setLength(0);
            }
        }
        if (currentArg.length() > 0) {
            args.add(currentArg.toString().trim());
        }

        for (String arg : args) {
            arguments.add(determineType(arg));
        }

        return args.size();
    }
}
