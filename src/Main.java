public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();

        int weight = 80;
        double height = 1.9;
        double total = service.calculate(weight, height);
        System.out.println("Итог = " + (total));

    }


}