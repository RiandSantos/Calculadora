package view;

import javax.swing.JOptionPane;

//@author Rian Santos(RiandSantos - GitHub)
public class Calculadora extends javax.swing.JFrame {

    public Calculadora() {
        initComponents();
    }

    double valor1, valor2;
    String sinal;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlCalculadora = new javax.swing.JPanel();
        lblConta = new javax.swing.JLabel();
        btnAdicao = new javax.swing.JButton();
        btnSubtracao = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        btnDivisao = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btnMultiplicacao = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        txtResultado = new javax.swing.JTextField();
        btn8 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btn3 = new javax.swing.JButton();
        btn0 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btnResultado = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        txtConta = new javax.swing.JTextField();
        btn9 = new javax.swing.JButton();
        btnVirgula = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        itmMenuImc = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculadora");
        setResizable(false);
        getContentPane().setLayout(null);

        pnlCalculadora.setBackground(new java.awt.Color(204, 204, 255));
        pnlCalculadora.setLayout(null);

        lblConta.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblConta.setText("A opeação realizada");
        lblConta.setEnabled(false);
        pnlCalculadora.add(lblConta);
        lblConta.setBounds(170, 50, 104, 28);

        btnAdicao.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnAdicao.setText("+");
        btnAdicao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicaoActionPerformed(evt);
            }
        });
        pnlCalculadora.add(btnAdicao);
        btnAdicao.setBounds(370, 300, 80, 44);

        btnSubtracao.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnSubtracao.setText("-");
        btnSubtracao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubtracaoActionPerformed(evt);
            }
        });
        pnlCalculadora.add(btnSubtracao);
        btnSubtracao.setBounds(370, 350, 80, 44);

        btn1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn1.setText("1");
        btn1.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });
        pnlCalculadora.add(btn1);
        btn1.setBounds(10, 180, 110, 80);

        btnDivisao.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnDivisao.setText("/");
        btnDivisao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDivisaoActionPerformed(evt);
            }
        });
        pnlCalculadora.add(btnDivisao);
        btnDivisao.setBounds(370, 450, 80, 40);

        btn4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn4.setText("4");
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });
        pnlCalculadora.add(btn4);
        btn4.setBounds(10, 270, 110, 80);

        btnMultiplicacao.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnMultiplicacao.setText("X");
        btnMultiplicacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMultiplicacaoActionPerformed(evt);
            }
        });
        pnlCalculadora.add(btnMultiplicacao);
        btnMultiplicacao.setBounds(370, 400, 80, 44);

        btn7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn7.setText("7");
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });
        pnlCalculadora.add(btn7);
        btn7.setBounds(10, 360, 110, 80);

        txtResultado.setEditable(false);
        txtResultado.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtResultado.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txtResultado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtResultadoActionPerformed(evt);
            }
        });
        pnlCalculadora.add(txtResultado);
        txtResultado.setBounds(10, 90, 350, 70);

        btn8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn8.setText("8");
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });
        pnlCalculadora.add(btn8);
        btn8.setBounds(130, 360, 110, 80);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Calculadora");
        pnlCalculadora.add(jLabel1);
        jLabel1.setBounds(10, 0, 300, 36);

        btn3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn3.setText("3");
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });
        pnlCalculadora.add(btn3);
        btn3.setBounds(250, 180, 110, 80);

        btn0.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn0.setText("0");
        btn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn0ActionPerformed(evt);
            }
        });
        pnlCalculadora.add(btn0);
        btn0.setBounds(10, 450, 230, 40);

        btn2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn2.setText("2");
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });
        pnlCalculadora.add(btn2);
        btn2.setBounds(130, 180, 110, 80);

        btnLimpar.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });
        pnlCalculadora.add(btnLimpar);
        btnLimpar.setBounds(370, 180, 80, 110);

        btn5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn5.setText("5");
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });
        pnlCalculadora.add(btn5);
        btn5.setBounds(130, 270, 110, 80);

        btnResultado.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnResultado.setText("=");
        btnResultado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResultadoActionPerformed(evt);
            }
        });
        pnlCalculadora.add(btnResultado);
        btnResultado.setBounds(370, 90, 80, 70);

        btn6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn6.setText("6");
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });
        pnlCalculadora.add(btn6);
        btn6.setBounds(250, 270, 110, 80);

        txtConta.setEditable(false);
        txtConta.setFocusable(false);
        txtConta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContaActionPerformed(evt);
            }
        });
        pnlCalculadora.add(txtConta);
        txtConta.setBounds(10, 50, 149, 28);

        btn9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn9.setText("9");
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });
        pnlCalculadora.add(btn9);
        btn9.setBounds(250, 360, 110, 80);

        btnVirgula.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnVirgula.setText(".");
        btnVirgula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVirgulaActionPerformed(evt);
            }
        });
        pnlCalculadora.add(btnVirgula);
        btnVirgula.setBounds(250, 450, 110, 40);

        getContentPane().add(pnlCalculadora);
        pnlCalculadora.setBounds(0, 0, 460, 520);

        jMenu1.setText("Opções");

        itmMenuImc.setText("Calcule seu IMC");
        itmMenuImc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmMenuImcActionPerformed(evt);
            }
        });
        jMenu1.add(itmMenuImc);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        setBounds(1050, 265, 471, 553);
    }// </editor-fold>//GEN-END:initComponents

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        txtResultado.setText(txtResultado.getText() + "6");
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        txtResultado.setText(txtResultado.getText() + "5");
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        txtResultado.setText(txtResultado.getText() + "4");
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        txtResultado.setText(txtResultado.getText() + "7");
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        txtResultado.setText(txtResultado.getText() + "8");
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        txtResultado.setText(txtResultado.getText() + "9");
    }//GEN-LAST:event_btn9ActionPerformed

    private void btn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn0ActionPerformed
        txtResultado.setText(txtResultado.getText() + "0");
    }//GEN-LAST:event_btn0ActionPerformed
    private void btnDivisaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDivisaoActionPerformed
        valor1 = Double.parseDouble(txtResultado.getText());
        sinal = "/";
        txtResultado.setText("");
    }//GEN-LAST:event_btnDivisaoActionPerformed

    private void btnMultiplicacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMultiplicacaoActionPerformed
        valor1 = Double.parseDouble(txtResultado.getText());
        sinal = "x";
        txtResultado.setText("");
    }//GEN-LAST:event_btnMultiplicacaoActionPerformed

    private void btnSubtracaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubtracaoActionPerformed
        valor1 = Double.parseDouble(txtResultado.getText());
        sinal = "-";
        txtResultado.setText("");
    }//GEN-LAST:event_btnSubtracaoActionPerformed

    private void btnAdicaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicaoActionPerformed
        valor1 = Double.parseDouble(txtResultado.getText());
        sinal = "+";
        txtResultado.setText("");
    }//GEN-LAST:event_btnAdicaoActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        txtResultado.setText("");
        txtConta.setText("");
        lblConta.setEnabled(false);
        valor1 = 0;
        valor2 = 0;
        sinal = null;
    }//GEN-LAST:event_btnLimparActionPerformed

    private void btnResultadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResultadoActionPerformed

        valor2 = Double.parseDouble(txtResultado.getText());
        if (sinal == "+"){
            txtResultado.setText(String.valueOf(valor1 + valor2));//Conversão para String valor1 e 2 que estavam em Double
        } else if (sinal == "-") {
            txtResultado.setText(String.valueOf(valor1 - valor2));//Conversão para String valor1 e 2 que estavam em Double
        } else if (sinal == "x") {
            txtResultado.setText(String.valueOf(valor1 * valor2));//Conversão para String valor1 e 2 que estavam em Double
        } else if (sinal == "/") {
            txtResultado.setText(String.valueOf(valor1 / valor2));//Conversão para String valor1 e 2 que estavam em Double
        } else {
            JOptionPane.showMessageDialog(this.pnlCalculadora, "Escolha uma função( +, -, x, / ) e digite outro valor!" + "\n" + "Em caso de dúvida leia o TXT junto ao executavél.", "ERROR :(", 1);
        }

        txtConta.setText(valor1 + " " + sinal + " " + valor2);
        lblConta.setEnabled(true);
    }//GEN-LAST:event_btnResultadoActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        txtResultado.setText(txtResultado.getText() + "3");
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        txtResultado.setText(txtResultado.getText() + "2");
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        txtResultado.setText(txtResultado.getText() + "1");
    }//GEN-LAST:event_btn1ActionPerformed

    private void txtResultadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtResultadoActionPerformed
    }//GEN-LAST:event_txtResultadoActionPerformed

    private void txtContaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContaActionPerformed
    }//GEN-LAST:event_txtContaActionPerformed

    private void btnVirgulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVirgulaActionPerformed
        txtResultado.setText(txtResultado.getText() + ".");
    }//GEN-LAST:event_btnVirgulaActionPerformed

    private void itmMenuImcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmMenuImcActionPerformed
        Imc telaImc = new Imc();
        telaImc.setVisible(true);
        telaImc.setLocationRelativeTo(this.lblConta);
    }//GEN-LAST:event_itmMenuImcActionPerformed

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
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn0;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnAdicao;
    private javax.swing.JButton btnDivisao;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnMultiplicacao;
    private javax.swing.JButton btnResultado;
    private javax.swing.JButton btnSubtracao;
    private javax.swing.JButton btnVirgula;
    private javax.swing.JMenuItem itmMenuImc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel lblConta;
    private javax.swing.JPanel pnlCalculadora;
    private javax.swing.JTextField txtConta;
    private javax.swing.JTextField txtResultado;
    // End of variables declaration//GEN-END:variables
}
