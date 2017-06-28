/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Peças;

import javax.swing.JButton;

/**
 *
 * @author Charden
 */
public class NewJFrame extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public JButton matrizbotao[][] = new JButton[5][5];
    
    public void atualizaIcone(){
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                matrizbotao[i][j].setIcon(Tabuleiro.matriz[i][j].getImagem());
            }
        }
    }
    
    public NewJFrame() {
        initComponents();
        
        matrizbotao[0][0] = jButton1;
        matrizbotao[0][1] = jButton2;
        matrizbotao[0][2] = jButton3;
        matrizbotao[0][3] = jButton4;
        matrizbotao[0][4] = jButton5;
        matrizbotao[1][0] = jButton6;
        matrizbotao[1][1] = jButton7;
        matrizbotao[1][2] = jButton8;
        matrizbotao[1][3] = jButton9;
        matrizbotao[1][4] = jButton10;
        matrizbotao[2][0] = jButton11;
        matrizbotao[2][1] = jButton12;
        matrizbotao[2][2] = jButton13;
        matrizbotao[2][3] = jButton14;
        matrizbotao[2][4] = jButton15;
        matrizbotao[3][0] = jButton16;
        matrizbotao[3][1] = jButton17;
        matrizbotao[3][2] = jButton18;
        matrizbotao[3][3] = jButton19;
        matrizbotao[3][4] = jButton20;
        matrizbotao[4][0] = jButton21;
        matrizbotao[4][1] = jButton22;
        matrizbotao[4][2] = jButton23;
        matrizbotao[4][3] = jButton24;
        matrizbotao[4][4] = jButton25;
        
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jButtonJogar = new javax.swing.JButton();
        checkdebug = new javax.swing.JCheckBox();
        optaleatorio = new javax.swing.JRadioButton();
        optmanual = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel4.setVisible(false);
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();
        jButton25 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("COMBATE V. alpha.001");
        setMaximumSize(null);
        setMinimumSize(null);
        setSize(new java.awt.Dimension(1024, 900));

        jButtonJogar.setIcon(jButton1.getIcon());
        jButtonJogar.setText("jogar");
        jButtonJogar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonJogarActionPerformed(evt);
            }
        });

        checkdebug.setText("DEBUG");
        checkdebug.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkdebugActionPerformed(evt);
            }
        });

        buttonGroup2.add(optaleatorio);
        optaleatorio.setText("Posicionamento aleatório");

        buttonGroup2.add(optmanual);
        optmanual.setText("Posicionamento manual");

        jLabel1.setText("Bem vindo ao jogo Combate! selecione a opção abaixo e clique em jogar:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(310, 310, 310)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(optmanual)
                            .addComponent(optaleatorio))
                        .addGap(32, 32, 32)
                        .addComponent(jButtonJogar))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(checkdebug)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(optmanual)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(optaleatorio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(checkdebug))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonJogar)
                .addGap(371, 371, 371))
        );

        jPanel2.setVisible(false);
        jPanel2.setMinimumSize(new java.awt.Dimension(600, 600));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 939, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 783, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 939, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 783, Short.MAX_VALUE)
        );

        jPanel4.setPreferredSize(jPanel1.getMinimumSize());
        jPanel4.setLayout(new java.awt.GridLayout(5, 5, 1, 1));

        jButton1.setIcon(Tabuleiro.matriz[0][0].getImagem());
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton1.setPreferredSize(new java.awt.Dimension(50, 50));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton1);

        jButton2.setIcon(Tabuleiro.matriz[0][1].getImagem());
        jPanel4.add(jButton2);

        jButton3.setIcon(Tabuleiro.matriz[0][2].getImagem());
        jPanel4.add(jButton3);

        jButton4.setIcon(Tabuleiro.matriz[0][3].getImagem());
        jPanel4.add(jButton4);

        jButton5.setIcon(Tabuleiro.matriz[0][4].getImagem());
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton5);

        jButton6.setIcon(Tabuleiro.matriz[1][0].getImagem());
        jPanel4.add(jButton6);

        jButton7.setIcon(Tabuleiro.matriz[1][1].getImagem());
        jButton7.setMnemonic('T');
        jPanel4.add(jButton7);

        jButton8.setIcon(Tabuleiro.matriz[1][2].getImagem());
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton8);

        jButton9.setIcon(Tabuleiro.matriz[1][4].getImagem());
        jPanel4.add(jButton9);

        jButton10.setIcon(Tabuleiro.matriz[2][0].getImagem());
        jPanel4.add(jButton10);

        jButton11.setIcon(Tabuleiro.matriz[2][0].getImagem());
        jPanel4.add(jButton11);

        jButton12.setIcon(Tabuleiro.matriz[2][1].getImagem());
        jPanel4.add(jButton12);

        jButton13.setIcon(Tabuleiro.matriz[2][2].getImagem());
        jPanel4.add(jButton13);

        jButton14.setIcon(Tabuleiro.matriz[2][3].getImagem());
        jPanel4.add(jButton14);

        jButton15.setIcon(Tabuleiro.matriz[2][4].getImagem());
        jPanel4.add(jButton15);

        jButton16.setIcon(Tabuleiro.matriz[3][0].getImagem());
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton16);

        jButton17.setIcon(Tabuleiro.matriz[3][1].getImagem());
        jPanel4.add(jButton17);

        jButton18.setIcon(Tabuleiro.matriz[3][2].getImagem());
        jPanel4.add(jButton18);

        jButton19.setIcon(Tabuleiro.matriz[3][3].getImagem());
        jPanel4.add(jButton19);

        jButton20.setIcon(Tabuleiro.matriz[3][4].getImagem());
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton20);

        jButton21.setIcon(Tabuleiro.matriz[4][0].getImagem());
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton21);

        jButton22.setIcon(Tabuleiro.matriz[4][1].getImagem());
        jPanel4.add(jButton22);

        jButton23.setIcon(Tabuleiro.matriz[4][2].getImagem());
        jPanel4.add(jButton23);

        jButton24.setIcon(Tabuleiro.matriz[4][3].getImagem());
        jPanel4.add(jButton24);

        jButton25.setIcon(Tabuleiro.matriz[4][4].getImagem());
        jPanel4.add(jButton25);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 939, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 783, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButtonJogarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonJogarActionPerformed
        
        
        Tabuleiro.esvaziaTabuleiro();
        
        if(optaleatorio.isSelected()){
            
                Tabuleiro.instanciaPeçasCPU();
                Tabuleiro.instanciaPeçasJogador();
                Tabuleiro.posicionamentoAleatorio();
                Tabuleiro.posicionamentoCPU();
            if(checkdebug.isSelected()){
                
            }
                jPanel1.setVisible(false);
                jPanel4.setVisible(true);
                
            
            
        }
        if(optmanual.isSelected()){
            if(checkdebug.isSelected()){
                
            }
                Tabuleiro.instanciaPeçasCPU();
                Tabuleiro.instanciaPeçasJogador();
                Tabuleiro.posicionamentoCPU();
                jPanel1.setVisible(false);
                jPanel4.setVisible(true);
                
            
            
        }
        atualizaIcone();
        
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonJogarActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton21ActionPerformed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
        
        
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton20ActionPerformed

    private void checkdebugActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkdebugActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkdebugActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Tabuleiro.esvaziaTabuleiro();
                new NewJFrame().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JCheckBox checkdebug;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JButton jButtonJogar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JRadioButton optaleatorio;
    private javax.swing.JRadioButton optmanual;
    // End of variables declaration//GEN-END:variables
}
