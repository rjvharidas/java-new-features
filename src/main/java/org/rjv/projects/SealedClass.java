package org.rjv.projects;

public class SealedClass {
    public static void printInfo(Class<? extends TrafficLight> klass) {
        System.out.println(klass.getSimpleName());
        System.out.println("Sealed?: " + klass.isSealed());
        System.out.println("Permitted subclasses:");
        var permittedSubclasses = klass.getPermittedSubclasses();
        if(permittedSubclasses != null) {
            for(var permitted: klass.getPermittedSubclasses()) {
                System.out.println(permitted);
            }
        }
    }
    public static void main(String[] args) {
        printInfo(TrafficLightFactory.createVertical().getClass());
        System.out.println("------------");
        printInfo(TrafficLightFactory.createHorizontal().getClass());
        System.out.println("------------");
        printInfo(TrafficLight.class);
    }
}
