/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package work01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JFileChooser;

/**
 *
 * @author phuzeron
 */
public class Kadai01_3 extends javax.swing.JFrame{

    /**
     * Creates new form Kadai01_3
     */
    public Kadai01_3(){
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("開く");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("保存");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //開く
        JFileChooser fc = new JFileChooser();
        int selected = fc.showOpenDialog(this);
        if(selected == JFileChooser.APPROVE_OPTION){
            File file = fc.getSelectedFile();
            String fileName = file.getName();
            System.out.println(fileName.substring(fileName.lastIndexOf(".")+1));
            
            if(!fileName.substring(fileName.lastIndexOf(".")+1).toString().equals("txt")){
                jTextArea1.setText("テキストファイルしか入力できません");
                return;
            }else{
                BufferedReader br = null;
                int total = 0;
                String vegetable;

                try{
                    br = new BufferedReader(new FileReader(new File("./src/en2/out11.txt")));

                    jTextArea1.append("野菜リスト：");
                    String line = null;
                    while((line = br.readLine()) != null){
                        Pattern p = Pattern.compile("\\d");
                        Matcher m = p.matcher(line);

                        if(m.find()){
                            //値段
                            total = total + Integer.parseInt(line);
                        }else{
                            //商品名
                            jTextArea1.append(line + "/");
                        }
                    }
                    
                    jTextArea1.append("\n");
                    jTextArea1.append("合計の値段：" + total + "\n");

                }catch(FileNotFoundException ex){
                    Logger.getLogger(Kadai01_3.class.getName()).log(Level.SEVERE, null, ex);
                }catch(IOException ex){
                    Logger.getLogger(Kadai01_3.class.getName()).log(Level.SEVERE, null, ex);
                }catch(NullPointerException ex){
                    Logger.getLogger(Kadai01_3.class.getName()).log(Level.SEVERE, null, ex);
                }catch(Exception ex){
                    Logger.getLogger(Kadai01_3.class.getName()).log(Level.SEVERE, null, ex);
                }finally{
                    try{
                        br.close();
                    }catch(IOException ex){
                        Logger.getLogger(Kadai01_3.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }

        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try{
            //保存
            fw = new FileWriter("./src/en2/out13.txt");
            bw = new BufferedWriter(fw);
            
            bw.write(jTextArea1.getText());
            bw.write("out13.txtに保存しました。");
            
        }catch(IOException ex){
            Logger.getLogger(Kadai01_3.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            try{
                bw.close();
                fw.close();
            }catch(IOException ex){
                Logger.getLogger(Kadai01_3.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]){
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try{
            for(javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()){
                if("Nimbus".equals(info.getName())){
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        }catch(ClassNotFoundException ex){
            java.util.logging.Logger.getLogger(Kadai01_3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }catch(InstantiationException ex){
            java.util.logging.Logger.getLogger(Kadai01_3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }catch(IllegalAccessException ex){
            java.util.logging.Logger.getLogger(Kadai01_3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }catch(javax.swing.UnsupportedLookAndFeelException ex){
            java.util.logging.Logger.getLogger(Kadai01_3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable(){
            public void run(){
                new Kadai01_3().setVisible(true);
            }
        });
    }

    BufferedWriter bw = null;
    FileWriter fw = null;
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
