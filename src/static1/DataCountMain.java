package static1;

public class DataCountMain {
    public static void main(String[] args) {
        Counter counter = new Counter();

        new Data2("A",counter);
        System.out.println("A : "+ counter.count);
        new Data2("B",counter);
        System.out.println("B : "+ counter.count);
        new Data2("C",counter);
        System.out.println("C : " + counter.count);

    }
}
