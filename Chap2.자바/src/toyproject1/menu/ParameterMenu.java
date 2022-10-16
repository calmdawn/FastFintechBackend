package toyproject1.menu;

import toyproject1.customer.Customers;
import toyproject1.group.Groups;

import java.util.Scanner;

/**
 * 첫 메뉴화면에서 고른  Classification Parameter 메뉴화면
 */
public class ParameterMenu extends Menu {
    private int menuCountMin = 1;
    private int menuCountMax = 4;

    @Override
    public void showMenu() {
        System.out.print("==============================\n" +
                " 1. Set Parameter\n" +
                " 2. View Parameter\n" +
                " 3. Update Parameter\n" +
                " 4. Back\n" +
                "==============================\n" +
                "Choose One: ");
    }

    @Override
    public Menu setMenu(int chooseNum, Groups groups, Customers customers, Scanner scan) {
        while (true) {
            if (chooseNum == 1) { // 1. Set Parameter
                groups.setGroups(scan);
                return this;
            } else if (chooseNum == 2) {  // 2. View Parameter
                groups.viewGroups(scan);
                return this;
            } else if (chooseNum == 3) {   // 3. Update Parameter
                groups.updateGroups(scan);
                return this;
            } else if (chooseNum == 4) {//  4. Back
                return new Menu();
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
