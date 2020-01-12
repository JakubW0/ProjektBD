package sample.Table;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.Alert;
import sample.ConnectTable;
import sample.Modele.ModelQuer3;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TableQuer3 {

    ObservableList<ModelQuer3> oblistQ3 = FXCollections.observableArrayList();
    public TableQuer3(){}
    public void querka(String semestr, String grupa) {
        try {
            oblistQ3.clear();
            Connection conn = ConnectTable.connectdb();
            ResultSet rs = conn.createStatement().executeQuery("SELECT katedra.id_katedry,przedmioty.nazwa_przedmiotu,katedra.nazwa_katedry, plan.id_grupy,plan.id_semestr \n" +
                    "FROM prowadzacy \n" +
                    "INNER JOIN plan \n" +
                    "ON prowadzacy.id_prowadzacy = plan.id_prowadzacy \n" +
                    "INNER JOIN katedra \n" +
                    "ON prowadzacy.id_katedry=katedra.id_katedry \n" +
                     "INNER JOIN przedmioty \n"+
                    "ON plan.Id_przedmiot=przedmioty.Id_przedmiot \n" +
                    "WHERE plan.id_semestr = "+semestr+" AND plan.id_grupy = "+grupa+" \n"
                    );
            while (rs.next()) {
                oblistQ3.add(new ModelQuer3(rs.getString("katedra.id_katedry"),
                        rs.getString("przedmioty.nazwa_przedmiotu"),
                        rs.getString("katedra.nazwa_katedry"),
                        rs.getString("plan.id_grupy"),
                        rs.getString("plan.id_semestr")
                ));
            }
            conn.close();
        } catch (SQLException e) {
            infoBox("Źle podane dane, przyjmowane są jedynie liczby",null,"Błąd");
        }
    }

    public ObservableList<ModelQuer3> getOblist(){
        return oblistQ3;
    }
    public static void infoBox(String infoMessage, String headerText, String title){
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setContentText(infoMessage);
        alert.setTitle(title);
        alert.setHeaderText(headerText);
        alert.showAndWait();}
}
