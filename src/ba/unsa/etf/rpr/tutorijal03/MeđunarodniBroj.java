package ba.unsa.etf.rpr.tutorijal03;

public class MeđunarodniBroj {
    String drzava, broj_tel;
    public MeđunarodniBroj (String drzava, String broj)
    {
        this.drzava=drzava;
        this.broj_tel=broj;
    }

    public String Ispisi ()
    {
        return (drzava+"/"+broj_tel);
    }
}
