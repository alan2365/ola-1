package listaDePasajerosDeAutobuses;

import java.util.ArrayList;

public class Jugadores extends javax.swing.JFrame {

    private int limiteLider = 1;

    public Jugadores() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("PUNTO C");
        setSize(600, 433);
        tituloCapitan.setText("Nombre del capitan " + limiteLider);
    }

    ArrayList<String> equipoUno = new ArrayList();

    ArrayList<String> equipoDos = new ArrayList();

    ArrayList<String> banca = new ArrayList();

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tituloCapitan = new javax.swing.JLabel();
        nombreLideres = new javax.swing.JTextField();
        confirmarLideres = new javax.swing.JButton();
        tituloJugador = new javax.swing.JLabel();
        capturaJugador = new javax.swing.JTextField();
        confirmaJugador = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        muestraEquipoUno = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        muestraEquipoDos = new javax.swing.JTextArea();
        equipo1 = new javax.swing.JLabel();
        equipo2 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        listaDeLaBanca = new javax.swing.JTextArea();
        aviso = new javax.swing.JLabel();
        tituloDisponibles = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tituloCapitan.setText("Nombre del capitan");

        confirmarLideres.setText("OK");
        confirmarLideres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmarLideresActionPerformed(evt);
            }
        });

        tituloJugador.setText("Escoge al Jugador");

        confirmaJugador.setText("OK");
        confirmaJugador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmaJugadorActionPerformed(evt);
            }
        });

        muestraEquipoUno.setColumns(20);
        muestraEquipoUno.setRows(5);
        jScrollPane1.setViewportView(muestraEquipoUno);

        muestraEquipoDos.setColumns(20);
        muestraEquipoDos.setRows(5);
        jScrollPane2.setViewportView(muestraEquipoDos);

        equipo1.setText("Equipo 1");

        equipo2.setText("Equipo 2");

        listaDeLaBanca.setColumns(20);
        listaDeLaBanca.setRows(5);
        jScrollPane3.setViewportView(listaDeLaBanca);

        tituloDisponibles.setText("Jugadores Disponibles");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tituloCapitan)
                                    .addComponent(nombreLideres, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                                    .addComponent(capturaJugador)
                                    .addComponent(tituloJugador, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addComponent(confirmaJugador))
                                    .addComponent(confirmarLideres))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tituloDisponibles)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(equipo1)
                                .addGap(165, 165, 165)
                                .addComponent(equipo2)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(aviso, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(44, 44, 44)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(tituloCapitan))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(tituloDisponibles)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(nombreLideres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(tituloJugador)
                        .addGap(18, 18, 18)
                        .addComponent(capturaJugador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(confirmarLideres)
                        .addGap(58, 58, 58)
                        .addComponent(confirmaJugador)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(equipo1)
                    .addComponent(equipo2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addGap(18, 18, 18)
                .addComponent(aviso, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(56, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void confirmarLideresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmarLideresActionPerformed
        if (limiteLider == 2) {
            equipoDos.add(nombreLideres.getText());
            muestraEquipoDos.setText("Capitan: " + equipoDos.toString());
            confirmarLideres.setVisible(false);
            nombreLideres.setText("");
            banca.add("saul");
            banca.add("kevin");
            banca.add("cholo");
            banca.add("matte");
            banca.add("sub zero");
            banca.add("kabuto");
            banca.add("chicarcas");
            banca.add("chicharo");
            banca.add("chuky");
            banca.add("masca");
            banca.add("trevor");
            banca.add("faker");

            banca.forEach((ver) -> {
                listaDeLaBanca.setText(listaDeLaBanca.getText() + ver + "\n");
            });
        } else {
            equipoUno.add(nombreLideres.getText());
            muestraEquipoUno.setText("Capitan: " + equipoUno.toString());
            nombreLideres.setText("");
            limiteLider++;
        }
        tituloCapitan.setText("Nombre del capitan: " + limiteLider);
    }//GEN-LAST:event_confirmarLideresActionPerformed

    private void confirmaJugadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmaJugadorActionPerformed
        String select = capturaJugador.getText();
        if (banca.contains(select)) {
            if (equipoDos.size() < equipoUno.size()) {
                equipoDos.add(select);
                banca.remove(select);
                listaDeLaBanca.setText("");
                banca.forEach((ver) -> {
                    listaDeLaBanca.setText(listaDeLaBanca.getText() + ver + "\n");
                });
                muestraEquipoDos.setText("Jugador: " + select + "\n" + muestraEquipoDos.getText());
                aviso.setText("");
                capturaJugador.setText("");
            } else {
                equipoUno.add(select);
                banca.remove(select);
                listaDeLaBanca.setText("");
                banca.forEach((ver) -> {
                    listaDeLaBanca.setText(listaDeLaBanca.getText() + ver + "\n");
                });
                muestraEquipoUno.setText("Jugador: " + select + "\n" + muestraEquipoUno.getText());
                capturaJugador.setText("");
                aviso.setText("");
            }
        } else {
            aviso.setText("No existe el jugador");
            capturaJugador.setText("");
        }
    }//GEN-LAST:event_confirmaJugadorActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Jugadores().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel aviso;
    private javax.swing.JTextField capturaJugador;
    private javax.swing.JButton confirmaJugador;
    private javax.swing.JButton confirmarLideres;
    private javax.swing.JLabel equipo1;
    private javax.swing.JLabel equipo2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea listaDeLaBanca;
    private javax.swing.JTextArea muestraEquipoDos;
    private javax.swing.JTextArea muestraEquipoUno;
    private javax.swing.JTextField nombreLideres;
    private javax.swing.JLabel tituloCapitan;
    private javax.swing.JLabel tituloDisponibles;
    private javax.swing.JLabel tituloJugador;
    // End of variables declaration//GEN-END:variables
}
