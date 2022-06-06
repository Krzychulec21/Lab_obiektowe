package pl.krzychulecjava;

public class Adres {
    String miasto,ulica,kodPocztowy;
    int numerDomu;

    public Adres(String miasto,String ulica,String kodPocztowy,int numerDomu) throws NieprawidlowyAdresException {
        if(miasto==null){
            throw new NieprawidlowyAdresException("miasto nie moze byc nullem");
        }else {this.miasto = miasto;}
        if(ulica==null){
            throw new NieprawidlowyAdresException("ulica nie moze byc nullem");
        }else{ this.ulica = ulica;}
        if(kodPocztowy==null){
            throw new NieprawidlowyAdresException("kod pocztowy nie moze byc nullem");
        }else{this.kodPocztowy = kodPocztowy;}
        if(numerDomu<=0){
            throw new NieprawidlowyAdresException("Numer domu musi byc dodatni");}
        else{this.numerDomu = numerDomu;}
    }
}
