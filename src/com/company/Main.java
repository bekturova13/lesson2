package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println(CheckWeather(12, 20));
        System.out.println(CheckWeather(5, 22));
        System.out.println(CheckWeather(23, 8));
        System.out.println(CheckWeather(18, 23));
        System.out.println(CheckWeather(26, 42));
    }

    public static String CheckWeather(int age, int temperature) {
        if (age > 20 && age < 45 && temperature > -20 && temperature < 30) {
            return "Можно идти гулять!";
        } else if (age < 20 && temperature > 0 && temperature < 28) {
            return "Можно идти гулять!";
        } else if (age > 45 && temperature > -10 && temperature < 25) {
            return "Можно идти гулять!";
        } else {
            return "Оставайтесь дома!";
        }}

}