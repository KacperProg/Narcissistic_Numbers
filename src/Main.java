import java.util.List;
import java.util.ArrayList;

public class Main {

    public static boolean isNarcissistic(int number) {
        double a = 213;
        int i = 1;
        List<Double> aSplit = new ArrayList<>();
        while(i>0){
            aSplit.add(a%10);
            if(a/10<1){
                i = -1;
            }
            a /= 10;
            a = Math.floor(a);
        }
        System.out.println(aSplit);
        return false;
    }

}