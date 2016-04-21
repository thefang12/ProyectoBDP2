/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto_de_venta_p2;
import javax.swing.table.DefaultTableModel;
 import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.xml.sax.Attributes;
import javax.swing.*;
/**
 *
 * @author pablotabales
 */
public class Venta extends javax.swing.JFrame {
    /**
     * Creates new form Venta
     */
    public Venta() {
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

        jTabbedPane1 = new javax.swing.JTabbedPane();
        Agregar_jTab = new javax.swing.JScrollPane();
        tab_agregar = new javax.swing.JPanel();
        label_titulo = new javax.swing.JLabel();
        label_nombre = new javax.swing.JLabel();
        label_categoria = new javax.swing.JLabel();
        label_precio = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtF_Precio = new javax.swing.JTextField();
        txtF_Nombre = new javax.swing.JTextField();
        combo_categorias = new javax.swing.JComboBox();
        jSpinner2 = new javax.swing.JSpinner();
        scrollP_productos = new javax.swing.JScrollPane();
        tabla_agregarP = new javax.swing.JTable(new UneditableTableModel());
        btn_cerrarSesion = new javax.swing.JButton();
        btn_Agregar = new javax.swing.JButton();
        logo = new javax.swing.JButton();
        fondo_agregar = new javax.swing.JButton();
        Usuarios_JTab = new javax.swing.JScrollPane();
        tabUsuarios = new javax.swing.JPanel();
        titulo_usuarios = new javax.swing.JLabel();
        label_nombre_usuarios = new javax.swing.JLabel();
        label_contrasenia = new javax.swing.JLabel();
        label_apellido = new javax.swing.JLabel();
        label_activo = new javax.swing.JLabel();
        label_sucursal = new javax.swing.JLabel();
        label_puesto = new javax.swing.JLabel();
        correo = new javax.swing.JLabel();
        txtF_Correo = new javax.swing.JTextField();
        txtF_ApellidoU = new javax.swing.JTextField();
        txtF_ContraseñaU = new javax.swing.JTextField();
        txtF_NombreU = new javax.swing.JTextField();
        txtF_Puesto = new javax.swing.JTextField();
        combo_sucursales = new javax.swing.JComboBox();
        scrollP_Usuarios = new javax.swing.JScrollPane();
        tabla_usuarios = new javax.swing.JTable(new UneditableTableModel());
        jCheckBox1 = new javax.swing.JCheckBox();
        logo1 = new javax.swing.JButton();
        btn_agregar_usuario = new javax.swing.JButton();
        boton_cerrarSesion_usuarios = new javax.swing.JButton();
        bckground_usuarios = new javax.swing.JButton();
        Venta_JTab = new javax.swing.JScrollPane();
        tab_venta = new javax.swing.JPanel();
        label_ventas = new javax.swing.JLabel();
        titulo_ventas = new javax.swing.JLabel();
        label_codigoProd = new javax.swing.JLabel();
        label_categoria_ventas = new javax.swing.JLabel();
        label_cambio = new javax.swing.JLabel();
        label_busquedas = new javax.swing.JLabel();
        label_total = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        label_recibo = new javax.swing.JLabel();
        txtF_codproducto = new javax.swing.JTextField();
        txtF_total = new javax.swing.JTextField();
        txtF_recibo = new javax.swing.JTextField();
        txtF_cambio = new javax.swing.JTextField();
        combo_categorias_ventas = new javax.swing.JComboBox();
        ScrollP_busquedas = new javax.swing.JScrollPane();
        tabla_busquedas = new javax.swing.JTable(new UneditableTableModel());
        ScrollP_Ventas = new javax.swing.JScrollPane();
        tabla_ventas = new javax.swing.JTable();
        jSpinner1 = new javax.swing.JSpinner();
        logo2 = new javax.swing.JButton();
        btn_buscar = new javax.swing.JButton();
        cerrarSesion_venta = new javax.swing.JButton();
        btn_pago = new javax.swing.JButton();
        btn_agregar_venta = new javax.swing.JButton();
        background_venta = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 204, 255));

        jTabbedPane1.setBackground(new java.awt.Color(102, 204, 255));

        tab_agregar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label_titulo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        label_titulo.setForeground(new java.awt.Color(255, 255, 255));
        label_titulo.setText("Agregar Productos");
        tab_agregar.add(label_titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 130, -1, -1));

        label_nombre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        label_nombre.setForeground(new java.awt.Color(255, 255, 255));
        label_nombre.setText("Nombre");
        tab_agregar.add(label_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, -1, -1));

        label_categoria.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        label_categoria.setForeground(new java.awt.Color(255, 255, 255));
        label_categoria.setText("Categoría");
        tab_agregar.add(label_categoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 300, -1, -1));

        label_precio.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        label_precio.setForeground(new java.awt.Color(255, 255, 255));
        label_precio.setText("Precio");
        tab_agregar.add(label_precio, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 260, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Cantidad");
        tab_agregar.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 330, 60, -1));
        tab_agregar.add(txtF_Precio, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 260, 160, -1));
        tab_agregar.add(txtF_Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 220, 160, -1));

        try{
            Connection con   = Conexion.getConexion();
            ResultSet r = Conexion.consultValues(con, "select nombre from categoria");
            r.last();
            String[] c=new String[r.getRow()+1];
            r.beforeFirst();
            int i = 0;
            for(i = 0 ; r.next();i++)
            c[i]=r.getString(1);

            c[i]="crear nueva categoria";
            combo_categorias.setModel(new javax.swing.DefaultComboBoxModel(c));
            con.close();
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
        combo_categorias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_categoriasActionPerformed(evt);
            }
        });
        tab_agregar.add(combo_categorias, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 300, 160, -1));

        jSpinner2.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));
        tab_agregar.add(jSpinner2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 330, 70, -1));

        try {
            Connection con   = Conexion.getConexion();
            String SQL = "SELECT nombre_articulo as Articulo ,precio as Precio,nombre as Categoria FROM articulo natural join categoria";
            tabla_agregarP.setModel(Conexion.createTableModel(con,SQL));
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        scrollP_productos.setViewportView(tabla_agregarP);

        tab_agregar.add(scrollP_productos, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 130, 520, 320));

        btn_cerrarSesion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_cerrarSesion.setText("Cerrar Sesión ");
        btn_cerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cerrarSesionActionPerformed(evt);
            }
        });
        tab_agregar.add(btn_cerrarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 40, -1, -1));

        btn_Agregar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_Agregar.setText("Agregar");
        btn_Agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AgregarActionPerformed(evt);
            }
        });
        tab_agregar.add(btn_Agregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 380, -1, -1));

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/Drawing (1).png"))); // NOI18N
        logo.setBorderPainted(false);
        logo.setContentAreaFilled(false);
        tab_agregar.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, -1, -1));

        fondo_agregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/glazed-doughnut-atom.jpg"))); // NOI18N
        fondo_agregar.setBorderPainted(false);
        fondo_agregar.setContentAreaFilled(false);
        tab_agregar.add(fondo_agregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 980, 540));

        Agregar_jTab.setViewportView(tab_agregar);

        jTabbedPane1.addTab("Productos", Agregar_jTab);

        tabUsuarios.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titulo_usuarios.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        titulo_usuarios.setForeground(new java.awt.Color(255, 255, 255));
        titulo_usuarios.setText("Agregar Personal y Asignación Usuarios");
        tabUsuarios.add(titulo_usuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, -1, -1));

        label_nombre_usuarios.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        label_nombre_usuarios.setForeground(new java.awt.Color(255, 255, 255));
        label_nombre_usuarios.setText("Nombre");
        tabUsuarios.add(label_nombre_usuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, -1, -1));

        label_contrasenia.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        label_contrasenia.setForeground(new java.awt.Color(255, 255, 255));
        label_contrasenia.setText("Contraseña");
        tabUsuarios.add(label_contrasenia, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, -1, -1));

        label_apellido.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        label_apellido.setForeground(new java.awt.Color(255, 255, 255));
        label_apellido.setText("Apellido");
        tabUsuarios.add(label_apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, -1, -1));

        label_activo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        label_activo.setForeground(new java.awt.Color(255, 255, 255));
        label_activo.setText("Activo");
        tabUsuarios.add(label_activo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, -1, -1));

        label_sucursal.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        label_sucursal.setForeground(new java.awt.Color(255, 255, 255));
        label_sucursal.setText("Sucursal");
        tabUsuarios.add(label_sucursal, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 390, -1, -1));

        label_puesto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        label_puesto.setForeground(new java.awt.Color(255, 255, 255));
        label_puesto.setText("Puesto");
        tabUsuarios.add(label_puesto, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 430, -1, -1));

        correo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        correo.setForeground(new java.awt.Color(255, 255, 255));
        correo.setText("Correo");
        tabUsuarios.add(correo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, -1, -1));
        tabUsuarios.add(txtF_Correo, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 310, 160, -1));
        tabUsuarios.add(txtF_ApellidoU, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 230, 160, -1));
        tabUsuarios.add(txtF_ContraseñaU, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 350, 160, -1));
        tabUsuarios.add(txtF_NombreU, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, 160, -1));

        txtF_Puesto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtF_PuestoActionPerformed(evt);
            }
        });
        tabUsuarios.add(txtF_Puesto, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 430, 160, -1));

        try{
            Connection con   = Conexion.getConexion();
            ResultSet r = Conexion.consultValues(con, "select direccion from direccion");
            r.last();
            String[] c=new String[r.getRow()+1];
            r.beforeFirst();
            int i = 0;
            for(i = 0 ; r.next();i++)
            c[i]=r.getString(1);
            c[i]="agregar nueva sucursal";
            combo_sucursales.setModel(new javax.swing.DefaultComboBoxModel(c));
            con.close();
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
        combo_sucursales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_sucursalesActionPerformed(evt);
            }
        });
        tabUsuarios.add(combo_sucursales, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 390, 160, -1));

        try {
            Connection con   = Conexion.getConexion();
            String SQL = "SELECT nombre,apellido,activo,puesto,contrasenia,correo,direccion as sucursal from staff  natural join sucursal natural join direccion";
            tabla_usuarios.setModel(Conexion.createTableModel(con, SQL));
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        scrollP_Usuarios.setViewportView(tabla_usuarios);

        tabUsuarios.add(scrollP_Usuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 120, 590, 330));

        jCheckBox1.setForeground(new java.awt.Color(204, 204, 204));
        tabUsuarios.add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 270, -1, -1));

        logo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/Drawing (1).png"))); // NOI18N
        logo1.setBorderPainted(false);
        logo1.setContentAreaFilled(false);
        tabUsuarios.add(logo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, -1, -1));

        btn_agregar_usuario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_agregar_usuario.setText("Agregar");
        btn_agregar_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_agregar_usuarioActionPerformed(evt);
            }
        });
        tabUsuarios.add(btn_agregar_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 460, -1, -1));

        boton_cerrarSesion_usuarios.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        boton_cerrarSesion_usuarios.setText("Cerrar Sesión");
        boton_cerrarSesion_usuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_cerrarSesion_usuariosActionPerformed(evt);
            }
        });
        tabUsuarios.add(boton_cerrarSesion_usuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 50, -1, -1));

        bckground_usuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/donuts_galaxy_wallpaper_by_annedelune-d6uhkc1.png"))); // NOI18N
        bckground_usuarios.setBorderPainted(false);
        bckground_usuarios.setContentAreaFilled(false);
        tabUsuarios.add(bckground_usuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 980, 540));

        Usuarios_JTab.setViewportView(tabUsuarios);

        jTabbedPane1.addTab("Usuarios", Usuarios_JTab);

        tab_venta.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label_ventas.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        label_ventas.setForeground(new java.awt.Color(204, 204, 204));
        label_ventas.setText("Ventas");
        tab_venta.add(label_ventas, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 70, -1));

        titulo_ventas.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        titulo_ventas.setForeground(new java.awt.Color(204, 204, 204));
        titulo_ventas.setText("Punto de Venta");
        tab_venta.add(titulo_ventas, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 30, -1, -1));

        label_codigoProd.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        label_codigoProd.setForeground(new java.awt.Color(204, 204, 204));
        label_codigoProd.setText("Nombre");
        tab_venta.add(label_codigoProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(259, 80, 130, -1));

        label_categoria_ventas.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        label_categoria_ventas.setForeground(new java.awt.Color(204, 204, 204));
        label_categoria_ventas.setText("Categoría");
        tab_venta.add(label_categoria_ventas, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 110, 139, -1));

        label_cambio.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        label_cambio.setForeground(new java.awt.Color(255, 255, 255));
        label_cambio.setText("Cambio");
        tab_venta.add(label_cambio, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 460, -1, -1));

        label_busquedas.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        label_busquedas.setForeground(new java.awt.Color(204, 204, 204));
        label_busquedas.setText("Busquedas");
        tab_venta.add(label_busquedas, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 180, 70, -1));

        label_total.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        label_total.setForeground(new java.awt.Color(255, 255, 255));
        label_total.setText("Total");
        tab_venta.add(label_total, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, 56, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("Cantidad");
        tab_venta.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 150, -1, -1));

        label_recibo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        label_recibo.setForeground(new java.awt.Color(255, 255, 255));
        label_recibo.setText("Recibió");
        tab_venta.add(label_recibo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 420, -1, -1));
        tab_venta.add(txtF_codproducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 70, 238, -1));

        txtF_total.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtF_totalActionPerformed(evt);
            }
        });
        tab_venta.add(txtF_total, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 420, 76, -1));
        tab_venta.add(txtF_recibo, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 420, 80, -1));
        tab_venta.add(txtF_cambio, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 460, 80, -1));

        try{
            Connection con   = Conexion.getConexion();
            ResultSet r = Conexion.consultValues(con, "select nombre from categoria");
            r.last();
            String[] c=new String[r.getRow()];
            r.beforeFirst();
            int i = 0;
            for(i = 0 ; r.next();i++)
            c[i]=r.getString(1);
            combo_categorias_ventas.setModel(new javax.swing.DefaultComboBoxModel(c));
            con.close();
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
        tab_venta.add(combo_categorias_ventas, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 110, 240, -1));

        tabla_busquedas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tabla_busquedas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabla_busquedasMouseClicked(evt);
            }
        });
        ScrollP_busquedas.setViewportView(tabla_busquedas);

        tab_venta.add(ScrollP_busquedas, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 200, 400, 180));

        tabla_ventas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        ScrollP_Ventas.setViewportView(tabla_ventas);

        tab_venta.add(ScrollP_Ventas, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 440, 180));

        jSpinner1.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));
        tab_venta.add(jSpinner1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 150, 70, -1));

        logo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/Drawing (1).png"))); // NOI18N
        logo2.setBorderPainted(false);
        logo2.setContentAreaFilled(false);
        tab_venta.add(logo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, -1, -1));

        btn_buscar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_buscar.setText("Buscar");
        btn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarActionPerformed(evt);
            }
        });
        tab_venta.add(btn_buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 130, 140, 30));

        cerrarSesion_venta.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cerrarSesion_venta.setText("Cerrar Sesión ");
        cerrarSesion_venta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerrarSesion_ventaActionPerformed(evt);
            }
        });
        tab_venta.add(cerrarSesion_venta, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 20, -1, 30));

        btn_pago.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_pago.setText("Pago");
        btn_pago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_pagoActionPerformed(evt);
            }
        });
        tab_venta.add(btn_pago, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 420, 100, -1));

        btn_agregar_venta.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_agregar_venta.setText("Agregar a cuenta");
        btn_agregar_venta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_agregar_ventaActionPerformed(evt);
            }
        });
        tab_venta.add(btn_agregar_venta, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 70, 140, 30));

        background_venta.setBackground(new java.awt.Color(251, 251, 251));
        background_venta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/nebula.png"))); // NOI18N
        background_venta.setText("jButton7");
        tab_venta.add(background_venta, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 970, 530));

        Venta_JTab.setViewportView(tab_venta);

        jTabbedPane1.addTab("Ventas", Venta_JTab);

        jPanel1.setMaximumSize(new java.awt.Dimension(987, 592));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/518079-background-hd.jpg"))); // NOI18N
        jLabel1.setToolTipText("");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 967, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 987, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 592, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
     private void cambiarVentana(JFrame frame){
        frame.setVisible(true);
        this.dispose();
    }
    
    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
   
        try {
            Connection con = Conexion.getConexion();
            String query = "";
            if(txtF_codproducto.equals(""))
             query= "Select nombre_articulo as articulo,nombre as categoria,precio,cantidad_disponible as dsp,direccion as sucursal "
                     + "from articulo a natural join categoria c natural join inventario  i natural join sucursal s natural join direccion d "
                    +"where c.nombre = '"+combo_categorias_ventas.getSelectedItem().toString()+"'";
            else
             query = "Select nombre_articulo as articulo,nombre as categoria,precio,cantidad_disponible as dsp,direccion as sucursal "
                    + "from articulo a natural join categoria c natural join inventario  i natural join sucursal s natural join direccion d "
                    +"where c.nombre = '"+combo_categorias_ventas.getSelectedItem().toString()+"' AND a.nombre_articulo like '%"+txtF_codproducto.getText()+"%'";
            //TODO es necesario un codigo de producto o solo el nombre?
            tabla_busquedas.setModel(Conexion.createTableModel(con, query));
            ScrollP_busquedas.getViewport().add(tabla_busquedas);
            
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }//GEN-LAST:event_btn_buscarActionPerformed

    private void btn_AgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AgregarActionPerformed
         try {
             String select;
           Connection con = Conexion.getConexion();
           select =  "Select categoria_id from categoria where nombre = '";
           ResultSet r =Conexion.consultValues(con,select+combo_categorias.getSelectedItem().toString()+"'");
           r.last();
           String insert = "INSERT INTO articulo VALUES(?,?,?,?)";
           Object[] o = {Conexion.getAutonumericField(con,insert , 1),txtF_Nombre.getText(),txtF_Precio.getText(),r.getInt(1)};
           Conexion.insertValues(con, insert, o);
           //se actualiza tabla inventario
           //TODO hacer trigger para evitar duplicados
           r.last();
           select="Select  articulo_id from articulo where  nombre_articulo = '"+txtF_Nombre.getText()+"' AND precio = '"+txtF_Precio.getText()+"' AND categoria_id = "+r.getInt(1);
           insert="INSERT INTO inventario VALUES(?,?,?,?)";
           r = Conexion.consultValues(con, select);
           r.last();
           Object[] f = {Conexion.getAutonumericField(con, insert, 1),r.getInt(1),Login.idSucursal,jSpinner2.getValue()};
           Conexion.insertValues(con, insert, f);
           String sql = "SELECT nombre_articulo as Articulo ,precio as Precio,nombre as Categoria FROM articulo natural join categoria";
           Conexion.refreshTable(tabla_agregarP,sql,con);
           con.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }//GEN-LAST:event_btn_AgregarActionPerformed

    
    private void btn_agregar_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agregar_usuarioActionPerformed
        // TODO add your handling code here:
          try {
          // String insertFoto="update table set foto="
           Connection con = Conexion.getConexion();
           ResultSet r =Conexion.consultValues(con, "Select sucursal_id from sucursal natural join direccion where direccion = '"+combo_sucursales.getSelectedItem()+"'");
           r.last();
           Object[] o = {Conexion.getAutonumericField(con, "INSERT INTO staff VALUES(?,?,?,?,?,?,?,?)", 1)
                   ,txtF_ContraseñaU.getText(),txtF_NombreU.getText(),txtF_ApellidoU.getText()
                   ,jCheckBox1.isSelected(),r.getInt(1),txtF_Puesto.getText(),txtF_Correo.getText()};
           Conexion.insertValues(con, "INSERT INTO staff VALUES(?,?,?,?,?,?,?,?)", o);
           String sql = "SELECT nombre,apellido,activo,puesto,contrasenia,correo,direccion as sucursal from staff  natural join sucursal natural join direccion";
           Conexion.refreshTable(tabla_usuarios,sql,con);
            con.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }     
    }//GEN-LAST:event_btn_agregar_usuarioActionPerformed

    

    private void obtenerDatosTabla()
    {
        int column = 3;
        float total=0;
        int row = tabla_ventas.getRowCount();
        for(int i = 0; i < row; i++) {
            float valor=(float)tabla_ventas.getValueAt(i, 0);
        total+= (float)tabla_ventas.getValueAt(i, column)*valor;
}
        txtF_total.setText(Float.toString(total));
    }
    
     private void modificarTotal(float precio,int cantidad)
    {
     
        int valorAnterior;
        float total=0;
        
        if(txtF_total.getText()!=null){
        valorAnterior= Integer.parseInt(txtF_total.getText());
        total = (float)valorAnterior;
        total += precio * (float)cantidad;
        }else{
           total += precio * (float)cantidad; 
        }
        
        txtF_total.setText(Float.toString(total));
    }
     
     
    
       
    private void btn_agregar_ventaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agregar_ventaActionPerformed
        
      //TODO agregar producto a vuanta cliente
      //TODO debe de agreegar solo los procutoscon el mismo idSucursal que Login.idSucursal
      //actualizar la tabla ventas sera lo mismo que busqueda menos la columna sucursal
      
    }//GEN-LAST:event_btn_agregar_ventaActionPerformed

    private void txtF_totalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtF_totalActionPerformed
        // TODO add your handling code here:
        //textfield del total
        
    }//GEN-LAST:event_txtF_totalActionPerformed

    private void btn_pagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_pagoActionPerformed
        // TODO add your handling code here:
        //el pago se hace igualando todos los datos de tabla ventas a su id con la sucursal de Login.idsucursal mas la cantidad deseada
        //restar la cantidad disponible
        
        
        float total=Float.parseFloat(txtF_total.getText());
        float recibio=Float.parseFloat(txtF_recibo.getText());
        float cambio=0;
        cambio = recibio-total;
        if(cambio<0)
        {
            
            JOptionPane.showMessageDialog(null, "Dinero insuficiente");
        }
        else 
            txtF_cambio.setText(Float.toString(cambio));
    }//GEN-LAST:event_btn_pagoActionPerformed

    private void txtF_PuestoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtF_PuestoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtF_PuestoActionPerformed

    private void btn_cerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cerrarSesionActionPerformed
        // TODO add your handling code here:
        cambiarVentana(new Login());
    }//GEN-LAST:event_btn_cerrarSesionActionPerformed

    private void cerrarSesion_ventaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrarSesion_ventaActionPerformed
        // TODO add your handling code here:
        cambiarVentana(new Login());
    }//GEN-LAST:event_cerrarSesion_ventaActionPerformed

    private void boton_cerrarSesion_usuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_cerrarSesion_usuariosActionPerformed
        // TODO add your handling code here:
        cambiarVentana(new Login());
    }//GEN-LAST:event_boton_cerrarSesion_usuariosActionPerformed

    private void combo_categoriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_categoriasActionPerformed
       if(combo_categorias.getSelectedItem().toString().equals("crear nueva categoria"))
           cambiarVentana(new AgregarCategoria());
    }//GEN-LAST:event_combo_categoriasActionPerformed

    private void combo_sucursalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_sucursalesActionPerformed
        // TODO add your handling code here:
        if(combo_sucursales.getSelectedItem().toString().equals("agregar nueva sucursal"))
           cambiarVentana(new AgregarSucursal());
    }//GEN-LAST:event_combo_sucursalesActionPerformed

    private void tabla_busquedasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla_busquedasMouseClicked
        // TODO add your handling code here:
        if(evt.getClickCount()>=2){
            UneditableTableModel m = (UneditableTableModel) tabla_busquedas.getModel();
            Object[] o = m.getRow(tabla_busquedas.getSelectedRow());
            txtF_codproducto.setText(o[0].toString());
        }
    }//GEN-LAST:event_tabla_busquedasMouseClicked

  
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane Agregar_jTab;
    private javax.swing.JScrollPane ScrollP_Ventas;
    private javax.swing.JScrollPane ScrollP_busquedas;
    private javax.swing.JScrollPane Usuarios_JTab;
    private javax.swing.JScrollPane Venta_JTab;
    private javax.swing.JButton background_venta;
    private javax.swing.JButton bckground_usuarios;
    private javax.swing.JButton boton_cerrarSesion_usuarios;
    private javax.swing.JButton btn_Agregar;
    private javax.swing.JButton btn_agregar_usuario;
    private javax.swing.JButton btn_agregar_venta;
    private javax.swing.JButton btn_buscar;
    private javax.swing.JButton btn_cerrarSesion;
    private javax.swing.JButton btn_pago;
    private javax.swing.JButton cerrarSesion_venta;
    private javax.swing.JComboBox combo_categorias;
    private javax.swing.JComboBox combo_categorias_ventas;
    private javax.swing.JComboBox combo_sucursales;
    private javax.swing.JLabel correo;
    private javax.swing.JButton fondo_agregar;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JSpinner jSpinner2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel label_activo;
    private javax.swing.JLabel label_apellido;
    private javax.swing.JLabel label_busquedas;
    private javax.swing.JLabel label_cambio;
    private javax.swing.JLabel label_categoria;
    private javax.swing.JLabel label_categoria_ventas;
    private javax.swing.JLabel label_codigoProd;
    private javax.swing.JLabel label_contrasenia;
    private javax.swing.JLabel label_nombre;
    private javax.swing.JLabel label_nombre_usuarios;
    private javax.swing.JLabel label_precio;
    private javax.swing.JLabel label_puesto;
    private javax.swing.JLabel label_recibo;
    private javax.swing.JLabel label_sucursal;
    private javax.swing.JLabel label_titulo;
    private javax.swing.JLabel label_total;
    private javax.swing.JLabel label_ventas;
    private javax.swing.JButton logo;
    private javax.swing.JButton logo1;
    private javax.swing.JButton logo2;
    private javax.swing.JScrollPane scrollP_Usuarios;
    private javax.swing.JScrollPane scrollP_productos;
    private javax.swing.JPanel tabUsuarios;
    private javax.swing.JPanel tab_agregar;
    private javax.swing.JPanel tab_venta;
    private javax.swing.JTable tabla_agregarP;
    private javax.swing.JTable tabla_busquedas;
    private javax.swing.JTable tabla_usuarios;
    private javax.swing.JTable tabla_ventas;
    private javax.swing.JLabel titulo_usuarios;
    private javax.swing.JLabel titulo_ventas;
    private javax.swing.JTextField txtF_ApellidoU;
    private javax.swing.JTextField txtF_ContraseñaU;
    private javax.swing.JTextField txtF_Correo;
    private javax.swing.JTextField txtF_Nombre;
    private javax.swing.JTextField txtF_NombreU;
    private javax.swing.JTextField txtF_Precio;
    private javax.swing.JTextField txtF_Puesto;
    private javax.swing.JTextField txtF_cambio;
    private javax.swing.JTextField txtF_codproducto;
    private javax.swing.JTextField txtF_recibo;
    private javax.swing.JTextField txtF_total;
    // End of variables declaration//GEN-END:variables

   
}
