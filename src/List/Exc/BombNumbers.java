package List.Exc;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BombNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        String[] input = scanner.nextLine().split(" ");

        int bombNumber = Integer.parseInt(input[0]);
        int bombPower = Integer.parseInt(input[1]);

        for (int index = 0; index <= numbers.size() - 1; index++) {
            int startIndex = 0;
            int endIndex = 0;
            if (numbers.get(index) == bombNumber) {
                startIndex = index - bombPower;
                if (startIndex < 0) {
                    startIndex = 0;
                }
                endIndex = index + bombPower+1;
                if (endIndex > numbers.size()) {
                    endIndex = numbers.size();
                }
                for (int i = startIndex; i < endIndex; i++) {
                    numbers.remove(startIndex);
                }
                index = 0;
            }
        }
        int sum = 0;
        for (Integer number : numbers) {
            sum += number;
        }
        System.out.println(sum);
    }
}



















