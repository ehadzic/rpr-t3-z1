package ba.unsa.etf.rpr.tutorijal03;


import java.util.Objects;


public class FiksniBroj extends  TelefonskiBroj {

    Grad grad;
    String broj;

    public enum Grad {

        Travnik ("030"),
        Orasje ("031"),
        Zenica ("032"),
        SARAJEVO("033"),
        Livno ("034"),
        Tuzla ("035"),
        Mostar("036"),
        Bihac ("037"),
        Gorazde ("038"),
        SirokiBrijeg ("039"),
        Brcko ("049"),
        MrkonjicGrad ("050"),
        BanjaLuka("051"),
        Prijedor("052"),
        Doboj("053"),
        Samac("054"),
        Bijeljina("055"),
        Zvornik	("056"),
        Pale("057"),
        Foca("058"),
        Trebinje("059");

        private final String pozivni;


        Grad (String pozivni)
        {
            this.pozivni=pozivni;
        }


        public String getPozivni()
        {
            return pozivni;
        }


    }
    @Override
    public int compareTo(TelefonskiBroj telefonskiBroj) {

        int i= this.ispisi().compareTo(telefonskiBroj.ispisi());
        return i;


    }

    public FiksniBroj(Grad grad, String broj)
    {
        this.grad=grad;
        this.broj=broj;
    }


    public String ispisi ()
    {

        String s= new String (grad.getPozivni()+"/"+ this.broj);
        return s;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FiksniBroj that = (FiksniBroj) o;
        return grad == that.grad &&
                Objects.equals(broj, that.broj);
    }

    @Override
    public int hashCode() {
        return Objects.hash(grad, broj);
    }
}