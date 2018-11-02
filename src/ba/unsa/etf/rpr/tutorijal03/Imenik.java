package ba.unsa.etf.rpr.tutorijal03;


import java.util.HashMap;
import java.util.Set;


public class Imenik {


    static HashMap<String, TelefonskiBroj > telefonskiImenik = new HashMap<String, TelefonskiBroj>();
    String ime;
    TelefonskiBroj  brojTel;

    public Imenik () {

    }

    public void dodaj(String ime, TelefonskiBroj  broj_tel)
    {
        telefonskiImenik.put (ime,brojTel);

    }

    public String dajBroj(String ime)
    {
        return (telefonskiImenik.get (ime).ispisi ());  // ne valja !
    }

    public String dajIme (TelefonskiBroj broj)
    {
        for (String key: telefonskiImenik.keySet())
            if (telefonskiImenik.get(key)==broj) return key;

        String s= new String ("Broj se ne nalazi u imeniku!");  // Ok ?
        return s;
    }

    Set <String> izGrada(Grad g) {



        Set <String> skup = new Set <String> ();  // GREŠKA
        String pozivniBroj= g.getPozivni();



        for (String s: telefonskiImenik.keySet()) { // prolazimo for petljom kroz imenik
            // očitati cijeli broj iz mape
            FiksniBroj brojTelefona= (FiksniBroj) telefonskiImenik.get(s);  // uzimamo brojTelefona za svakog u imeniku
            if (pozivniBroj.equals(brojTelefona.grad.getPozivni()))  // ako taj broj iz imenika ima isti pozivni g
            {
                String ime=dajIme (brojTelefona);  // uzmi ime
                skup.add(ime); // dodaj ime skupu
            }
        }
        return skup;
    }


    Set<TelefonskiBroj> izGradaBrojevi(Grad g) {

        String <TelefonskiBroj> skup = new Set <TelefonskiBroj> ();
        String pozivniBroj=g.getPozivni();

        for (String s: telefonskiImenik.keySet())
        {
            FiksniBroj brojTelefona = (FiksniBroj) telefonskiImenik.get(s); // uzima broj telefona iz imenika
            if (pozivniBroj.equals(brojTelefona.grad.getPozivni())) {
                skup.add(ime);
            }
        }

        return skup;
    }
}


