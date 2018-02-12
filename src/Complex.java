public class Complex {
    // variables for real and imaginary parts respectively
    private double a, b;
    // constructor
    public Complex(double real, double imaginary) {
        this.a = real;
        this.b = imaginary;
    }

    public void add(Complex z2) {
        a += z2.a;
        b += z2.b;
    }

    public void multiply(Complex z2) {
        double a0 = this.a;
        this.a = (this.a * z2.a) - (this.b * z2.b);
        this.b = (a0 * z2.b) + (this.b * z2.a);
    }

    public boolean equals(Complex z2) {
        return this.a == z2.a && this.b == z2.b;
    }

    double arg() {
        return Math.atan(this.a / this.b);
    }

    public String toString() {
        if(b < 0) {
            return this.a + "" + this.b + "i";
        } else {
            return this.a + "+" + this.b + "i";
        }
    }
}