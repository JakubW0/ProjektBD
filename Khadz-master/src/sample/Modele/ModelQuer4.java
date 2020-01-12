package sample.Modele;

public class ModelQuer4 {
    String id;
    String tytul;
    String imie;
    String nazwisko;
    String przedmiot;

    public ModelQuer4(String id, String tytul, String imie, String nazwisko, String przedmiot) {
        this.id = id;
        this.tytul = tytul;
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.przedmiot = przedmiot;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTytul() {
        return tytul;
    }

    public void setTytul(String tytul) {
        this.tytul = tytul;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public String getPrzedmiot() {
        return przedmiot;
    }

    public void setPrzedmiot(String przedmiot) {
        this.przedmiot = przedmiot;
    }
}
