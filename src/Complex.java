public class Complex {

    private double real;
    private double imaginary;

    public Complex() {
        real = 0;
        imaginary = 0;
    }

    public Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public Complex add(Complex n) {
        return new Complex(real + n.getReal(), imaginary + n.getImaginary());
    }
}
