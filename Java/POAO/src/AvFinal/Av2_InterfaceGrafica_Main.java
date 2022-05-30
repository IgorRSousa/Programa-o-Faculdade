package AvFinal;

import javax.swing.JOptionPane;

public class Av2_InterfaceGrafica_Main extends javax.swing.JFrame {
    
    public Av2_InterfaceGrafica_Main() {
        initComponents();
        this.banco = new Banco();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField2 = new javax.swing.JTextField();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        tfSDNome = new javax.swing.JTextField();
        tfSDNConta = new javax.swing.JTextField();
        tfSDSaldo = new javax.swing.JTextField();
        tfSDfValorTransasao = new javax.swing.JTextField();
        btSaque = new javax.swing.JButton();
        btDeposito = new javax.swing.JButton();
        Main = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        tfTranfTitular = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        tfTranfDestino = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        tfTranfSaldo = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        tfTranfValorTrasasao = new javax.swing.JTextField();
        btTransferir = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        tfCadastroNome = new javax.swing.JTextField();
        tfCadastroCPF = new javax.swing.JTextField();
        tfCadastroEndereco = new javax.swing.JTextField();
        tfCadastroTelefone = new javax.swing.JTextField();
        tfCadastroNConta = new javax.swing.JTextField();
        tfCadastroTipo = new javax.swing.JComboBox<>();
        tfCadastroSaldo = new javax.swing.JTextField();
        btCadastrar = new javax.swing.JButton();

        jTextField2.setText("jTextField2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel8.setText("Nome do Titular");

        jLabel9.setText("Nro da Conta");

        jLabel10.setText("Saldo Atual");

        jLabel11.setText("Valor da trasação");

        tfSDNome.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfSDNomeFocusLost(evt);
            }
        });

        tfSDNConta.setEditable(false);

        tfSDSaldo.setEditable(false);

        btSaque.setText("Saque");
        btSaque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSaqueActionPerformed(evt);
            }
        });

        btDeposito.setText("Deposito");
        btDeposito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDepositoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btSaque)
                        .addGap(69, 69, 69)
                        .addComponent(btDeposito))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(tfSDNConta, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(tfSDSaldo)
                        .addComponent(tfSDfValorTransasao, javax.swing.GroupLayout.DEFAULT_SIZE, 261, Short.MAX_VALUE)
                        .addComponent(tfSDNome)))
                .addGap(106, 106, 106))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(tfSDNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(tfSDNConta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(tfSDSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(tfSDfValorTransasao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btSaque)
                    .addComponent(btDeposito))
                .addContainerGap(48, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Saque ou Deposito", jPanel2);

        jLabel12.setText("Titular de Origen");

        tfTranfTitular.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfTranfTitularFocusLost(evt);
            }
        });

        jLabel13.setText("Titular do Destino");

        tfTranfDestino.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfTranfDestinoFocusLost(evt);
            }
        });

        jLabel14.setText("Saldo Disponivel");

        tfTranfSaldo.setEditable(false);

        jLabel15.setText("Valor da Trasação");

        btTransferir.setText("Transferir");
        btTransferir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btTransferirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout MainLayout = new javax.swing.GroupLayout(Main);
        Main.setLayout(MainLayout);
        MainLayout.setHorizontalGroup(
            MainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(MainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel13)
                    .addComponent(jLabel12)
                    .addComponent(jLabel14)
                    .addComponent(jLabel15))
                .addGap(27, 27, 27)
                .addGroup(MainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btTransferir)
                    .addGroup(MainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(tfTranfDestino)
                        .addComponent(tfTranfTitular)
                        .addComponent(tfTranfSaldo)
                        .addComponent(tfTranfValorTrasasao, javax.swing.GroupLayout.DEFAULT_SIZE, 307, Short.MAX_VALUE)))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        MainLayout.setVerticalGroup(
            MainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(MainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(tfTranfTitular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(MainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addComponent(tfTranfSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(MainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(tfTranfDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(MainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(tfTranfValorTrasasao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(btTransferir)
                .addContainerGap(47, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Transferencia", Main);

        jLabel1.setText("Nome");

        jLabel2.setText("CPF");

        jLabel3.setText("Endereço");

        jLabel4.setText("Telefone");

        jLabel5.setText("Nro da Conta");

        jLabel6.setText("Tipo");

        jLabel7.setText("Saldo Inicial");

        tfCadastroNome.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfCadastroNomeFocusLost(evt);
            }
        });

        tfCadastroTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Conta Corrente", "Conta Poupança" }));

        btCadastrar.setText("Cadastrar");
        btCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btCadastrar)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfCadastroNome, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfCadastroTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfCadastroSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfCadastroNConta, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfCadastroTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfCadastroEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfCadastroCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(140, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tfCadastroNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfCadastroCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tfCadastroEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tfCadastroTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfCadastroNConta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(tfCadastroTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(tfCadastroSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btCadastrar)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Cadastro e Consulta", jPanel1);

        getContentPane().add(jTabbedPane1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastrarActionPerformed
        Cadastrar();
    }//GEN-LAST:event_btCadastrarActionPerformed

    private void tfCadastroNomeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfCadastroNomeFocusLost
        Consultar();
    }//GEN-LAST:event_tfCadastroNomeFocusLost

    private void btSaqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSaqueActionPerformed
        Saque();
    }//GEN-LAST:event_btSaqueActionPerformed

    private void tfSDNomeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfSDNomeFocusLost
        consultaSD();
    }//GEN-LAST:event_tfSDNomeFocusLost

    private void btDepositoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDepositoActionPerformed
        Deposito();
    }//GEN-LAST:event_btDepositoActionPerformed

    private void btTransferirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTransferirActionPerformed
        Transferencia();
    }//GEN-LAST:event_btTransferirActionPerformed

    private void tfTranfTitularFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfTranfTitularFocusLost
        SaldoAtual();
    }//GEN-LAST:event_tfTranfTitularFocusLost

    private void tfTranfDestinoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfTranfDestinoFocusLost
        vDestino();
    }//GEN-LAST:event_tfTranfDestinoFocusLost

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Av2_InterfaceGrafica_Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Main;
    private javax.swing.JButton btCadastrar;
    private javax.swing.JButton btDeposito;
    private javax.swing.JButton btSaque;
    private javax.swing.JButton btTransferir;
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField tfCadastroCPF;
    private javax.swing.JTextField tfCadastroEndereco;
    private javax.swing.JTextField tfCadastroNConta;
    private javax.swing.JTextField tfCadastroNome;
    private javax.swing.JTextField tfCadastroSaldo;
    private javax.swing.JTextField tfCadastroTelefone;
    private javax.swing.JComboBox<String> tfCadastroTipo;
    private javax.swing.JTextField tfSDNConta;
    private javax.swing.JTextField tfSDNome;
    private javax.swing.JTextField tfSDSaldo;
    private javax.swing.JTextField tfSDfValorTransasao;
    private javax.swing.JTextField tfTranfDestino;
    private javax.swing.JTextField tfTranfSaldo;
    private javax.swing.JTextField tfTranfTitular;
    private javax.swing.JTextField tfTranfValorTrasasao;
    // End of variables declaration//GEN-END:variables
    private Banco banco;
    
    private void Cadastrar(){
        String nome = tfCadastroNome.getText();
        String cpf = tfCadastroCPF.getText();
        String endereco = tfCadastroEndereco.getText();
        String tell = tfCadastroTelefone.getText();
        String tipo = tfCadastroTipo.getSelectedItem().toString();
        var conta = new Conta(Integer.parseInt((tfCadastroNConta.getText())) ,tipo , Float.parseFloat(tfCadastroSaldo.getText()));
        this.banco.Cadastrar(new Cliente(nome , cpf, endereco, tell, conta));
        Limpar();
        JOptionPane.showMessageDialog(this,"!! Cadastro efetuado com sucesso !!");
    }
    
    private void Consultar(){
        Cliente c = this.banco.Consultar(tfCadastroNome.getText());
        if(c!=null){
            tfCadastroCPF.setText(c.getCPF());
            tfCadastroEndereco.setText(c.getEndereco());
            tfCadastroNConta.setText(Integer.toString(c.getConta().getNumero()));
            tfCadastroNome.setText(c.getNome());
            tfCadastroSaldo.setText("");
            tfCadastroTelefone.setText(c.getTelefone());
            if(c.getConta().getTipo() == "Conta Corrente"){
                tfCadastroTipo.setSelectedIndex(0);
            }else{
                tfCadastroTipo.setSelectedIndex(1);
            }
            tfCadastroSaldo.setText(Float.toString(c.getConta().getSaldo()));
            btCadastrar.setEnabled(false);
        }else {
            tfCadastroCPF.setText("");
            tfCadastroEndereco.setText("");
            tfCadastroNConta.setText("");
            tfCadastroSaldo.setText("");
            tfCadastroTelefone.setText("");
            tfCadastroTipo.setSelectedIndex(0); 
            btCadastrar.setEnabled(true);
        }
    }
    
    private void consultaSD(){
        Cliente c = this.banco.Consultar(tfSDNome.getText());
        if(c!=null){
            tfSDNConta.setText(Integer.toString(c.getConta().getNumero()));
            tfSDSaldo.setText(Float.toString(c.getConta().getSaldo()));
            btDeposito.setEnabled(true);
            btSaque.setEnabled(true);
        }else {
            btDeposito.setEnabled(false);
            btSaque.setEnabled(false);
            Limpar();
        }
    }
    
    private void Saque(){
        Cliente c = this.banco.Consultar(tfSDNome.getText());
        if(c.getConta().getSaldo() > Float.parseFloat(tfSDfValorTransasao.getText())){
            banco.Sacar(tfSDNome.getText(), Float.parseFloat(tfSDfValorTransasao.getText()));
            Limpar();
            JOptionPane.showMessageDialog(this,"!! Saque efetuado com sucesso !!");
        }else{
            JOptionPane.showMessageDialog(this,"!! Saldo Insuficiente transação nao efetuado !!");
            tfSDfValorTransasao.setText("");   
        }
    }
    
    private void Deposito(){
        banco.Depositar(tfSDNome.getText(), Float.parseFloat(tfSDfValorTransasao.getText()));
        Limpar();
        JOptionPane.showMessageDialog(this,"!! Deposito efetuado com sucesso !!");
    }
    
    private void Transferencia(){ //rever todo ---------------------------------------------------------------------------
        Cliente c = this.banco.Consultar(tfTranfTitular.getText());
        if(c.getConta().getSaldo() > Float.parseFloat(tfTranfValorTrasasao.getText())){
            banco.Transferir(tfTranfTitular.getText(),tfTranfDestino.getText() ,Float.parseFloat(tfTranfValorTrasasao.getText()));
            Limpar();
            JOptionPane.showMessageDialog(this,"!! Transferencia efetuado com sucesso !!");
        }else{
            JOptionPane.showMessageDialog(this,"!! Saldo Insuficiente transação nao efetuado !!");
            tfTranfValorTrasasao.setText("");
        }    
    }
    
    private void SaldoAtual(){
        Cliente c = this.banco.Consultar(tfTranfTitular.getText());
        if(c!=null){
            tfTranfSaldo.setText(Float.toString(c.getConta().getSaldo()));
            btTransferir.setEnabled(true);
        }else{
            btTransferir.setEnabled(false);
            Limpar();
        }  
    }
    
    private void vDestino(){
        Cliente c = this.banco.Consultar(tfTranfDestino.getText());
        if(c==null){
            JOptionPane.showMessageDialog(this,"!! Titular destinatario Invalido ou Inexistente !!");
            tfTranfDestino.setText("");
            btTransferir.setEnabled(false);
        }else{
            btTransferir.setEnabled(true);
        } 
    }
    
    private void Limpar(){
        tfCadastroCPF.setText("");
        tfCadastroEndereco.setText("");
        tfCadastroNConta.setText("");
        tfCadastroNome.setText("");
        tfCadastroSaldo.setText("");
        tfCadastroTelefone.setText("");
        tfCadastroTipo.setSelectedIndex(0);
        tfSDNome.setText("");
        tfSDNConta.setText("");
        tfSDSaldo.setText("");
        tfSDfValorTransasao.setText("");
        tfTranfDestino.setText("");
        tfTranfSaldo.setText("");
        tfTranfTitular.setText("");
        tfTranfValorTrasasao.setText("");
    }
}
