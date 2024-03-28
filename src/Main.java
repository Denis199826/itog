public class Main {

    public static void main(String[] args) {
        СomplexNumbers firstNumber = new СomplexNumbers(6, 3);
        СomplexNumbers secondNumber = new СomplexNumbers(2, 7);
        Calculator calculator = new Calculator();
        Division division = new Division();
        calculator.setOperation(division);
        СomplexNumbers sum = calculator.calculate(firstNumber, secondNumber);
        System.out.println("Результат: " + sum.getReal() + " + " + sum.getImaginary() + "i");
    }
}