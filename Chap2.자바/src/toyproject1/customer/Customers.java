package toyproject1.customer;

import toyproject1.utils.ExceptionStore;

import java.util.Scanner;

public class Customers {
    Customer[] customers = new Customer[100];
    int customersIdx = 0;

    public void addCustomer(Scanner scan) {
        while (true) {
            System.out.print("** Press -1, if you want to exit! **\n" +
                    "How many customers to input? ");
            String input = scan.nextLine();
            if (input.equals("-1"))
                return;
            if (ExceptionStore.checkInput(input, 0, Integer.MAX_VALUE)) {
                int size = Integer.parseInt(input);
                if (size == 0)
                    return;
                createCustomer(size, scan);
            }
        }
    }

    private void createCustomer(int size, Scanner scan) {
        for (int i = 1; i <= size; i++) {
            Customer customer = new Customer();
            System.out.println("====== Customer " + i + " Info. ======\n");
            customers[customersIdx] = customer;
            customersIdx++;
            setCustomer(customer, scan);
        }
    }

    private void setCustomer(Customer customer, Scanner scan) {
        while (true) {
            showCreateCustomerInfo();
            String input = scan.nextLine();
            if (ExceptionStore.checkInput(input, 1, 5)) {
                int chooseNum = Integer.parseInt(input);
                if (chooseNum == 1) {
                    setName(customer, scan);
                } else if (chooseNum == 2) {
                    setID(customer, scan);
                } else if (chooseNum == 3) {
                    setSpentTime(customer, scan);
                } else if (chooseNum == 4) {
                    setTotalPay(customer, scan);
                } else if (chooseNum == 5) {
                    break;
                }
            }
        }
    }

    private void setName(Customer customer, Scanner scan) {
        while (true) {
            String input = scan.nextLine();
            System.out.println("Input Customer's Name: ");
            if (input.length() >= 3 && ExceptionStore.checkStringType(input) == true) {
                customer.name = input;
                break;
            }
            System.out.println("Invalid Format for Input. Please try again.\n");
        }
    }

    private void setID(Customer customer, Scanner scan) {
        while (true) {
            String input = scan.nextLine();
            System.out.println("Input Customer's UserID: ");
            if (input.length() >= 5 &&
                    ('a' <= input.charAt(0) && input.charAt(0) <= 'z') &&
                    ('A' <= input.charAt(0) && input.charAt(0) <= 'Z')) {
                customer.userID = input;
                break;
            }
            System.out.println("Invalid Format for Input. Please try again.\n");
        }
    }

    private void setSpentTime(Customer customer, Scanner scan) {
        while (true) {
            String input = scan.nextLine();
            System.out.println("Input Customer's Spent Time at Your Store: ");
            if (ExceptionStore.checkInput(input, 0, Integer.MAX_VALUE)) {
                customer.spentTime = Integer.parseInt(input);
                break;
            }
            System.out.println("Invalid Format for Input. Please try again.\n");
        }
    }


    private void setTotalPay(Customer customer, Scanner scan) {
        while (true) {
            String input = scan.nextLine();
            System.out.println("Input Customer's Spent Time at Your Store:\n");
            if (ExceptionStore.checkInput(input, 0, Integer.MAX_VALUE)) {
                customer.totalPay = Integer.parseInt(input);
                break;
            }
            System.out.println("Invalid Format for Input. Please try again.\n");
        }
    }

    public void viewCustomer() {
        System.out.println("======= Customer Info. =======");
        for (int i = 0; i < customersIdx; i++) {
            System.out.println("No. " + (i + 1) + " => " + customers[i].toString());
        }
    }

    public void updateCustomer(Scanner scan) {
        viewCustomer();
        System.out.println();
        System.out.println("Which customer ( 1 ~ " + (customersIdx) + " )?\n");
        String input = scan.nextLine();
        if (ExceptionStore.checkStringType(input)) {
            int no = Integer.parseInt(input);
            if (0 <= no && no <= customersIdx) {
                setCustomer(customers[customersIdx - 1], scan);
            }
        }
    }

    private void showCreateCustomerInfo() {
        System.out.println("==============================\n" +
                " 1. Customer Name\n" +
                " 2. Customer ID\n" +
                " 3. Customer Spent Time\n" +
                " 4. Customer Total Pay\n" +
                " 5. Back\n" +
                "==============================\n" +
                "Choose One: ");
    }

}
