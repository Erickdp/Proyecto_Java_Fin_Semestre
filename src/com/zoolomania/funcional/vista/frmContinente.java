/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zoolomania.funcional.vista;

import com.zoolomania.funcional.control.ContinenteTrs;
import com.zoolomania.funcional.control.HabitatTrs;
import com.zoolomania.funcional.control.MyExcepcion;
import com.zoolomania.funcional.control.UtilGestion;
import com.zoolomania.funcional.modelo.Continente;
import com.zoolomania.funcional.modelo.Habitat;
import java.util.Collections;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Erick Díaz
 */
public class frmContinente extends javax.swing.JFrame {
    
    HabitatTrs htrs = new HabitatTrs();
    ContinenteTrs ctrs = new ContinenteTrs();
    List<Habitat> habitats = htrs.listar();
    List<Continente> continentes = ctrs.listar();
    boolean bandera = true;
    
    private void cargarTablaH() {
        Object[] columna = {"ID", "Habitat", "Clima", "Vegetación"};
        DefaultTableModel modeloH = new DefaultTableModel(columna, 0);
        for (Habitat h : habitats) {
            short id = h.getId();
            String nombreH = h.getNombreHabitat();
            String clima = h.getClima();
            String vegetacion = h.getVegetacion();
            Object[] fila = {id, nombreH, clima, vegetacion};
            modeloH.addRow(fila);
        }
        this.tablaH.setModel(modeloH);
    }
    
    private void cargarTablaC() {
        Object[] columna = {"ID", "Continente"};
        DefaultTableModel modeloC = new DefaultTableModel(columna, 0);
        for (Continente c : continentes) {
            short id = c.getId();
            String continente = c.getNombreContienete();
            Object[] fila = {id, continente};
            modeloC.addRow(fila);
        }
        this.tablaC.setModel(modeloC);
    }

    /**
     * Creates new form frmContinente
     */
    public frmContinente() {
        initComponents();
        setLocationRelativeTo(null);
        cargarTablaC();
        cargarTablaH();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jID = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jNombre = new javax.swing.JTextField();
        bAgregar = new javax.swing.JButton();
        bActualizar = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        rAscendente = new javax.swing.JRadioButton();
        rDescendente = new javax.swing.JRadioButton();
        cBox = new javax.swing.JComboBox<>();
        jButton7 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        rAscendenteO = new javax.swing.JRadioButton();
        rDescendenteO = new javax.swing.JRadioButton();
        cBoxO = new javax.swing.JComboBox<>();
        jButton11 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaH = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaC = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(0, 102, 153));

        jLabel1.setText("ID");

        jLabel2.setText("Continente");

        bAgregar.setText("Agregar");
        bAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAgregarActionPerformed(evt);
            }
        });

        bActualizar.setText("Actualizar");
        bActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bActualizarActionPerformed(evt);
            }
        });

        jButton3.setText("Eliminar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Ordenar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Menú Principal");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("Ver Habitats");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        buttonGroup1.add(rAscendente);
        rAscendente.setSelected(true);
        rAscendente.setText("Ascendente");

        buttonGroup1.add(rDescendente);
        rDescendente.setText("Descendente");

        cBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nombre", "ID" }));

        jButton7.setText("Agregar");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton9.setText("Eliminar");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.setText("Ordenar");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        buttonGroup2.add(rAscendenteO);
        rAscendenteO.setSelected(true);
        rAscendenteO.setText("Ascendente");

        buttonGroup2.add(rDescendenteO);
        rDescendenteO.setText("Descendente");

        cBoxO.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nombre", "ID" }));

        jButton11.setText("Ver Todos los Habitats");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jLabel3.setText("jLabel3");

        tablaH.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tablaH);

        tablaC.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tablaC);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jID, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(362, 362, 362)
                        .addComponent(jButton5)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(bAgregar)
                                .addGap(18, 18, 18)
                                .addComponent(bActualizar)
                                .addGap(18, 18, 18)
                                .addComponent(jButton3)
                                .addGap(18, 18, 18)
                                .addComponent(jButton6))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton4)
                                .addGap(18, 18, 18)
                                .addComponent(rAscendente)
                                .addGap(18, 18, 18)
                                .addComponent(rDescendente)
                                .addGap(34, 34, 34)
                                .addComponent(cBox, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton10)
                                .addGap(18, 18, 18)
                                .addComponent(rAscendenteO))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton7)
                                .addGap(42, 42, 42)
                                .addComponent(jButton9)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(rDescendenteO)
                                .addGap(34, 34, 34)
                                .addComponent(cBoxO, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(24, 24, 24))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton11)
                                .addGap(48, 48, 48))))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 590, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 591, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton7)
                            .addComponent(jButton9)
                            .addComponent(jButton11))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton10)
                            .addComponent(rAscendenteO)
                            .addComponent(rDescendenteO)
                            .addComponent(cBoxO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton5))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(jNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(bAgregar)
                                    .addComponent(bActualizar)
                                    .addComponent(jButton3)
                                    .addComponent(jButton6))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButton4)
                                    .addComponent(rAscendente)
                                    .addComponent(rDescendente)
                                    .addComponent(cBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
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

    private void bActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bActualizarActionPerformed
        // TODO add your handling code here:
        if (tablaC.getSelectedRow() > -1
                & !(jID.getText().isEmpty() | jNombre.getText().isEmpty())) {
            JOptionPane.showMessageDialog(null, "El ID no puede ser actualizado", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            try {
                ctrs.actulizar(new Continente(continentes.get(tablaC.getSelectedRow()).getId(), jNombre.getText()));
            } catch (MyExcepcion ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            } finally {
                cargarTablaC();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Complete todos los campos", "AVISO", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_bActualizarActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        if (tablaC.getSelectedRow() > -1) {
            try {
                UtilGestion.eliminacionCompleta(continentes.get(tablaC.getSelectedRow()));
                ctrs.eliminar(continentes.get(tablaC.getSelectedRow()));
            } catch (MyExcepcion ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            } finally {
                cargarTablaC();
                habitats = htrs.listar();
                cargarTablaH();
            }
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        if (cBox.getSelectedIndex() == 0) {
            if (rAscendente.isSelected()) {
                Collections.sort(continentes, (o1, o2) -> {
                    return o2.getNombreContienete().compareToIgnoreCase(o1.getNombreContienete());
                });
            } else if (rDescendente.isSelected()) {
                Collections.sort(continentes, (o1, o2) -> {
                    return o1.getNombreContienete().compareToIgnoreCase(o2.getNombreContienete());
                });
            }
        } else if (cBox.getSelectedIndex() == 1) {
            if (rAscendente.isSelected()) {
                Collections.sort(continentes, (o1, o2) -> {
                    return Short.compare(o1.getId(), o2.getId());
                });
            } else if (rDescendente.isSelected()) {
                Collections.sort(continentes, (o1, o2) -> {
                    return Short.compare(o2.getId(), o1.getId());
                });
            }
        }
        cargarTablaC();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new frmMenuPrincipal().setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        if (tablaC.getSelectedRow() > -1 & tablaH.getSelectedRow() > -1 & !bandera) {
            Continente continente = continentes.get(tablaC.getSelectedRow());
            Habitat habitat = habitats.get(tablaH.getSelectedRow());
            if (continente.getHabitats().contains(habitat)) {
                continente.eliminarHabitat(habitat);
                habitat.eliminarContinente(continente);
                try {
                    ctrs.actulizar(continente);
                    htrs.actulizar(habitat);
                } catch (MyExcepcion ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                } finally {
                    habitats = continente.getHabitats();
                    cargarTablaH();
                }
            } else {
                JOptionPane.showMessageDialog(null, "El habitat que intenta eliminar no es del continente " + continente.getNombreContienete(),
                        "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Seleccione la fila del continente para ver sus habitats y luego eliminarlos", "Aviso",
                    JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
        if (cBoxO.getSelectedIndex() == 0) {
            Habitat.bandera = false;
            if (rAscendenteO.isSelected()) {
                Collections.sort(habitats, Collections.reverseOrder());
            } else if (rDescendenteO.isSelected()) {
                Collections.sort(habitats);
            }
        } else if (cBoxO.getSelectedIndex() == 1) {
            Habitat.bandera = true;
            if (rAscendenteO.isSelected()) {
                Collections.sort(habitats);
            } else if (rDescendenteO.isSelected()) {
                Collections.sort(habitats, Collections.reverseOrder());
            }
        }
        cargarTablaH();
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
        habitats = htrs.listar();
        continentes = ctrs.listar();
        bandera = true;
        cargarTablaC();
        cargarTablaH();
    }//GEN-LAST:event_jButton11ActionPerformed

    private void bAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAgregarActionPerformed
        // TODO add your handling code here:
        if (!(jID.getText().isEmpty() | jNombre.getText().isEmpty())) {
            try {
                ctrs.guardar(new Continente(Short.parseShort(jID.getText()), jNombre.getText()));
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Por favor llene los campos cuantitativos con números enteros", "Error", JOptionPane.ERROR_MESSAGE);
            } catch (MyExcepcion ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            } finally {
                cargarTablaC();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Complete todos los campos", "AVISO", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_bAgregarActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        if (tablaC.getSelectedRow() > -1) {
            habitats = continentes.get(tablaC.getSelectedRow()).getHabitats();
            cargarTablaH();
            bandera = false;
        } else {
            JOptionPane.showMessageDialog(null, "Seleccione la fila de la cual quiere revisar sus habitats", "Aviso", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        if (tablaC.getSelectedRow() > -1 & tablaH.getSelectedRow() > -1 & bandera) {
            Continente continente = continentes.get(tablaC.getSelectedRow());
            Habitat habitat = habitats.get(tablaH.getSelectedRow());
            if (!continente.getHabitats().contains(habitat)) {
                continente.agregarHabitat(habitat);
                habitat.agregarContinente(continente);
                try {
                    ctrs.actulizar(continente);
                    htrs.actulizar(habitat);
                    JOptionPane.showMessageDialog(null, "Habitat agregado al continente", "Aviso", JOptionPane.INFORMATION_MESSAGE);
                } catch (MyExcepcion ex) {
                    Logger.getLogger(frmContinente.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                JOptionPane.showMessageDialog(null, "El habitat que intenta agregar ya se "
                        + "encuentra en la lista", "Error", JOptionPane.INFORMATION_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Seleccione la fila del continente a agregar o "
                    + "agrege desde la lista completa de habitats", "Aviso", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_jButton7ActionPerformed

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
            java.util.logging.Logger.getLogger(frmContinente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmContinente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmContinente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmContinente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmContinente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bActualizar;
    private javax.swing.JButton bAgregar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JComboBox<String> cBox;
    private javax.swing.JComboBox<String> cBoxO;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton9;
    private javax.swing.JTextField jID;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField jNombre;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JRadioButton rAscendente;
    private javax.swing.JRadioButton rAscendenteO;
    private javax.swing.JRadioButton rDescendente;
    private javax.swing.JRadioButton rDescendenteO;
    private javax.swing.JTable tablaC;
    private javax.swing.JTable tablaH;
    // End of variables declaration//GEN-END:variables
}
