/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package login;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;
import java.io.FileOutputStream;
import java.io.ByteArrayOutputStream;
import java.nio.file.FileVisitOption;
import com.itextpdf.text.*;
import com.itextpdf.text.pdf.*;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

/**
 *
 * @author LENOVO
 */

public class slipgaji extends javax.swing.JFrame {
    /**
     * Creates new form slipgaji
     */
            
    public slipgaji( String nama, String nik, String alamat, String notelp, String jabatan, String tunjangan, String jamkerja, String jamlembur, String gajipokok, String gajilembur, String tunjangan1, String jumlahpendapatan, String jht, String pajak, String jumlahpotongan , String totalgajibersih, String penerima) {
        initComponents(); 
        
    getContentPane().add(unduhbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 460, 130, 30));
        namalabel.setText(nama);
        niklabel.setText(nik);
        alamatlabel.setText(alamat);
        notelplabel.setText(notelp);
        jabatanlabel.setText(jabatan);
        tunjanganlabel.setText(tunjangan);
        jamkerjalabel.setText(jamkerja);
        jamlemburlabel.setText(jamlembur);
        gajipokoklabel.setText(gajipokok);
        gajilemburlabel.setText(gajilembur);
        tunjanganlabel1.setText(tunjangan1);
        jumlahpendapatanlabel.setText(jumlahpendapatan);
        jhtlabel.setText(jht);
        pajaklabel.setText(pajak);
        jumlahpotonganlabel.setText(jumlahpotongan);
        gajibersihlabel.setText(totalgajibersih);
        penerimalabel.setText(penerima);
    }
   
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        textArea1 = new java.awt.TextArea();
        penerimalabel = new javax.swing.JLabel();
        notelplabel = new javax.swing.JLabel();
        niklabel = new javax.swing.JLabel();
        alamatlabel = new javax.swing.JLabel();
        jabatanlabel = new javax.swing.JLabel();
        tunjanganlabel = new javax.swing.JLabel();
        jamkerjalabel = new javax.swing.JLabel();
        jamlemburlabel = new javax.swing.JLabel();
        jumlahpotonganlabel = new javax.swing.JLabel();
        tunjanganlabel1 = new javax.swing.JLabel();
        pajaklabel = new javax.swing.JLabel();
        gajilemburlabel = new javax.swing.JLabel();
        potonganlabel = new javax.swing.JLabel();
        pendapatanlabel2 = new javax.swing.JLabel();
        gajipokoklabel = new javax.swing.JLabel();
        jhtlabel = new javax.swing.JLabel();
        jumlahpendapatanlabel = new javax.swing.JLabel();
        gajibersihlabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        namalabel = new javax.swing.JLabel();
        logoutbt = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        unduhbutton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                formPropertyChange(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        penerimalabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        penerimalabel.setText("Nama         : ");
        getContentPane().add(penerimalabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 400, 230, 20));

        notelplabel.setText("notelp");
        getContentPane().add(notelplabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 186, 340, 20));

        niklabel.setText("NIK             :");
        getContentPane().add(niklabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, 310, -1));

        alamatlabel.setText("Alamat");
        getContentPane().add(alamatlabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, 320, -1));

        jabatanlabel.setText("jabatan");
        getContentPane().add(jabatanlabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 120, 230, 20));

        tunjanganlabel.setText("tunjangan");
        getContentPane().add(tunjanganlabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 140, 240, 20));

        jamkerjalabel.setText("jamkerja");
        getContentPane().add(jamkerjalabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 160, 250, 20));

        jamlemburlabel.setText("jamlembur");
        getContentPane().add(jamlemburlabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 184, 250, 20));

        jumlahpotonganlabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jumlahpotonganlabel.setText("Jumlah Potongan");
        getContentPane().add(jumlahpotonganlabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 300, 260, -1));

        tunjanganlabel1.setText("Tunjangah");
        getContentPane().add(tunjanganlabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 270, 300, -1));

        pajaklabel.setText("Pajak");
        getContentPane().add(pajaklabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 250, 270, -1));

        gajilemburlabel.setText("Gaji Lembur");
        getContentPane().add(gajilemburlabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, 310, -1));

        potonganlabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        potonganlabel.setText("POTONGAN");
        getContentPane().add(potonganlabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 200, -1, 40));

        pendapatanlabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        pendapatanlabel2.setText("PENDAPATAN");
        getContentPane().add(pendapatanlabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, -1, 40));

        gajipokoklabel.setText("Gaji pokok");
        getContentPane().add(gajipokoklabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, 310, 20));

        jhtlabel.setText("Jaminan Hari Tua");
        getContentPane().add(jhtlabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 230, 270, -1));

        jumlahpendapatanlabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jumlahpendapatanlabel.setText("Jumlah Pendapatan");
        getContentPane().add(jumlahpendapatanlabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 300, 300, -1));

        gajibersihlabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        gajibersihlabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        gajibersihlabel.setText("Total Gaji Bersih : ");
        getContentPane().add(gajibersihlabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 325, 620, -1));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Penerima");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, 240, 30));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Schin Nasarani Pangaribuan");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 400, 240, -1));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Manager");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(417, 350, 240, 30));

        namalabel.setText("Nama         : ");
        getContentPane().add(namalabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, 340, 20));

        logoutbt.setBackground(new java.awt.Color(51, 51, 255));
        logoutbt.setForeground(new java.awt.Color(255, 255, 255));
        logoutbt.setText("MENU UTAMA");
        logoutbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutbtActionPerformed(evt);
            }
        });
        getContentPane().add(logoutbt, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 460, 120, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\LENOVO\\Documents\\NetBeansProjects\\GajiKaryawan_KLP3\\src\\login\\slipgajirill (3).png")); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -1, 710, 460));

        unduhbutton.setBackground(new java.awt.Color(0, 204, 153));
        unduhbutton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        unduhbutton.setForeground(new java.awt.Color(255, 255, 255));
        unduhbutton.setText("UNDUH");
        unduhbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unduhbuttonActionPerformed(evt);
            }
        });
        getContentPane().add(unduhbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 460, 130, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logoutbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutbtActionPerformed
        mainmenu mainmenu = new mainmenu();
      mainmenu.setVisible(true);
      this.dispose();
    }//GEN-LAST:event_logoutbtActionPerformed

    private void unduhbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unduhbuttonActionPerformed
        try {            
        String pdfFilePath = "D:\\New Volume.pdf";
        String textFilePath = "D:\\New Volume.txt";
       
        String filePath = System.getProperty("java.io.tmpdir") + "yourfile.txt";
        
        
        
        Document PDFreport = new Document();
       
        ByteArrayOutputStream pdfStream = new ByteArrayOutputStream();
        PdfWriter.getInstance(PDFreport, pdfStream);

        PDFreport.open();
        
             PDFreport.add(new Paragraph("Nama :  " + namalabel.getText()));
             PDFreport.add(new Paragraph("NIK :  " + niklabel.getText()));
             PDFreport.add(new Paragraph("Alamat :  " + alamatlabel.getText()));
             PDFreport.add(new Paragraph("No Telp :  " + notelplabel.getText()));
             PDFreport.add(new Paragraph("Jabatan :  " + jabatanlabel.getText()));
             PDFreport.add(new Paragraph("Tunjangan :  " + tunjanganlabel.getText()));
             PDFreport.add(new Paragraph("Jam Kerja :  " + jamkerjalabel.getText()));
             PDFreport.add(new Paragraph("Jam Lembur :  " + jamlemburlabel.getText()));
             PDFreport.add(new Paragraph("Gaji Pokok :  " + gajipokoklabel.getText()));
             PDFreport.add(new Paragraph("Gaji Lembur :  " + gajilemburlabel.getText()));
             PDFreport.add(new Paragraph("Tunjangan :  " + tunjanganlabel1.getText()));
             PDFreport.add(new Paragraph("Jumlah Pendapatan :  " + jumlahpendapatanlabel.getText()));
             PDFreport.add(new Paragraph("Jaminan Hari Tua :  " + jhtlabel.getText()));
             PDFreport.add(new Paragraph("Pajak :  " + pajaklabel.getText()));
             PDFreport.add(new Paragraph("Jumlah Potongan :  " + jumlahpotonganlabel.getText()));
             PDFreport.add(new Paragraph("Total Gaji Bersih : " + gajibersihlabel.getText()));
             
             

       
        try (FileOutputStream pdfFile = new FileOutputStream(pdfFilePath)) {
            pdfFile.write(pdfStream.toByteArray());
            pdfFile.flush();
        } catch (IOException ex) {           
            ex.printStackTrace();
        }
                       
             
           
            
           try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filePath))) {
                PDFreport.add(new Paragraph(namalabel.getText()));
             PDFreport.add(new Paragraph(niklabel.getText()));
             PDFreport.add(new Paragraph( alamatlabel.getText()));
             PDFreport.add(new Paragraph( notelplabel.getText()));
             PDFreport.add(new Paragraph(jabatanlabel.getText()));
             PDFreport.add(new Paragraph( tunjanganlabel.getText()));
             PDFreport.add(new Paragraph(jamkerjalabel.getText()));
             PDFreport.add(new Paragraph(jamlemburlabel.getText()));
             PDFreport.add(new Paragraph( gajipokoklabel.getText()));
             PDFreport.add(new Paragraph(gajilemburlabel.getText()));
             PDFreport.add(new Paragraph(tunjanganlabel1.getText()));
             PDFreport.add(new Paragraph(jumlahpendapatanlabel.getText()));
             PDFreport.add(new Paragraph( jhtlabel.getText()));
             PDFreport.add(new Paragraph( pajaklabel.getText()));
             PDFreport.add(new Paragraph( jumlahpotonganlabel.getText()));
             PDFreport.add(new Paragraph( gajibersihlabel.getText()));
                  
               
        JOptionPane.showMessageDialog(this, "PDF File and text file are exported successfully!!");
        } catch (IOException ex) {
    JOptionPane.showMessageDialog(this, "Error saving PDF file: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    ex.printStackTrace();

        }
    } catch (DocumentException e) {
        e.printStackTrace();
        
    }//GEN-LAST:event_unduhbuttonActionPerformed
        }
    private void formPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_formPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_formPropertyChange

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
       
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel alamatlabel;
    private javax.swing.JLabel gajibersihlabel;
    private javax.swing.JLabel gajilemburlabel;
    private javax.swing.JLabel gajipokoklabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jabatanlabel;
    private javax.swing.JLabel jamkerjalabel;
    private javax.swing.JLabel jamlemburlabel;
    private javax.swing.JLabel jhtlabel;
    private javax.swing.JLabel jumlahpendapatanlabel;
    private javax.swing.JLabel jumlahpotonganlabel;
    private javax.swing.JButton logoutbt;
    public javax.swing.JLabel namalabel;
    public javax.swing.JLabel niklabel;
    public javax.swing.JLabel notelplabel;
    private javax.swing.JLabel pajaklabel;
    private javax.swing.JLabel pendapatanlabel2;
    public javax.swing.JLabel penerimalabel;
    private javax.swing.JLabel potonganlabel;
    private java.awt.TextArea textArea1;
    private javax.swing.JLabel tunjanganlabel;
    private javax.swing.JLabel tunjanganlabel1;
    private javax.swing.JButton unduhbutton;
    // End of variables declaration//GEN-END:variables
}
