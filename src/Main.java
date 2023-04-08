// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        double weight = 90.0;
        double height = 1.8;
        BmiService bmiService = new BmiService();
        double bmi = bmiService.calculate(weight, height);


        System.out.println("Индекс массы тела" + bmi);


    }
}
