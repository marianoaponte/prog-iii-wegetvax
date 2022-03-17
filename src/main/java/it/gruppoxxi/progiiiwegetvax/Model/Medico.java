package it.gruppoxxi.progiiiwegetvax.Model;

public class Medico implements Utente {
    protected String name;
    protected String surname;

    protected String username;
    protected String password;

    private String Codice_Ordine_dei_Medici;

    public Medico(String name, String cognome, String username, String password, String codice_Ordine_dei_Medici) {
        super();

        this.Codice_Ordine_dei_Medici = codice_Ordine_dei_Medici;
    }


    public String getCodice_Ordine_dei_Medici() {
        return Codice_Ordine_dei_Medici;
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
