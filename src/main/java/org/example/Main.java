package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        // shouldWakeUp testleri
        System.out.println(shouldWakeUp(true, 1));  // true
        System.out.println(shouldWakeUp(false, 2)); // false
        System.out.println(shouldWakeUp(true, 8));  // false
        System.out.println(shouldWakeUp(true, -1)); // false

        // hasTeen testleri
        System.out.println(hasTeen(9, 99, 19));    // true
        System.out.println(hasTeen(23, 15, 42));   // true
        System.out.println(hasTeen(22, 23, 34));   // false

        // isCatPlaying testleri
        System.out.println(isCatPlaying(true, 10));  // false
        System.out.println(isCatPlaying(false, 36)); // false
        System.out.println(isCatPlaying(false, 35)); // true

        // area testleri
        System.out.println(area(5.0, 4.0));  // 20.0
        System.out.println(area(-1.0, 4.0)); // -1
        System.out.println(area(5.0));       // 78.53975
        System.out.println(area(-1));        // -1
    }

    // Köpeğin havlamasını kontrol eden metod
    public static boolean shouldWakeUp(boolean isBarking, int clock) {
        if (clock < 0 || clock > 23) {
            return false;
        }
        return isBarking && (clock < 8 || clock >= 20);
    }

    // Yaş aralığını kontrol eden metod
    public static boolean hasTeen(int firstAge, int secondAge, int thirdAge) {
        return (firstAge >= 13 && firstAge <= 19) ||
                (secondAge >= 13 && secondAge <= 19) ||
                (thirdAge >= 13 && thirdAge <= 19);
    }

    // Kedinin oyun oynayıp oynamadığını kontrol eden metod
    public static boolean isCatPlaying(boolean isSummer, int temp) {
        int upperLimit = isSummer ? 45 : 35;
        return temp >= 25 && temp <= upperLimit;
    }

    // Dikdörtgenin alanını hesaplayan metod
    public static double area(double width, double height) {
        if (width < 0 || height < 0) {
            return -1;
        }
        return width * height;
    }

    // Dairenin alanını hesaplayan metod
    public static double area(double radius) {
        if (radius < 0) {
            return -1;
        }
        return radius * radius * Math.PI;
    }
}
