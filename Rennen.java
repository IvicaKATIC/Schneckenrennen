import java.util.ArrayList;

public class Rennen {
    private ArrayList<Schnecke> rennschnecken = new ArrayList<>();
    private float vorgegebenDistanz;

    public Rennen(float vorgegebenDistanz) {
        this.vorgegebenDistanz = vorgegebenDistanz;
    }


    public void addSchnecke() {
        Schnecke schnecke1 = new Gehaeuseschnecke("Tiger", 2.4f, "gelb");
        Schnecke schnecke2 = new Gehaeuseschnecke("Speedy", 3.0f, "rot");
        Schnecke schnecke3 = new Nacktschnecke("Cookie", 2.2f);
        rennschnecken.add(schnecke1);
        rennschnecken.add(schnecke2);
        rennschnecken.add(schnecke3);
    }


    public void macheRennen() {
        boolean gewonnen = false;
        while (!gewonnen) {
            for (Schnecke schnecke : rennschnecken) {
                schnecke.kriechen();
                float zurückgelegeteDistnz = schnecke.getZurueckgelegteDistanz();
                if (zurückgelegeteDistnz >= vorgegebenDistanz) {
                    gewonnen = true;
                }
            }
            try {
                Thread.sleep(1000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }

        }

    }

    public static void main(String[] args) {
        Rennen rennen = new Rennen(20);
        rennen.addSchnecke();
        rennen.macheRennen();
    }
}
