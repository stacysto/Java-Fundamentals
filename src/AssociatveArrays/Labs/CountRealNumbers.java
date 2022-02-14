package AssociatveArrays.Labs;

import java.text.DecimalFormat;
import java.util.*;

public class CountRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToDouble(Double::parseDouble).toArray();
        Map<Double, Integer> counts = new TreeMap<>();

        for (double number : numbers) {
          if (!counts.containsKey(number)){
              counts.put(number,1);
          } else {
              counts.put(number,counts.get(number)+1);
          }

        }
        DecimalFormat df = new DecimalFormat("#.########");
        for (Map.Entry<Double, Integer> entry: counts.entrySet()) {
            System.out.printf("%s -> %d%n", df.format(entry.getKey()), entry.getValue());
        }
    }
}
