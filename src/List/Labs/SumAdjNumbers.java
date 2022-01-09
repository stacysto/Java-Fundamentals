package List.Labs;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SumAdjNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //3 3 6 1
        List<Double> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Double::parseDouble).collect(Collectors.toList());

        for (int i = 0; i < numbers.size() - 1; i++) {
            double sum = 0;
            if (numbers.get(i).equals(numbers.get(i + 1))) {
                sum = numbers.get(i) + numbers.get(i + 1);
                numbers.set(i, sum);
                numbers.remove(i + 1);
                i = -1;
            }

        }
        DecimalFormat decimalFormat = new DecimalFormat("0.#");
        for (Double item : numbers) {
            System.out.print(decimalFormat.format(item) +" ");
       // DecimalFormat decimalFormat = new DecimalFormat("0.#");
       // for (Double item: numbers) {
           // System.out.print(decimalFormat.format(item)+" ");
        }
    }
}







