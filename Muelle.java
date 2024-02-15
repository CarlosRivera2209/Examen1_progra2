package examen1_progra2;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Muelle extends javax.swing.JFrame {

    private ArrayList<Barco> listaBarcos = new ArrayList<>();
    private ArrayList<String> nombresBarcos = new ArrayList<>();

    public Muelle() {
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSpinField1 = new com.toedter.components.JSpinField();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        AgregarBarco = new javax.swing.JButton();
        agregarElemento = new javax.swing.JButton();
        vaciarBarco = new javax.swing.JButton();
        barcosDesde = new javax.swing.JButton();
        salir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("BIENVENIDOS ");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, 310, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("AL MUELLE");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 80, -1, -1));

        AgregarBarco.setBackground(new java.awt.Color(255, 204, 204));
        AgregarBarco.setForeground(new java.awt.Color(0, 0, 0));
        AgregarBarco.setText("Agregar un Barco");
        AgregarBarco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarBarcoActionPerformed(evt);
            }
        });
        jPanel1.add(AgregarBarco, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 170, 170, 50));

        agregarElemento.setBackground(new java.awt.Color(255, 255, 204));
        agregarElemento.setForeground(new java.awt.Color(0, 0, 0));
        agregarElemento.setText("Agregar Elemento al barco");
        agregarElemento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarElementoActionPerformed(evt);
            }
        });
        jPanel1.add(agregarElemento, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 230, -1, 50));

        vaciarBarco.setBackground(new java.awt.Color(255, 255, 0));
        vaciarBarco.setForeground(new java.awt.Color(0, 0, 0));
        vaciarBarco.setText("Vaciar el Barco");
        vaciarBarco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vaciarBarcoActionPerformed(evt);
            }
        });
        jPanel1.add(vaciarBarco, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 290, 170, 50));

        barcosDesde.setBackground(new java.awt.Color(102, 255, 255));
        barcosDesde.setForeground(new java.awt.Color(0, 0, 0));
        barcosDesde.setText("Barcos Desde ");
        barcosDesde.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                barcosDesdeActionPerformed(evt);
            }
        });
        jPanel1.add(barcosDesde, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 350, 170, 50));

        salir.setBackground(new java.awt.Color(153, 0, 0));
        salir.setText("Salir");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });
        jPanel1.add(salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 420, 160, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/PLAYA.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 674, -1));

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

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        dispose();
    }//GEN-LAST:event_salirActionPerformed

    private void AgregarBarcoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarBarcoActionPerformed
        String tipo = JOptionPane.showInputDialog(null, "Ingrese el tipo de barco (PESQUERO o PASAJERO):");
        if (tipo != null && !tipo.isEmpty()) {
            String nombreBarco = JOptionPane.showInputDialog(null, "Ingrese el nombre del barco:");
            if (nombreBarco != null && !nombreBarco.isEmpty()) {
                boolean nombreUnico = !nombresBarcos.contains(nombreBarco);
                if (nombreUnico) {
                    if (tipo.equalsIgnoreCase("PESQUERO")) {
                        TipoPesquero tipoPesquero = obtenerTipoPesquero();
                        if (tipoPesquero != null) {
                            BarcoPesquero barcoPesquero = new BarcoPesquero(tipoPesquero);
                            listaBarcos.add(barcoPesquero);
                            nombresBarcos.add(nombreBarco);
                            JOptionPane.showMessageDialog(null, "Barco pesquero agregado correctamente.");
                        }
                    } else if (tipo.equalsIgnoreCase("PASAJERO")) {
                        int capacidad = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la capacidad del barco de pasajeros:"));
                        double precioBoleto = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el precio del boleto:"));
                        BarcoPasajero barcoPasajero = new BarcoPasajero(capacidad, precioBoleto);
                        listaBarcos.add(barcoPasajero);
                        nombresBarcos.add(nombreBarco);
                        JOptionPane.showMessageDialog(null, "Barco de pasajeros agregado correctamente.");
                    } else {
                        JOptionPane.showMessageDialog(null, "Tipo de barco no válido.");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "El nombre del barco ya existe.");
                }
            }
        }
    }//GEN-LAST:event_AgregarBarcoActionPerformed

    private void agregarElementoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarElementoActionPerformed
        String nombreBarco = JOptionPane.showInputDialog(null, "Ingrese el nombre del barco:");
        if (nombreBarco != null && !nombreBarco.isEmpty()) {
            int indiceBarco = nombresBarcos.indexOf(nombreBarco);
            if (indiceBarco != -1) {
                Barco barco = listaBarcos.get(indiceBarco);
                barco.agregarElemento();
                JOptionPane.showMessageDialog(null, "Elemento agregado al barco correctamente.");
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró un barco con ese nombre.");
            }
        }
    }//GEN-LAST:event_agregarElementoActionPerformed

    private void vaciarBarcoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vaciarBarcoActionPerformed
        String nombreBarco = JOptionPane.showInputDialog(null, "Ingrese el nombre del barco:");
        if (nombreBarco != null && !nombreBarco.isEmpty()) {
            int indiceBarco = nombresBarcos.indexOf(nombreBarco);
            if (indiceBarco != -1) {
                Barco barco = listaBarcos.get(indiceBarco);
                double total = barco.vaciarCobrar();
                JOptionPane.showMessageDialog(null, "Barco vaciado correctamente.\nTotal generado: $" + total + "\nDatos del barco:\n" + barco.toString());
                if (barco instanceof BarcoPasajero) {
                    ((BarcoPasajero) barco).listarPasajeros();
                }
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró un barco con ese nombre.");
            }
        }
    }//GEN-LAST:event_vaciarBarcoActionPerformed

    private void barcosDesdeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_barcosDesdeActionPerformed
        int year = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el año para filtrar los barcos:"));
        StringBuilder mensaje = new StringBuilder("Barcos desde " + year + ":\n");
        barcosDesdeRecursivo(year, mensaje);
        JOptionPane.showMessageDialog(null, mensaje.toString());
    }

    private void barcosDesdeRecursivo(int year, StringBuilder mensaje) {
        for (Barco barco : listaBarcos) {
            if (barco.getFechaPuestaEnCirculacion().getYear() >= year) {
                mensaje.append(barco.getNombre()).append(" - Fecha de circulación: ").append(barco.getFechaPuestaEnCirculacion()).append("\n");
            }
        }
    }//GEN-LAST:event_barcosDesdeActionPerformed

    private TipoPesquero obtenerTipoPesquero() {
        TipoPesquero[] tipos = TipoPesquero.values();
        String[] nombresTipos = new String[tipos.length];
        for (int i = 0; i < tipos.length; i++) {
            nombresTipos[i] = tipos[i].toString();
        }
        String tipoSeleccionado = (String) JOptionPane.showInputDialog(null, "Seleccione el tipo de pesquero:", "Tipo de Pesquero",
                JOptionPane.QUESTION_MESSAGE, null, nombresTipos, nombresTipos[0]);
        if (tipoSeleccionado != null) {
            return TipoPesquero.valueOf(tipoSeleccionado);
        }
        return null;
    }

    public static void main(String args[]) {

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
            java.util.logging.Logger.getLogger(Muelle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Muelle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Muelle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Muelle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Muelle().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AgregarBarco;
    private javax.swing.JButton agregarElemento;
    private javax.swing.JButton barcosDesde;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private com.toedter.components.JSpinField jSpinField1;
    private javax.swing.JButton salir;
    private javax.swing.JButton vaciarBarco;
    // End of variables declaration//GEN-END:variables
}
