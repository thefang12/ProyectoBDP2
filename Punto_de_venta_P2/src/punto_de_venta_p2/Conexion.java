/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto_de_venta_p2;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;
import javax.swing.JTable;
import javax.swing.table.TableModel;

/**
 *
 * @author pablotabales
 */
public class Conexion {

    //10.49.176.129 my ip
    private static String ipAddress;
    private static String dbName;
    private static String user;
    private static String password;
    private static String service;
    private static ResourceBundle dbProperties;

    public static int getAutonumericField(Connection con, String query, int column) throws SQLException {

        int ai = 0;
        PreparedStatement psmt = con.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
        ResultSet tblkeys = psmt.getGeneratedKeys();
        while (tblkeys.next()) {
            ai = tblkeys.getInt(column);
        }
        return ai;

    }

    public static ResultSet callStoredProcedure(Connection con, String query, Object[] data) throws SQLException {
        CallableStatement cs = con.prepareCall("{" + query + "}");
        int i = 1;
        for (Object t : data) {
            cs.setObject(i, t);
            i++;
        }
        return cs.executeQuery();
    }

    public static void executeUpdate(Connection con, String query, Object[] data) throws SQLException {

        PreparedStatement psmt = con.prepareStatement(query);
        int i = 1;
        for (Object t : data) {
            psmt.setObject(i, t);
            i++;
        }
        psmt.execute();
    }

    public static ResultSet consultValues(Connection con, String query, Object[] data) throws SQLException {
        PreparedStatement psmt = con.prepareStatement(query);
        int i = 1;
        if (data != null) {
            for (Object t : data) {
                psmt.setObject(i, t);
                i++;
            }
        }
        return psmt.executeQuery();
    }

    public static void refreshTable(JTable tabla, Connection con) {
        CustomTableModel model = ((CustomTableModel) tabla.getModel());
        if (model.getSelect_query().equals("")) {
            System.err.println("la tabla no tiene una consulta asociada, cheque que no alla sido creada con un Result Set");
        } else {
            tabla.setModel(Conexion.createTableModel(con, model.getSelect_query(), model.getQueryData(), model.getError_message()));
        }
        //tabla.setViewportView(tabla);
    }

    public static CustomTableModel createTableModel(Connection con, String SentenciaSQL, Object[] data, String fail_message) {
        CustomTableModel modelo = new CustomTableModel();
        try {
            ResultSet rsDatos = consultValues(con, SentenciaSQL, data);
            modelo.setError_message(fail_message);
            if (rsDatos.next()) {
                //optendremos lo metodos se la consulta 
                // del cual obtenemos 
                modelo.setSelect_query(SentenciaSQL);
                modelo.setQueryData(data);
                rsDatos.beforeFirst();
                ResultSetMetaData metaDatos = rsDatos.getMetaData();
                //optemos el nro de columnas
                int numeroColumnas = metaDatos.getColumnCount();//columnas
                //optener las etiquetas  de la tabla 
                Object[] etiquetas = new Object[numeroColumnas];//creamos de array de objetos dinamico
                for (int i = 0; i < numeroColumnas; i++) {
                    etiquetas[i] = metaDatos.getColumnLabel(i + 1);//las etiquetas comienzan desde 1e
                }
                //enlazar las etiquetas con el modelo 
                modelo.setColumnIdentifiers(etiquetas);//asignamos identificadores de las columnas 
                while (rsDatos.next()) {
                    //creamos un objeto para almacenar un registro
                    Object[] datosFila = new Object[modelo.getColumnCount()];
                    //rellenar cada posicion del objeto con una de las columans de la tabla 
                    for (int i = 0; i < modelo.getColumnCount(); i++) {
                        datosFila[i] = rsDatos.getObject(i + 1);
                    }
                    modelo.addRow(datosFila);
                }
            } else {
                modelo = new CustomTableModel(fail_message);
            }
        } catch (Exception e) {
        }
        return modelo;
    }

    public static Connection getConexion() throws SQLException {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
        if (dbProperties == null) {
            dbProperties = ResourceBundle.getBundle("propiedad");
            ipAddress = dbProperties.getString("ip_address");
            dbName = dbProperties.getString("db_name");
            user = dbProperties.getString("user");
            password = dbProperties.getString("password");
            service = dbProperties.getString("service");
        }

        return DriverManager.getConnection("jdbc:mysql://" + ipAddress
                + ":" + service + "/" + dbName, user, password);
    }

    static TableModel createTableModel(Connection con, ResultSet r, String fail_message) {
        CustomTableModel modelo = new CustomTableModel();
        try {
            modelo.setError_message(fail_message);
            if (r.next()) {
                //optendremos lo metodos se la consulta 
                // del cual obtenemos 
                modelo.setSelect_query(null);
                modelo.setQueryData(null);
                r.beforeFirst();
                ResultSetMetaData metaDatos = r.getMetaData();
                //optemos el nro de columnas
                int numeroColumnas = metaDatos.getColumnCount();//columnas
                //optener las etiquetas  de la tabla 
                Object[] etiquetas = new Object[numeroColumnas];//creamos de array de objetos dinamico
                for (int i = 0; i < numeroColumnas; i++) {
                    etiquetas[i] = metaDatos.getColumnLabel(i + 1);//las etiquetas comienzan desde 1e
                }
                //enlazar las etiquetas con el modelo 
                modelo.setColumnIdentifiers(etiquetas);//asignamos identificadores de las columnas 
                while (r.next()) {
                    //creamos un objeto para almacenar un registro
                    Object[] datosFila = new Object[modelo.getColumnCount()];
                    //rellenar cada posicion del objeto con una de las columans de la tabla 
                    for (int i = 0; i < modelo.getColumnCount(); i++) {
                        datosFila[i] = r.getObject(i + 1);
                    }
                    modelo.addRow(datosFila);
                }
            } else {
                modelo = new CustomTableModel(fail_message);
            }
        } catch (Exception e) {
        }
        return modelo;
    }

}
