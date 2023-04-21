package lesson_2;

public class FuncResult implements Calculations {

    @Override
    public double addition(double num1, double num2) {
        return num1 + num2;
    }

    @Override
    public double substrction(double num1, double num2) {
        return num1 - num2;
    }

    @Override
    public double multiplication(double num1, double num2) {
        return num1 * num2;
    }

    @Override
    public double division(double num1, double num2) {
        if (num1 == 0 || num2 == 0) {
            return 0;
        } else {
            return num1 / num2;
        }
    }

}