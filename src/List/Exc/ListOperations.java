package List.Exc;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //read array as list

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
        //read command until get "end"
        String input = scanner.nextLine();

        while (!input.equals("End")) {
            String[] tokens = input.split(" ");
            String command = tokens[0];
            //•	Add {number} - add number at the end
            if (command.equals("Add")) {
                int numberToAdd = Integer.parseInt(tokens[1]);
                numbers.add(numberToAdd);
                //•	Insert {number} {index} - insert number at given index
            } else if (command.equals("Insert")) {

                int numberToInsert = Integer.parseInt(tokens[1]);
                int indexToInsert = Integer.parseInt(tokens[2]);
                if (isValidIndex(indexToInsert,numbers.size())){
                    numbers.add(indexToInsert, numberToInsert);
                } else {
                    System.out.println("Invalid index");
                }

//•	Remove {index} - remove that index
            } else if (command.equals("Remove")) {
                int indexToRemove = Integer.parseInt(tokens[1]);
                if (isValidIndex(indexToRemove,numbers.size())){
                    numbers.remove(indexToRemove);
                } else {
                    System.out.println("Invalid index");
                }
                //•	Shift left {count} - first number becomes last 'count' times
                //•	Shift right {count} - last number becomes first 'count' times
            } else if (command.equals("Shift")){
                int count = Integer.parseInt(tokens[2]);
                if (tokens[1].equals("left")){
                 shiftLeft(numbers, count);

                }else if (tokens[1].equals("right")){
shiftRight (numbers, count);

                }
            }


            input = scanner.nextLine();
        }
        printNumbers(numbers);

    }

    private static void shiftRight(List<Integer> numbers, int count) {
        for (int i = 0; i < count; i++) {
            int lastNumber = numbers.get(numbers.size()-1);
            numbers.add(0, lastNumber );
            numbers.remove(numbers.size()-1);
        }
    }

    private static void shiftLeft(List<Integer> numbers, int count) {
        for (int i = 0; i < count; i++) {
            int firstNumber = numbers.get(0);
            numbers.add(firstNumber);
            numbers.remove(0);
        }
    }

    private static void printNumbers(List<Integer> numbers) {
        for (int number:
             numbers) {
            System.out.print(number +" ");
        }
    }
    public static boolean isValidIndex(int index, int size){
        return (index>=0 && index<=size-1);
    }
}
