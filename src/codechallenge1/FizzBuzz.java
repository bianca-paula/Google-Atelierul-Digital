package codechallenge1;

import codechallenge3.PairOf2;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class FizzBuzz {
    public String result_StageOne() {
        String result = "Sample output for numbers from 1 to 100:\n";
        for (int index = 1; index <= 100; index++) {
            if (index % 3 == 0 && index % 5 == 0) {
                result = result.concat("FizzBuzz\n");
            } else {
                if (index % 3 == 0) {
                    result = result.concat("Fizz\n");
                } else if (index % 5 == 0) {
                    result = result.concat("Buzz\n");
                } else {
                    result = result.concat(index + "\n");
                }
            }
        }
        return result;
    }

    public String result_StageTwo() {
        String result = "Sample output for numbers from 1 to 100:\n";
        for (int index = 1; index <= 100; index++) {
            if (index % 3 == 0 && index % 5 == 0) {
                result = result.concat("FizzBuzz\n");
            } else {
                if (index % 11 == 0) {
                    result = result.concat("Jazz\n");
                } else if (index % 7 == 0) {
                    result = result.concat("Rizz\n");
                } else if (index % 3 == 0) {
                    result = result.concat("Fizz\n");
                } else if (index % 5 == 0) {
                    result = result.concat("Buzz\n");
                } else {
                    result = result.concat(index + "\n");
                }
            }
        }
        return result;
    }


    public static void main(String[] args) {
        FizzBuzz fizzBuzz = new FizzBuzz();
        System.out.println("Stage one:");
        System.out.println(fizzBuzz.result_StageOne());
        System.out.println("Stage two:");
        System.out.println(fizzBuzz.result_StageTwo());

        }
}

