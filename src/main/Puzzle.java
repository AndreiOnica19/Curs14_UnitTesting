package main;

public class Puzzle {
    public String getWaterState(int temperature) {
        if (temperature < 0) {
            return "ice";
        } else if (temperature > 0 && temperature < 100) {
            return "liquid";
        } else {
            return "gas";
        }
    }

    public String playFizzBuzz(int number) {
        if (number % 3 == 0 && number % 5 == 0) {
            return "FizzBuzz";
        } else if (number % 3 == 0) {
            return "Fizz";
        } else if (number % 5 == 0) {
            return "Buzz";
        } else {
            return String.valueOf(number);
        }
    }
}

