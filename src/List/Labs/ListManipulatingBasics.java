package List.Labs;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulatingBasics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        String input = scanner.nextLine();

        while (!input.equals("end")) {
            String[] command = input.split(" ");
            switch (command[0]) {
                case "Add":
                    int numberToAdd = Integer.parseInt(command[1]);
                    numbers.add(numberToAdd);

                    break;
                case "Remove":
                    int numberToRemove = Integer.parseInt(command[1]);
                    numbers.remove(numberToRemove);
                    break;
                case "RemoveAt":
                    int indexToRemove = Integer.parseInt(command[1]);
                    numbers.remove(indexToRemove);
                    break;
                case "Insert":
                    int numberToinsert = Integer.parseInt(command[1]);
                    int indexToinsert = Integer.parseInt(command[2]);
                    numbers.add(indexToinsert, numberToinsert);
                    break;

            }
             input = scanner.nextLine();

        }
        System.out.println(numbers.toString().replaceAll("[\\[\\],]",""));

    }
}
