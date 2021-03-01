public class Gehaeuseschnecke extends Schnecke {
    private String gehaeuseFarbe;


    public Gehaeuseschnecke(String name, float speed, String gehaeuseFarbe) {
        super(name, speed);
        this.gehaeuseFarbe = gehaeuseFarbe;
    }

    public String getGehaeuseFarbe() {
        return gehaeuseFarbe;
    }


    public void kriechen() {
        zurueckgelegteDistanz = zurueckgelegteDistanz + getSpeed();
        System.out.println("Schnecke "+getName()+" hat "+getZurueckgelegteDistanz()+" mm gekrochen.");
    }

}
