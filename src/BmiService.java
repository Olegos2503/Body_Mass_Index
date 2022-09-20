public class BmiService {
    public double calculate(int weight, double height) {
        double height2 = (height * height);
        double weight2 = (weight / height2);
        return weight2;
    }
}
