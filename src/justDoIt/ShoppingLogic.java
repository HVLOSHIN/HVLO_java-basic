package justDoIt;

import java.util.Scanner;

public class ShoppingLogic {


    public static void startLogic() {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        SearchItem[] items = new SearchItem[10];
        while (true) {

            System.out.println("1.장바구니에 담기 | 2. 결제 | 3. 종료");
            int choice = scanner.nextInt();


            if (choice == 1) {

                if (count >= 10) {
                    System.out.println("장바구니는 10개 까지만 등록가능합니다");
                    continue;
                }
                SearchItem newItem = new SearchItem();
                items[count] = newItem;    //현재 items 배열에 newItem 정보가 안들어감
                newItem.showItemData();
                count++;


            } else if (choice == 2) {
                System.out.println("결제내역 : ");
                for (int i = 0; i < count; i++) {
                    System.out.print((i + 1) + "번 물건 : ");
                    SearchItem searchItem = items[i];
              //      System.out.println(items[0]);    // items[]에 암것도 없어서 출력이 안돼고 있음
                    searchItem.showItemData();
                }

            } else if (choice == 3) {
                System.out.println("종료...");
                break;
            } else {
                System.out.println("올바른 입력이 아닙니다.");
            }
        }
    }
}



