package dividirconta;

public class Restaurante extends javax.swing.JFrame {

    public Restaurante() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botoes = new javax.swing.ButtonGroup();
        PanelInformaçõesConsumo = new javax.swing.JPanel();
        LabelConsumo = new javax.swing.JLabel();
        consutotal = new javax.swing.JTextField();
        LabelCouvert = new javax.swing.JLabel();
        couvpessoa = new javax.swing.JTextField();
        LabelTaxaServiço = new javax.swing.JLabel();
        si = new javax.swing.JRadioButton();
        na = new javax.swing.JRadioButton();
        divpessoas = new javax.swing.JSpinner();
        LabelDividirPessoas = new javax.swing.JLabel();
        vazio = new javax.swing.JRadioButton();
        PanelCustoFinal = new javax.swing.JPanel();
        LabelCustoTotal = new javax.swing.JLabel();
        custototal = new javax.swing.JTextField();
        LabelValorPessoa = new javax.swing.JLabel();
        valorpessoa = new javax.swing.JTextField();
        calcul = new javax.swing.JButton();
        limpa = new javax.swing.JButton();
        fecha = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("DividirConta");

        PanelInformaçõesConsumo.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 51, 0), 3, true), "Informações de Consumo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Rockwell Condensed", 1, 18), new java.awt.Color(102, 0, 0))); // NOI18N

        LabelConsumo.setFont(new java.awt.Font("Lucida Handwriting", 1, 14)); // NOI18N
        LabelConsumo.setText("Consumo Total (R$)");

        LabelCouvert.setFont(new java.awt.Font("Lucida Handwriting", 1, 14)); // NOI18N
        LabelCouvert.setText("Couvert por Pessoa (R$)");

        LabelTaxaServiço.setFont(new java.awt.Font("Lucida Handwriting", 1, 14)); // NOI18N
        LabelTaxaServiço.setText("Possui Taxa de Serviço (10%)?");

        botoes.add(si);
        si.setFont(new java.awt.Font("Malgun Gothic", 1, 14)); // NOI18N
        si.setText("SIM");

        botoes.add(na);
        na.setFont(new java.awt.Font("Malgun Gothic", 1, 14)); // NOI18N
        na.setText("NÃO");

        LabelDividirPessoas.setFont(new java.awt.Font("Lucida Handwriting", 1, 14)); // NOI18N
        LabelDividirPessoas.setText("Dividir em quantas Pessoas?");

        botoes.add(vazio);
        vazio.setText("jRadioButton1");

        javax.swing.GroupLayout PanelInformaçõesConsumoLayout = new javax.swing.GroupLayout(PanelInformaçõesConsumo);
        PanelInformaçõesConsumo.setLayout(PanelInformaçõesConsumoLayout);
        PanelInformaçõesConsumoLayout.setHorizontalGroup(
            PanelInformaçõesConsumoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelInformaçõesConsumoLayout.createSequentialGroup()
                .addGroup(PanelInformaçõesConsumoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelInformaçõesConsumoLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(PanelInformaçõesConsumoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(consutotal)
                            .addComponent(LabelConsumo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(PanelInformaçõesConsumoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LabelCouvert, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelInformaçõesConsumoLayout.createSequentialGroup()
                                .addComponent(couvpessoa, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)))
                        .addGap(25, 25, 25))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelInformaçõesConsumoLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(PanelInformaçõesConsumoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(PanelInformaçõesConsumoLayout.createSequentialGroup()
                                .addComponent(LabelTaxaServiço, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addComponent(si)
                                .addGap(56, 56, 56)
                                .addComponent(na))
                            .addGroup(PanelInformaçõesConsumoLayout.createSequentialGroup()
                                .addComponent(LabelDividirPessoas)
                                .addGap(18, 18, 18)
                                .addComponent(divpessoas, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(vazio, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(16, 16, 16))
        );
        PanelInformaçõesConsumoLayout.setVerticalGroup(
            PanelInformaçõesConsumoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelInformaçõesConsumoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelInformaçõesConsumoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelConsumo)
                    .addComponent(LabelCouvert, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelInformaçõesConsumoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(consutotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(couvpessoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PanelInformaçõesConsumoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelTaxaServiço)
                    .addComponent(si)
                    .addComponent(na))
                .addGap(18, 18, 18)
                .addGroup(PanelInformaçõesConsumoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(divpessoas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelDividirPessoas)
                    .addComponent(vazio))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        PanelCustoFinal.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 51, 0), 3, true), "Custo Final", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Rockwell Condensed", 1, 18), new java.awt.Color(102, 0, 0))); // NOI18N

        LabelCustoTotal.setFont(new java.awt.Font("Lucida Handwriting", 1, 14)); // NOI18N
        LabelCustoTotal.setText("Custo Total (R$)");

        LabelValorPessoa.setFont(new java.awt.Font("Lucida Handwriting", 1, 14)); // NOI18N
        LabelValorPessoa.setText("Valor por Pessoa (R$)");

        javax.swing.GroupLayout PanelCustoFinalLayout = new javax.swing.GroupLayout(PanelCustoFinal);
        PanelCustoFinal.setLayout(PanelCustoFinalLayout);
        PanelCustoFinalLayout.setHorizontalGroup(
            PanelCustoFinalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelCustoFinalLayout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(PanelCustoFinalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LabelCustoTotal)
                    .addComponent(custototal, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(PanelCustoFinalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LabelValorPessoa)
                    .addGroup(PanelCustoFinalLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(valorpessoa, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelCustoFinalLayout.setVerticalGroup(
            PanelCustoFinalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelCustoFinalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelCustoFinalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LabelValorPessoa, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(LabelCustoTotal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelCustoFinalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(custototal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(valorpessoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        calcul.setBackground(new java.awt.Color(51, 51, 0));
        calcul.setFont(new java.awt.Font("Rockwell Condensed", 1, 18)); // NOI18N
        calcul.setForeground(new java.awt.Color(255, 255, 255));
        calcul.setText("CALCULAR");
        calcul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculActionPerformed(evt);
            }
        });

        limpa.setBackground(new java.awt.Color(51, 51, 0));
        limpa.setFont(new java.awt.Font("Rockwell Condensed", 1, 18)); // NOI18N
        limpa.setForeground(new java.awt.Color(255, 255, 255));
        limpa.setText("LIMPAR");
        limpa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpaActionPerformed(evt);
            }
        });

        fecha.setBackground(new java.awt.Color(51, 51, 0));
        fecha.setFont(new java.awt.Font("Rockwell Condensed", 1, 18)); // NOI18N
        fecha.setForeground(new java.awt.Color(255, 255, 255));
        fecha.setText("FECHAR");
        fecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fechaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(PanelInformaçõesConsumo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(PanelCustoFinal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(calcul, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(limpa, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(PanelInformaçõesConsumo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PanelCustoFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(calcul, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(limpa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(fecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void fechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fechaActionPerformed

        System.exit(0);
        
    }//GEN-LAST:event_fechaActionPerformed

    private void calculActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculActionPerformed

        String consu = consutotal.getText();
        double consuvalor = Double.parseDouble(consu);
        String couve = couvpessoa.getText();
        double couvevalor = Double.parseDouble(couve);
        double resultadototal;
        double valorpess;
        int div = (int)divpessoas.getValue();

        if(na.isSelected()){
            resultadototal = consuvalor + couvevalor;
        }else{
            resultadototal = consuvalor + couvevalor + (consuvalor * 0.1);}
            
        valorpess = resultadototal / div;
        custototal.setText(" " + resultadototal);
        valorpessoa.setText(" " + valorpess);
        
    }//GEN-LAST:event_calculActionPerformed

    private void limpaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpaActionPerformed
        
        divpessoas.setValue(0);
        couvpessoa.setText("");
        consutotal.setText("");
        custototal.setText("");
        valorpessoa.setText("");
        na.setSelected(false);
        si.setSelected(false);
        vazio.setSelected(true);
        
    }//GEN-LAST:event_limpaActionPerformed

    public static void main(String args[]) {
   
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Restaurante().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelConsumo;
    private javax.swing.JLabel LabelCouvert;
    private javax.swing.JLabel LabelCustoTotal;
    private javax.swing.JLabel LabelDividirPessoas;
    private javax.swing.JLabel LabelTaxaServiço;
    private javax.swing.JLabel LabelValorPessoa;
    private javax.swing.JPanel PanelCustoFinal;
    private javax.swing.JPanel PanelInformaçõesConsumo;
    private javax.swing.ButtonGroup botoes;
    private javax.swing.JButton calcul;
    private javax.swing.JTextField consutotal;
    private javax.swing.JTextField couvpessoa;
    private javax.swing.JTextField custototal;
    private javax.swing.JSpinner divpessoas;
    private javax.swing.JButton fecha;
    private javax.swing.JButton limpa;
    private javax.swing.JRadioButton na;
    private javax.swing.JRadioButton si;
    private javax.swing.JTextField valorpessoa;
    private javax.swing.JRadioButton vazio;
    // End of variables declaration//GEN-END:variables
}
