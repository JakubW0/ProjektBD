package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import sample.Modele.*;
import sample.TabController;
import sample.Table.*;

import java.net.URL;
import java.util.ResourceBundle;

public class StudentController implements Initializable {

    @FXML
    private TableView<ModelPrzedmioty> table;
    @FXML
    private TableColumn<ModelPrzedmioty, String> col_id;
    @FXML
    private TableColumn<ModelPrzedmioty, String> typ_id;
    @FXML
    private TableColumn<ModelPrzedmioty, String> nazwaString;
    @FXML
    private TableColumn<ModelPrzedmioty, String> ects;
    @FXML
    private TableColumn<ModelPrzedmioty, String> godz;
    @FXML
    private TableView<ModelGrupa> tableGrupa;
    @FXML
    private TableColumn<ModelGrupa, String> id_grupy;
    @FXML
    private TableColumn<ModelGrupa, String> numer_grupy;
    @FXML
    private TableView<ModelProwadzacy> tableProwadzacy;
    @FXML
    private TableColumn<ModelProwadzacy, String> id_prowadzacy;
    @FXML
    private TableColumn<ModelProwadzacy, String> id_tytul;
    @FXML
    private TableColumn<ModelProwadzacy, String> id_katedry;
    @FXML
    private TableColumn<ModelProwadzacy, String> imie_prowadzacy;
    @FXML
    private TableColumn<ModelProwadzacy, String> nazwisko_prowadzacy;
    @FXML
    private TableColumn<ModelProwadzacy, String> data_ur_prowa;
    @FXML
    private TableColumn<ModelProwadzacy, String> pensja;
    @FXML
    private TableColumn<ModelProwadzacy, String> dzieci;
    @FXML
    private TableView<ModelStudenci> tableStudenci;
    @FXML
    private TableColumn<ModelStudenci, String> id_student;
    @FXML
    private TableColumn<ModelStudenci, String> id_specjalnosc;
    @FXML
    private TableColumn<ModelStudenci, String> id_tryb;
    @FXML
    private TableColumn<ModelStudenci, String> id_kierunki;
    @FXML
    private TableColumn<ModelStudenci, String> id_semestr;
    @FXML
    private TableColumn<ModelStudenci, String> id_grupyStudent;
    @FXML
    private TableColumn<ModelStudenci, String> nr_albumu;
    @FXML
    private TableColumn<ModelStudenci, String> imie_studenta;
    @FXML
    private TableColumn<ModelStudenci, String> nazwisko_studenta;
    @FXML
    private TableColumn<ModelStudenci, String> data_urodzenia_student;
    @FXML
    private TableColumn<ModelStudenci, String> pesel_student;
    @FXML
    private TableColumn<ModelStudenci, String> stypendium;
    @FXML
    private TableView<ModelPlan> tablePlan;
    @FXML
    private TableColumn<ModelPlan, String> idPlan;
    @FXML
    private TableColumn<ModelPlan, String> idPrzedmiot;
    @FXML
    private TableColumn<ModelPlan, String> idProwadzacy;
    @FXML
    private TableColumn<ModelPlan, String> idSpecjalnosc;
    @FXML
    private TableColumn<ModelPlan, String> idGrupy;
    @FXML
    private TableColumn<ModelPlan, String> idSemestr;
    @FXML
    private TableColumn<ModelPlan, String> idTryb;
    @FXML
    private TableColumn<ModelPlan, String> idKierunek;
    @FXML
    private TableColumn<ModelPlan, String> tytul;
    @FXML
    private TableColumn<ModelPlan, String> nazwisko;
    @FXML
    private TableView<ModelKatedra> tableKatedra;
    @FXML
    private TableColumn<ModelKatedra, String> idKatedry;
    @FXML
    private TableColumn<ModelKatedra, String> idWydzial;
    @FXML
    private TableColumn<ModelKatedra, String> NazwaWydzialu;
    @FXML
    private TableView<ModelKierunek> tableKierunek;
    @FXML
    private TableColumn<ModelKierunek, String> idKierunekK;
    @FXML
    private TableColumn<ModelKierunek, String> idWydzialK;
    @FXML
    private TableColumn<ModelKierunek, String> NazwaKierunek;
    @FXML
    private TableView<ModelSemestr> tableSemestr;
    @FXML
    private TableColumn<ModelSemestr, String> idSemestrS;
    @FXML
    private TableColumn<ModelSemestr, String> nazwaSem;
    @FXML
    private TableView<ModelSpecjalnosci> tableSpecjalnsci;
    @FXML
    private TableColumn<ModelSpecjalnosci, String> idSpecjalnosci;
    @FXML
    private TableColumn<ModelSpecjalnosci, String> nazwaSpec;
    @FXML
    private TableView<ModelTryb> tableTryb;
    @FXML
    private TableColumn<ModelTryb, String> idTrybT;
    @FXML
    private TableColumn<ModelTryb, String> tryb;
    @FXML
    private TableView<ModelTypy> tableTyp;
    @FXML
    private TableColumn<ModelTypy, String> idTypT;
    @FXML
    private TableColumn<ModelTypy, String> nazwaTypy;
    @FXML
    private TableView<ModelTytul> tableTytul;
    @FXML
    private TableColumn<ModelTytul, String> idTytul;
    @FXML
    private TableColumn<ModelTytul, String> nazwaTytul;
    @FXML
    private TableView<ModelWydzial> tableWydzial;
    @FXML
    private TableColumn<ModelWydzial, String> idWydzialW;
    @FXML
    private TableColumn<ModelWydzial, String> nazwaWydzialu;
    @FXML
    private TextField idDodaj;
    @FXML
    private TabPane TabsP;
    @FXML
    private Button dodaj;
    @FXML
    private TextField jed;
    @FXML
    private TextField dwa;
    @FXML
    private TextField trzy;
    @FXML
    private TextField czt;
    @FXML
    private TextField pie;
    @FXML
    private CheckBox pokaz;
    @FXML
    private TextField sze;
    @FXML
    private TextField sie;
    @FXML
    private TextField osi;
    @FXML
    private TextField dzie;
    @FXML
    private TextField dzies;
    @FXML
    private TextField jede;
    @FXML
    private Button aktualizuj;
    @FXML
    private ComboBox<String> combo;


    @FXML
    private TableView<ModelStudenci> tableQ1;
    @FXML
    private TableColumn<ModelStudenci, String> id_student1;
    @FXML
    private TableColumn<ModelStudenci, String> id_specjalnosc1;
    @FXML
    private TableColumn<ModelStudenci, String> id_tryb1;
    @FXML
    private TableColumn<ModelStudenci, String> id_kierunki1;
    @FXML
    private TableColumn<ModelStudenci, String> id_semestr1;
    @FXML
    private TableColumn<ModelStudenci, String> id_grupyStudent1;
    @FXML
    private TableColumn<ModelStudenci, String> nr_albumu1;
    @FXML
    private TableColumn<ModelStudenci, String> imie_studenta1;
    @FXML
    private TableColumn<ModelStudenci, String> nazwisko_studenta1;
    @FXML
    private TableColumn<ModelStudenci, String> data_urodzenia_student1;
    @FXML
    private TableColumn<ModelStudenci, String> pesel_student1;
    @FXML
    private TableColumn<ModelStudenci, String> stypendium1;
    @FXML
    private Button q1Button;
    @FXML
    private TextField q1Bdziek;
    @FXML
    private TextField q1BKier;
    @FXML
    private TableView<ModelProwadzacy> tableQ2;
    @FXML
    private TableColumn<ModelProwadzacy, String> id_prowadzacy1;
    @FXML
    private TableColumn<ModelProwadzacy, String> id_tytul1;
    @FXML
    private TableColumn<ModelProwadzacy, String> id_katedry1;
    @FXML
    private TableColumn<ModelProwadzacy, String> imie_prowadzacy1;
    @FXML
    private TableColumn<ModelProwadzacy, String> nazwisko_prowadzacy1;
    @FXML
    private TableColumn<ModelProwadzacy, String> data_ur_prowa1;
    @FXML
    private TableColumn<ModelProwadzacy, String> pensja1;
    @FXML
    private TableColumn<ModelProwadzacy, String> dzieci1;
    @FXML
    private Button q2Button;
    @FXML
    private ComboBox<String> boxQ2;

    @FXML
    private TableView<ModelQuer3> tableQ3;
    @FXML
    private TableColumn<ModelQuer3, String> id_katedra;
    @FXML
    private TableColumn<ModelQuer3, String> nazwa_przed;
    @FXML
    private TableColumn<ModelQuer3, String> katedra;
    @FXML
    private TableColumn<ModelQuer3, String> grupa;
    @FXML
    private TableColumn<ModelQuer3, String> semestr;
    @FXML
    private Button q3Button;
    @FXML
    private TextField q3Grupa;
    @FXML
    private TextField q3Semestr;

    @FXML
    private TableView<ModelQuer4> tableQ4;
    @FXML
    private TableColumn<ModelQuer4, String> idPro;
    @FXML
    private TableColumn<ModelQuer4, String> tytulq4;
    @FXML
    private TableColumn<ModelQuer4, String> imieQ4;
    @FXML
    private TableColumn<ModelQuer4, String> nazwiskoQ4;
    @FXML
    private TableColumn<ModelQuer4, String> grupaQ4;
    @FXML
    private TableColumn<ModelQuer4, String> przedmiotQ4;
    @FXML
    private Button q4B;
    @FXML
    private TextField q4Grupa;
    @FXML
    private ComboBox<String> boxQ4;


    @FXML
    private TableView<ModelQuer5> tableQ5;
    @FXML
    private TableColumn<ModelQuer5, String> imieQ5;
    @FXML
    private TableColumn<ModelQuer5, String> nazwiskoQ5;
    @FXML
    private TableColumn<ModelQuer5, String> przedmiotQ5;
    @FXML
    private TableColumn<ModelQuer5, String> idProwadzacyQ5;
    @FXML
    private TableColumn<ModelQuer5, String> semestrQ5;
    @FXML
    private TableColumn<ModelQuer5, String> idTypZajecQ5;
    @FXML
    private TableColumn<ModelQuer5, String> godziny;
    @FXML
    private Button q5B;
    @FXML
    private TextField grupaQ5;

    @FXML
    private Tab tabPrzedmioty;
    @FXML
    private Button usun;
    @FXML
    private Tab tabGrupy;
    @FXML
    private Tab tabProwadzacy;
    @FXML
    private Tab tabStudenci;
    @FXML
    private Tab tabTytul;
    @FXML
    private Tab tabTypy;
    @FXML
    private Tab tabQuer;
    @FXML
    private Tab tabKierunki;
    @FXML
    private Tab tabKatedra;
    @FXML
    private Tab tabSemestr;
    @FXML
    private Tab tabSpecjalnosci;
    @FXML
    private Tab tabTryb;
    @FXML
    private Tab tabWydzialy;

    private String zapytajS,idprzedS,idtypS,nazwaS,ectsS,godzinyS;


    TablePlan tPLan = new TablePlan();


    TabController tab = new TabController();

    /* String[] Tabs = {}*/
    ObservableList<String> oblist = FXCollections.observableArrayList();
    ObservableList<String> oblistNazwa = FXCollections.observableArrayList();
    ObservableList<String> oblistNazwaQ4 = FXCollections.observableArrayList();



    public StudentController(){}


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        tabGrupy.setDisable(true);
        tabStudenci.setDisable(true);
        tabTytul.setDisable(true);
        tabTypy.setDisable(true);
        tabQuer.setDisable(true);
        tabProwadzacy.setDisable(true);
        tabPrzedmioty.setDisable(false);
        tabKierunki.setDisable(true);
        tabSemestr.setDisable(true);
        tabTryb.setDisable(true);
        tabKatedra.setDisable(true);
        tabWydzialy.setDisable(true);
        tabPrzedmioty.setDisable(true);
        tabSpecjalnosci.setDisable(true);


        tab.setTab(0);
        onTab();
        tytul.setVisible(false);
        nazwisko.setVisible(false);

        tPLan.setPlan();

        idPlan.setCellValueFactory(new PropertyValueFactory<>("idPlan"));
        idPrzedmiot.setCellValueFactory(new PropertyValueFactory<>("idPrzedmiot"));
        idProwadzacy.setCellValueFactory(new PropertyValueFactory<>("idProwadzacy"));
        tytul.setCellValueFactory(new PropertyValueFactory<>("tytul"));
        nazwisko.setCellValueFactory(new PropertyValueFactory<>("nazwisko"));
        idSpecjalnosc.setCellValueFactory(new PropertyValueFactory<>("idSpecjalnosc"));
        idGrupy.setCellValueFactory(new PropertyValueFactory<>("idGrupy"));
        idSemestr.setCellValueFactory(new PropertyValueFactory<>("idSemestr"));
        idTryb.setCellValueFactory(new PropertyValueFactory<>("idTryb"));
        idKierunek.setCellValueFactory(new PropertyValueFactory<>("idKierunek"));

        tablePlan.setItems(tPLan.getOblist());

}
    @FXML
    private void onDodaj()  {
        if(tab.getTab() == 0){

        }

        else if(tab.getTab() == 1){

        }
        else if(tab.getTab() == 2){

        }
        else if(tab.getTab() == 3){

        }
        else if(tab.getTab() == 4){
          /*  System.out.println(tPLan.getOblist().size()+1);
           // tPLan.setDodaj(tPLan.getOblist().size()+1,jed.getText(),dwa.getText(),trzy.getText(),czt.getText(),pie.getText(),sze.getText(),sie.getText());
            tablePlan.setItems(tPLan.getOblist());
            combo.setItems(comboWriterU());*/
        }
        else if(tab.getTab() == 5){

        }
        else if(tab.getTab() == 6){

        }
        else if(tab.getTab() == 7){

        }
        else if(tab.getTab() == 8){

        }
        else if(tab.getTab() == 9){

        }
        else if(tab.getTab() == 10){

        }
        else if(tab.getTab() == 11){

        }
        else if(tab.getTab() == 12){

        }
    }
    @FXML
    private void onUsun() {
        if(tab.getTab() == 0) {

        }
        else if(tab.getTab() == 1){

        }
        else if(tab.getTab() == 2){

        }
        else if(tab.getTab() == 3){

        }
        else if(tab.getTab() == 4){
            tPLan.setUsun(combo.getValue());
            tablePlan.setItems(tPLan.getOblist());
            combo.setItems(comboWriterU());
        }

        else if(tab.getTab() == 5){

        }
        else if(tab.getTab() == 6){

        }
        else if(tab.getTab() == 7){

        }
        else if(tab.getTab() == 8){

        }
        else if(tab.getTab() == 9){

        }
        else if(tab.getTab() == 10){

        }
        else if(tab.getTab() == 11){

        }
        else if(tab.getTab() == 12){

        }


    }
    @FXML
    private void onCombo(){
        if(getIndex()==0) {

        }
        if(getIndex()==1){

        }
        if(getIndex()==2){

        }
        if(getIndex()==3){


        }
        if(getIndex()==4){
            jed.setText(tPLan.getOblist().get(Integer.parseInt(combo.getValue()) - 1).getIdPrzedmiot());
            dwa.setText(tPLan.getOblist().get(Integer.parseInt(combo.getValue()) - 1).getIdProwadzacy());
            trzy.setText(tPLan.getOblist().get(Integer.parseInt(combo.getValue()) - 1).getIdSpecjalnosc());
            czt.setText(tPLan.getOblist().get(Integer.parseInt(combo.getValue()) - 1).getIdGrupy());
            pie.setText(tPLan.getOblist().get(Integer.parseInt(combo.getValue()) - 1).getIdSemestr());
            sze.setText(tPLan.getOblist().get(Integer.parseInt(combo.getValue()) - 1).getIdTryb());
            sie.setText(tPLan.getOblist().get(Integer.parseInt(combo.getValue()) - 1).getIdKierunek());
        }

    }
    @FXML
    private void onAktualizuj(){

    }
    @FXML
    private void onTab(){
        if(getIndex() == 0){
            setVisible(false,false,false,false,false,false,false,false,false,false,false);
            jed.setPromptText("Id przedmiot");
            dwa.setPromptText("Id typ zajec");
            trzy.setPromptText("Nazwa przedmiotu");
            czt.setPromptText("Ects");
            pie.setPromptText("Godziny");
            dodaj.setDisable(true);
            usun.setDisable(true);
            aktualizuj.setDisable(true);
            combo.setDisable(true);





            tab.setTab(0);
            comboWriterU();
        }
        if(getIndex() == 1 ){
            setVisible(false,false,false,false,false,false,false,false,false,false,false);
            dodaj.setDisable(true);
            usun.setDisable(true);
            aktualizuj.setDisable(true);
            combo.setDisable(true);
            tab.setTab(1);
            comboWriterU();
        }
        if(getIndex() == 2){
            setVisible(false,false,false,false,false,false,false,false,false,false,false);
            dodaj.setDisable(true);
            usun.setDisable(true);
            aktualizuj.setDisable(true);
            combo.setDisable(true);
            tab.setTab(2);
            comboWriterU();
        }
        if(getIndex() == 3){
            setVisible(false,false,false,false,false,false,false,false,false,false,false);

            tab.setTab(3);
            comboWriterU();
        }
        if(getIndex() == 4){
            setVisible(false,false,false,false,false,false,false,false,false,false,false);
            dodaj.setDisable(true);
            usun.setDisable(true);
            aktualizuj.setDisable(true);
            combo.setDisable(true);
            tab.setTab(4);
            comboWriterU();
        }
        if(getIndex() == 5 ){
            setVisible(false,false,false,false,false,false,false,false,false,false,false);
            dodaj.setDisable(true);
            usun.setDisable(true);
            aktualizuj.setDisable(true);
            combo.setDisable(true);
            tab.setTab(5);
        }
        if(getIndex() == 6 ){
            setVisible(false,false,false,false,false,false,false,false,false,false,false);
            dodaj.setDisable(true);
            usun.setDisable(true);
            aktualizuj.setDisable(true);
            combo.setDisable(true);
            tab.setTab(6);
        }
        if(getIndex() == 7 ){
            setVisible(false,false,false,false,false,false,false,false,false,false,false);
            dodaj.setDisable(true);
            usun.setDisable(true);
            aktualizuj.setDisable(true);
            combo.setDisable(true);
            tab.setTab(7);
        }
        if(getIndex() == 8 ){
            setVisible(false,false,false,false,false,false,false,false,false,false,false);

            dodaj.setDisable(true);
            usun.setDisable(true);
            aktualizuj.setDisable(true);
            combo.setDisable(true);
            tab.setTab(8);
        }
        if(getIndex() == 9 ){
            setVisible(false,false,false,false,false,false,false,false,false,false,false);
            dodaj.setDisable(true);
            usun.setDisable(true);
            aktualizuj.setDisable(true);
            combo.setDisable(true);
            tab.setTab(9);
        }
        if(getIndex() == 10 ){
            setVisible(false,false,false,false,false,false,false,false,false,false,false);
            dodaj.setDisable(true);
            usun.setDisable(true);
            aktualizuj.setDisable(true);
            combo.setDisable(true);
            tab.setTab(10);
        }
        if(getIndex() == 11 ){
            setVisible(false,false,false,false,false,false,false,false,false,false,false);
            dodaj.setDisable(true);
            usun.setDisable(true);
            aktualizuj.setDisable(true);
            combo.setDisable(true);
            tab.setTab(11);
        }
        if(getIndex() == 12 ){
            setVisible(false,false,false,false,false,false,false,false,false,false,false);
            dodaj.setDisable(true);
            usun.setDisable(true);
            aktualizuj.setDisable(true);
            combo.setDisable(true);
            tab.setTab(12);
        }
        if(getIndex() == 13 ){
            setVisible(false,false,false,false,false,false,false,false,false,false,false);
            dodaj.setDisable(true);
            usun.setDisable(true);
            aktualizuj.setDisable(true);
            combo.setDisable(true);
            tab.setTab(13);

        }


    }
    @FXML
    private void onCheck(){

        if(pokaz.isSelected() == true){


            tytul.setVisible(true);
            nazwisko.setVisible(true);
            tPLan.setPlanNazwy();
            tablePlan.setItems(tPLan.getOblistNazwy());



        }


        if(pokaz.isSelected() == false){






            tytul.setVisible(false);
            nazwisko.setVisible(false);
            tPLan.OblistClearNazwy();
            tPLan.setPlan();
            tablePlan.setItems(tPLan.getOblist());


        }

    }





    public  ObservableList<String>  comboWriterU(){
        if(tab.getTab() == 0){
           }
        else if(tab.getTab() == 1){

        }
        else if(tab.getTab() == 2){

        }

        else if(tab.getTab() == 3){
        }
        else if(tab.getTab() == 4){
            combo.getItems().clear();
            tPLan.OblistClear();
            tPLan.setPlan();
            for(int i =0;i< tPLan.getOblist().size() ;i++){
                oblist.add(tPLan.getOblist().get(i).getIdPlan());
            }
            return oblist;}
        else if(tab.getTab() == 5){

            return oblist;}
        else if(tab.getTab() == 6){
           }
        else if(tab.getTab() == 7) {
        }
        else if(tab.getTab() == 8){


            return oblist;}
        else if(tab.getTab() == 9){


            return oblist;}
        else if(tab.getTab() == 10){

        }
        else if(tab.getTab() == 11){
        }
        else if(tab.getTab() == 12){
           }
        return oblist;
    }

    public Integer getIndex(){
        return TabsP.getSelectionModel().getSelectedIndex();
    }

    public void setVisible(Boolean s1,Boolean s2,Boolean s3,Boolean s4,Boolean s5,Boolean s6,Boolean s7,Boolean s8,Boolean s9,Boolean s10,Boolean s11){
        combo.setVisible(true);
        jed.setVisible(s1);
        dwa.setVisible(s2);
        trzy.setVisible(s3);
        czt.setVisible(s4);
        pie.setVisible(s5);
        sze.setVisible(s6);
        sie.setVisible(s7);
        osi.setVisible(s8);
        dzie.setVisible(s9);
        dzies.setVisible(s10);
        jede.setVisible(s11);
    }


    public void onQ1B(){



    }

    public void onQ2B(){



    }
    public void onQ3B(){




    }
    public void onQ4B(){


    }

    public void onQ5B(){

    }



    public static void infoBox(String infoMessage, String headerText, String title){
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setContentText(infoMessage);
        alert.setTitle(title);
        alert.setHeaderText(headerText);
        alert.showAndWait();}


}
