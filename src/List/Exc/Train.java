package List.Exc;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // String [] wagons = scanner.nextLine().split(" ");
        List <Integer> wagons = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
        int maxPeople = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();
        while (!input.equals("end")){

            String[] commandLine = input.split(" ");
            if (commandLine[0].equals("Add")){
                int passengers = Integer.parseInt(commandLine[1]);
                wagons.add(passengers);
            } else {
                int passengersToAdd = Integer.parseInt(commandLine[0]);
                for (int index = 0; index < wagons.size(); index++ ){
                    int currentWagon = wagons.get(index);
                    if (wagons.get(index)+passengersToAdd <= maxPeople){
                        wagons.set(index, currentWagon+passengersToAdd);
                        break;
                    }
                }
            }

            input = scanner.nextLine();
        }
        for (int wagon:
             wagons) {
            System.out.print(wagon+ " ");
        }

    }
}
