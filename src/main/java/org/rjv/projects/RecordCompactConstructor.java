package org.rjv.projects;

public class RecordCompactConstructor {
    public static void main(String[] args) {
        try {
            new Location(37.827, -222.423);
        } catch (RuntimeException ex) {
            System.out.println(ex);
        }
        var alcatraz = new Location(37.827, -122.423);
        System.out.println(alcatraz);
    }
}

