package class1.ex;

public class ProductOrderMain {
    public static void main(String[] args) {
        ProductOrder[] productOrders = new ProductOrder[3];
        ProductOrder productOrder1 = new ProductOrder();
        productOrder1.productName = "두부";
        productOrder1.productPrice = 2000;
        productOrder1.productQuantity = 2;
        productOrders[0] = productOrder1;

        ProductOrder productOrder2 = new ProductOrder();
        productOrder2.productName = "김치";
        productOrder2.productPrice = 5000;
        productOrder2.productQuantity = 1;
        productOrders[1] = productOrder2;

        ProductOrder productOrder3 = new ProductOrder();
        productOrder3.productName = "콜라";
        productOrder3.productPrice = 1500;
        productOrder3.productQuantity = 2;
        productOrders[2] = productOrder3;

        int total = 0;
        for (ProductOrder productOrder : productOrders) {
            System.out.print("상품명 : " + productOrder.productName);
            System.out.print(", 가격 : " + productOrder.productPrice);
            System.out.print(", 수량 : " + productOrder.productQuantity);
            System.out.println();
            int productSum = productOrder.productPrice * productOrder.productQuantity;
            total += productSum;
            productSum = 0;
        }
        System.out.println("총 결제 금액 : " + total);
    }
}
