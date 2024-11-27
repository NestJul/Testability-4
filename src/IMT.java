import java.lang.module.FindException;

public class IMT {
    public static void main(String[] args) {
        BMIService service = new BMIService();
        double height = 1.87;
        int weight = 98;
        double calculate;
        calculate = 0;
        int imt = service.calculate(height, weight); // должно получиться 28
        System.out.println(imt);
    }
}
