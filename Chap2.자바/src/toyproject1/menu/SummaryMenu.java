package toyproject1.menu;

import toyproject1.customer.Customers;
import toyproject1.group.Groups;

import java.util.Scanner;

public class SummaryMenu extends Menu {
    @Override
    public void showMenu() {
        System.out.print("==============================\n" +
                " 1. Summary\n" +
                " 2. Summary (Sorted By Name)\n" +
                " 3. Summary (Sorted By Spent Time)\n" +
                " 4. Summary (Sorted By Total Payment)\n" +
                " 5. Back\n" +
                "==============================\n" +
                "Choose One: ");
    }

    @Override
    public Menu setMenu(int chooseNum, Groups groups, Customers customers, Scanner scan) {
        while (true) {
            if (chooseNum == 1) {     // 1. Summary
                return new ParameterMenu();
            } else if (chooseNum == 2) {  // 2. Summary (Sorted By Name)
                return new CustomerMenu();
            } else if (chooseNum == 3) {   // 3. Summary (Sorted By Spent Time)
                return new SummaryMenu();
            } else if (chooseNum == 4) {// 4. Summary (Sorted By Total Payment)

            } else if (chooseNum == 5) { // 5. Back
                return new Menu();
            } else {
                System.out.println("Invalid Input. Please try again.");
            }
        }
    }

}
