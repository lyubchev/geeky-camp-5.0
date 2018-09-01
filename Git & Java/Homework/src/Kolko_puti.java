import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Kolko_puti {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        
        Map<String, Integer> numMap = new LinkedHashMap<>();
        
        for (String num : input) {
            if(numMap.containsKey(num)) {
                numMap.put(num, numMap.get(num)+1);
                continue;
            }
            numMap.put(num, 1);
        }

        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, Integer> KvP : numMap.entrySet()) {
            sb.append(KvP.getKey() + " " + KvP.getValue() + " ");
        }

        System.out.println(sb.toString().trim());
    }
}
