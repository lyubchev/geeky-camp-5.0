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

        while (!guesser.getHasWon()) {
            input = scanner.nextLine();
            try {
                guesser.setNumber(input);
            } catch (Exception e) {
                System.out.println(e.toString());
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
    private boolean hasWon = false;

    private int cows = 0;
    private int bulls = 0;

    public GuessManager() {
    }

    public void setNumber(String number) throws Exception {
        if (number.length() == this.originalNum.length() && number.matches("^[0-9]+$") && Utility.isNumberUnique(number)) {
            this.number = number;
        }
    }

    public void guess() {
        findCows();
        findBulls();

        System.out.println(this.cows + " кравa(и), " + this.bulls + " бик(а)");
    }

    public boolean getHasWon() {
        return this.hasWon;
    }

    public int getCows() {
        return this.cows;
    }

    public int getBulls() {
        return this.bulls;
    }

    private void findCows() {
        this.cows = 0;
        List<Character> temp = new LinkedList<>();

        for (char digit : this.originalNum.toCharArray()) {
            temp.add(digit);
        }

        for (int i = 0; i < originalNum.length(); i++) {
            for (int j = 0; j < temp.size(); j++) {
                if (this.number.charAt(i) == temp.get(j)) {
                    this.cows++;
                    temp.remove(j);
                    break;
                }
            }
        }
    }

    private void findBulls() {
        this.bulls = 0;

        for (int i = 0; i < this.originalNum.length(); i++) {
            if (this.number.charAt(i) == this.originalNum.charAt(i)) {
                this.bulls++;
            }
        }

        this.hasWon = this.bulls == 4;
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
