/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Gstore.vista;

import Gstore.daoImpl.CategoriasDaoImpl;
import Gstore.daoImpl.ProductosDaoImpl;
import Gstore.model.Categorias;
import Gstore.model.Productos;
import Gstore.config.Entries;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;



public class MenuFrame extends javax.swing.JFrame {
    
    static ProductosDaoImpl limp =new ProductosDaoImpl();
    static CategoriasDaoImpl aimp = new CategoriasDaoImpl();
    static DefaultTableModel model = new DefaultTableModel();
    static List<Productos> listProductos = new ArrayList<>();
    static List<Categorias> listCategorias = new ArrayList<>();
    private boolean accion = false;
    
    Entries metodo = new Entries();
    
    public MenuFrame() {
        initComponents();
        this.setLocationRelativeTo(null);
        listar();
        listarCategorias();
        deshabilitarForm();
    }
    private void listarCategorias(){
      List<Categorias> listaDao = new ArrayList();
        try {
            listaDao = aimp.readAll();
            for (Categorias categorias : listaDao) {
                listCategorias.add(categorias);
                cboCategoria.addItem(categorias.getNombre());
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    private void listar(){
        List<Productos> listaDao = new ArrayList();
        model.setNumRows(0);
        model = (DefaultTableModel) tblListado.getModel();
        Object[] obj = new Object[7];
        try {
            listaDao = limp.readAll();
            for (Productos productos : listaDao) {
                obj[0] = String.valueOf(productos.getIdproductos());
                obj[1] = String.valueOf(productos.getNombre());
                obj[2] = String.valueOf(productos.getPrecio());
                obj[3] = String.valueOf(productos.getStock());
                obj[4] = String.valueOf(productos.getOferta());
                obj[5] = String.valueOf(productos.getProovedor_id());
                obj[6] = String.valueOf(productos.getCategoria_id());
                model.addRow(obj);
            }
            tblListado.setModel(model);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    private void habilitarForm() {
        
        btnAgregar.setEnabled(false);
        btnEditar.setEnabled(false);
        btnEliminar.setEnabled(false);
        btnProforma.setEnabled(false);
        
        btnCancelar.setEnabled(true);
        btnGuardar.setEnabled(true);
        txtIdProductos.setEnabled(true);
        txtNombre.setEnabled(true);
        txtStock.setEnabled(true);
        txtIdProovedor.setEnabled(true);
        txtPrecio.setEnabled(true);
        txtOferta.setEnabled(true);
        cboCategoria.setEnabled(true);
        tblListado.setEnabled(true);
        
    }
    
    private void deshabilitarForm() {
        
        btnAgregar.setEnabled(true);
        btnEditar.setEnabled(true);
        btnEliminar.setEnabled(true);
        btnProforma.setEnabled(true);
        
        btnCancelar.setEnabled(false);
        btnGuardar.setEnabled(false);
        txtIdProductos.setText("");
        txtNombre.setText("");
        txtStock.setText("");
        txtIdProovedor.setText("");
        txtPrecio.setText("");
        txtOferta.setText("");
        if (!listCategorias.isEmpty()) {
            cboCategoria.setSelectedIndex(0);
        }
 
        txtIdProductos.setEnabled(false);
        txtNombre.setEnabled(false);
        txtStock.setEnabled(false);
        txtIdProovedor.setEnabled(false);
        txtPrecio.setEnabled(false);
        txtOferta.setEnabled(false);
        cboCategoria.setEnabled(false);
        tblListado.setEnabled(true);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblLogo = new javax.swing.JLabel();
        btnProforma = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblListado = new javax.swing.JTable();
        btnAgregar = new javax.swing.JButton();
        txtIdProductos = new javax.swing.JTextField();
        btnSeleccionar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        lblUsername = new javax.swing.JLabel();
        bienvenido = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtIdProovedor = new javax.swing.JTextField();
        txtPrecio = new javax.swing.JTextField();
        txtOferta = new javax.swing.JTextField();
        txtStock = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JButton();
        cboCategoria = new javax.swing.JComboBox<>();
        btnCancelar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        lblFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gstore/images/logo.png"))); // NOI18N
        getContentPane().add(lblLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 180, 90));

        btnProforma.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnProforma.setText("PROFORMA");
        btnProforma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProformaActionPerformed(evt);
            }
        });
        getContentPane().add(btnProforma, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 490, 190, 80));

        tblListado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Producto ID", "Nombre", "Precio", "Stock", "Oferta", "Proovedor ID", "Categoria ID"
            }
        ));
        jScrollPane1.setViewportView(tblListado);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 180, 630, 230));

        btnAgregar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnAgregar.setText("AGREGAR");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 400, 140, 40));
        getContentPane().add(txtIdProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 440, 210, 30));

        btnSeleccionar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnSeleccionar.setText("SELECCIONAR");
        btnSeleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeleccionarActionPerformed(evt);
            }
        });
        getContentPane().add(btnSeleccionar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, 140, 40));

        btnEditar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnEditar.setText("EDITAR");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, 140, 40));

        lblUsername.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        lblUsername.setForeground(new java.awt.Color(0, 0, 0));
        lblUsername.setText("USUARIO");
        getContentPane().add(lblUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 20, -1, -1));

        bienvenido.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        bienvenido.setForeground(new java.awt.Color(0, 0, 0));
        bienvenido.setText("BIENVENIDO ");
        getContentPane().add(bienvenido, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 20, -1, -1));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("PRECIO:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 450, -1, -1));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("STOCK:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 500, -1, -1));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("ID PROOVEDOR:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 550, -1, -1));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("OFERTA:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 500, -1, -1));

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("ID CATEGORIA:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 550, -1, -1));

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("NOMBRE:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 80, 90, -1));
        getContentPane().add(txtIdProovedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 540, 210, 30));
        getContentPane().add(txtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 440, 210, 30));
        getContentPane().add(txtOferta, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 490, 210, 30));
        getContentPane().add(txtStock, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 490, 210, 30));
        getContentPane().add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 70, 530, 30));

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("ID PRODUCTO:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 450, -1, -1));

        btnEliminar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnEliminar.setText("ELIMINAR");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 330, 140, 40));

        cboCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboCategoriaActionPerformed(evt);
            }
        });
        getContentPane().add(cboCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 540, 210, 30));

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 120, 80, 30));

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        getContentPane().add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 120, 80, 30));

        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gstore/images/background.png"))); // NOI18N
        getContentPane().add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnProformaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProformaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnProformaActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        //this.accion = "add";
        this.accion = true;
        habilitarForm();
        
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnSeleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeleccionarActionPerformed
        if (tblListado.getSelectedRowCount() == 1) {
            int row = tblListado.getSelectedRow();
            txtIdProductos.setText(tblListado.getValueAt(row, 0).toString());
            txtNombre.setText(tblListado.getValueAt(row, 1).toString());
            txtPrecio.setText(tblListado.getValueAt(row, 2).toString());
            txtStock.setText(tblListado.getValueAt(row, 3).toString());
            txtOferta.setText(tblListado.getValueAt(row, 4).toString());
            txtIdProovedor.setText(tblListado.getValueAt(row, 5).toString());
            int index = 0;
            cboCategoria.getItemAt(index);
            
            
        } else {
            JOptionPane.showMessageDialog(null, "Tiene que seleccionar al menos un registro de la lista", "Advertencia", JOptionPane.WARNING_MESSAGE);
        } 
    }//GEN-LAST:event_btnSeleccionarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        
        if(tblListado.getSelectedRowCount() ==1){
            //this.accion = "edit";
            this.accion=false;
            habilitarForm();
            int row = tblListado.getSelectedRow();
            txtIdProductos.setText(tblListado.getValueAt(row, 0).toString());
            txtNombre.setText(tblListado.getValueAt(row, 1).toString());
            txtPrecio.setText(tblListado.getValueAt(row, 2).toString());
            txtStock.setText(tblListado.getValueAt(row, 3).toString());
            txtOferta.setText(tblListado.getValueAt(row, 4).toString());
            txtIdProovedor.setText(tblListado.getValueAt(row, 5).toString());
            int categoria_id = Integer.parseInt(tblListado.getValueAt(row, 3).toString());
            int index = 0;
            for (Categorias categorias : listCategorias) {
                if (categorias.getIdCategorias() == categoria_id) {
                    cboCategoria.setSelectedIndex(index);
                    break;
                }
                index++;
            }
            
        }else {
            JOptionPane.showMessageDialog(null, "Tiene que seleccionar al menos un registro de la lista", "Advertencia", JOptionPane.WARNING_MESSAGE);
        }

    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        if (tblListado.getSelectedRowCount() == 1) {
            int row = tblListado.getSelectedRow();
            int idproductos= Integer.parseInt(tblListado.getValueAt(row, 0).toString());
            String titulo = tblListado.getValueAt(row, 1).toString();
            if (JOptionPane.showConfirmDialog(null, "¿Seguro de eliminar el producto " + titulo + "?") == JOptionPane.YES_OPTION) {
                int rpta = limp.delete(idproductos);
                if (rpta == 1) {
                    JOptionPane.showMessageDialog(null, "Operación realizada correctamente.", "Información", JOptionPane.INFORMATION_MESSAGE);
                    listar();
                } else {
                    JOptionPane.showMessageDialog(null, "Ocurrió un error al realizar la operación, consulte los logs del sistema", "Advertencia", JOptionPane.WARNING_MESSAGE);
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Tiene que seleccionar al menos un registro de la lista", "Advertencia", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void cboCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboCategoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboCategoriaActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        deshabilitarForm();  
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        
        
        if(this.accion==true){
        metodo.guardarPRODUCTO(txtNombre.getText(),txtPrecio.getText(),txtStock.getText(),txtOferta.getText(),txtIdProovedor.getText());}
        else{
        metodo.modificarPRODUCTO(txtNombre.getText(),txtPrecio.getText(),txtStock.getText(),txtOferta.getText(),txtIdProovedor.getText(),txtIdProductos.getText());
        }
        deshabilitarForm();
        listar();
        listarCategorias();
    }//GEN-LAST:event_btnGuardarActionPerformed

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
            java.util.logging.Logger.getLogger(MenuFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bienvenido;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnProforma;
    private javax.swing.JButton btnSeleccionar;
    private javax.swing.JComboBox<String> cboCategoria;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblLogo;
    public javax.swing.JLabel lblUsername;
    private javax.swing.JTable tblListado;
    private javax.swing.JTextField txtIdProductos;
    private javax.swing.JTextField txtIdProovedor;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtOferta;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtStock;
    // End of variables declaration//GEN-END:variables
}
