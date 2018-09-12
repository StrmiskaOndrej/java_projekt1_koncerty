package koncerty;

/**
 * Místo konání koncertu.
 * 
 * @author Hana Havelková
 * @version 2013
 */
public class Misto
{
    private String nazev;
    private String mesto;
    private Stat stat;    
    private int kapacita;
    //venkovní prostranství
    private boolean venku;

    /**
     * Konstruktor
     * @param nazev
     * @param mesto
     * @param stat
     * @param kapacita
     * @param venku 
     */
    public Misto(String nazev, String mesto, Stat stat, int kapacita, boolean venku)
    {
        this.nazev = nazev;
        this.mesto = mesto;
        this.stat = stat;  
        this.kapacita = kapacita; 
        this.venku = venku;
    }

    /**
     * Konstruktor
     * @param nazev
     * @param mesto
     * @param venku 
     */
    public Misto(String nazev, String mesto, boolean venku ){
        this(nazev, mesto, Stat.CZE, 100, venku);
    }  

    public String getNazev(){
        return nazev;
    }

    public String getMesto(){
        return mesto;
    }

    public int getKapacita(){
        return kapacita;
    }

    public Stat getStat(){
        return stat;
    }

    public boolean getVenku(){
        return venku;
    }

    public void setVenku(boolean venku) {
        this.venku = venku;
    }

    public void setMesto(String mesto) {
        this.mesto = mesto;
    }

    @Override
    public String toString(){
        return getNazev() + "(" + (venku?"venku":"uvnitř") + ")";
    }

}
