package koncerty;

/**
 * Výčet hudebních žánrů
 * 
 * @author Hana Havelková
 * @version 2011
 */
public enum Zanr
{
    NEDEF(0,"nedefinovaný"),
    MULTI(1, "multižánrový"),
    ACAP(2, "a cappela"), 
    AROCK(3, "alternativní rock"),
    BIGBEAT(4,"big beat"), 
    BLUES(5, "blues"), 
    BGRASS(6, "bluegrass"),
    COUNTRY(7, "country"),
    CROCK(8, "celtic rock"), 
    DECHOVKA(9, "dechovka"),
    GROCK(10, "gothic rock"),    
    FOLK(11, "folk"),
    FOLKLOR(12,"folklor"),
    FOLKROCK(13,"folkrock"), 
    FUNK(14, "funk"), 
    HIP_HOP(15, "hip-hop"), 
    HMETAL(16, "heavy metal"),
    HROCK(17, "heavy rock"),
    IROCK(18, "indie rock"),
    JAZZ(19, "jazz"), 
    JROCK(20, "jazz rock"),
    KLASIKA(21,"klasika"), 
    METAL(22, "metal"),
    OPERA(23, "opera"), 
    POP(24, "pop"), 
    PUNK(25, "punk"), 
    PROCK(26, "pop rock"), 
    REGGAE(27, "reggae"),
    ROCK(28, "rock"),     
    SKA(29, "ska"),     
    SOUL(30, "soul");
     
	
    
    private final int kod;
    private final String nazev;
    
    Zanr(int kod, String nazev){
        this.kod = kod;
        this.nazev = nazev;
    }
    
    public int Kod(){
        return kod ; 
    }
    
    public String Nazev(){
        return nazev;
    }
    
    @Override
    public String toString(){
        return nazev;
    }    
}
