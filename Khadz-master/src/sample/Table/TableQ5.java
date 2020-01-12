package sample.Table;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.Alert;
import sample.ConnectTable;
import sample.Modele.ModelQuer5;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TableQ5 {
    ObservableList<ModelQuer5> oblistQ5 = FXCollections.observableArrayList();
    public TableQ5() {
    }
    public void querka(String grupa) {
        try {
            oblistQ5.clear();
            Connection conn = ConnectTable.connectdb();
            ResultSet rs = conn.createStatement().executeQuery("SELECT prowadzacy.imie_prowadzacy,\n" +
                    "prowadzacy.nazwisko_prowadzacy,\n" +
                    "przedmioty.nazwa_przedmiotu,\n" +
                    "plan.id_prowadzacy,\n" +
                    "plan.id_semestr,\n" +
                    "przedmioty.id_typ_zajec,\n" +
                    "przedmioty.godziny \n" +
                    "FROM plan \n" +
                    "INNER JOIN przedmioty\n" +
                    "ON plan.Id_przedmiot = przedmioty.Id_przedmiot \n" +
                    "INNER JOIN prowadzacy\n" +
                    "ON plan.id_prowadzacy=prowadzacy.id_prowadzacy\n" +
                    "WHERE plan.id_specjalnosc != 0 AND plan.id_grupy = "+grupa+" "
            );
            while (rs.next()) {
                oblistQ5.add(new ModelQuer5(rs.getString("prowadzacy.imie_prowadzacy"),
                        rs.getString("prowadzacy.nazwisko_prowadzacy"),
                        rs.getString("przedmioty.nazwa_przedmiotu"),
                        rs.getString("plan.id_prowadzacy"),
                        rs.getString("plan.id_semestr"),
                        rs.getString("przedmioty.id_typ_zajec"),
                        rs.getString("przedmioty.godziny")
                ));
            }
            conn.close();
        } catch (SQLException e) {
            infoBox("Źle podane dane, przyjmowane są jedynie liczby",null,"Błąd");
        }
    }

    public ObservableList<ModelQuer5> getOblist(){
        return oblistQ5;
    }


    public static void infoBox(String infoMessage, String headerText, String title){
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setContentText(infoMessage);
        alert.setTitle(title);
        alert.setHeaderText(headerText);
        alert.showAndWait();}
}

