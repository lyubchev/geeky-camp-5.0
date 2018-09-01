import java.util.Scanner;

public class Plato {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        int max = 0;
        int current = 1;

        if(input.length() == 1) {
            System.out.println(1);
            return;
        }

        for (int i = 1; i < input.length(); i++) {
            if(input.charAt(i - 1) == input.charAt(i)) {
                current++;
            } else {
                current=1;
            }
            if(current > max) {
                max = current;
            }
        }

        System.out.println(max);
    }
}
