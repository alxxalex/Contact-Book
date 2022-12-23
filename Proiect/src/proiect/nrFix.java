package proiect;

/* @author radoi alexandru*/
public class nrFix extends nrTel {

    private String nrFix;

    public nrFix(String numarTelefon) {
        super(numarTelefon);
        this.nrFix = numarTelefon;
    }

    @Override
    boolean validareNume() {
        if (nrFix.startsWith("02") || nrFix.startsWith("03")) {
            return true;
        }
        return false;
    }

    public void setNrFix(String nr) {
        this.nrFix = nr;
    }

}
