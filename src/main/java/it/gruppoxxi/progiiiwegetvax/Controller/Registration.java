package it.gruppoxxi.progiiiwegetvax.Controller;

import it.gruppoxxi.progiiiwegetvax.Model.*;
import it.gruppoxxi.progiiiwegetvax.App;
import it.gruppoxxi.progiiiwegetvax.Database.DatabaseConnection;
import it.gruppoxxi.progiiiwegetvax.Model.FactoryRegistration;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import java.util.*;
import java.io.IOException;


public class Registration {
    Registration()
    {
    }

    private TextField NomeT;
    private TextField CognomeT;
    private TextField Data_di_NascitaT;
    private TextField Citta_NataleT;
    private TextField CittaT;
    private TextField ProvinciaT;
    private TextField CAPT;
    private TextField Codice_FiscaleT;
    private TextField TesseraSanitariaT;
    private TextField UsernameT;
    private PasswordField PasswordT;
    private PasswordField ConfermePassword;
    private RadioButton Ruolo1;
    private RadioButton Ruolo2;
    private RadioButton Ruolo3;
    private TextField MailT;
    private Label MailLabel;
    private TextField Numero_di_TelefonoT;
    private TextField Codice_Ordine_dei_MediciT;
    private TextField codice_IdentificativoT;
    private Label PasswordMessage;
    private Label ErrorMessage;
    private Label registrazioneCorretta;
    private Label DuplicateError;

    public void userRegistrazione(ActionEvent event){
        if(!NomeT.getText().isBlank() && !CognomeT.getText().isBlank() &&
            !Data_di_NascitaT.getText().isBlank() && !Citta_NataleT.getText().isBlank()
            && !CittaT.getText().isBlank() && !ProvinciaT.getText().isBlank()
            && !CAPT.getText().isBlank() && !Codice_FiscaleT.getText().isBlank()
            && !TesseraSanitariaT.getText().isBlank() && !UsernameT.getText().isBlank()
            && !PasswordT.getText().isBlank() && (Ruolo1.isSelected() || Ruolo2.isSelected()
            || Ruolo3.isSelected()) && !MailT.getText().isBlank() && !Numero_di_TelefonoT.getText().isBlank()
            && !Codice_Ordine_dei_MediciT.getText().isBlank() && !codice_IdentificativoT.getText().isBlank())
            registrazione();
        else
            ErrorMessage.setText("Controlla i campi mancanti!");
    }

    public void registrazione() throws IndexOutOfBoundsException{
        App m = new App();

        /* Connessione al database
        DatabaseConnection connectionNow = new DatabaseConnection();
        Connection connectDB = connectNow.getConnection();
        */
        if(Ruolo1.isSelected()==true)
        {
            Utente nuovoUtente = (Vaccinando) (FactoryRegistration.createUtente(1,NomeT.getText(),CognomeT.getText(),
                    Data_di_NascitaT.getText(),Citta_NataleT.getText(),CittaT.getText(), ProvinciaT.getText(),CAPT.getText(),Codice_FiscaleT.getText(),
                    TesseraSanitariaT.getText(),UsernameT.getText(),PasswordT.getText(),MailT.getText(), Numero_di_TelefonoT.getText(),Codice_Ordine_dei_MediciT.getText(),
                    codice_IdentificativoT.getText()));
            /*Inserimento dati nel Database
            String insertFields = "INSERT INTO Vaccinando(campi) VALUES ('";
            String insertValues = ;
            String insertToRegister = insertFields + insertValues;
            */
            try {
                String espressione = "^[0-9a-z]([-_.]?[0-9a-z])*@[0-9a-z]([-.]?[0-9a-z])*.[a-z]{2,4}$";
                if (MailT.getText().matches(espressione)) {
                    MailLabel.setText("");
                    if (PasswordT.getText().equals(ConfermePassword.getText())) {
                        registrazioneCorretta.setText("Utente registrato con successo!");
                    } else {
                        PasswordMessage.setText("Password non coincidenti!");
                    }
                } else
                    MailLabel.setText("Mail non valida!");
            }
            catch(Exception e){
                DuplicateError.setText("Email o Username già in uso");
                e.printStackTrace();
                e.getCause();
             }
        }
        else if(Ruolo2.isSelected())
        {
            Utente nuovoUtente = (Medico) (FactoryRegistration.createUtente(1,NomeT.getText(),CognomeT.getText(),
                    Data_di_NascitaT.getText(),Citta_NataleT.getText(),CittaT.getText(), ProvinciaT.getText(),CAPT.getText(),Codice_FiscaleT.getText(),
                    TesseraSanitariaT.getText(),UsernameT.getText(),PasswordT.getText(),MailT.getText(), Numero_di_TelefonoT.getText(),Codice_Ordine_dei_MediciT.getText(),
                    codice_IdentificativoT.getText()));
            /*Inserimento dati nel Database
            String insertFields = "INSERT INTO Medico(campi) VALUES ('";
            String insertValues = ;
            String insertToRegister = insertFields + insertValues;
            */
            try {
                //Controllo della mail
                String espressione = "^[0-9a-z]([-_.]?[0-9a-z])*@[0-9a-z]([-.]?[0-9a-z])*.[a-z]{2,4}$";
                if (MailT.getText().matches(espressione)) {
                    MailLabel.setText("");
                    //Controllo Password
                    if (PasswordT.getText().equals(ConfermePassword.getText()))
                        registrazioneCorretta.setText("Utente registrato con successo!");
                    else
                        PasswordMessage.setText("Password non coincidenti!");
                } else
                    MailLabel.setText("Mail non valida!");
            }
            catch(Exception e){
                DuplicateError.setText("Email o Username già in uso");
                e.printStackTrace();
                e.getCause();
            }
        }
        else if(Ruolo3.isSelected())
        {
            Utente nuovoUtente = (Autorita_Sanitaria) (FactoryRegistration.createUtente(1,NomeT.getText(),CognomeT.getText(),
                    Data_di_NascitaT.getText(),Citta_NataleT.getText(),CittaT.getText(), ProvinciaT.getText(),CAPT.getText(),Codice_FiscaleT.getText(),
                    TesseraSanitariaT.getText(),UsernameT.getText(),PasswordT.getText(),MailT.getText(), Numero_di_TelefonoT.getText(),Codice_Ordine_dei_MediciT.getText(),
                    codice_IdentificativoT.getText()));
            /*Inserimento dati nel Database
            String insertFields = "INSERT INTO Aut_Sanitaria(campi) VALUES ('";
            String insertValues = ;
            String insertToRegister = insertFields + insertValues;
            */
            try {
                //Controllo della mail
                String espressione = "^[0-9a-z]([-_.]?[0-9a-z])*@[0-9a-z]([-.]?[0-9a-z])*.[a-z]{2,4}$";
                if (MailT.getText().matches(espressione)) {
                    MailLabel.setText("");
                    //Controllo Password
                    if (PasswordT.getText().equals(ConfermePassword.getText()))
                        registrazioneCorretta.setText("Utente registrato con successo!");
                    else
                        PasswordMessage.setText("Password non coincidenti!");
                } else
                    MailLabel.setText("Mail non valida!");
            }
            catch(Exception e){
                DuplicateError.setText("Email o Username già in uso");
                e.printStackTrace();
                e.getCause();
            }
        }
    }
    public void userLogin(ActionEvent event) throws IOException
    {
        App a=new App();
        a.changeScene("Login.fxml");
    }
}

