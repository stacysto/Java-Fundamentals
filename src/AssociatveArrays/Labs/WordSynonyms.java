package AssociatveArrays.Labs;

import java.util.*;

public class WordSynonyms {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, List<String>> synonymsDictionary = new LinkedHashMap<>();


        for (int i = 0; i < n; i++) {
            String word = scanner.nextLine();
            String synonym = scanner.nextLine();

            synonymsDictionary.putIfAbsent(word, new ArrayList<>());
            synonymsDictionary.get(word).add(synonym);


        }
        for (Map.Entry<String, List <String>> wordEntry :
                synonymsDictionary.entrySet()) {
            String currentWord = wordEntry.getKey();
            List<String>synonymsForCurrentWord = wordEntry.getValue();
            System.out.printf("%s - %s%n", currentWord, String.join(", ", synonymsForCurrentWord));
        }
    }
}
