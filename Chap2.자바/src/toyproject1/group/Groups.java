package toyproject1.group;

import toyproject1.utils.ExceptionStore;

import java.util.Scanner;

public class Groups {
    Group general = new Group();
    Group vip = new Group();
    Group vvip = new Group();

    public Groups() {
        this.general.groupType = GroupType.GENERAL;
        this.vip.groupType = GroupType.VIP;
        this.vvip.groupType = GroupType.VVIP;
    }

    public void setGroups(Scanner scan) {
        while (true) {
            selectGroup();
            String input = scan.nextLine();
            System.out.println();
            if (input.equals("GENERAL")) {
                checkWriteHistory(scan, general);
            } else if (input.equals("VIP")) {
                checkWriteHistory(scan, vip);
            } else if (input.equals("VVIP")) {
                checkWriteHistory(scan, vvip);
            } else if (input.equals("end")) {
                return;
            } else {
                System.out.println("Invalid Input. Please try again.");
            }
        }
    }

    public void viewGroups(Scanner scan) {
        while (true) {
            selectGroup();
            String input = scan.nextLine();
            System.out.println();
            if (input.equals("GENERAL")) {
                viewParam(general);
            } else if (input.equals("VIP")) {
                viewParam(vip);
            } else if (input.equals("VVIP")) {
                viewParam(vvip);
            } else if (input.equals("end")) {
                return;
            } else {
                System.out.println("Invalid Input. Please try again.");
            }
        }
    }

    public void updateGroups(Scanner scan) {
        while (true) {
            selectGroup();
            String input = scan.nextLine();
            System.out.println();
            if (input.equals("GENERAL")) {
                checkWriteHistoryUpdate(scan, general);
            } else if (input.equals("VIP")) {
                checkWriteHistoryUpdate(scan, vip);
            } else if (input.equals("VVIP")) {
                checkWriteHistoryUpdate(scan, vvip);
            } else if (input.equals("end")) {
                return;
            } else {
                System.out.println("Invalid Input. Please try again.");
            }
        }
    }

    private void checkWriteHistoryUpdate(Scanner scan, Group group) {
        if (group.writeHistory == false) {
            System.out.println("No parameter. Set the parameter first.\n");
        } else {
            viewParam(group);
            setParam(scan, group);
            viewParam(group);
        }
    }

    private void viewParam(Group group) {
        System.out.println("GroupType: " + group.groupType);
        System.out.println("Parameter: " + group.parameter.toString() + "\n");
        group.writeHistory = true;
    }


    //기존에 값이 쓰여진적이 있는지 확인
    private void checkWriteHistory(Scanner scan, Group group) {
        if (group.writeHistory == true) {
            System.out.println(group.groupType + " group already exists.\n");
            System.out.println("GroupType: " + group.groupType);
            System.out.println("Parameter: " + group.parameter.toString() + "\n");
            return;
        }
        group.writeHistory = true;
        setParam(scan, group);
    }

    private void setParam(Scanner scan, Group group) {
        while (true) {
            System.out.println("==============================\n" +
                    " 1. Minimum Spent Time\n" +
                    " 2. Minimum Total Pay\n" +
                    " 3. Back\n" +
                    "==============================\n" +
                    "Choose One: ");
            String input = scan.nextLine();

            if (ExceptionStore.checkInput(input, 1, 3)) {
                int chooseNum = Integer.parseInt(input);
                if (chooseNum == 1) {
                    setMinimumSpentTime(scan, group);
                } else if (chooseNum == 2) {
                    setMinimumTotalPay(scan, group);
                } else if (chooseNum == 3) {
                    return;
                }
            }
        }
    }

    private void setMinimumTotalPay(Scanner scan, Group group) {
        while (true) {
            System.out.print("Input Minimum Total Pay: ");
            String input = scan.nextLine();
            if (ExceptionStore.checkInput(input, 0, Integer.MAX_VALUE)) {
                int minPay = Integer.parseInt(input);
                group.parameter.minTotalPay = minPay;
                return;
            }
        }
    }

    private void setMinimumSpentTime(Scanner scan, Group group) {
        while (true) {
            System.out.print("Input Minimum Spent Time: ");
            String input = scan.nextLine();
            if (ExceptionStore.checkInput(input, 0, Integer.MAX_VALUE)) {
                int minTime = Integer.parseInt(input);
                group.parameter.minSpentTime = minTime;
                return;
            }
        }
    }

    private void selectGroup() {
        System.out.println("** Press 'end', if you want to exit! **\n" +
                "Which group (GENERAL, VIP, VVIP)? ");
    }

}
