/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto_de_venta_p2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;
import javax.swing.JTable;

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
         
        

         public static int getAutonumericField(Connection con , String query,int column) throws SQLException{
             
           int ai=0;
           PreparedStatement psmt =con.prepareStatement(query,Statement.RETURN_GENERATED_KEYS);
           ResultSet tblkeys = psmt.getGeneratedKeys();
           while(tblkeys.next())
              ai=tblkeys.getInt(column);
           return ai;
             
         }
         public static Object getForeignKey(Connection con , String query,int column) throws SQLException{
             
           int ai=0;
           PreparedStatement psmt =con.prepareStatement(query,Statement.RETURN_GENERATED_KEYS);
           ResultSet tblkeys = psmt.getGeneratedKeys();
           while(tblkeys.next())
              ai=tblkeys.getInt(column);
           return ai;
             
         }
         public static void insertValues(Connection con , String query,Object[] data ) throws SQLException{
         
            PreparedStatement psmt = con.prepareStatement(query);
            int i=1;
            for(Object t : data){
                psmt.setObject(i, t);
                i++;
            }
            psmt.execute();
         }
            public static ResultSet consultValues(Connection con , String query) throws SQLException{
           Statement st = con.createStatement();
           return st.executeQuery(query);
         }
             public static  void refreshTable(JTable tabla,String querry,Connection con) {
                 tabla.setModel(Conexion.createTableModel(con,querry));
                 //tabla.setViewportView(tabla);
             }
           public static UneditableTableModel createTableModel(Connection con,String SentenciaSQL) {
                UneditableTableModel modelo = new UneditableTableModel();
                try {
                     ResultSet rsDatos = consultValues(con,SentenciaSQL);
                     if(rsDatos.next()){
                     //optendremos lo metodos se la consulta 
                    // del cual optenemos 
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
                     }
                     else{
                         modelo =new UneditableTableModel(
                         new Object [][] {
                             {null}
                             },
                        new String [] {
                        "sin resultados"
                        }
                        );
                     }
        } catch (Exception e) {
        }
        return modelo;
     }
         public static Connection getConexion() throws SQLException
         {
             try{
                 Class.forName("com.mysql.jdbc.Driver");
             }catch(ClassNotFoundException e){
                 System.out.println(e.getMessage());
             }
             if(dbProperties==null)
             {
            dbProperties = ResourceBundle.getBundle("propiedad");
            ipAddress = dbProperties.getString("ip_address");
            dbName = dbProperties.getString("db_name");
            user = dbProperties.getString("user");
            password = dbProperties.getString("password");
            service = dbProperties.getString("service");
             }
             
             return DriverManager.getConnection("jdbc:mysql://" + ipAddress + 
                ":" + service + "/" + dbName, user, password);
         }
         
    
    
}


