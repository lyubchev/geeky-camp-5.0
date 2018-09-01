import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Unikalen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        List<Character> letters = new ArrayList<>();
        for (int i = 0; i < input.length(); i++) {
            if(letters.contains(input.charAt(i))) {
                System.out.println("false");
                return;
            }
            letters.add(input.charAt(i));
        }
        System.out.println("true");
    }
}
