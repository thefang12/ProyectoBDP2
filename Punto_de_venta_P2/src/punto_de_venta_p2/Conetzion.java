/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto_de_venta_p2;
 import java.sql.*;
import java.util.ResourceBundle;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author pablotabales
 */
public class Conetzion {
   

    Connection conectar;
    Statement stSentenciasSQL;
    ResultSet rsDatosResultado;
  PreparedStatement psPrepararSentencia;
  Conexion conecte= new Conexion();
  
    public Conetzion() throws ClassNotFoundException, SQLException {
        
            conectar = conecte.getConexion();
            stSentenciasSQL = conectar.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
       
    }
    //funcion para ejecutar sentencias SELECT
    public ResultSet consulta(String sql) throws SQLException {
        try {
            rsDatosResultado = stSentenciasSQL.executeQuery(sql);//para sentencias select nada mas

        } catch (SQLException ex) {
            throw ex;
        }
        return rsDatosResultado;
    }
    //funcion para ejecutar sentencias INSERT DELETE UPDATE

    public void ejecutar(String sql) throws SQLException {
        try {
            stSentenciasSQL.execute(sql);
        } catch (SQLException ex) {
            throw ex;
        }
    }
     public DefaultTableModel retornarDatosTabla(String SentenciaSQL) {
        DefaultTableModel modelo = new DefaultTableModel();
        try {
            ResultSet rsDatos = consulta(SentenciaSQL);
            //optendremos lo metodos se la consulta 
            // del cual optenemos 
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
        } catch (Exception e) {
        }
        return modelo;
     }
    }
    
    

    
