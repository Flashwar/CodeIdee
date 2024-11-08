import java.util.ArrayList;
import java.util.List;

public class Kunde {

    public String name;
    public Warenkorb warenkorb;
    public List<Bestellung> bestellungen;

    public Kunde(String name) {
        this.name = name;
        this.warenkorb = new Warenkorb();
        this.bestellungen = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void anmelden(){

    }

     public void bestellungErstellen(Bestellung bestellung) {
        bestellungen.add(bestellung);
    }

}
