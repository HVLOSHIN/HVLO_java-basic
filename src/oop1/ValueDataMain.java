package oop1;

public class ValueDataMain {
    public static void main(String[] args) {
        ValueData vd = new ValueData();
        add(vd);
        add(vd);
        add(vd);
        System.out.println("최종 Value : " + vd.value);

    }
    static void add(ValueData vd) {
        vd.value++;
        System.out.println("Value : " + vd.value);
    }
}
