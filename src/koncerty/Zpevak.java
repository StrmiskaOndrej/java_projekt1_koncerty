package koncerty;

/**
 * Zpěvák (zpěvačka)
 *
 * @author Hana Havelkova
 * @version 2013
 */
public class Zpevak extends Hudebnik
{
    private String prijmeni;
    private String jmeno;

    /**
     * Konstruktor objektu tridy Zpevak
     * @param id
     * @param prijmeni
     * @param jmeno
     * @param zanr
     */
    public Zpevak(int id, String prijmeni, String jmeno, Zanr zanr)
    {
        super(id, zanr);
        this.prijmeni = prijmeni;
        this.jmeno = jmeno;
    }

    public Zpevak(int id, String prijmeni, String jmeno, Zanr zanr, Stat stat)
    {
        super(id, zanr, stat);
        this.prijmeni = prijmeni;
        this.jmeno = jmeno;
    }

    /**
     * Vrací jméno hudebníka - jde vlastně o prijmeni a jmeno zpevaka
     * @return 
     */
    @Override
    public String getJmeno(){
        return prijmeni + " " + jmeno;
    }

    public void setPrijmeni(String prijmeni) {
        this.prijmeni = prijmeni;
    }

    public void setJmeno(String jmeno) {
        this.jmeno = jmeno;
    }
    
    @Override
    public String toString(){
        return prijmeni + " " + jmeno;
    }
}