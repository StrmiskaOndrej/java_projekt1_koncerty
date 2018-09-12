package koncerty;

/**
 * Trida reprezentujici hudebni skupinu.
 *
 * @author Hana Havelkova
 * @version 2011
 */
public class Skupina extends Hudebnik
{
    private String nazev;    

    /**
     * Konstruktor objektu tridy Skupina
     * @param id
     * @param nazev
     * @param zanr
     */
    public Skupina(int id, String nazev, Zanr zanr)
    {
        this(id, nazev, zanr, Stat.CZE);      
    }

    public Skupina(int id, String nazev, Zanr zanr, Stat stat)
    {
        super(id, zanr, stat);
        this.nazev = nazev;                       
    }

    @Override
    public String getJmeno(){
        return nazev;
    }

 
    @Override
    public String toString(){
        return nazev;
    }
}