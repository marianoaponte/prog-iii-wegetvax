package it.gruppoxxi.progiiiwegetvax.Model;

public class FactoryRegistration {

    public static Utente createUtente(int value, String name, String cognome, String data_di_Nascita, String citta_Natale, String citta, String provincia, String cap, String codice_Fiscale, String tessera_Sanitaria, String username, String password, String mail, String numero_Telefono, String codice_Ordine_dei_Medici, String codice_Identificativo) {

        return switch (value) {
            case (1) -> new Vaccinando(name, cognome, data_di_Nascita, citta_Natale, citta, provincia, cap, codice_Fiscale, tessera_Sanitaria, username, password, mail, numero_Telefono);
            case (2) -> new Medico(name, cognome, username, password, codice_Ordine_dei_Medici);
            case (3) -> new Autorita_Sanitaria(name, cognome, username, password, codice_Identificativo);
            default -> null;
        };
    }
}

