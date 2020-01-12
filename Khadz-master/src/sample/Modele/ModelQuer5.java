package sample.Modele;

public class ModelQuer5 {
    String imie;
    String nazwisko;
    String przedmiot;
    String idProwadzacy;
    String idSemestr;
    String idTypZajec;
    String godziny;

    public ModelQuer5(String imie, String nazwisko, String przedmiot, String idProwadzacy, String idSemestr, String idTypZajec, String godziny) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.przedmiot = przedmiot;
        this.idProwadzacy = idProwadzacy;
        this.idSemestr = idSemestr;
        this.idTypZajec = idTypZajec;
        this.godziny = godziny;
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

    public String getIdProwadzacy() {
        return idProwadzacy;
    }

    public void setIdProwadzacy(String idProwadzacy) {
        this.idProwadzacy = idProwadzacy;
    }

    public String getIdSemestr() {
        return idSemestr;
    }

    public void setIdSemestr(String idSemestr) {
        this.idSemestr = idSemestr;
    }

    public String getIdTypZajec() {
        return idTypZajec;
    }

    public void setIdTypZajec(String idTypZajec) {
        this.idTypZajec = idTypZajec;
    }

    public String getGodziny() {
        return godziny;
    }

    public void setGodziny(String godziny) {
        this.godziny = godziny;
    }
}
