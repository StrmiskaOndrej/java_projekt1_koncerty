package koncerty;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
/**
 * Koncert hudební skupiny či zpěváka
 * 
 * @author Hana Havelková 
 * @version 2013
 */
public class Koncert
{
    private final String id;
    // nazev akce, v ramci ktere je koncert poradan
    private String akce;    
    private Hudebnik hudebnik;
    private Misto misto;
    private Calendar datum;
    private int cena;
    /**
     * Konstruktor objektu tridy Koncert
     * @param id
     * @param akce
     * @param hudebnik
     * @param misto
     * @param datum
     * @param cena
     */
    public Koncert(String id, String akce, Hudebnik hudebnik, Misto misto, Calendar datum, int cena)
    {
        this.id = id;
        this.akce = akce;
        this.hudebnik = hudebnik;
        this.misto = misto;
        this.datum = datum;
        this.cena = cena;
    }

    /**
     * DOPLŇTE statickou metodu koncertyHudebnika(List<Koncert>, String jmeno)
     * vracející seznam koncertů hudebníka, jehož jméno začíná 
     * řetězcem uvedeným jako parametr 
     * @param koncerty
     * @param jmeno
     * @return 
     */
    public static List<Koncert> koncertyHudebnika(List<Koncert> koncerty, String jmeno){
    if(jmeno == null || jmeno.trim().isEmpty()){
            return koncerty;
        }
    
    List<Koncert> vysledek = new ArrayList<>();
        for(Koncert kon : koncerty){
            if(kon.getHudebnik().getJmeno().startsWith(jmeno))
                vysledek.add(kon);
        }
        return vysledek;
    }
    

    /**
     * Seznam koncertů odehrávající se v daném místě 
     * @param koncerty
     * @param misto
     * @return 
     */
    public static List<Koncert> koncertyDleMista(List<Koncert> koncerty, String misto){
        if(misto == null || misto.trim().isEmpty()){
            return koncerty;
        }
        
        List<Koncert> vysledek = new ArrayList<>();
        for(Koncert kon : koncerty){
            String nazev = kon.getMisto().getNazev();
            if(nazev.startsWith(misto)){
                vysledek.add(kon);
            }
        }
        return vysledek;
    }
    /**
     * Seznam koncertů daného žánru 
     * @param koncerty
     * @param zanr
     * @return 
     */
    public static List<Koncert> koncertyDleZanru(List<Koncert> koncerty, Zanr zanr){
        if(zanr == null || zanr == Zanr.NEDEF){
            return koncerty;
        }
        List<Koncert> vysledek = new ArrayList<>();
        for(Koncert kon : koncerty){
            if(kon.getHudebnik().getZanr() == zanr){
                vysledek.add(kon);
            }
        }
        return vysledek;
    }   
    
    public String getId(){
        return id;
    }
    
    public String getAkce(){
        return akce;
    }
    
    public Hudebnik getHudebnik(){
        return hudebnik;
    }

    public Misto getMisto(){
        return misto;
    }  

    public Calendar getDatum(){
        return datum;
    }

    /**
     * Nastavení data koncertu
     * @param datum 
     */
    public void setDatum(Calendar datum) {
        this.datum = datum;
    }    

    public void setAkce(String akce) {
        this.akce = akce;
    }

    public void setHudebnik(Hudebnik hudebnik) {
        this.hudebnik = hudebnik;
    }

    public void setMisto(Misto misto) {
        this.misto = misto;
    }

    public void setCena(int cena) {
        this.cena = cena;
    }

    public int getCena() {
        return cena;
    }
    
    
    
    
}
