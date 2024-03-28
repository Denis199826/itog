public class Calculator {
    private Operatoins operation;
    public void setOperation(Operatoins operation) {
        this.operation = operation;
    }

    public СomplexNumbers calculate(СomplexNumbers a, СomplexNumbers b) {
        return operation.calculater(a, b);
    }
}
