/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lucas
 */
public class MenuRanking extends javax.swing.JFrame {

        Ranking rank;
        
        public MenuRanking() {
                rank = new Ranking();
                rank.readRanking();
                rank.fillRankingInformation();
                initComponents();
                initComponents2();
        }

        /**
         * This method is called from within the constructor to initialize the
         * form. WARNING: Do NOT modify this code. The content of this method is
         * always regenerated by the Form Editor.
         */
        @SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                jLabelName1 = new javax.swing.JLabel();
                jLabelName2 = new javax.swing.JLabel();
                jLabelName3 = new javax.swing.JLabel();
                jLabelName4 = new javax.swing.JLabel();
                jLabelName5 = new javax.swing.JLabel();
                jLabelName6 = new javax.swing.JLabel();
                jLabelName7 = new javax.swing.JLabel();
                jLabelName8 = new javax.swing.JLabel();
                jLabelName9 = new javax.swing.JLabel();
                jLabelName10 = new javax.swing.JLabel();
                jLabelRankingNumbers = new javax.swing.JLabel();
                jLabelRankingImage = new javax.swing.JLabel();
                jLabelBackground = new javax.swing.JLabel();

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
                setTitle("Ranking");
                setBackground(new java.awt.Color(1, 50, 67));
                setForeground(new java.awt.Color(1, 50, 67));
                setMaximumSize(new java.awt.Dimension(400, 500));
                setMinimumSize(new java.awt.Dimension(400, 500));
                setPreferredSize(new java.awt.Dimension(400, 500));
                setResizable(false);
                getContentPane().setLayout(null);

                jLabelName1.setFont(new java.awt.Font("Bitstream Charter", 1, 24)); // NOI18N
                jLabelName1.setForeground(new java.awt.Color(240, 52, 52));
                getContentPane().add(jLabelName1);
                jLabelName1.setBounds(110, 90, 170, 40);

                jLabelName2.setFont(new java.awt.Font("Bitstream Charter", 1, 24)); // NOI18N
                jLabelName2.setForeground(new java.awt.Color(240, 52, 52));
                getContentPane().add(jLabelName2);
                jLabelName2.setBounds(110, 130, 170, 40);

                jLabelName3.setFont(new java.awt.Font("Bitstream Charter", 1, 24)); // NOI18N
                jLabelName3.setForeground(new java.awt.Color(240, 52, 52));
                getContentPane().add(jLabelName3);
                jLabelName3.setBounds(110, 170, 170, 40);

                jLabelName4.setFont(new java.awt.Font("Bitstream Charter", 1, 24)); // NOI18N
                jLabelName4.setForeground(new java.awt.Color(240, 52, 52));
                getContentPane().add(jLabelName4);
                jLabelName4.setBounds(110, 210, 170, 40);

                jLabelName5.setFont(new java.awt.Font("Bitstream Charter", 1, 24)); // NOI18N
                jLabelName5.setForeground(new java.awt.Color(240, 52, 52));
                getContentPane().add(jLabelName5);
                jLabelName5.setBounds(110, 250, 170, 40);

                jLabelName6.setFont(new java.awt.Font("Bitstream Charter", 1, 24)); // NOI18N
                jLabelName6.setForeground(new java.awt.Color(240, 52, 52));
                getContentPane().add(jLabelName6);
                jLabelName6.setBounds(110, 290, 170, 40);

                jLabelName7.setFont(new java.awt.Font("Bitstream Charter", 1, 24)); // NOI18N
                jLabelName7.setForeground(new java.awt.Color(240, 52, 52));
                getContentPane().add(jLabelName7);
                jLabelName7.setBounds(110, 330, 170, 40);

                jLabelName8.setFont(new java.awt.Font("Bitstream Charter", 1, 24)); // NOI18N
                jLabelName8.setForeground(new java.awt.Color(240, 52, 52));
                getContentPane().add(jLabelName8);
                jLabelName8.setBounds(110, 370, 170, 40);

                jLabelName9.setFont(new java.awt.Font("Bitstream Charter", 1, 24)); // NOI18N
                jLabelName9.setForeground(new java.awt.Color(240, 52, 52));
                getContentPane().add(jLabelName9);
                jLabelName9.setBounds(110, 410, 170, 40);

                jLabelName10.setFont(new java.awt.Font("Bitstream Charter", 1, 24)); // NOI18N
                jLabelName10.setForeground(new java.awt.Color(240, 52, 52));
                getContentPane().add(jLabelName10);
                jLabelName10.setBounds(110, 450, 170, 40);

                jLabelRankingNumbers.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Numeros_Rank.png"))); // NOI18N
                getContentPane().add(jLabelRankingNumbers);
                jLabelRankingNumbers.setBounds(0, 80, 110, 410);

                jLabelRankingImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Logo_Ranking1.png"))); // NOI18N
                getContentPane().add(jLabelRankingImage);
                jLabelRankingImage.setBounds(100, 30, 210, 50);

                jLabelBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Blue_background.jpg"))); // NOI18N
                getContentPane().add(jLabelBackground);
                jLabelBackground.setBounds(0, 0, 400, 501);

                pack();
                setLocationRelativeTo(null);
        }// </editor-fold>//GEN-END:initComponents

        public void initComponents2(){
                jLabelName1.setText(rank.getNamesTop10(0));
                jLabelName2.setText(rank.getNamesTop10(1));
                jLabelName3.setText(rank.getNamesTop10(2));
                jLabelName4.setText(rank.getNamesTop10(3));
                jLabelName5.setText(rank.getNamesTop10(4));
                jLabelName6.setText(rank.getNamesTop10(5));
                jLabelName7.setText(rank.getNamesTop10(6));
                jLabelName8.setText(rank.getNamesTop10(7));
                jLabelName9.setText(rank.getNamesTop10(8));
                jLabelName10.setText(rank.getNamesTop10(9));
                
                
                //for(User xUser: users){
                //                if (count < 10){
                //                        int nameLength = xUser.topUserName.length();
                //                        pw.print(xUser.topUserName + " "); 
                //                        for (int i = 0; i < 21-(nameLength+1); i++){
                //                                pw.print("-");
                //                        }
                //                        pw.println(xUser.topUserScore);
                //                }
                //        count++;
                //}
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
                        java.util.logging.Logger.getLogger(MenuRanking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                } catch (InstantiationException ex) {
                        java.util.logging.Logger.getLogger(MenuRanking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                } catch (IllegalAccessException ex) {
                        java.util.logging.Logger.getLogger(MenuRanking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                        java.util.logging.Logger.getLogger(MenuRanking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                }
                //</editor-fold>

                /* Create and display the form */
                java.awt.EventQueue.invokeLater(new Runnable() {
                        public void run() {
                                new MenuRanking().setVisible(true);
                        }
                });
        }

        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JLabel jLabelBackground;
        private javax.swing.JLabel jLabelName1;
        private javax.swing.JLabel jLabelName10;
        private javax.swing.JLabel jLabelName2;
        private javax.swing.JLabel jLabelName3;
        private javax.swing.JLabel jLabelName4;
        private javax.swing.JLabel jLabelName5;
        private javax.swing.JLabel jLabelName6;
        private javax.swing.JLabel jLabelName7;
        private javax.swing.JLabel jLabelName8;
        private javax.swing.JLabel jLabelName9;
        private javax.swing.JLabel jLabelRankingImage;
        private javax.swing.JLabel jLabelRankingNumbers;
        // End of variables declaration//GEN-END:variables
}