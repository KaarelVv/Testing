package pocket;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the amount: ");
        int amount = scanner.nextInt();
        Pocket pocket = new Pocket(amount);
        pocket.setMoney(amount);




        System.out.println(pocket.getMoney());
    }
}
