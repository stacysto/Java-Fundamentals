package List.Exc;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ChangeList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //read the list
        List<Integer> numbers = Arrays.stream(scanner.nextLine()
                .split(" ")).map(Integer::parseInt)
                .collect(Collectors.toList());

        //read the command
        String input = scanner.nextLine();
        while (!input.equals("end")) {

            String command = input.split("\\s+")[0];

            // Delete {element} - delete all elements in the array, which are equal to the given element
            if (command.equals("Delete")) {
                int element = Integer.parseInt(input.split("\\s+")[1]);
                numbers.removeAll(Arrays.asList(element));

                // Insert {element} {position}
            } else if (command.equals("Insert")){
                int element = Integer.parseInt(input.split("\\s+")[1]);
                int position = Integer.parseInt(input.split("\\s+")[2]);
                numbers.add(position, element);

            }
            input = scanner.nextLine();
        }
        //print
        printList(numbers);

        }

    private static void printList(List<Integer> numbers) {
        for (int number :
                numbers) {
            System.out.print(number + " ");
    }

}
}
