public class Division implements Operatoins {

    @Override
    public СomplexNumbers calculater(СomplexNumbers a, СomplexNumbers b) {
        double donominator = b.getReal() * b.getReal() + b.getImaginary()*b.getImaginary();
        double newRealPart = (a.getReal() * b.getReal() + a.getImaginary() * b.getImaginary())/donominator;
        double newImaginaryPart = (a.getImaginary()*b.getReal() - a.getReal()*b.getImaginary())/donominator;
        return new СomplexNumbers(newRealPart, newImaginaryPart);
    }
}
