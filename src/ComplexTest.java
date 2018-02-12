public class ComplexTest {
    public static void main(String[] args) {
        Complex z = new Complex(5,2);
        System.out.println(z.toString());
        z.add(new Complex(3, 8));
        System.out.println(z.toString());
        z.multiply(new Complex(4, 3));
        System.out.println(z.toString());
        System.out.println(z.arg());
        System.out.println(z.equals(new Complex(2, 64)));
        System.out.println(z.equals(new Complex(10, -10)));
    }
}
