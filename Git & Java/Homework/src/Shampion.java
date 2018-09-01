import java.util.Scanner;

public class Shampion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        if (input.length == 1) {
            System.out.println(input[0] + " " + 1);
            return;
        }

        int max = 0;
        int current = 1;
        int currentIndex = 0;

        int champion = Integer.parseInt(input[0]);
        for (int i = 1; i < input.length; i++) {
            if (input[i].equals(input[i - 1])) {
                current++;
            } else {
                current = 1;
                currentIndex = i;
            }
            if (current > max || (Integer.parseInt(input[currentIndex]) <= champion && current == max)) {
                max = current;
                champion = Integer.parseInt(input[currentIndex]);
            }
        }
        System.out.println(champion + " " + max);
    }
}
