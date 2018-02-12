public class PunktTest {
    public static void main(String[] args) {
        Punkt p1 = new Punkt(0, 0);
        Punkt p2 = new Punkt(4, 3);
        Linje l = new Linje(p1, p2);
        System.out.println(l.getLength());
        Linje l2 = new Linje(new Punkt(5,6), new Punkt(11,9));
        System.out.println(l2.length);
    }
}
