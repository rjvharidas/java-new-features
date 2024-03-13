package org.rjv.projects;

public class SwitchWithRecord {
    public static void main(String[] args) {
        System.out.println("Protein Level : "+ getProteinLevel(new Dish<>( new Cheese(), new Egg())));
    }

    private static int getProteinLevel(Dish<HighProtein> highProteinDish) {
        return switch (highProteinDish){
            case Dish<HighProtein>(Egg egg, Cheese cheese)  -> 1;
            case Dish<HighProtein>(Cheese cheese, Egg egg)  -> 2;
            default -> throw new IllegalStateException("Unexpected value: " + highProteinDish);
        };
    }
}

sealed interface HighProtein permits Egg, Cheese {}
final class Egg implements HighProtein {}
final class Cheese implements HighProtein {}

record Dish<T> (T x, T y){}