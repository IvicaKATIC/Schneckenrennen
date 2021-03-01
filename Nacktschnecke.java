public class Nacktschnecke extends Schnecke {

    public Nacktschnecke(String name, float speed) {
        super(name, speed);
    }

    public void kriechen() {
        zurueckgelegteDistanz = zurueckgelegteDistanz + getSpeed();
        System.out.println("Schnecke "+getName()+" hat "+getZurueckgelegteDistanz()+" mm gekrochen.");
    }
}
