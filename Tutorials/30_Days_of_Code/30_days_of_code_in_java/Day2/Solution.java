import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your Meal Cost: ");
        double mealCost = scan.nextDouble(); // original meal price
        System.out.println("Enter your Tip Percent: ");
        int tipPercent = scan.nextInt(); // tip percentage
        System.out.println("Enter your Tax Percent: ");
        int taxPercent = scan.nextInt(); // tax percentage
        scan.close();

        // Write your calculation code here.
        double tip = mealCost * tipPercent / 100;

        double tax = mealCost * taxPercent / 100;

        // cast the result of the rounding operation to an int and save it as totalCost
        int totalCost = (int) Math.round(mealCost + tip + tax);

        // Print your result
        System.out.println("The total meal cost is " + totalCost + " dollars.");
    }
}
