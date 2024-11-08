import java.util.ArrayList;
import java.util.List;

public class Warenkorb {

    public int menge;
    public List<Produkt> produkte;

    public Warenkorb() {
        this.produkte = new ArrayList<Produkt>();
    }

     public void produktHinzufuegen(Produkt produkt, int menge) {
         produkte.add(produkt);
         menge++;
     }

    public double gesamtpreisBerechnen(){return menge;}

    public int getMenge() {
        return menge;
    }

    public void setMenge(int menge) {
        this.menge = menge;
    }



}
