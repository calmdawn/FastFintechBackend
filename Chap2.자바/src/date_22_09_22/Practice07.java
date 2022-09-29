package date_22_09_22;

import java.util.Scanner;

public class Practice07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] menuNames = {"김밥", "라면", "떡볶이", "돈가스"};
        int[] menuCosts = {2500, 3000, 4000, 5000};
        int haveMoney = scan.nextInt();
        int cmd = 0;
        if (haveMoney < menuCosts[0]) {
            System.out.println("현금을 얼마 가지고 있니? "
                    + haveMoney + "원\n"
                    + "돈이 부족하여 김밥천국 입장 불가능합니다.");
        } else {
            while (true) {
                System.out.println("현금을 얼마 가지고 있니? " + haveMoney + "원");
                System.out.println("메뉴를 선택해주세요.");
                System.out.println("==================");
                for (int i = 0; i < 4; i++) {
                    System.out.printf("%d. %s     (%d)\n", i + 1, menuNames[i], menuCosts[i]);
                }
                System.out.println("5. 종료");
                System.out.println("==================");
                System.out.print("메뉴 주문 번호 : ");
                cmd = scan.nextInt() - 1;
                if (0 <= cmd && cmd <= 3) {
                    if (haveMoney < menuCosts[cmd])
                        System.out.println("돈이 부족하여 메뉴를 선택할 수 없습니다.\n");
                    else {
                        haveMoney = haveMoney - menuCosts[cmd];
                        System.out.println(menuNames[cmd] + " 선택하셨습니다.");
                        System.out.println("잔돈은 " + haveMoney + "원 입니다.");
                        if (haveMoney < 2500) {
                            System.out.println("더이상 선택할 수 없습니다. 프로그램 종료");
                            System.out.println("지금까지 선택하신 식사 주문이 완료되었습니다.");
                            break;
                        }
                    }
                } else if (cmd == 4) {
                    System.out.println("프로그램 종료");
                    System.out.println("지금까지 선택하신 식사 주문이 완료되었습니다.");
                    break;
                } else {
                    System.out.println("메뉴 선택 오류. 1 ~ 5번 사이의 메뉴를 선택해주세요.\n");
                }
            }
        }
    }
}
