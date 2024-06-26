package ref.ex;

import java.util.Scanner;

public class ProductOrderMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        ProductOrder[] po = new ProductOrder[n];

        for (int i = 0; i < n; i++) {
            po[i] = new ProductOrder();
            System.out.println((i+1) + "번째 주문");

            System.out.print("품명 : ");
            String name = sc.nextLine();
            System.out.print("가격 : ");
            int price = sc.nextInt();
            System.out.print("수량 : ");
            int quantity = sc.nextInt();
            sc.nextLine();

            po[i] = list(name, price, quantity);
        }
        print(po);
        int totalAmount = getTotalAmount(po);
        System.out.println("total amount : " + totalAmount);

    }
    static ProductOrder list (String name, int price, int quantity) {
        ProductOrder po = new ProductOrder();
        po.productName = name;
        po.productPrice = price;
        po.productQuantity = quantity;
        return po;
    }
    static void print(ProductOrder[] po) {
        for (ProductOrder p : po) {
            System.out.println(p.productName + ", " + p.productPrice + ", " + p.productQuantity);
        }
    }
    static int getTotalAmount(ProductOrder[] po) {
        int totalAmount = 0;
        for (ProductOrder p : po) {
            totalAmount += p.productPrice * p.productQuantity;
        }
        return totalAmount;
    }
}
