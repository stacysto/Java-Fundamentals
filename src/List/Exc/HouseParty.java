package List.Exc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class HouseParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //read how many commands
        int numberOfCommands = Integer.parseInt(scanner.nextLine());

        List<String> guestNames = new ArrayList<>();
// read commands
        for (int i = 0; i < numberOfCommands; i++) {
            String command = scanner.nextLine();

            List<String> commandParts = Arrays.stream(command.split(" "))
                    .collect(Collectors.toList());
            String name = commandParts.get(0);
            //if is going - check if is in the list -  print, if it is not in the list - add

            if (commandParts.size() == 3) {
                if (guestNames.contains(name)) {
                                       System.out.printf("%s is already in the list!%n", name);

                } else {
                    guestNames.add(name);
                }
            } else if (commandParts.size() == 4) {
                if (guestNames.contains(name)) {
                    guestNames.remove(name);
                } else {
                    System.out.printf("%s is not in the list!%n", name);
                }

            }

        }        //print the guests


        for (String guestName:
             guestNames) {
            System.out.println(guestName + " ");

        }


    }
}
