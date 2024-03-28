public class Addition implements Operatoins {

    @Override
    public СomplexNumbers calculater(СomplexNumbers a, СomplexNumbers b) {
        double newRealPart = a.getReal() + b.getReal();
        double newImaginaryPart = a.getImaginary() + b.getImaginary();
        return new СomplexNumbers(newRealPart, newImaginaryPart);
    }

}
