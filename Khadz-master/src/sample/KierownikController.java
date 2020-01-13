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

public class KierownikController implements Initializable {

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


    private String zapytajS,idprzedS,idtypS,nazwaS,ectsS,godzinyS;

    TablePrzedmioty tPrzedmioty = new TablePrzedmioty();
    TablePlan tPLan = new TablePlan();
    TableGrupa tGrupa = new TableGrupa();
    TableKatedra tKatedra = new TableKatedra();
    TableProwadzacy tProwadzacy = new TableProwadzacy();
    TableKierunek tKierunek = new TableKierunek();
    TableSemestr tSemestr = new TableSemestr();
    TableSpecjalnosci tSpecjalnosci = new TableSpecjalnosci();
    TableTryb tTryb = new TableTryb();
    TableWydzial tWydzial = new TableWydzial();
    TableQuer3 tQ3 = new TableQuer3();
    TableQuer4 tQ4 = new TableQuer4();
    TableQ5 tQ5 = new TableQ5();

    TabController tab = new TabController();

    /* String[] Tabs = {}*/
    ObservableList<String> oblist = FXCollections.observableArrayList();
    ObservableList<String> oblistNazwa = FXCollections.observableArrayList();
    ObservableList<String> oblistNazwaQ4 = FXCollections.observableArrayList();



    public KierownikController(){}


    @Override
    public void initialize(URL location, ResourceBundle resources) {
      //  tabProwadzacy.setDisable(true);
        tabStudenci.setDisable(true);
        tabTytul.setDisable(true);
        tabTypy.setDisable(true);
        tabQuer.setDisable(true);


        tab.setTab(0);
        onTab();
        tytul.setVisible(false);
        nazwisko.setVisible(false);
        tPrzedmioty.setPrzedmioty();
        tProwadzacy.setProwadzacy();
        tGrupa.setGrupy();
        tPLan.setPlan();
        tKatedra.setKatedra();
        tKierunek.setKierunek();
        tSemestr.setSemestr();
        tSpecjalnosci.setSpecjalnosci();
        tTryb.setTryb();

        tWydzial.setWydzial();
        tQ4.setQuer4();



        col_id.setCellValueFactory(new PropertyValueFactory<>("id"));
        typ_id.setCellValueFactory(new PropertyValueFactory<>("typId"));
        nazwaString.setCellValueFactory(new PropertyValueFactory<>("nazwa"));
        ects.setCellValueFactory(new PropertyValueFactory<>("ects"));
        godz.setCellValueFactory(new PropertyValueFactory<>("godz"));

        id_grupy.setCellValueFactory(new PropertyValueFactory<>("idgrupy"));
        numer_grupy.setCellValueFactory(new PropertyValueFactory<>("numergrupy"));

        id_prowadzacy.setCellValueFactory(new PropertyValueFactory<>("id_prowadzacy"));
        id_tytul.setCellValueFactory(new PropertyValueFactory<>("Id_tytul"));
        id_katedry.setCellValueFactory(new PropertyValueFactory<>("id_katedry"));
        imie_prowadzacy.setCellValueFactory(new PropertyValueFactory<>("imie_prowadzacy"));
        nazwisko_prowadzacy.setCellValueFactory(new PropertyValueFactory<>("nazwisko_prowadzacy"));
        data_ur_prowa.setVisible(false);
        pensja.setVisible(false);
        dzieci.setVisible(false);

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

        idKatedry.setCellValueFactory(new PropertyValueFactory<>("idKatedry"));
        idWydzial.setCellValueFactory(new PropertyValueFactory<>("idWydzial"));
        NazwaWydzialu.setCellValueFactory(new PropertyValueFactory<>("nazwaKatedry"));

        idKierunekK.setCellValueFactory(new PropertyValueFactory<>("idKierunek"));
        idWydzialK.setCellValueFactory(new PropertyValueFactory<>("idWydzial"));
        NazwaKierunek.setCellValueFactory(new PropertyValueFactory<>("nazwaKierunek"));

        idSemestrS.setCellValueFactory(new PropertyValueFactory<>("idSemestr"));
        nazwaSem.setCellValueFactory(new PropertyValueFactory<>("numer_sem"));

        idSpecjalnosci.setCellValueFactory(new PropertyValueFactory<>("idSpecjalnosc"));
        nazwaSpec.setCellValueFactory(new PropertyValueFactory<>("nazwaSpecjalnosci"));

        idTrybT.setCellValueFactory(new PropertyValueFactory<>("idTryb"));
        tryb.setCellValueFactory(new PropertyValueFactory<>("nazwaTrybu"));


        idWydzialW.setCellValueFactory(new PropertyValueFactory<>("idWydzial"));
        nazwaWydzialu.setCellValueFactory(new PropertyValueFactory<>("nazwaWydzialu"));


        id_student1.setCellValueFactory(new PropertyValueFactory<>("idStudent"));
        id_specjalnosc1.setCellValueFactory(new PropertyValueFactory<>("id_specjalnosc"));
        id_tryb1.setCellValueFactory(new PropertyValueFactory<>("id_tryb"));
        id_kierunki1.setCellValueFactory(new PropertyValueFactory<>("id_kierunek"));
        id_semestr1.setCellValueFactory(new PropertyValueFactory<>("id_semestr"));
        id_grupyStudent1.setCellValueFactory(new PropertyValueFactory<>("id_grupy"));
        nr_albumu1.setCellValueFactory(new PropertyValueFactory<>("nr_albumu"));
        imie_studenta1.setCellValueFactory(new PropertyValueFactory<>("imie_studenta"));
        nazwisko_studenta1.setCellValueFactory(new PropertyValueFactory<>("nazwisko_studenta"));
        data_urodzenia_student1.setCellValueFactory(new PropertyValueFactory<>("data_urodzenia_student"));
        pesel_student1.setCellValueFactory(new PropertyValueFactory<>("pesel_student"));
        stypendium1.setCellValueFactory(new PropertyValueFactory<>("stypendium"));

        id_prowadzacy1.setCellValueFactory(new PropertyValueFactory<>("id_prowadzacy"));
        id_tytul1.setCellValueFactory(new PropertyValueFactory<>("Id_tytul"));
        id_katedry1.setCellValueFactory(new PropertyValueFactory<>("id_katedry"));
        imie_prowadzacy1.setCellValueFactory(new PropertyValueFactory<>("imie_prowadzacy"));
        nazwisko_prowadzacy1.setCellValueFactory(new PropertyValueFactory<>("nazwisko_prowadzacy"));
        data_ur_prowa1.setCellValueFactory(new PropertyValueFactory<>("data_urodzenia_prowadzacy"));
        pensja1.setCellValueFactory(new PropertyValueFactory<>("pensja"));
        dzieci1.setCellValueFactory(new PropertyValueFactory<>("ilosc_dzieci"));


        id_katedra.setCellValueFactory(new PropertyValueFactory<>("idKatedra"));
        nazwa_przed.setCellValueFactory(new PropertyValueFactory<>("przedmiot"));
        katedra.setCellValueFactory(new PropertyValueFactory<>("nazwaKatedry"));
        grupa.setCellValueFactory(new PropertyValueFactory<>("idgrupy"));
        semestr.setCellValueFactory(new PropertyValueFactory<>("idSemestr"));

        idPro.setCellValueFactory(new PropertyValueFactory<>("id"));
        tytulq4.setCellValueFactory(new PropertyValueFactory<>("tytul"));
        imieQ4.setCellValueFactory(new PropertyValueFactory<>("imie"));
        nazwiskoQ4.setCellValueFactory(new PropertyValueFactory<>("nazwisko"));
        przedmiotQ4.setCellValueFactory(new PropertyValueFactory<>("przedmiot"));



        imieQ5.setCellValueFactory(new PropertyValueFactory<>("imie"));
        nazwiskoQ5.setCellValueFactory(new PropertyValueFactory<>("nazwisko"));
        przedmiotQ5.setCellValueFactory(new PropertyValueFactory<>("przedmiot"));
        idProwadzacyQ5.setCellValueFactory(new PropertyValueFactory<>("idProwadzacy"));
        semestrQ5.setCellValueFactory(new PropertyValueFactory<>("idSemestr"));
        idTypZajecQ5.setCellValueFactory(new PropertyValueFactory<>("idTypZajec"));
        godziny.setCellValueFactory(new PropertyValueFactory<>("godziny"));



        combo.setItems(comboWriter());
        boxQ2.setItems(comboQ2());
        boxQ4.setItems(comboQ4());



        table.setItems(tPrzedmioty.getOblist());
        tableGrupa.setItems(tGrupa.getOblist());
        tablePlan.setItems(tPLan.getOblist());
        tableKatedra.setItems(tKatedra.getOblist());
        tableProwadzacy.setItems(tProwadzacy.getOblist());
        tableKierunek.setItems(tKierunek.getOblist());
        tableSemestr.setItems(tSemestr.getOblist());
        tableSpecjalnsci.setItems(tSpecjalnosci.getOblist());
        tableTryb.setItems(tTryb.getOblist());

        tableWydzial.setItems(tWydzial.getOblist());





    }
    @FXML
    private void onDodaj()  {
        if(tab.getTab() == 0){
            tPrzedmioty.setDodaj(idDodaj.getText(), jed.getText(), dwa.getText(), trzy.getText(), czt.getText());
            table.setItems(tPrzedmioty.getOblist());
            combo.setItems(comboWriter());
        }

        else if(tab.getTab() == 1){

        }
        else if(tab.getTab() == 2){

        }
        else if(tab.getTab() == 3){

        }
        else if(tab.getTab() == 4){
            System.out.println(tPLan.getOblist().size()+1);
            tPLan.setDodaj(idDodaj.getText(),jed.getText(),dwa.getText(),trzy.getText(),czt.getText(),pie.getText(),sze.getText(),sie.getText());
            tablePlan.setItems(tPLan.getOblist());
            combo.setItems(comboWriterU());
        }
        else if(tab.getTab() == 5){
            System.out.println(tKatedra.getOblist().size()+1);
            tKatedra.setDodaj(idDodaj.getText(),jed.getText(),dwa.getText());
            tableKatedra.setItems(tKatedra.getOblist());
            combo.setItems(comboWriterU());
        }
        else if(tab.getTab() == 6){
            System.out.println(tKierunek.getOblist().size()+1);
            tKierunek.setDodaj(idDodaj.getText(),jed.getText(),dwa.getText());
            tableKierunek.setItems(tKierunek.getOblist());
            combo.setItems(comboWriterU());
        }
        else if(tab.getTab() == 7){
            System.out.println(tSemestr.getOblist().size()+1);
            tSemestr.setDodaj(idDodaj.getText(),jed.getText());
            tableSemestr.setItems(tSemestr.getOblist());
            combo.setItems(comboWriterU());
        }
        else if(tab.getTab() == 8){
            System.out.println(tSpecjalnosci.getOblist().size()+1);
            tSpecjalnosci.setDodaj(idDodaj.getText(),jed.getText());
            tableSpecjalnsci.setItems(tSpecjalnosci.getOblist());
            combo.setItems(comboWriterU());
        }
        else if(tab.getTab() == 9){
            System.out.println(tTryb.getOblist().size()+1);
            tTryb.setDodaj(idDodaj.getText(),jed.getText());
            tableTryb.setItems(tTryb.getOblist());
            combo.setItems(comboWriterU());
        }
        else if(tab.getTab() == 10){

        }
        else if(tab.getTab() == 11){

        }
        else if(tab.getTab() == 12){
            System.out.println(tWydzial.getOblist().size()+1);
            tWydzial.setDodaj(idDodaj.getText(),jed.getText());
            tableWydzial.setItems(tWydzial.getOblist());
            combo.setItems(comboWriterU());
        }
    }
    @FXML
    private void onUsun() {
        if(tab.getTab() == 0) {
            tPrzedmioty.setUsun(combo.getValue());
            table.setItems(tPrzedmioty.getOblist());
            combo.setItems(comboWriterU());
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
            tKatedra.setUsun(combo.getValue());
            tableKatedra.setItems(tKatedra.getOblist());
            combo.setItems(comboWriterU());
        }
        else if(tab.getTab() == 6){
            tKierunek.setUsun(combo.getValue());
            tableKierunek.setItems(tKierunek.getOblist());
            combo.setItems(comboWriterU());
        }
        else if(tab.getTab() == 7){
            tSemestr.setUsun(combo.getValue());
            tableSemestr.setItems(tSemestr.getOblist());
            combo.setItems(comboWriterU());
        }
        else if(tab.getTab() == 8){
            tSpecjalnosci.setUsun(combo.getValue());
            tableSpecjalnsci.setItems(tSpecjalnosci.getOblist());
            combo.setItems(comboWriterU());
        }
        else if(tab.getTab() == 9){
            tTryb.setUsun(combo.getValue());
            tableTryb.setItems(tTryb.getOblist());
            combo.setItems(comboWriterU());
        }
        else if(tab.getTab() == 10){

        }
        else if(tab.getTab() == 11){

        }
        else if(tab.getTab() == 12){
            tWydzial.setUsun(combo.getValue());
            tableWydzial.setItems(tWydzial.getOblist());
            combo.setItems(comboWriterU());
        }


    }
    @FXML
    private void onCombo(){
        if(getIndex()==0) {
            jed.setText(tPrzedmioty.getOblist().get(Integer.parseInt(combo.getValue()) - 1).getTypId());
            dwa.setText(tPrzedmioty.getOblist().get(Integer.parseInt(combo.getValue()) - 1).getNazwa());
            trzy.setText(tPrzedmioty.getOblist().get(Integer.parseInt(combo.getValue()) - 1).getEcts());
            czt.setText(tPrzedmioty.getOblist().get(Integer.parseInt(combo.getValue()) - 1).getGodz());
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
        if(tab.getTab() == 0) {
            tPrzedmioty.setAktualizuj(combo.getValue(), jed.getText(), dwa.getText(), trzy.getText(), czt.getText());
            table.setItems(tPrzedmioty.getOblist());
            combo.setItems(comboWriterU());
        }
        else if(tab.getTab() == 1){
            tGrupa.setAktualizuj(combo.getValue(), jed.getText());

            tableGrupa.setItems(tGrupa.getOblist());
            combo.setItems(comboWriterU());
        }
        else if(tab.getTab() == 2){
            tProwadzacy.setAktualizuj(combo.getValue(), jed.getText(), dwa.getText(), trzy.getText(), czt.getText(),pie.getText(),sze.getText(),sie.getText());

            tableProwadzacy.setItems(tProwadzacy.getOblist());
            combo.setItems(comboWriterU());
        }
        else if(tab.getTab() == 3){

        }
        else if(tab.getTab() == 4){
            tPLan.setAktualizuj(combo.getValue(), jed.getText(), dwa.getText(), trzy.getText(), czt.getText(),pie.getText(),sze.getText(),sie.getText());

            tablePlan.setItems(tPLan.getOblist());
            combo.setItems(comboWriterU());
        }

        else if(tab.getTab() == 5){
            tKatedra.setAktualizuj(combo.getValue(), jed.getText(), dwa.getText());

            tableKatedra.setItems(tKatedra.getOblist());
            combo.setItems(comboWriterU());
        }
        else if(tab.getTab() == 6){
            tKierunek.setAktualizuj(combo.getValue(), jed.getText(), dwa.getText());

            tableKierunek.setItems(tKierunek.getOblist());
            combo.setItems(comboWriterU());
        }
        else if(tab.getTab() == 7){
            tSemestr.setAktualizuj(combo.getValue(), jed.getText());

            tableSemestr.setItems(tSemestr.getOblist());
            combo.setItems(comboWriterU());
        }
        else if(tab.getTab() == 8){
            tSpecjalnosci.setAktualizuj(combo.getValue(), jed.getText());

            tableSpecjalnsci.setItems(tSpecjalnosci.getOblist());
            combo.setItems(comboWriterU());
        }
        else if(tab.getTab() == 9){
            tTryb.setAktualizuj(combo.getValue(), jed.getText());

            tableTryb.setItems(tTryb.getOblist());
            combo.setItems(comboWriterU());
        }
        else if(tab.getTab() == 10){

        }
        else if(tab.getTab() == 11){

        }
        else if(tab.getTab() == 12){
            tWydzial.setAktualizuj(combo.getValue(), jed.getText());

            tableWydzial.setItems(tWydzial.getOblist());
            combo.setItems(comboWriterU());
        }

    }


    @FXML
    private void onTab(){
        if(getIndex() == 0){
            setVisible(false,false,false,false,false,false,false,false,false,false,false);
            idDodaj.setVisible(false);
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
            idDodaj.setVisible(false);
            dodaj.setDisable(true);
            usun.setDisable(true);
            aktualizuj.setDisable(true);
            combo.setDisable(true);
            tab.setTab(1);
            comboWriterU();
        }
        if(getIndex() == 2){
            setVisible(false,false,false,false,false,false,false,false,false,false,false);
            idDodaj.setVisible(false);
            dodaj.setDisable(true);
            usun.setDisable(true);
            aktualizuj.setDisable(true);
            combo.setDisable(true);
            tab.setTab(2);
            comboWriterU();
        }
        if(getIndex() == 3){
            setVisible(true,true,true,true,true,true,true,true,true,true,true);

            tab.setTab(3);
            comboWriterU();
        }
        if(getIndex() == 4){
            setVisible(true,true,true,true,true,true,true,false,false,false,false);
            idDodaj.setVisible(true);
            jed.setPromptText("Id przedmiot");
            dwa.setPromptText("Id prowadzacy");
            trzy.setPromptText("Id specjalnosc");
            czt.setPromptText("Id grupy");
            pie.setPromptText("Id semestr");
            sze.setPromptText("Id tryb");
            sie.setPromptText("Id kierunek");
            dodaj.setDisable(false);
            usun.setDisable(false);
            aktualizuj.setDisable(false);
            combo.setDisable(false);

            tab.setTab(4);
            comboWriterU();
        }
        if(getIndex() == 5 ){
            setVisible(false,false,false,false,false,false,false,false,false,false,false);
            idDodaj.setVisible(false);
            dodaj.setDisable(true);
            usun.setDisable(true);
            aktualizuj.setDisable(true);
            combo.setDisable(true);
            tab.setTab(5);
        }
        if(getIndex() == 6 ){
            setVisible(false,false,false,false,false,false,false,false,false,false,false);
            idDodaj.setVisible(false);
            dodaj.setDisable(true);
            usun.setDisable(true);
            aktualizuj.setDisable(true);
            combo.setDisable(true);
            tab.setTab(6);
        }
        if(getIndex() == 7 ){
            setVisible(false,false,false,false,false,false,false,false,false,false,false);
            idDodaj.setVisible(false);
            dodaj.setDisable(true);
            usun.setDisable(true);
            aktualizuj.setDisable(true);
            combo.setDisable(true);
            tab.setTab(7);
        }
        if(getIndex() == 8 ){
            setVisible(false,false,false,false,false,false,false,false,false,false,false);
            idDodaj.setVisible(false);

            dodaj.setDisable(true);
            usun.setDisable(true);
            aktualizuj.setDisable(true);
            combo.setDisable(true);
            tab.setTab(8);
        }
        if(getIndex() == 9 ){
            setVisible(false,false,false,false,false,false,false,false,false,false,false);
            idDodaj.setVisible(false);
            dodaj.setDisable(true);
            usun.setDisable(true);
            aktualizuj.setDisable(true);
            combo.setDisable(true);
            tab.setTab(9);
        }
        if(getIndex() == 10 ){
            setVisible(false,false,false,false,false,false,false,false,false,false,false);
            idDodaj.setVisible(false);
            dodaj.setDisable(true);
            usun.setDisable(true);
            aktualizuj.setDisable(true);
            combo.setDisable(true);
            tab.setTab(10);
        }
        if(getIndex() == 11 ){
            setVisible(false,false,false,false,false,false,false,false,false,false,false);
            idDodaj.setVisible(false);
            dodaj.setDisable(true);
            usun.setDisable(true);
            aktualizuj.setDisable(true);
            combo.setDisable(true);
            tab.setTab(11);
        }
        if(getIndex() == 12 ){
            setVisible(false,false,false,false,false,false,false,false,false,false,false);
            idDodaj.setVisible(false);
            dodaj.setDisable(true);
            usun.setDisable(true);
            aktualizuj.setDisable(true);
            combo.setDisable(true);
            tab.setTab(12);
        }
        if(getIndex() == 13 ){
            setVisible(false,false,false,false,false,false,false,false,false,false,false);
            idDodaj.setVisible(false);
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
            tProwadzacy.setProwadzacyNazwy();
            tPrzedmioty.setPrzedmiotyNazwy();
            tytul.setVisible(true);
            nazwisko.setVisible(true);
            tPLan.setPlanNazwy();
            tablePlan.setItems(tPLan.getOblistNazwy());

            tKatedra.setKatedraNazwy();

            tKierunek.setKierunekNazwa();

        }


        if(pokaz.isSelected() == false){
            tProwadzacy.setClearOblist();
            tProwadzacy.setProwadzacy();

            tPrzedmioty.setClearOblist();
            tPrzedmioty.setPrzedmioty();



            tytul.setVisible(false);
            nazwisko.setVisible(false);
            tPLan.OblistClearNazwy();
            tPLan.setPlan();
            tablePlan.setItems(tPLan.getOblist());


            tKatedra.setOblistClear();
            tKatedra.setKatedra();

            tKierunek.setOblistClear();
            tKierunek.setKierunek();
        }

    }

    public  ObservableList<String>  comboWriter(){
        oblist.clear();
        combo.getItems().clear();
        for(int i =0;i< tPrzedmioty.getOblist().size() ;i++){
            oblist.add(tPrzedmioty.getOblist().get(i).getId());
        }
        return oblist;
    }

    public  ObservableList<String>  comboQ2(){
        oblistNazwa.clear();
        boxQ2.getItems().clear();
        for(int i =0;i< tKatedra.getOblist().size() ;i++){
            oblistNazwa.add(tKatedra.getOblist().get(i).getNazwaKatedry());
        }
        return oblistNazwa;
    }
    public  ObservableList<String>  comboQ4(){
        oblistNazwaQ4.clear();
        boxQ4.getItems().clear();
        for(int i =0;i< tQ4.getOblist().size() ;i++){
            oblistNazwaQ4.add(tQ4.getOblist().get(i).getPrzedmiot());
        }
        return oblistNazwaQ4;
    }



    public  ObservableList<String>  comboWriterU(){
        if(tab.getTab() == 0){
            combo.getItems().clear();
            tPrzedmioty.setClearOblist();
            tPrzedmioty.setPrzedmioty();
            for(int i =0;i< tPrzedmioty.getOblist().size() ;i++){
                oblist.add(tPrzedmioty.getOblist().get(i).getId());
            }
            return oblist;}
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
            combo.getItems().clear();
            tKatedra.setClearOblist();
            tKatedra.setKatedra();
            for(int i =0;i< tKatedra.getOblist().size() ;i++){
                oblist.add(tKatedra.getOblist().get(i).getIdKatedry());
            }
            return oblist;}
        else if(tab.getTab() == 6){
            combo.getItems().clear();
            tKierunek.setOblistClear();
            tKierunek.setKierunek();
            for(int i =0;i< tKierunek.getOblist().size() ;i++){
                oblist.add(tKierunek.getOblist().get(i).getIdKierunek());
            }
            return oblist;}
        else if(tab.getTab() == 7){
            combo.getItems().clear();
            tSemestr.setClearOblist();
            tSemestr.setSemestr();
            for(int i =0;i< tSemestr.getOblist().size() ;i++){
                oblist.add(tSemestr.getOblist().get(i).getIdSemestr());
            }
            return oblist;}
        else if(tab.getTab() == 8){
            combo.getItems().clear();
            tSpecjalnosci.setClearOblist();
            tSpecjalnosci.setSpecjalnosci();
            for(int i =0;i< tSpecjalnosci.getOblist().size() ;i++){
                oblist.add(tSpecjalnosci.getOblist().get(i).getIdSpecjalnosc());
            }
            return oblist;}
        else if(tab.getTab() == 9){
            combo.getItems().clear();
            tTryb.setClearOblist();
            tTryb.setTryb();
            for(int i =0;i< tTryb.getOblist().size() ;i++){
                oblist.add(tTryb.getOblist().get(i).getIdTryb());
            }
            return oblist;}
        else if(tab.getTab() == 10){

         }
        else if(tab.getTab() == 11){
          }
        else if(tab.getTab() == 12){
            combo.getItems().clear();
            tWydzial.setClearOblist();
            tWydzial.setWydzial();
            for(int i =0;i< tWydzial.getOblist().size() ;i++){
                oblist.add(tWydzial.getOblist().get(i).getIdWydzial());
            }
            return oblist;}
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

        tQ3.querka(q3Semestr.getText(), q3Grupa.getText());
        tableQ3.setItems(tQ3.getOblist());


    }
    public void onQ4B(){

        tQ4.querka(q4Grupa.getText(), boxQ4.getValue());
        tableQ4.setItems(tQ4.getOblist());
    }

    public void onQ5B(){

        tQ5.querka(grupaQ5.getText());
        tableQ5.setItems(tQ5.getOblist());
    }



    public static void infoBox(String infoMessage, String headerText, String title){
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setContentText(infoMessage);
        alert.setTitle(title);
        alert.setHeaderText(headerText);
        alert.showAndWait();}


}
