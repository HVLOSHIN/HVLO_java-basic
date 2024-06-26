package justDoIt;

import java.util.Scanner;

public class SearchItem {
    Scanner scanner = new Scanner(System.in);
    private String itemName;
    private int itemPrice;
    private int itemQuantity;

    public SearchItem() {
        System.out.print("상품명 : ");
        this.itemName = scanner.nextLine();
        System.out.print("가격 : ");
        this.itemPrice = scanner.nextInt();
        System.out.print("수량 : ");
        this.itemQuantity = scanner.nextInt();

    }

    public void showItemData() {
        System.out.print("상품명 : " + this.itemName + ", 가격 : " + this.itemPrice + ", 수량 : " + this.itemQuantity);
        System.out.println();

    }

}
