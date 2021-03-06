public abstract class Schnecke {
    private String name;
    private float speed;
    protected float zurueckgelegteDistanz;

    public Schnecke(String name, float speed) {
        this.name = name;
        this.speed = speed;
    }

    public String toString() {
        return name + ", " + speed;
    }

    public abstract void kriechen();

    public String getName() {
        return name;
    }

    public float getSpeed() {
        return speed;
    }

    protected float getZurueckgelegteDistanz() {
        return zurueckgelegteDistanz;
    }

}
