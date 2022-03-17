package it.gruppoxxi.progiiiwegetvax.Model;

public class Vaccinando implements Utente {
    protected String name;
    protected String surname;

    protected String username;
    protected String password;

    private String Data_di_Nascita;
    private String Citta_Natale;
    private String Citta;
    private String Provincia;
    private String CAP;
    private String Codice_Fiscale;
    private String Tessera_Sanitaria;
    private String Mail;
    private String Numero_Telefono;


    public Vaccinando(String name, String cognome, String data_di_Nascita, String citta_Natale,
                      String citta, String provincia, String cap, String codice_Fiscale, String tessera_Sanitaria,
                      String username, String password, String mail, String numero_Telefono) {
        super();

        this.Data_di_Nascita = data_di_Nascita;
        this.Citta_Natale = citta_Natale;
        this.Citta = citta;
        this.Provincia = provincia;
        this.CAP = cap;
        this.Codice_Fiscale = codice_Fiscale;
        this.Tessera_Sanitaria = tessera_Sanitaria;
        this.Mail = mail;
        this.Numero_Telefono = numero_Telefono;
    }


    public String getData_di_Nascita() {
        return Data_di_Nascita;
    }

    public String getCitta_Natale() {
        return Citta_Natale;
    }

    public String getCitta() {
        return Citta;
    }

    public String getProvincia() {
        return Provincia;
    }

    public String getCAP() {
        return CAP;
    }

    public String getCodice_Fiscale() {
        return Codice_Fiscale;
    }

    public String getTessera_Sanitaria() {
        return Tessera_Sanitaria;
    }

    public String getMail() {
        return Mail;
    }

    public String getNumero_Telefono() {
        return Numero_Telefono;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getSurname() {
        return this.surname;
    }

    @Override
    public String getUsername() {
        return this.username;
    }

    @Override
    public String getPassword() {
        return this.password;
    }

}
