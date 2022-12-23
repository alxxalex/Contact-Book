package proiect;

import javax.swing.JOptionPane;

/* @author radoi alexandru*/
 abstract class nrTel implements Comparable{

    private String numarTelefon;

    public nrTel(String numarTelefon) {
        try {
            int nr = Integer.parseInt(numarTelefon);
            if (numarTelefon.length() != 10) {
                JOptionPane.showMessageDialog(null, "Numar de telfon invalid", "Error", JOptionPane.WARNING_MESSAGE);
            } else {
                this.numarTelefon = numarTelefon;
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Numar de telefon invalid", "Error", JOptionPane.WARNING_MESSAGE);
        }
    }

    abstract boolean validareNume();
   
    public boolean equals(nrTel nr){
    if(nr.numarTelefon.equals(numarTelefon))
        return true;
    return false;
    }
    
    public String toString() {
        return numarTelefon;
    }

    @Override
    public int compareTo(Object o) {
        return 2;
    }
}
