package odinido.docent;

import java.util.Dictionary;
import java.util.Hashtable;

public class DocentDatabank {

    private Dictionary<String, Docent> docentDatabase;

    public DocentDatabank() {
        docentDatabase = new Hashtable<>();
    }

    public void slaDocentOp(Docent docent) {
        docentDatabase.put(docent.emailadres, docent);
    }

    public void werkDocentBij(Docent docent) {
        docentDatabase.put(docent.emailadres, docent);
    }

    public Docent haalDocentOp(String docentEmail) {
        return docentDatabase.get(docentEmail);
    }

}
