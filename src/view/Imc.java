package view;

import javax.swing.JOptionPane;

//@author Rian Santos(RiandSantos - GitHub)

public class Imc extends javax.swing.JFrame {

    public Imc() {
        initComponents();  
        this.setResizable(false);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        /*this.setDefaultCloseOperation(Imc.DO_NOTHING_ON_CLOSE);*///Ainda não implementado...
    }
    double result;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        lblPeso = new javax.swing.JLabel();
        lblAltura = new javax.swing.JLabel();
        txtPeso = new javax.swing.JTextField();
        txtAltura = new javax.swing.JTextField();
        btnCalcule = new javax.swing.JButton();
        pnlImc = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculadora de IMC");
        getContentPane().setLayout(null);

        lblTitulo.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblTitulo.setText("Calcule o IMC");
        getContentPane().add(lblTitulo);
        lblTitulo.setBounds(10, 6, 145, 56);

        lblPeso.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblPeso.setText("Informe seu peso(kg):");
        getContentPane().add(lblPeso);
        lblPeso.setBounds(10, 68, 142, 30);

        lblAltura.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblAltura.setText("Informe sua altura:");
        getContentPane().add(lblAltura);
        lblAltura.setBounds(10, 104, 150, 30);

        txtPeso.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtPeso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPesoActionPerformed(evt);
            }
        });
        getContentPane().add(txtPeso);
        txtPeso.setBounds(170, 68, 218, 30);

        txtAltura.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtAltura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAlturaActionPerformed(evt);
            }
        });
        getContentPane().add(txtAltura);
        txtAltura.setBounds(170, 104, 218, 30);

        btnCalcule.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnCalcule.setText("Calcule");
        btnCalcule.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalculeActionPerformed(evt);
            }
        });
        getContentPane().add(btnCalcule);
        btnCalcule.setBounds(272, 140, 116, 34);

        javax.swing.GroupLayout pnlImcLayout = new javax.swing.GroupLayout(pnlImc);
        pnlImc.setLayout(pnlImcLayout);
        pnlImcLayout.setHorizontalGroup(
            pnlImcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        pnlImcLayout.setVerticalGroup(
            pnlImcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 190, Short.MAX_VALUE)
        );

        getContentPane().add(pnlImc);
        pnlImc.setBounds(0, 0, 400, 190);

        setBounds(1050, 265, 412, 222);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCalculeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalculeActionPerformed
        double p = Double.parseDouble(txtPeso.getText());
        double a = Double.parseDouble(txtAltura.getText());
        result = p / (a*a);
        if(result <= 18.5 )
        {
            //Conversão para Sting para conseguir limitar as casas decimais usando %.2f
            String resu = String.format("%.2f", result);
            JOptionPane.showMessageDialog(this.pnlImc,"Você está abaixo do peso! \n Seu IMC é de: " + resu);
        }else if(result >= 18.5 && result <= 24.9)
        {
            String resu = String.format("%.2f",result);
            JOptionPane.showMessageDialog(this.pnlImc, "Você está dentro do IMC adequado para seu peso e altura! \n Seu IMC é de: "+ resu);
        }else if(result >= 24.9 && result <=30)
        {
            String resu = String.format("%.2f", result);
            JOptionPane.showMessageDialog(this.pnlImc, "Você está sobrepeso!\nSeu IMC é de: "+resu);
        }else if(result>=30)
        {
            String resu = String.format("%.2f", result);
            JOptionPane.showMessageDialog(this.pnlImc, "De acordo com o calculo de IMC você está atualmente com obesidade!\nSeu IMC é de: "+resu);
        }
        
        JOptionPane.showMessageDialog(this.pnlImc, "<html><b>Magreza</b>: resultado é menor que 18,5kg/m² \n"
                + "<html><b>Normal</b>: resultado está entre 18,5kg/m² e 24,9kg/m² \n"
                + "<html><b>Sobrepeso</b>: resultado está entre 24,9kg/m² e 30kg/m² \n"
                + "<html><b>Obesidade</b>: resultado é maior que 30kg/m²"
                + "\n\nPara mais informações consulte um médico.","Dados de IMC",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnCalculeActionPerformed

    private void txtPesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPesoActionPerformed
    }//GEN-LAST:event_txtPesoActionPerformed

    private void txtAlturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAlturaActionPerformed
    }//GEN-LAST:event_txtAlturaActionPerformed

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
            java.util.logging.Logger.getLogger(Imc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Imc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Imc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Imc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Imc().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcule;
    private javax.swing.JLabel lblAltura;
    private javax.swing.JLabel lblPeso;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel pnlImc;
    private javax.swing.JTextField txtAltura;
    private javax.swing.JTextField txtPeso;
    // End of variables declaration//GEN-END:variables
}