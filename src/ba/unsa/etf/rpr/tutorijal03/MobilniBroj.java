package ba.unsa.etf.rpr.tutorijal03;

public class MobilniBroj extends TelefonskiBroj{

int pozivni;
String brojTelefona;

public MobilniBroj(int mobilnaMreza, String broj){
    this.pozivni=mobilnaMreza;
    this.brojTelefona=broj;

}

public String Ispisi(){
    return(pozivni+"/"+brojTelefona);
}

}


