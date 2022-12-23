
package proiect.Exceptii;

/* @author radoi alexandru*/
public class FormatGresitException extends RuntimeException{
    String DataNastere;

    public FormatGresitException(String DataNastere) {
        super("Varsta nu este de format: YYYY-MM-DD");
        this.DataNastere = DataNastere;
    }
    
    public String getDataNastere(){
        return DataNastere;
    }
 }
