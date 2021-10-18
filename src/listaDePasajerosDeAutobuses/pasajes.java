package listaDePasajerosDeAutobuses;

import java.util.LinkedHashSet;

public class pasajes extends javax.swing.JFrame {

    public pasajes() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("PUNTO B");
        setSize(423, 405);
    }
    LinkedHashSet<String> listaPasaje = new LinkedHashSet();

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tituloUno = new javax.swing.JLabel();
        ingresaNombre = new javax.swing.JTextField();
        agrega = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        eliminaNombre = new javax.swing.JTextField();
        elimina = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        muestraPasajeros = new javax.swing.JTextArea();
        actualizaLista = new javax.swing.JButton();
        siguientePrograma = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tituloUno.setText("Agregar pasajero");

        agrega.setText("Agrega");
        agrega.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregaActionPerformed(evt);
            }
        });

        jLabel1.setText("Eliminar pasajero");

        elimina.setText("Elimina");
        elimina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminaActionPerformed(evt);
            }
        });

        jLabel2.setText("Ver informacion");

        muestraPasajeros.setColumns(20);
        muestraPasajeros.setRows(5);
        jScrollPane1.setViewportView(muestraPasajeros);

        actualizaLista.setText("actualiza");
        actualizaLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualizaListaActionPerformed(evt);
            }
        });

        siguientePrograma.setText("Siguiente");
        siguientePrograma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                siguienteProgramaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(siguientePrograma)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(30, 30, 30)
                            .addComponent(actualizaLista))
                        .addComponent(jLabel2)
                        .addComponent(jLabel1)
                        .addComponent(tituloUno)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(eliminaNombre, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                                .addComponent(ingresaNombre, javax.swing.GroupLayout.Alignment.LEADING))
                            .addGap(33, 33, 33)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(agrega)
                                .addComponent(elimina)))))
                .addContainerGap(119, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(tituloUno)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ingresaNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(agrega))
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(eliminaNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(elimina))
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(actualizaLista)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(siguientePrograma)
                .addGap(40, 40, 40))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void agregaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregaActionPerformed
        listaPasaje.add(ingresaNombre.getText());
        ingresaNombre.setText("");
    }//GEN-LAST:event_agregaActionPerformed

    private void actualizaListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizaListaActionPerformed
        muestraPasajeros.setText(listaPasaje.toString());
    }//GEN-LAST:event_actualizaListaActionPerformed

    private void eliminaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminaActionPerformed
        listaPasaje.remove(eliminaNombre.getText());
        eliminaNombre.setText("");
    }//GEN-LAST:event_eliminaActionPerformed

    private void siguienteProgramaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_siguienteProgramaActionPerformed
        Jugadores ventana = new Jugadores();
        ventana.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_siguienteProgramaActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pasajes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton actualizaLista;
    private javax.swing.JButton agrega;
    private javax.swing.JButton elimina;
    private javax.swing.JTextField eliminaNombre;
    private javax.swing.JTextField ingresaNombre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea muestraPasajeros;
    private javax.swing.JButton siguientePrograma;
    private javax.swing.JLabel tituloUno;
    // End of variables declaration//GEN-END:variables
}
