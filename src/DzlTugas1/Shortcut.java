/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DzlTugas1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import javax.swing.JOptionPane;
import javax.swing.JFileChooser;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.beans.binding.Bindings;
/**
 *
 * @author Dzulkarnain Inc
 */
public class Shortcut extends javax.swing.JFrame {

    String filePath = "";
    String kopi = "";
    JFileChooser choos = new JFileChooser();
    /**
     * Creates new form Shortcut
     */
    public Shortcut() {
        initComponents();
        ComponentGUI();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFileChooser1 = new javax.swing.JFileChooser();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txfolder = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        chooseLoc1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        chooseLoc2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        pslabel = new javax.swing.JLabel();
        txcut = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        fileee = new javax.swing.JLabel();
        cplabel = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));

        jButton1.setBackground(new java.awt.Color(0, 190, 242));
        jButton1.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jButton1.setText("New Folder");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel1.setText("Membuat Folder");

        txfolder.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        txfolder.setText(" Nama directory...");
        txfolder.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txfolderMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel2.setText("Remove / delete");

        chooseLoc1.setBackground(new java.awt.Color(0, 190, 242));
        chooseLoc1.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        chooseLoc1.setText("Pilih File / Directory");
        chooseLoc1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chooseLoc1ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel3.setText("Rename");

        chooseLoc2.setBackground(new java.awt.Color(0, 190, 242));
        chooseLoc2.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        chooseLoc2.setText("File / Directory");
        chooseLoc2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chooseLoc2ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel4.setText("Copy & Paste");

        jButton2.setBackground(new java.awt.Color(0, 190, 242));
        jButton2.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jButton2.setText("Copas File");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel5.setText("Cut");

        jButton3.setBackground(new java.awt.Color(0, 190, 242));
        jButton3.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jButton3.setText("File");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        pslabel.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        pslabel.setText("File location");

        txcut.setEditable(false);
        txcut.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N

        jButton4.setBackground(new java.awt.Color(0, 190, 242));
        jButton4.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jButton4.setText("New Location");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(0, 190, 242));
        jButton5.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jButton5.setText("Cut");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 0, 0));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("Fix sak fix fix e ;)");

        jLabel7.setFont(new java.awt.Font("Consolas", 1, 180)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("</>");

        jLabel8.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel8.setText("Copy");

        jButton6.setBackground(new java.awt.Color(0, 190, 242));
        jButton6.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jButton6.setText("Paste File location");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setBackground(new java.awt.Color(0, 190, 242));
        jButton7.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jButton7.setText("Copy");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel9.setText("Paste");

        fileee.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        fileee.setText("Pilih File");

        cplabel.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        cplabel.setText("File");

        jButton8.setBackground(new java.awt.Color(0, 190, 242));
        jButton8.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jButton8.setText("C");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1)
                                .addComponent(jLabel2)
                                .addComponent(jLabel3)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(txfolder)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(pslabel, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(chooseLoc1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(chooseLoc2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(18, 18, 18)
                                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(jButton7)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(cplabel, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addContainerGap(26, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jButton3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(fileee, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txcut, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButton5)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txfolder, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chooseLoc1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chooseLoc2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cplabel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pslabel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(fileee, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txcut, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here: 
        // Membuat Folder baru
        if(txfolder.getText().equals("") || txfolder.getText().equals(" Nama directory...")){
            JOptionPane.showMessageDialog(null, "Ketik nama direktori");
        }else{
            choos.setFileSelectionMode( JFileChooser.DIRECTORIES_ONLY );
            int returnVal = choos.showOpenDialog( this );
            if( returnVal == JFileChooser.APPROVE_OPTION ) {
                JOptionPane.showMessageDialog(null, "Location Selected");
            }else{
                JOptionPane.showMessageDialog(null, "Location not Selected");
            }

            filePath = ( choos.getSelectedFile().toString());
            File file = new File(filePath +  "\\" + txfolder.getText());

            if(!file.exists()){
                if(file.mkdirs()){
                    JOptionPane.showMessageDialog(null, "Folder telah dibuat \nDirectory Location : "
                            + filePath);
                    txfolder.setText(" Nama directory...");
                }else{
                    JOptionPane.showMessageDialog(null, "Folder gagal dibuat");
                }  
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txfolderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txfolderMouseClicked
        // TODO add your handling code here:
        txfolder.setText("");
    }//GEN-LAST:event_txfolderMouseClicked

    private void chooseLoc1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chooseLoc1ActionPerformed
        // TODO add your handling code here:
        // Remove Script
        choos.setFileSelectionMode( JFileChooser.FILES_AND_DIRECTORIES );
        int returnVal = choos.showOpenDialog( this );
        
        filePath = ( choos.getSelectedFile().toString());
        int confirm = JOptionPane.showConfirmDialog(null, "Yakin ingin menghapus?? \n" + filePath,"WARNING", JOptionPane.YES_NO_OPTION, JOptionPane.ERROR_MESSAGE);
        if(confirm == 0){
            DeleteDir(new File(filePath));
            if( returnVal == JFileChooser.APPROVE_OPTION ) {
                JOptionPane.showMessageDialog(null, "Berhasil menghapus");
                System.out.println("File yang dihapus : " + filePath);
            }else{
                JOptionPane.showMessageDialog(null, "Gagal menghapus");
            }
        }
    }//GEN-LAST:event_chooseLoc1ActionPerformed

    private void chooseLoc2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chooseLoc2ActionPerformed
        // TODO add your handling code here:
        // Rename
        RenameDir(filePath);
    }//GEN-LAST:event_chooseLoc2ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        // copy paste File
        choos.setFileSelectionMode( JFileChooser.FILES_AND_DIRECTORIES );
        int returnVal = choos.showOpenDialog( this );
        
        filePath = ( choos.getSelectedFile().toString());
        String ekst = ekstensiFile(new File(filePath));
        File original = new File(filePath);
        String noEks = noEkstensiFile(new File(filePath));
        File copyFile = new File(original.getParent() , noEks.toString() + " - Copy" + ekst.toString());
        System.out.println(filePath);
        System.out.println(copyFile);
        System.out.println(ekst); //Ambil Ekstensi File
        
        if(copyFile.exists()){
            int confirm = JOptionPane.showConfirmDialog(null, "Replace File?? \n" + filePath,"WARNING", JOptionPane.YES_NO_OPTION, JOptionPane.ERROR_MESSAGE);
            if(confirm == 0){
                try{
                Files.copy(original.toPath(), copyFile.toPath(), StandardCopyOption.REPLACE_EXISTING);
                }catch(Exception e){
                    System.err.println("Error!!" + e.getMessage());
                    System.err.println(e);
                }
                System.out.println("Replace File : " + filePath);
            }
        }else{
            try{
                Files.copy(original.toPath(), copyFile.toPath());
                JOptionPane.showMessageDialog(null, "Succes copying file \n"
                        + "Location : " + copyFile.getParent());
            }catch(Exception e){
                System.err.println("Error!!" + e.getMessage());
                System.err.println(e);
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        // Original file Cut location
        choos.setFileSelectionMode( JFileChooser.FILES_AND_DIRECTORIES );
        int returnVal = choos.showOpenDialog( this );
        
        filePath = ( choos.getSelectedFile().toString());
        fileee.setText(filePath);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        // New location cut files
        choos.setFileSelectionMode( JFileChooser.DIRECTORIES_ONLY );
        int returnVal = choos.showOpenDialog( this );
        
        filePath = ( choos.getSelectedFile().toString());
        txcut.setText(filePath);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        // Cut files 
        InputStream in = null;
        OutputStream out = null;
        boolean noSelect = false;

        if(fileee.getText().equals("") || fileee.getText().equals("Pilih File")){
            noSelect = true;
            JOptionPane.showMessageDialog(null, "Pilih file terlebih dahulu !!");
        }
        if(txcut.getText().equals("")){
            noSelect = true;
            JOptionPane.showMessageDialog(null, "Select new location !!");
        }
        
        if(!noSelect){
            try{
                File original = new File(fileee.getText());
                File copyFile = new File(txcut.getText() + "\\" + original.getName());
                System.out.println(original);
                System.out.println("Cut Location : " + copyFile);

                in = new FileInputStream(original);
                out = new FileOutputStream(copyFile);

                byte[] buffer = new byte[1024];

                int length;
                while((length = in.read(buffer)) > 0){
                    out.write(buffer, 0, length);
                }

                in.close();
                out.close();

                original.delete();

                JOptionPane.showMessageDialog(null, "File berhasil di pindah \n"
                        + "New Location : " + copyFile);
                fileee.setText("Pilih File");
                txcut.setText("");
            }catch(Exception e){
                System.err.println("Error!!" + e.getMessage());
                System.err.println(e);
            }
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        // Paste Location
        if(cplabel.getText().equals("") || cplabel.getText().equals("File")){
            JOptionPane.showMessageDialog(null, "Pilih Copy dahulu!!");
        }else{
            choos.setFileSelectionMode( JFileChooser.DIRECTORIES_ONLY );
            int returnVal = choos.showOpenDialog( this );

            filePath = ( choos.getSelectedFile().toString());
            pslabel.setText(filePath);

            // Prosese
            // Proses Paste File
            InputStream in = null;
            OutputStream out = null;
            boolean noSelect = false;
            
            try{
                File original = new File(kopi);
                File copyFile = new File(pslabel.getText() + "\\" + original.getName());
                System.out.println(original);
                System.out.println("Kopi Lokasi : " + copyFile);

                in = new FileInputStream(original);
                out = new FileOutputStream(copyFile);

                byte[] buffer = new byte[1024];

                int length;
                while((length = in.read(buffer)) > 0){
                    out.write(buffer, 0, length);
                }

                in.close();
                out.close();

                JOptionPane.showMessageDialog(null, "File berhasil di copy \n"
                        + "File copy : " + copyFile);
            }catch(Exception e){
                System.err.println("Error!!" + e.getMessage());
                System.err.println(e);
            }
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        // Copy file saja
        choos.setFileSelectionMode( JFileChooser.FILES_AND_DIRECTORIES );
        int returnVal = choos.showOpenDialog( this );
        
        filePath = ( choos.getSelectedFile().toString());
        File FileCopy = new File(filePath);
        kopi = filePath;
        cplabel.setText(FileCopy.getName());
        System.out.println("File Kopi : " + kopi);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        txcut.setText("");
        fileee.setText("Pilih File");
        cplabel.setText("File");
        pslabel.setText("File location");
    }//GEN-LAST:event_jButton8ActionPerformed
    
    public static String ekstensiFile(File file){
        String extension = "";
        try{
            if(file != null && file.exists()){
                String name = file.getName();
                extension = name.substring(name.lastIndexOf("."));
            }
        }catch(Exception ex){
            extension = "";
        }
        return extension;
    }
    
        public static String noEkstensiFile(File file){
        String noExtension = "";
        
        try{
            if(file != null && file.exists()){
                String name = file.getName();
                noExtension = name.replaceFirst("[.][^.]+$", "");
            }
        }catch(Exception ex){
            noExtension = "";
        }
        return noExtension;
    }
    
    public static void DeleteDir(File file){
        if(!file.exists()){
            return;
        }
        
        if(file.isDirectory()){
            for(File f : file.listFiles()){
                DeleteDir(f);
            }
        }
        file.delete();
    }
    
    public void RenameDir(String filePath){
        choos.setFileSelectionMode( JFileChooser.FILES_AND_DIRECTORIES );
        int returnVal = choos.showOpenDialog( this );
        
        filePath = (choos.getSelectedFile().toString());
        
        System.out.println(filePath);
        RenameForm ren = new RenameForm();
        ren.ambil = filePath;
        ren.setVisible(true);
    }
    
    /**
     * @param args the command line arguments
     */
    public void ComponentGUI(){
        setTitle("Dzulkarnain Inc");
    }
    
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
            java.util.logging.Logger.getLogger(Shortcut.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Shortcut.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Shortcut.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Shortcut.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Shortcut().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton chooseLoc1;
    private javax.swing.JButton chooseLoc2;
    private javax.swing.JLabel cplabel;
    private javax.swing.JLabel fileee;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel pslabel;
    private javax.swing.JTextField txcut;
    private javax.swing.JTextField txfolder;
    // End of variables declaration//GEN-END:variables
}
