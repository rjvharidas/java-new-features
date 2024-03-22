package org.rjv.projects;

public sealed abstract class TrafficLight {
    public void turnRed() {}
    public void turnYellow() {}
    public void turnGreen() {}
}

final class VerticalTrafficLight extends TrafficLight {}
final class HorizontalTrafficLight extends TrafficLight {}