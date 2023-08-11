package ahorcado;

import javax.swing.JOptionPane;

public class Jugar extends javax.swing.JFrame {

    String letraingresadaChar = "";
    String letraingresada = "";
    String letraagarrada = "";
    JuegoAhorcadoAzar jaa;
    JuegoAhorcadoFijo jaf;
    boolean modo;
    String palabraPorEncontrar;
    int intentos;

    public Jugar(JuegoAhorcadoAzar jaa, JuegoAhorcadoFijo jaf) {
        initComponents();
        this.jaa = jaa;
        this.jaf = jaf;
        this.letraIngresada = txtletraingresada.getText();
        

        if (modo == false) {
        jaa = new  JuegoAhorcadoAzar("hilo");
            jaa.inicializarPalabraSecreta();
            jaa.intentos = 6;
            this.intentos = jaa.intentos;
            palabraPorEncontrar = jaa.palabraSecretaAzar;
        } else {
            jaf.inicializarPalabraSecreta();
            jaf.intentos = 6;
            this.intentos = jaf.intentos;
            palabraPorEncontrar = jaf.palabraSecretaFija;
        }
        lblnumintentos.setText(String.valueOf(intentos));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblnumintentos = new javax.swing.JLabel();
        lblpalabraoculta = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtletraingresada = new javax.swing.JTextField();
        btnprobarletra = new javax.swing.JButton();

        jLabel3.setText("jLabel3");

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(102, 0, 204));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Ingrese una letra: ");

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("ADIVINE LA PALABRA");

        lblnumintentos.setBackground(new java.awt.Color(102, 0, 204));
        lblnumintentos.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblnumintentos.setForeground(new java.awt.Color(0, 0, 0));
        lblnumintentos.setText("5");

        lblpalabraoculta.setBackground(new java.awt.Color(102, 0, 204));
        lblpalabraoculta.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblpalabraoculta.setForeground(new java.awt.Color(0, 0, 0));
        lblpalabraoculta.setText("Palabra");

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Intentos restantes:");

        txtletraingresada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtletraingresadaActionPerformed(evt);
            }
        });

        btnprobarletra.setBackground(new java.awt.Color(0, 51, 102));
        btnprobarletra.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnprobarletra.setForeground(new java.awt.Color(255, 255, 255));
        btnprobarletra.setText("Probar");
        btnprobarletra.setBorder(new javax.swing.border.MatteBorder(null));
        btnprobarletra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnprobarletraActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnprobarletra, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(121, 121, 121))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(txtletraingresada, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(lblnumintentos)
                        .addGap(93, 93, 93)
                        .addComponent(lblpalabraoculta)))
                .addGap(26, 95, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblnumintentos, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblpalabraoculta, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtletraingresada, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnprobarletra, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void txtletraingresadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtletraingresadaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtletraingresadaActionPerformed

    private void btnprobarletraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnprobarletraActionPerformed

        if (txtletraingresada.getText().length() > 1 && txtletraingresada.getText().length() < 1) {
            JOptionPane.showMessageDialog(null, "Ingrese unicamente una letra.");
        } else {
            letraingresada = txtletraingresada.getText();

            if (jaa.intentos > 0 && jaa.verificarLetra(letraingresada.charAt(0)) == true) {
                jaa.actualizarPalabraActual(letraingresada.charAt(0));

            }
        }

    }//GEN-LAST:event_btnprobarletraActionPerformed
    public String letraIngresada;


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnprobarletra;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblnumintentos;
    private javax.swing.JLabel lblpalabraoculta;
    private javax.swing.JTextField txtletraingresada;
    // End of variables declaration//GEN-END:variables
}
