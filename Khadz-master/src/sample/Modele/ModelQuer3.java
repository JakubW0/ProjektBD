package sample.Modele;

public class ModelQuer3 {
    String idKatedra;
    String nazwaKatedry;
    String idgrupy;
    String idSemestr;
    String przedmiot;

    public ModelQuer3(String idKatedra,String przedmiot, String nazwaKatedry, String idgrupy, String idSemestr) {
        this.idKatedra = idKatedra;
        this.przedmiot = przedmiot;
        this.nazwaKatedry = nazwaKatedry;
        this.idgrupy = idgrupy;
        this.idSemestr = idSemestr;
    }

    public String getIdKatedra() {
        return idKatedra;
    }

    public void setIdKatedra(String idKatedra) {
        this.idKatedra = idKatedra;
    }

    public String getNazwaKatedry() {
        return nazwaKatedry;
    }

    public void setNazwaKatedry(String nazwaKatedry) {
        this.nazwaKatedry = nazwaKatedry;
    }

    public String getIdgrupy() {
        return idgrupy;
    }

    public void setIdgrupy(String idgrupy) {
        this.idgrupy = idgrupy;
    }

    public String getIdSemestr() {
        return idSemestr;
    }

    public void setIdSemestr(String idSemestr) {
        this.idSemestr = idSemestr;
    }
    public String getPrzedmiot() {
        return przedmiot;
    }

    public void setPrzedmiot(String przedmiot) {
        this.przedmiot = przedmiot;
    }
}
