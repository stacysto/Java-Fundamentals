package AssociatveArrays.Labs;

import java.util.*;
import java.util.stream.Collectors;

public class OddOccurrences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> counts = new LinkedHashMap<>();
        List<String> wordsList = Arrays.stream(scanner.nextLine().split(" "))
                .collect(Collectors.toList());
        for (String word:wordsList) {
            String wordInLowerCase = word.toLowerCase();
            if(!counts.containsKey(wordInLowerCase)){
                counts.put(wordInLowerCase, 1);
            }else {
                counts.put(wordInLowerCase, counts.get(wordInLowerCase)+1);
            }
        }
        List<String> odds = new ArrayList<>();
        for (var entry : counts.entrySet())
              {
            if(entry.getValue()%2 == 1){
                odds.add(entry.getKey());
            }
        }
        for (int i = 0; i < odds.size(); i++) {
            System.out.print(odds.get(i));
if (i<odds.size()-1){
    System.out.print(", ");
}
        }

        }
    }

