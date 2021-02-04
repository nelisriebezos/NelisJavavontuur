package practicum1;
import java.lang.Math;
import java.text.DecimalFormat;

public class opdracht3 {

    private static DecimalFormat testvariabel = new DecimalFormat("#.##");

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            double randint = Math.random();
            System.out.println(testvariabel.format(randint));
        }
    }
}
