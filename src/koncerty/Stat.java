package koncerty;

/**
 * Výčet států - zkratky
 * 
 * @author Hana Havelková
 * @version 2011
 */
public enum Stat
{
    ARG(0,"ARG"),
    BEL(1, "BEL"),
    CZE(2,"CZE"), 
    FIN(3, "FIN"),
    GBR(4,"GBR"),
    GER(5, "GER"), 
    ITA(6, "ITA"), 
    FRA(7,"FRA"), 
    NED(8, "NED"),
    SPA(9, "SPA"),
    SWE(10, "SWE"),
    USA(11, "USA");
    
    private final int kod;
    private final String zkratka;
    
    Stat(int kod, String zkratka){
        this.kod = kod;
        this.zkratka = zkratka;
    }
    
    public int Kod(){
        return kod ; 
    }
    
    public String Zkratka(){
        return zkratka;
    }
    
    @Override
    public String toString(){
        return zkratka;
    }
}
