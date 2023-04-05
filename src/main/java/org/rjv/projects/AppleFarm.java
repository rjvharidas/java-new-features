package org.rjv.projects;

public class AppleFarm {
    public static void main(String[] args) {


//        System.out.println("Apple Farm of, "+ getAppleFarm());

    }

//    private static String getAppleFarm(Object apple) {
//        switch (apple){
//            case Apple<HimalayanApple>(HimalayanApple apple1) -> System.out.println("");
//            case Apple<ItalianApple>(ItalianApple apple1) -> System.out.println("");
//        }
//    }

    record Apple<T>(T apple){
    }

    record HimalayanApple(String name, String place){}
    record ItalianApple(String name, String place){}
}
