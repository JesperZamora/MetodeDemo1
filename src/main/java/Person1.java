public class Person1 {
    String name;
    int alder;
    private double højde;

    public Person1 (String name, double højde, int alder) {
        this.højde = højde;
        this.name = name;
        this.alder = alder;
    }

    public double getHøjde() {
        return højde;
    }
}
