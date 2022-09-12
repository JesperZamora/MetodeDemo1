public class Person1 {
    private String name;
    private int alder;
    private double højde;

    public Person1 (String name, double højde, int alder) {
        this.højde = højde;
        this.name = name;
        this.alder = alder;
    }

    public double getHøjde() {
        return højde;
    }

    public String getName() {
        return name;
    }

    public int getAlder() {
        return alder;
    }

    public void setHøjde(double højde) {
        this.højde = højde;
    }
}
