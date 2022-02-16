package List.Labs;

import java.util.*;
import java.util.stream.Collectors;

public class RemoveNegativesandReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List <Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
        //numbers.removeIf(n->n<0);
        numbers = removeNegativeNumbers (numbers);
        Collections.reverse(numbers);

        if (numbers.isEmpty()){
            System.out.println("empty");
        }else {
            System.out.printf(numbers.toString().replaceAll("[\\[\\],]", ""));
        }
    }

    private static List<Integer> removeNegativeNumbers(List<Integer> numbers) {
        for (int i = 0; i < numbers.size(); i++) {
            int element = numbers.get(i);
            if (element <0){
                numbers.remove(i);
                i--;
            }
        }
        return numbers;
    }

}
