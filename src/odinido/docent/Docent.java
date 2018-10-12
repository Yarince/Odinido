package odinido.docent;

import odinido.Lokaal;
import odinido.docent.betaling.AccountKosten;
import odinido.docent.betaling.AccountType;

import java.util.ArrayList;

public class Docent {

    public String emailadres;

    public String voornaam;

    public String achternaam;

    public String wachtwoord;

    public String schoolOrOrganisatie;

    public AccountType accountType;

    public Docent(String emailadres, String voornaam, String achternaam, String wachtwoord, String schoolOrOrganisation, AccountType accountType) {

        this.emailadres = emailadres;
        this.voornaam = voornaam;
        this.achternaam = achternaam;
        this.wachtwoord = wachtwoord;
        this.schoolOrOrganisatie = schoolOrOrganisation;
        this.accountType = accountType;
    }

    public Lokaal getLokaal(int lokaalNr) {
        return null;
    }

    public AccountType getAccountType() {
        return null;
    }

    public ArrayList<Lokaal> getAlleLokalen() {
        return null;
    }

    public double getPremiumKosten() {
        if (accountType == AccountType.PREMIUM)
            return new AccountKosten().kosten;
        else
            return 0;
    }

}
