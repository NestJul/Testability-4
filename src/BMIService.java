
public class BMIService {
    public int calculate(double height, int weight) {
        int calculate;
        calculate = (int) (weight / (height * height));
        return calculate;
    }
}