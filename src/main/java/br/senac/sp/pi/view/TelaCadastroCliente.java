/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.senac.sp.pi.view;

import br.senac.sp.pi.DAO.CadastroClienteDAO;
import br.senac.sp.pi.model.Clientes;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author denis
 */
public class TelaCadastroCliente extends javax.swing.JFrame {

    /**
     * Creates new form ata
     */
    public TelaCadastroCliente() {
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

        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Genero = new javax.swing.ButtonGroup();
        EstadoCivil = new javax.swing.ButtonGroup();
        inputNome = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        inputCPF = new javax.swing.JFormattedTextField();
        jLabel5 = new javax.swing.JLabel();
        inputTelefone = new javax.swing.JFormattedTextField();
        jLabel6 = new javax.swing.JLabel();
        inputEmail = new javax.swing.JFormattedTextField();
        jLabel7 = new javax.swing.JLabel();
        inputCEP = new javax.swing.JFormattedTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        genMasculino = new javax.swing.JRadioButton();
        genFeminino = new javax.swing.JRadioButton();
        genOutro = new javax.swing.JRadioButton();
        jLabel12 = new javax.swing.JLabel();
        inputDataNascimento = new javax.swing.JFormattedTextField();
        inputRua = new javax.swing.JFormattedTextField();
        inputEstado = new javax.swing.JFormattedTextField();
        jLabel9 = new javax.swing.JLabel();
        inputNumero = new javax.swing.JFormattedTextField();
        inputBairro = new javax.swing.JFormattedTextField();
        jLabel10 = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();
        btnConfirmar = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        btnSolteiro = new javax.swing.JRadioButton();
        btnCasado = new javax.swing.JRadioButton();
        btnViuvo = new javax.swing.JRadioButton();
        jLabel15 = new javax.swing.JLabel();
        inputCidade = new javax.swing.JFormattedTextField();

        jLabel2.setText("CPF:");

        jLabel4.setText("Telefone (DDD):");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        inputNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputNomeActionPerformed(evt);
            }
        });

        jLabel1.setText("Nome:");

        jLabel3.setText("CPF:");

        try {
            inputCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        inputCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputCPFActionPerformed(evt);
            }
        });

        jLabel5.setText("Telefone (DDD):");

        try {
            inputTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel6.setText("Email:");

        jLabel7.setText("CEP:");

        try {
            inputCEP.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel8.setText("Estado:");

        jLabel11.setText("Genero");

        Genero.add(genMasculino);
        genMasculino.setText("Masculino");
        genMasculino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genMasculinoActionPerformed(evt);
            }
        });

        Genero.add(genFeminino);
        genFeminino.setText("Feminino");

        Genero.add(genOutro);
        genOutro.setText("Outro");

        jLabel12.setText("Data de Nascimento (DD/MM/AAAA)");

        try {
            inputDataNascimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            inputEstado.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("??")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        inputEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputEstadoActionPerformed(evt);
            }
        });

        jLabel9.setText("Nº");

        inputNumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputNumeroActionPerformed(evt);
            }
        });

        jLabel10.setText("Bairro:");

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnConfirmar.setText("Confirmar");
        btnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarActionPerformed(evt);
            }
        });

        jLabel13.setText("Rua");

        jLabel14.setText("Estado Civil:");

        EstadoCivil.add(btnSolteiro);
        btnSolteiro.setText("Solteiro");
        btnSolteiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSolteiroActionPerformed(evt);
            }
        });

        EstadoCivil.add(btnCasado);
        btnCasado.setText("Casado");
        btnCasado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCasadoActionPerformed(evt);
            }
        });

        EstadoCivil.add(btnViuvo);
        btnViuvo.setText("Viuvo");

        jLabel15.setText("Cidade");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnConfirmar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCancelar)
                .addGap(84, 84, 84))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(inputNome)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(inputCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(inputTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel9)
                            .addComponent(jLabel13))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(inputRua)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(inputCEP, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(inputEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(inputCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(inputNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(inputBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(inputEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(genMasculino)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(genFeminino)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(genOutro))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(inputDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnSolteiro)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCasado)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnViuvo)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(inputCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(inputTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(inputEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(genMasculino)
                    .addComponent(genFeminino)
                    .addComponent(genOutro))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(inputDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(btnSolteiro)
                    .addComponent(btnCasado)
                    .addComponent(btnViuvo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(inputCEP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(inputEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(inputCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputRua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(inputNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConfirmar)
                    .addComponent(btnCancelar))
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inputNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputNomeActionPerformed

    private void inputCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputCPFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputCPFActionPerformed

    private void genMasculinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genMasculinoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_genMasculinoActionPerformed

    private void inputEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputEstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputEstadoActionPerformed

    private void inputNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputNumeroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputNumeroActionPerformed

    private void btnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarActionPerformed
        String nome = inputNome.getText().trim();
        String rua = inputRua.getText().trim();
        String cpf = inputCPF.getText().trim();
        String dn = inputDataNascimento.getText().trim();
        String cep = inputCEP.getText().trim();
        String numero = inputNumero.getText().trim();
        String bairro = inputBairro.getText().trim();
        String estado = inputEstado.getText().trim();
        String genero = "";
        String estadoCivil = "";
        String cidade = inputCidade.getText().trim();
        String email = inputEmail.getText().trim();
        String telefone = inputTelefone.getText().trim();

        try {

            if (genMasculino.isSelected()) {
                genero = "Masculino";
            }
            if (genFeminino.isSelected()) {
                genero = "Feminino";
            }
            if (genOutro.isSelected()) {
                genero = "Outro";
            }

            if (btnSolteiro.isSelected()) {
                estadoCivil = "Solteiro";

            }

            if (btnCasado.isSelected()) {
                estadoCivil = "Casado";
            }
            if (btnViuvo.isSelected()) {
                estadoCivil = "Viuvo";
            }

            if (!rua.isEmpty() && !cpf.isEmpty()
                    && !dn.isEmpty() && !cep.isEmpty()
                    && !numero.isEmpty() && !bairro.isEmpty()
                    && !estado.isEmpty() && !nome.isEmpty()
                    && !genero.isEmpty() && !estadoCivil.isEmpty()
                    && !email.isEmpty() && !telefone.isEmpty()
                    && !cidade.isEmpty())
             {
                JOptionPane.showMessageDialog(null, "Tudo preenchido");
                String endereco = rua + ", " + numero;
                cpf = cpf.replace(".", "");
                cpf = cpf.replace("-", "");
                cep = cep.replace("-", "");
                System.out.println(dn);
                System.out.println(cep);
                dn = dn.substring(6, 10) + "-" + dn.substring(3, 5) + "-" + dn.substring(0, 2);

                Clientes obj = new Clientes(genero, nome, cpf, endereco, dn, bairro, cidade, estado, estadoCivil,
                        cep, email, telefone);
                boolean retorno;
                retorno = CadastroClienteDAO.salvar(obj);

                if (retorno) {
                    JOptionPane.showMessageDialog(rootPane, "Sucesso!");
                    JOptionPane.showMessageDialog(null, "Dados enviados para o banco de dados");
                    WindowEvent closeWindow = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
                    Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(closeWindow);
                } else {
                    JOptionPane.showMessageDialog(rootPane, "Falha");
                    
                }

            } else {
                JOptionPane.showMessageDialog(null, "Preencha os campos restantes");

            }
        } finally {

        }

        // TODO add your handling code here:
    }//GEN-LAST:event_btnConfirmarActionPerformed

    private void btnSolteiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSolteiroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSolteiroActionPerformed

    private void btnCasadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCasadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCasadoActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        WindowEvent closeWindow = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(closeWindow);

        // TODO add your handling code here:
    }//GEN-LAST:event_btnCancelarActionPerformed

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
            java.util.logging.Logger.getLogger(TelaCadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastroCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup EstadoCivil;
    private javax.swing.ButtonGroup Genero;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JRadioButton btnCasado;
    private javax.swing.JButton btnConfirmar;
    private javax.swing.JRadioButton btnSolteiro;
    private javax.swing.JRadioButton btnViuvo;
    private javax.swing.JRadioButton genFeminino;
    private javax.swing.JRadioButton genMasculino;
    private javax.swing.JRadioButton genOutro;
    private javax.swing.JFormattedTextField inputBairro;
    private javax.swing.JFormattedTextField inputCEP;
    private javax.swing.JFormattedTextField inputCPF;
    private javax.swing.JFormattedTextField inputCidade;
    private javax.swing.JFormattedTextField inputDataNascimento;
    private javax.swing.JFormattedTextField inputEmail;
    private javax.swing.JFormattedTextField inputEstado;
    private javax.swing.JFormattedTextField inputNome;
    private javax.swing.JFormattedTextField inputNumero;
    private javax.swing.JFormattedTextField inputRua;
    private javax.swing.JFormattedTextField inputTelefone;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
