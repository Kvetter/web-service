package dk.profac.demo.exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Numbers {


    public List<Integer> findEvenNumbers(List<Integer> numbers) {
        ArrayList<Integer> result = new ArrayList<>();


        return result;
    }

    public int findLargestNumber(List<Integer> numbers) {
        return 0;
    }

    public List<Integer> removeDuplicate(List<Integer> numbers) {
        return numbers;
    }

    public int totalSum (List<Integer> numbers) {
        return 0;
    }

    public int average(List<Integer> numbers) {
        return 0;
    }

    public static void main(String[] args) {
        Numbers numbers = new Numbers();
        Random rng = new Random();
        List<Integer> list = new ArrayList();

        for (int i = 0; i < 10; i++) {
            list.add(rng.nextInt(1000));
        }

        System.out.println("Random numbers in our list:");
        for (int i : list) {
            System.out.print(i + " ");
        }

        System.out.println("\nEven numbers: ");

        System.out.println(numbers.findEvenNumbers(list));

        System.out.println("Largest number");
        System.out.println(numbers.findLargestNumber(list));

        System.out.println("Total sum");
        System.out.println(numbers.totalSum(list));

        System.out.println("Average");
        System.out.println(numbers.average(list));

        System.out.println("Remove Duplicate");
        list.addAll(list);
        System.out.println("Duplicated list: " + list);
        System.out.println(numbers.removeDuplicate(list));

    }

}
