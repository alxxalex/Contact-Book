
package proiect;

/* @author radoi alexandru*/
public class nrMobil extends nrTel {
    private String nrMobil;

    public nrMobil(String nrMobil) {
        super(nrMobil);
        this.nrMobil = nrMobil;
    }

    @Override
    boolean validareNume() {
        if(nrMobil.startsWith("07"))
            return true;
        else return false;
    }
    
    public void setNrMobil(String nr){
    this.nrMobil = nr;
    }
}
