package toyproject1.menu;

import toyproject1.customer.Customers;
import toyproject1.group.Groups;

import java.util.Scanner;

/**
 * 프로그램 실행시 가장 처음에 나오는 메뉴화면
 */

public class Menu {
    //해당화면의 메뉴가 몇개까지 있는지 체크하기 위한 변수
    private int menuCountMin = 1;
    private int menuCountMax = 4;

    public void showTitle() {
        System.out.println("===========================================");
        System.out.println(" Title : SmartStore Customer Segmentation");
        System.out.println(" Release Date : 22.10.11");
        System.out.println(" Copyright 2022 JunHyeong All rights reserved.");
        System.out.println("===========================================");
        System.out.println();
    }

    public void showMenu() {
        System.out.print("==============================\n" +
                " 1. Classification Parameter\n" +
                " 2. Customer Data\n" +
                " 3. Summary\n" +
                " 4. Quit\n" +
                "==============================\n" +
                "Choose One: ");
    }

    public Menu setMenu(int chooseNum, Groups groups, Customers customers, Scanner scan) {
        while (true) {
            if (chooseNum == 1) {   //  1. Classification Parameter
                return new ParameterMenu();
            } else if (chooseNum == 2) {//  2. Customer Data
                return new CustomerMenu();
            } else if (chooseNum == 3) {//  3. Summary
                return new SummaryMenu();
            } else if (chooseNum == 4) {//  4. Quit
                System.out.println("Program Finished.");
                return new OrderTypeMenu();
            }
        }
    }

    public int getMenuCountMin() {
        return menuCountMin;
    }

    public int getMenuCountMax() {
        return menuCountMax;
    }
}
