import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Bikove_i_Kravi {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GuessManager guesser = new GuessManager();
        String input;

        System.out.println("Моля въведете четирицифрено число с различни цифри: ");

        while (!guesser.isWon()) {
            input = scanner.nextLine();
            try {
                guesser.setNumber(input);
            } catch (Exception e) {
                e.printStackTrace();

                System.out.println("Моля въведете четирицифрено число с различни цифри: ");
                continue;
            }
            guesser.guess();
        }

        System.out.println("4 бика, печелиш");
    }
}

class GuessManager {

    private final String originalNum = Utility.generateRandomNumber();
    private String number = "";
    private boolean won = false;

    

    public GuessManager() {
    }

    public void setNumber(String number) throws Exception {
        if (number.length() == this.originalNum.length() && number.matches("^[0-9]+$") && Utility.isNumberUnique(number)) {
            this.number = number;
        }
    }

    public void guess() {
        private int cows = findCows();
        private int bulls = findBulls();
        System.out.println(this.cows + " кравa(и), " + this.bulls + " бик(а)");
    }

    public boolean isWon() {
        return this.won;
    }

    public int getCows() {
        return this.cows;
    }

    public int getBulls() {
        return this.bulls;
    }

    private int findCows() {
        int cows = 0;
        List<Character> temp = new LinkedList<>();

        for (char digit : this.originalNum.toCharArray()) {
            temp.add(digit);
        }

        for (int i = 0; i < originalNum.length(); i++) {
            for (int j = 0; j < temp.size(); j++) {
                if (this.number.charAt(i) == temp.get(j)) {
                    cows++;
                    temp.remove(j);
                    break;
                }
            }
        }
        return cows;
    }

    private int findBulls() {
        int bulls = 0;

        for (int i = 0; i < this.originalNum.length(); i++) {
            if (this.number.charAt(i) == this.originalNum.charAt(i)) {
                bulls++;
            }
        }

        this.won = bulls == 4;
        return bulls;
    }

    private static class Utility {

        private static StringBuilder numToGuess = new StringBuilder(4);

        public static String generateRandomNumber() {

            while (numToGuess.length() < 4) {
                String num = Integer.toString((int) (Math.random() * 10));
                if (numToGuess.indexOf(num) == -1) {
                    numToGuess.append(num);
                }
            }

            return numToGuess.toString();
        }

        public static boolean isNumberUnique(String str) throws Exception {
            List<Character> nums = new ArrayList<>();

            for (int i = 0; i < str.length(); i++) {
                if (nums.contains(str.charAt(i))) {
                    throw new Exception("Unique numbers only!");
                } else {
                    nums.add(str.charAt(i));
                }
            }
            return true;
        }
    }
}
