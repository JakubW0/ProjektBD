package sample.Table;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.Alert;
import sample.ConnectTable;
import sample.Modele.ModelQuer4;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TableQuer4 {
    ObservableList<ModelQuer4> oblistQ4 = FXCollections.observableArrayList();
    public TableQuer4() {

    }

    public void setQuer4() {
        try {
            oblistQ4.clear();
            Connection conn = ConnectTable.connectdb();
            ResultSet rs = conn.createStatement().executeQuery("SELECT prowadzacy.id_prowadzacy,tytul_naukowy.nazwa_tytulu,\n" +
                    "prowadzacy.imie_prowadzacy,prowadzacy.nazwisko_prowadzacy, przedmioty.nazwa_przedmiotu\n" +
                    "FROM prowadzacy\n" +
                    "INNER JOIN plan\n" +
                    "ON prowadzacy.id_prowadzacy=plan.id_prowadzacy\n" +
                    "INNER JOIN przedmioty\n" +
                    "ON plan.Id_przedmiot=przedmioty.Id_przedmiot\n" +
                    "INNER JOIN tytul_naukowy\n" +
                    "ON prowadzacy.Id_tytul = tytul_naukowy.Id_tytul\n" +
                    "WHERE 1  "
            );
            while (rs.next()) {
                oblistQ4.add(new ModelQuer4(rs.getString("prowadzacy.id_prowadzacy"),
                        rs.getString("tytul_naukowy.nazwa_tytulu"),
                        rs.getString("prowadzacy.imie_prowadzacy"),
                        rs.getString("prowadzacy.nazwisko_prowadzacy"),
                        rs.getString("przedmioty.nazwa_przedmiotu")
                ));
            }
            conn.close();
        } catch (SQLException e) {
            infoBox("Źle podane dane",null,"Błąd");
        }
    }


    public void querka(String grupa, String przedmiot) {
        try {
            oblistQ4.clear();
            Connection conn = ConnectTable.connectdb();
            ResultSet rs = conn.createStatement().executeQuery("SELECT prowadzacy.id_prowadzacy,tytul_naukowy.nazwa_tytulu,\n" +
                    "prowadzacy.imie_prowadzacy,prowadzacy.nazwisko_prowadzacy, przedmioty.nazwa_przedmiotu\n" +
                    "FROM prowadzacy\n" +
                    "INNER JOIN plan\n" +
                    "ON prowadzacy.id_prowadzacy=plan.id_prowadzacy\n" +
                    "INNER JOIN przedmioty\n" +
                    "ON plan.Id_przedmiot=przedmioty.Id_przedmiot\n" +
                    "INNER JOIN tytul_naukowy\n" +
                    "ON prowadzacy.Id_tytul = tytul_naukowy.Id_tytul\n" +
                    "WHERE plan.id_grupy = "+grupa+" AND przedmioty.nazwa_przedmiotu = '"+przedmiot+"' "
            );
            while (rs.next()) {
                oblistQ4.add(new ModelQuer4(rs.getString("prowadzacy.id_prowadzacy"),
                        rs.getString("tytul_naukowy.nazwa_tytulu"),
                        rs.getString("prowadzacy.imie_prowadzacy"),
                        rs.getString("prowadzacy.nazwisko_prowadzacy"),
                        rs.getString("przedmioty.nazwa_przedmiotu")
                ));
            }
            conn.close();
        } catch (SQLException e) {
            infoBox("Źle podane dane, przyjmowane są jedynie liczby",null,"Błąd");
        }
    }

    public ObservableList<ModelQuer4> getOblist(){
        return oblistQ4;
    }


    public static void infoBox(String infoMessage, String headerText, String title){
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setContentText(infoMessage);
        alert.setTitle(title);
        alert.setHeaderText(headerText);
        alert.showAndWait();}
}
