package static2.ex;

public class MathArrayUtils {

    private MathArrayUtils(){} //생성자 제한
    public static int sum(int[] values){
        int total = 0;
        for(int i = 0; i < values.length; i++ ){
            total += values[i];
        }
        return total;
    }
    public static double average(int[] values){
        int total = sum(values);
        double avr = (double) total/values.length;
        return avr;
    }

    public static int min(int[] values) {
        int min = values[0];
        for (int i = 1; i< values.length; i++){
            if(min > values[i]){
                min = values[i];
            }
        }
        return min;
    }

    public static int max(int[] values) {
        int max = values[0];
        for (int i = 1; i< values.length; i++){
            if(max < values[i]){
                max = values[i];
            }
        }
        return max;
    }
}
