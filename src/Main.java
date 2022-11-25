public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double bmi = service.calculate(60, 1.75);

        System.out.println("Индекс массы тела: " + bmi);
    }
}
