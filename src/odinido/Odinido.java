package odinido;


import odinido.docent.DocentDatabank;
import odinido.docent.betaling.AccountType;
import odinido.docent.betaling.BetaalType;
import odinido.docent.Docent;

import java.util.ArrayList;

public class Odinido {

    private DocentDatabank docentDatabank = new DocentDatabank();
    public static final Odinido ODINIDO = new Odinido();

    public double registreren(String emailAdres, String voornaam, String achternaam, String wachtwoord, String schoolOrOrganisation, AccountType accountType) {
        Docent docent = new Docent(emailAdres, voornaam, achternaam, wachtwoord, schoolOrOrganisation, accountType);

        docentDatabank.slaDocentOp(docent);

        return docent.getPremiumKosten();
    }

    public double profielAanpassen(Docent docent) {
        docentDatabank.werkDocentBij(docent);
        return docent.getPremiumKosten();
    }

    public void betaalPremium(BetaalType betaalType, String docentEmail) {

    }

    public Kennistoets maakKennisToets(String toetsJsonData, String docentEmail) {
        return null;
    }

    public Vraag maakVraag(String vraagJson) {
        return null;
    }

    public void voegVragenToe(String toetsCode, ArrayList vrage, String docentEmail) {

    }

    public void zetToetsKlaar(String toetsCode, int lokaalnummer, int tijd) {

    }

    public ArrayList<Kennistoets> haalAlleToetsenOp(String docentEmail) {
        return null;
    }

    public ArrayList<Lokaal> haalAlleLokalenOp(String docentEmail) {
        return null;
    }

    public Lokaal getLokaal(int lokaalNr) {
        return null;
    }

    public static void main(String[] args) {
        ODINIDO.registreren("email", "voornaam", "achter", "ww", "han", AccountType.PREMIUM);
    }

}
