package List.Labs;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MergingLists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> firstArray = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> secondArray = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        int smallListSize = Math.min(firstArray.size(), secondArray.size());

        for (int i = 0; i < smallListSize; i++) {
            System.out.print(firstArray.get(i) + " " + secondArray.get(i) + " ");

            }
        printTheRest(firstArray, smallListSize);
        printTheRest(secondArray, smallListSize);
        }

    private static void printTheRest(List<Integer> list, int beginIndex) {
        for (int i = beginIndex; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");

        }

    }
}