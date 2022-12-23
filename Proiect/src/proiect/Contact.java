package proiect;

import java.time.LocalDate;
import javax.swing.JOptionPane;
import proiect.Exceptii.FormatGresitException;

/* @author radoi alexandru*/
public class Contact {

    private String nume, prenume, dataNasterii;
    private nrTel numarTel;

    public Contact(String nume, String prenume, String dataNasterii, nrTel numarTel) {
        try {
            if (!numeValid(nume)) {
                JOptionPane.showMessageDialog(null, "A-ti introdus un nume invalid", "Error", JOptionPane.WARNING_MESSAGE);
            } else if (!numeValid(prenume)) {
                JOptionPane.showMessageDialog(null, "A-ti introdus un prenume invalid", "Error", JOptionPane.WARNING_MESSAGE);
            } else if (!dataNastereValida(dataNasterii)) {
                JOptionPane.showMessageDialog(null, "Data de nastere introdusa este invalida", "Error", JOptionPane.WARNING_MESSAGE);
            } else {
                this.nume = nume;
                this.prenume = prenume;
                this.dataNasterii = dataNasterii;
                this.numarTel = numarTel;
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Data de nastere invalida");
        } catch (FormatGresitException e) {
            JOptionPane.showMessageDialog(null, "Varsta nu este de format: YYYY-MM-DD");
        }
    }

    public boolean equals(Contact c) {
        if (nume.toLowerCase().equals(c.nume.toLowerCase())) {
            if (prenume.toLowerCase().equals(c.prenume.toLowerCase())) {
                if (dataNasterii.equals(c.dataNasterii)) {
                    if (numarTel.toString().equals(c.numarTel.toString())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return nume + " " + prenume + ", " + numarTel + ", " + dataNasterii;
    }

    private boolean numeValid(String nume) {
        char[] numeArray = nume.toCharArray();
        for (char c : numeArray) {
            if (!Character.isLetter(c)) {
                return false;
            }

        }
        if (nume.length() < 2) {
            return false;
        }
        return true;
    }

    private boolean dataNastereValida(String dataNasterii) {
        String[] elem = dataNasterii.split("-");
        if (elem.length != 3) {
            throw new FormatGresitException(dataNasterii);
        }
        int an = Integer.parseInt(elem[0]);
        int luna = Integer.parseInt(elem[1]);
        int zi = Integer.parseInt(elem[2]);

        if (an <= 0 || luna <= 0 || zi <= 0) {
            return false;
        }
        if (an > 2022 || luna > 12 || zi > 31) {
            return false;
        }
        if (luna == 2 && zi > 29 && an % 4 == 0) {
            return false;
        }
        if (luna == 2 && zi > 28 && an % 4 != 0) {
            return false;
        }
        if (luna % 2 == 0 && luna != 2 && zi > 30) {
            return false;
        }
        return true;
    }

    public String getNume() {
        return nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public nrTel getNumarTel() {
        return numarTel;
    }

    public String getDataNasterii() {
        return dataNasterii;
    }

    public boolean hasFiltru(String filtru) {
        if (nume.toLowerCase().contains(filtru) || prenume.toLowerCase().contains(filtru) || numarTel.toString().contains(filtru)) {
            return true;
        }
        return false;
    }

    public boolean isNrFix() {
        if (numarTel.toString().startsWith("02") || numarTel.toString().startsWith("03")) {
            return true;
        }
        return false;

    }
    
    public int getVarsta(){
        int an = LocalDate.now().getYear();
        int luna = LocalDate.now().getMonthValue();
        int zi = LocalDate.now().getDayOfMonth();
         String[] elem = dataNasterii.split("-");
        int anNastere = Integer.parseInt(elem[0]);
        int lunaNastere = Integer.parseInt(elem[1]);
        int ziNastere = Integer.parseInt(elem[2]);
        
        if(lunaNastere < luna)
            anNastere --;
        if(lunaNastere == luna)
            if(ziNastere < zi)
                anNastere --;
            
        return an - anNastere;
        
    }
    
    public static void modificaPersoana(Contact c1,Contact c2){
    c1.nume = c2.nume;
    c1.prenume = c2.prenume;
    c1.dataNasterii = c2.dataNasterii;
    c1.numarTel = c2.numarTel;
    }
}
