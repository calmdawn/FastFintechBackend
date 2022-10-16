package toyproject1.menu;

import toyproject1.customer.Customers;
import toyproject1.group.Groups;

import java.util.Scanner;

/**
 * 첫 메뉴화면에서 고른  Customer Data 메뉴화면
 */

public class CustomerMenu extends Menu {
    private int menuCountMin = 1;
    private int menuCountMax = 5;

    @Override
    public void showMenu() {
        System.out.print("==============================\n" +
                " 1. Add Customer Data\n" +
                " 2. View Customer Data\n" +
                " 3. Update Customer Data\n" +
                " 4. Delete Customer Data\n" +
                " 5. Back\n" +
                "==============================\n" +
                "Choose One: ");
    }


    @Override
    public Menu setMenu(int chooseNum, Groups groups, Customers customers, Scanner scan) {
        while (true) {
            if (chooseNum == 1) {     // 1. Add Customer Data
                customers.addCustomer(scan);
                return this;
            } else if (chooseNum == 2) {  // 2. View Customer Data
                customers.viewCustomer();
                return this;
            } else if (chooseNum == 3) {   // 3. Update Customer Data
                customers.updateCustomer(scan);
                return this;
            } else if (chooseNum == 4) {//  // 4. Delete Customer Data
                return this;
            } else if (chooseNum == 5) {// 5. Back
                return new Menu();
            } else {
                System.out.println("Invalid Input. Please try again.");
            }
        }
    }

    @Override
    public int getMenuCountMin() {
        return menuCountMin;
    }

    @Override
    public int getMenuCountMax() {
        return menuCountMax;
    }
}
