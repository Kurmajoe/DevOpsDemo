package ch.zhaw.iwi.devops.fizzbuzz;

public class FizzBuzzConverter {
    //test 4

    public String convert(int i) {
        //insert test here
        if (i % 3 == 0 && i % 7 == 0) {
            return "FizzBuzz";
        } else if (i % 3 == 0) {
            return "Fizz";
        } else if (i % 7 == 0) {
            return "Buzz";
        }
        return String.valueOf(i);
    }

}
