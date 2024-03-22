package org.rjv.projects;

public record Location(double latitude, double longitude) {
    public Location {
        if(latitude < -90 || latitude > 90 ||
                longitude < -180 || longitude > 180) {
            throw new RuntimeException("The location is out of this world");
        }
        latitude = Math.round(latitude * 100.0) / 100.0;
    }
}
