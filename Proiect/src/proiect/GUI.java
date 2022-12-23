package proiect;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/* @author radoi alexandru*/

public class GUI extends javax.swing.JFrame {

    String parolaCorecta = "javaProiect";

    static List<Contact> listaContacte = new ArrayList<>();
    List<Contact> contacteFiltrate = listaContacte;
    DefaultListModel model = new DefaultListModel();
    private File director = new File("Reclame");
    private File[] reclameArr = director.listFiles();
    private List<File> reclameList = Arrays.asList(reclameArr);
    splashScreen dlgSpalsh = new splashScreen(this, true);
    private boolean cod = false;
    private Comparator<Contact> comp;

    public GUI() {
        initComponents();
        timer1.start();
        dlgSpalsh.setVisible(true);
        shareware();

    }

    ActionListener task = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            dlgSpalsh.dispose();
        }
    };
    javax.swing.Timer timer1 = new javax.swing.Timer(1000, task);

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        FileChooser = new javax.swing.JFileChooser();
        jLabel1 = new javax.swing.JLabel();
        cbFiltrare = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        tfFiltru = new javax.swing.JTextField();
        btFiltreaza = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        cbOrdonare = new javax.swing.JComboBox<>();
        btOrdonare = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jlContacte = new javax.swing.JList<>();
        btAdauga = new javax.swing.JButton();
        btSterge = new javax.swing.JButton();
        btEditeaza = new javax.swing.JButton();
        lbReclame = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        miDeschidere = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        miSalvare = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        miInchidere = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        miInregistrare = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        miDespre = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(350, 150));

        jLabel1.setText("Filtrare:");

        cbFiltrare.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Numar fix", "Numar mobil", "Persoane sarbatorite", "Sarbatoriti in restul lunii", "Personalizat", "Anulare Filtru" }));

        jLabel2.setText("Fitru:");

        btFiltreaza.setText("Filtreaza");
        btFiltreaza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btFiltreazaActionPerformed(evt);
            }
        });

        jLabel3.setText("Ordonare");

        cbOrdonare.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dupa nume", "Dupa prenume", "Dupa varsta crescator", "Dupa varsta descrescator" }));

        btOrdonare.setText("Ordoneaza");
        btOrdonare.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btOrdonareActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(jlContacte);

        btAdauga.setText("Adauga contact");
        btAdauga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAdaugaActionPerformed(evt);
            }
        });

        btSterge.setText("Sterge contact");
        btSterge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btStergeActionPerformed(evt);
            }
        });

        btEditeaza.setText("Editeaza contact");
        btEditeaza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditeazaActionPerformed(evt);
            }
        });

        lbReclame.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jMenu1.setText("File");

        miDeschidere.setText("Deschidere");
        miDeschidere.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miDeschidereActionPerformed(evt);
            }
        });
        jMenu1.add(miDeschidere);
        jMenu1.add(jSeparator1);

        miSalvare.setText("Salvare");
        miSalvare.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miSalvareActionPerformed(evt);
            }
        });
        jMenu1.add(miSalvare);
        jMenu1.add(jSeparator2);

        miInchidere.setText("Inchidere");
        miInchidere.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miInchidereActionPerformed(evt);
            }
        });
        jMenu1.add(miInchidere);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Ajutor");

        miInregistrare.setText("Inregistrare");
        miInregistrare.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miInregistrareActionPerformed(evt);
            }
        });
        jMenu2.add(miInregistrare);
        jMenu2.add(jSeparator3);

        miDespre.setText("Despre");
        miDespre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miDespreActionPerformed(evt);
            }
        });
        jMenu2.add(miDespre);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbReclame, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(cbFiltrare, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(tfFiltru, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(cbOrdonare, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(32, 32, 32)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btFiltreaza, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btOrdonare, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE))
                                .addGap(0, 22, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(btAdauga, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btSterge, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(btEditeaza, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbFiltrare, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfFiltru, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btFiltreaza))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbOrdonare, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btOrdonare, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btAdauga)
                    .addComponent(btSterge)
                    .addComponent(btEditeaza))
                .addGap(26, 26, 26)
                .addComponent(lbReclame, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void shareware() {
        miDeschidere.hide();
        jSeparator1.hide();
        miSalvare.hide();
        reclame.start();
    }

    private void miInchidereActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miInchidereActionPerformed

        int a = JOptionPane.showConfirmDialog(this, "Sigur doriti sa iesiti?", "Warning", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
        if (a == 0) {
            System.exit(0);
        }

    }//GEN-LAST:event_miInchidereActionPerformed

    private void miInregistrareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miInregistrareActionPerformed
        if (cod == false) {

            String parola = JOptionPane.showInputDialog(this, "Introduceti parola de inregistrare");
            if (parola.equals(parolaCorecta)) {
                JOptionPane.showMessageDialog(this, "Parola este corecta!");
                cod = true;
                reclame.stop();
                lbReclame.hide();
                miInregistrare.hide();
                miDeschidere.show();
                miSalvare.show();
                jSeparator1.show();
            } else {
                JOptionPane.showMessageDialog(this, "Parola introdusa este incorecta", "Error", JOptionPane.WARNING_MESSAGE);
            }

        }
    }//GEN-LAST:event_miInregistrareActionPerformed

    private void miDespreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miDespreActionPerformed
        if (cod == true) {
            Despre dlgDespre = new Despre(this, true);
            dlgDespre.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this, "Nu a-ti introdus parola", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_miDespreActionPerformed

    //Este permisa doar deschiderea dintr-un fisier cu extensia .txt
    private void miDeschidereActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miDeschidereActionPerformed
        if (cod == true) {
            if (FileChooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION);
            {
                File fSelectat = FileChooser.getSelectedFile();
                if (!fSelectat.isFile()) {
                    JOptionPane.showMessageDialog(this, "Nu ai selectat un fisier");
                } else if (!fSelectat.canRead() || !fSelectat.canExecute()) {
                    JOptionPane.showMessageDialog(this, "Nu ai drepturile necesare");
                } else if (!fSelectat.toString().endsWith(".txt")) {
                    JOptionPane.showMessageDialog(this, "Nu ai selectat un fisier cu extensia .txt");
                } else {
                    try {
                        FileReader fr = new FileReader(fSelectat);
                        BufferedReader br = new BufferedReader(fr);
                        String contact;
                        while ((contact = br.readLine()) != null) {
                            String[] elem = contact.split(",");
                            if (elem[2].startsWith("07")) {
                                listaContacte.add(new Contact(elem[0], elem[1], elem[3], new nrMobil(elem[2])));
                            } else {
                                listaContacte.add(new Contact(elem[0], elem[1], elem[3], new nrFix(elem[2])));
                            }
                        }
                        fr.close();
                        br.close();

                        Sarbatoriti dlgSarabtoriti = new Sarbatoriti(this, true);
                        dlgSarabtoriti.setSarbatoriti(persoaneSarbatorite(listaContacte));
                        dlgSarabtoriti.setVisible(true);

                        regenereazaModel(listaContacte);
                    } catch (FileNotFoundException e) {
                        JOptionPane.showMessageDialog(this, e.getMessage());
                    } catch (IOException e) {
                        JOptionPane.showMessageDialog(this, e.getMessage());
                    }
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "Nu a-ti introdus parola", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_miDeschidereActionPerformed

    //Salvarea se realizeaza doar in fisiere cu extensia .txt
    private void miSalvareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miSalvareActionPerformed
        if (cod == true) {
            if (FileChooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION);
            {
                File fSelectat = FileChooser.getSelectedFile();
                if (!fSelectat.isFile()) {
                    JOptionPane.showMessageDialog(this, "Nu ai selectat un fisier");
                } else if (!fSelectat.canRead() || !fSelectat.canExecute()) {
                    JOptionPane.showMessageDialog(this, "Nu ai drepturile necesare");
                } else if (!fSelectat.toString().endsWith(".txt")) {
                    JOptionPane.showMessageDialog(this, "Nu ai selectat un fisier cu extensia .txt");
                } else {
                    salvareInFisier(fSelectat);
                    JOptionPane.showMessageDialog(this, "Salvare cu succes in fisier!");
                }

                ActionListener taskSalvare = new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        salvareInFisier(fSelectat);
                    }
                };
                javax.swing.Timer salvare = new javax.swing.Timer(60000, taskSalvare);

                salvare.start();
            }
        } else {
            JOptionPane.showMessageDialog(this, "Nu a-ti introdus parola", "Error", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_miSalvareActionPerformed

    private void btFiltreazaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFiltreazaActionPerformed
        if (cod == true) {

            if (cbFiltrare.getSelectedItem().toString().equals("Numar fix")) {
                contacteFiltrate = listaContacte.stream().filter(p -> p.isNrFix()).collect(Collectors.toList());
                regenereazaModel(contacteFiltrate);
            } else if (cbFiltrare.getSelectedItem().toString().equals("Numar mobil")) {
                contacteFiltrate = listaContacte.stream().filter(p -> p.getNumarTel().toString().startsWith("07")).collect(Collectors.toList());
                regenereazaModel(contacteFiltrate);
            } else if (cbFiltrare.getSelectedItem().toString().equals("Persoane sarbatorite")) {
                contacteFiltrate = persoaneSarbatorite(listaContacte);
                regenereazaModel(contacteFiltrate);
            } else if (cbFiltrare.getSelectedItem().toString().equals("Sarbatoriti in restul lunii")) {
                contacteFiltrate = sarbatoritiInRestulLunii(listaContacte);
                regenereazaModel(contacteFiltrate);
            } else if (cbFiltrare.getSelectedItem().toString().equals("Anulare Filtru")) {
                contacteFiltrate.clear();
                regenereazaModel(listaContacte);
                tfFiltru.setText("");
            } else {
                String filtru = tfFiltru.getText().trim();
                contacteFiltrate = listaContacte.stream()
                        .filter(p -> p.hasFiltru(filtru))
                        .collect(Collectors.toList());
                regenereazaModel(contacteFiltrate);
            }

        } else {
            JOptionPane.showMessageDialog(this, "Nu a-ti introdus parola", "Error", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_btFiltreazaActionPerformed

    private void btOrdonareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btOrdonareActionPerformed
        if (cod == true) {
            setComp();
            if (contacteFiltrate.isEmpty()) {
                //contacteFiltrate este gol in cazul in care s-a selectatat anulare filtru
                Collections.sort(listaContacte, comp);
                regenereazaModel(listaContacte);
            } else {
                Collections.sort(contacteFiltrate, comp);
                regenereazaModel(contacteFiltrate);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Nu a-ti introdus parola", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btOrdonareActionPerformed

    private void btStergeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btStergeActionPerformed
        if (cod == true) {
            int index = jlContacte.getSelectedIndex();
            if (index != -1) {
                listaContacte.remove(index);
                contacteFiltrate = listaContacte;
                regenereazaModel(contacteFiltrate);
            } else {
                JOptionPane.showMessageDialog(this, "Nu a-i selectat un contact", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Nu a-ti introdus parola", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btStergeActionPerformed

    private void btAdaugaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAdaugaActionPerformed
        boolean duplicat = false;
        if (cod == true) {
            addDialog dlgAdd = new addDialog(this, true);
            dlgAdd.setVisible(true);
            Contact contactToAdd = dlgAdd.getContactToAdd();

            for (Contact c : listaContacte) {
                if (contactToAdd.equals(c)) {
                    JOptionPane.showMessageDialog(this, "Contactul se afla deja in lista", "Error", JOptionPane.ERROR_MESSAGE);
                    duplicat = true;
                }

            }
            if (duplicat == false) {
                if (contactToAdd != null) {
                    listaContacte.add(contactToAdd);
                    contacteFiltrate = listaContacte;
                    regenereazaModel(contacteFiltrate);
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "Nu a-ti introdus parola", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btAdaugaActionPerformed

    private void btEditeazaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditeazaActionPerformed
        if (cod == true) {

            int index = jlContacte.getSelectedIndex();
            if (index != -1) {
                editDialog dlgEdit = new editDialog(this, true);
                dlgEdit.setContact(contacteFiltrate.get(jlContacte.getSelectedIndex()));
                dlgEdit.setVisible(true);
                Contact contactModificat = dlgEdit.getContactModificat();

                if (contactModificat != null) {
                    Contact.modificaPersoana(listaContacte.get(index), contactModificat);
                    regenereazaModel(contacteFiltrate);
                }
            } else {
                JOptionPane.showMessageDialog(this, "Nu a-ti selectat un contact", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Nu a-ti introdus parola", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btEditeazaActionPerformed

    List<Contact> persoaneSarbatorite(List<Contact> lista) {
        List<Contact> listaSarbatoriti = new ArrayList<>();
        int luna = LocalDateTime.now().getMonthValue();
        int zi = LocalDateTime.now().getDayOfMonth();
        for (Contact c : lista) {
            String[] elem = c.getDataNasterii().split("-");
            if (luna == Integer.parseInt(elem[1]) && zi == Integer.parseInt(elem[2])) {
                listaSarbatoriti.add(c);
            }
        }
        return listaSarbatoriti;
    }

    List<Contact> sarbatoritiInRestulLunii(List<Contact> lista) {
        List<Contact> listaSarbatoriti = new ArrayList<>();
        int luna = LocalDateTime.now().getMonthValue();
        int zi = LocalDateTime.now().getDayOfMonth();
        for (Contact c : lista) {
            String[] elem = c.getDataNasterii().split("-");
            if (luna == Integer.parseInt(elem[1]) && zi < Integer.parseInt(elem[2])) {
                listaSarbatoriti.add(c);
            }
        }
        return listaSarbatoriti;
    }

    private void setComp() {
        Comparator<Contact> dupaNume = (p1, p2) -> p1.getNume().compareToIgnoreCase(p2.getNume());
        Comparator<Contact> dupaPrenume = (p1, p2) -> p1.getPrenume().compareToIgnoreCase(p2.getPrenume());
        Comparator<Contact> dupaVarsta = (p1, p2) -> p1.getVarsta() - p2.getVarsta();

        if (cbOrdonare.getSelectedItem().toString().equals("Dupa nume")) {
            comp = dupaNume;
        } else if (cbOrdonare.getSelectedItem().toString().equals("Dupa prenume")) {
            comp = dupaPrenume;
        } else if (cbOrdonare.getSelectedItem().toString().equals("Dupa varsta crescator")) {
            comp = dupaVarsta;
        } else {
            comp = dupaVarsta.reversed();
        }
    }

    private void salvareInFisier(File fSelectat) {
        FileWriter writer = null;
        try {
            writer = new FileWriter(fSelectat);
            for (Contact c : contacteFiltrate) {
                writer.append(c.toString());
                writer.append("\n");
            }
            writer.flush();
            writer.close();

        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }

    }

    ActionListener task2 = new ActionListener() {
        int idxPozaCurenta = 0;

        @Override
        public void actionPerformed(ActionEvent e) {
            File reclamaCurenta = reclameList.get(idxPozaCurenta);
            ImageIcon image = new ImageIcon(reclamaCurenta.getAbsolutePath());
            lbReclame.setIcon(image);
            if (idxPozaCurenta == reclameList.size() - 1) {
                idxPozaCurenta = 0;
            } else {
                idxPozaCurenta++;
            }
        }
    };
    javax.swing.Timer reclame = new javax.swing.Timer(2000, task2);

    private void regenereazaModel(List<Contact> lista) {
        model.clear();
        for (Contact c : lista) {
            model.addElement(c);
        }
        jlContacte.setModel(model);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFileChooser FileChooser;
    private javax.swing.JButton btAdauga;
    private javax.swing.JButton btEditeaza;
    private javax.swing.JButton btFiltreaza;
    private javax.swing.JButton btOrdonare;
    private javax.swing.JButton btSterge;
    private javax.swing.JComboBox<String> cbFiltrare;
    private javax.swing.JComboBox<String> cbOrdonare;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JList<String> jlContacte;
    private javax.swing.JLabel lbReclame;
    private javax.swing.JMenuItem miDeschidere;
    private javax.swing.JMenuItem miDespre;
    private javax.swing.JMenuItem miInchidere;
    private javax.swing.JMenuItem miInregistrare;
    private javax.swing.JMenuItem miSalvare;
    private javax.swing.JTextField tfFiltru;
    // End of variables declaration//GEN-END:variables
}
