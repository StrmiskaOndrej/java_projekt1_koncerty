package koncerty;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;
/**
* Evidence koncertů, míst, hudebníků
*
* @author Hana Havelková
* @version 2013
*/
public class Evidence{
    private final List<Hudebnik> hudebnici;
    private final List<Misto> mista;
    private final List<Koncert> koncerty;
    int pocetSkupin = 0;
    int pocetZpevaku = 0;
/**
* Constructor for objects of class Evidence
*/
    public Evidence(){
        hudebnici = new ArrayList<>();
        mista = new ArrayList<>();
        koncerty = new ArrayList<>();
        init();
        
    }

    /**
     * DOPLŇTE metodu zaradKoncert(Koncert kon)
     */
    
    public void zaradKoncert(Koncert kon)
    {
//        for(Koncert k : koncerty){
//            if(k.getId().equals(kon.getId())){
//                return;
//            }
//        }   
        
        if(!koncerty.contains(kon)){           
            koncerty.add(kon);
            hudebnici.add(kon.getHudebnik());
            mista.add(kon.getMisto()); 
        }    
    }
    
    public int getPocetSkupin(){
        
        
        for(Hudebnik h : hudebnici){
            if(h instanceof Skupina)
            {      
                pocetSkupin++;
            }
        }        
        
        return pocetSkupin;
    }
    
    
     public int getPocetZpevaku(){
                
        for(Hudebnik h : hudebnici){
            if(h instanceof Zpevak)
            {      
                pocetZpevaku++;
            }
        }        
        
        return pocetZpevaku;
    }
    
    
   
    
    
   
 
    /**
     * Metoda vracející seznam koncertů
     * @return 
     */
    public List<Koncert> getKoncerty(){
        return koncerty;
    }

    /**
     * Metoda vracející seznam hudebníků
     * @return 
     */
    public List<Hudebnik> getHudebnici(){
        
        
        return hudebnici;
    }

    /**
     * Metoda vracející seznam míst
     * @return 
     */
    public List<Misto> getMista(){
        return mista;
    }

    /**
     * Metoda inicializující seznamy pro potřeby ladění
     */
    private void init(){
        Misto m1 = new Misto("Všesportovní hala","České Budějovice", Stat.CZE,1500,false);
        Misto m2 = new Misto("Stromovka", "Praha",Stat.CZE,500,true);
        Misto m3 = new Misto("Pivovarské zahrady", "Český Krumlov",Stat.CZE, 300, true);
        Misto m4 = new Misto("Městské divadlo", "Český Krumlov",Stat.CZE, 200, false);
        Misto m5 = new Misto("Otáčivé hlediště", "Český Krumlov",Stat.CZE, 658, true);
        Misto m6 = new Misto("Zámecké nádvoří", "Třeboň",Stat.CZE, 250, true);
       // mista.add(m1); mista.add(m2); mista.add(m3); mista.add(m4); 
       // mista.add(m5);mista.add(m6);

        Hudebnik h1 = new Skupina(12,"Čechomor", Zanr.FOLK);
        Hudebnik h2 = new Skupina(41, "Sto zvířat", Zanr.SKA);
        Hudebnik h3 = new Zpevak(39,"Plíhal", "Karel", Zanr.FOLK);
        Hudebnik h4 = new Zpevak(45,"Urbanová", "Eva",Zanr.OPERA);
        Hudebnik h5 = new Zpevak(27,"Landa", "Daniel", Zanr.NEDEF);
        Hudebnik h6 = new Zpevak(11,"Cura", "José",Zanr.OPERA, Stat.ARG);
        

        Koncert k1 = new Koncert("O101", "Hudební slavnosti", h6, m5, new GregorianCalendar(2014, 7,22),1500);
        Koncert k2 = new Koncert("S120", "Summer 2011", h2, m2, new GregorianCalendar(2014, 6,7),400);
        Koncert k3 = new Koncert("S122", "Summer 2011", h5, m2, new GregorianCalendar(2014, 6,7),400);
        Koncert k4 = new Koncert("F101", "Folkové léto", h1, m3, new GregorianCalendar(2014, 5,30),550);
        Koncert k5 = new Koncert("F102", "Folkové léto", h3, m3, new GregorianCalendar(2014, 5,30),550);
        Koncert k6 = new Koncert("O113", "Hudební slavnosti", h4, m4, new GregorianCalendar(2014, 7,23),800);
        Koncert k7 =  new Koncert("F104", "Okolo Třeboně", h3, m6, 
            new GregorianCalendar(2013, 7, 3), 320);
        
        zaradKoncert(k1);
        zaradKoncert(k2);
        zaradKoncert(k3);
        zaradKoncert(k4);
        zaradKoncert(k5);
        zaradKoncert(k6);
        zaradKoncert(k7);
        
//        koncerty.add(k1); koncerty.add(k2); koncerty.add(k3);
//        koncerty.add(k4); koncerty.add(k5); koncerty.add(k6);koncerty.add(k7);
    }
}