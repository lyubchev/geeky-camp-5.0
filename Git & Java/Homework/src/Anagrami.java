import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Anagrami {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().toLowerCase().split(" ");

        List<Character> first = new ArrayList<>();
        List<Character> second = new ArrayList<>();

        for(char letter : input[0].toCharArray()) {
            if(letter > 97 && letter < 125) {
                first.add(letter);
            }
        }

        for(char letter : input[1].toCharArray()) {
            if(letter > 97 && letter < 125) {
                second.add(letter);
            }
        }

        if(first.size() != second.size()) {
            System.out.println("false");
            return;
        }

        for (int i = 0; i < first.size() ; i++) {
            if(second.contains(first.get(i)) == false) {
                System.out.println("false");
                return;
            }
        }

        System.out.println("true");
    }
}
