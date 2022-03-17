package it.gruppoxxi.progiiiwegetvax.Model;

public class Autorita_Sanitaria implements Utente {
    protected String name;
    protected String surname;

    protected String username;
    protected String password;

    private String ID_Code;

    public Autorita_Sanitaria(String name, String cognome, String username, String password, String ID_Code) {
        super();

        this.ID_Code = ID_Code;
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
