public class Main {

    public static void main(String[] args) {

        Person1 p = new Person1("Jesper", 1.72, 32);
        Person1 p1 = new Person1 ("Paul", 1.73, 26);
        Person1 p2 = new Person1("Malou", 1.65, 23);
        Person1 p3 = new Person1("Osama", 1.81, 23);

        System.out.println("Navn: " + p.getName()+", højde: "+p.getHøjde()+", alder: "+ p.getAlder());
        System.out.println("Navn: " + p1.getName()+", højde: "+p1.getHøjde()+", alder: "+ p.getAlder());
        System.out.println("Navn: " + p2.getName()+", højde: "+p2.getHøjde()+", alder: "+ p.getAlder());
        System.out.println("Navn: " + p3.getName()+", højde: "+p3.getHøjde()+", alder: "+ p.getAlder()+"\n");


        //Højde-skift
        p.setHøjde(1.78);
        p1.setHøjde(1.82);
        p2.setHøjde(1.84);
        p3.setHøjde(1.92);

        System.out.println("Ny højde: ");
        System.out.println("Navn: " + p.getName()+", højde: "+p.getHøjde()+", alder: "+ p.getAlder());
        System.out.println("Navn: " + p1.getName()+", højde: "+p1.getHøjde()+", alder: "+ p.getAlder());
        System.out.println("Navn: " + p2.getName()+", højde: "+p2.getHøjde()+", alder: "+ p.getAlder());
        System.out.println("Navn: " + p3.getName()+", højde: "+p3.getHøjde()+", alder: "+ p.getAlder()+"\n");

    }
}
