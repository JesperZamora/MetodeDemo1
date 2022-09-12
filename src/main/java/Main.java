public class Main {

    public static void main(String[] args) {

        Person1 p = new Person1("Jesper", 1.72, 32);
        Person1 p1 = new Person1 ("Paul", 1.73, 26);

        System.out.println("Navne: " + p.name+", højde: "+p.getHøjde()+", alder: "+ p.alder);
        System.out.println("Navn: " + p1.name+", højde: "+p1.getHøjde()+", alder: "+ p1.alder);

    }
}
