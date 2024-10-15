package org.example;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Task24 {
    private final Set<String> javaKeywords = new HashSet<>();

    public Task24() {
        javaKeywords.add("if");
        javaKeywords.add("for");
        javaKeywords.add("while");
        javaKeywords.add("do");
        javaKeywords.add("else");
    }

    private boolean isValidIdentifier(String arg) {
        if (arg == null || arg.isEmpty()) {
            return false;
        }

        if (!Character.isLetter(arg.charAt(0)) && arg.charAt(0) != '_' && arg.charAt(0) != '$') {
            return false;
        }

        for (int i = 1; i < arg.length(); i++) {
            char c = arg.charAt(i);
            if (!Character.isLetterOrDigit(c) && c != '_' && c != '$') {
                return false;
            }
        }

        return true;
    }

    public int analyzeArguments(String input, List<String> arguments) {
        String[] args = input.trim().split("\\s+");

        for (String arg : args) {
            if (javaKeywords.contains(arg)) {
                arguments.add("Keyword");
            } else if (isValidIdentifier(arg)) {
                arguments.add("Identifier");
            } else {
                arguments.add("Illegal");
            }
        }

        return args.length;
    }
}
