package org.rjv.projects;

import java.util.Map;

import static java.util.stream.Collectors.joining;

public class TextBlock {
    public static void main(String[] args) {
        var authors =
                Map.of("Java", "Gosling", "Ruby", "Matsumoto", "JavaScript", "Eich");
        var years =
                Map.of("Java", 1995, "Ruby", 1996, "JavaScript", 1995);

        System.out.println("Output is : " + printJson(authors, years));
    }

    private static String printJson(Map<String, String> authors, Map<String, Integer> years) {
        var language = """
                {
                "language": {
                "name": "%s",
                "author": "%s",
                "year": %d
                }
                }""".indent(4);
        var childElements = authors.keySet()
                .stream()
                .sorted()
                .map(name -> language.formatted(name, authors.get(name), years.get(name)))
                .map(String::stripTrailing)
                .collect(joining("," + System.lineSeparator()));
        return """
                {
                "languages": [
                %s
                ]
                }""".formatted(childElements);
    }
}
