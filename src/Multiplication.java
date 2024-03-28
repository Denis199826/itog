public class Multiplication implements Operatoins {

    @Override
    public СomplexNumbers calculater(СomplexNumbers a, СomplexNumbers b) {
        double newRealPart = (a.getReal() * b.getReal()) + (a.getImaginary() * b.getImaginary()*(-1));
        double newImaginaryPart = (a.getReal()*b.getImaginary())+(a.getImaginary()*b.getReal());
        return new СomplexNumbers(newRealPart, newImaginaryPart);
    }
}
