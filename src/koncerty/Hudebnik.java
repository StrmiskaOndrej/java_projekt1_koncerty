package koncerty;

/**
 * Abstraktni trida Hudebnik
 *
 * @author Hana Havelkova
 * @version 2013
 */
public abstract class Hudebnik
{
    private int id;
    private Zanr zanr;
    private Stat stat;

    public Hudebnik(int id, Zanr zanr){
        this(id, zanr, Stat.CZE);
    }

    public Hudebnik(int id, Zanr zanr,Stat stat){
        this.id = id;
        this.zanr = zanr;
        this.stat = stat;
    }

    int getId(){
        return id;
    }
    
    Zanr getZanr(){
        return zanr;
    }

    Stat getStat(){
        return stat;
    }

    abstract String getJmeno();

    @Override
    public String toString(){
        return "hudebník";
    }
}