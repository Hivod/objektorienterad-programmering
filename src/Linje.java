public class Linje {
    Punkt p1, p2;
    double length;
    public Linje(Punkt p1, Punkt p2) {
        this.p1 = p1;
        this.p2 = p2;
        this.length = getLength();
    }
    double getLength() {
        return Math.sqrt(Math.pow((this.p2.x - this.p1.x), 2) + Math.pow((this.p2.y - this.p1.y), 2));
    }
}
