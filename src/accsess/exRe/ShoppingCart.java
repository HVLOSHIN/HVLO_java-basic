package accsess.exRe;

public class ShoppingCart {
    private Item[] items = new Item[10];
    private int itemCount = 0;


    public void addItem(Item item){
        if(itemCount > items.length ){
            System.out.println("장바구니가 가득 찼습니다");
            return;
        }
        items[itemCount] = item;
    }


}
