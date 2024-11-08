import java.util.ArrayList;
import java.util.List;

public class Bestellung {

    public String bestellnummer;
    public List<Produkt> produkte;

    public Bestellung(String bestellnummer, List<Produkt> produkte) {
        this.bestellnummer = bestellnummer;
        this.produkte = produkte;
    }

    public String getBestellnummer() {
        return bestellnummer;
    }

    public void setBestellnummer(String bestellnummer) {
        this.bestellnummer = bestellnummer;
    }

    public List<Produkt> getProdukte() {
        return produkte;
    }

    public void produktHinzufuegen(Produkt produkt) {
        produkte.add(produkt);
    }

    public void aufgeben() {}




}
