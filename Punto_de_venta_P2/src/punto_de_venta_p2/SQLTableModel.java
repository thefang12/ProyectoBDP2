/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto_de_venta_p2;

import java.util.ArrayList;
import javax.swing.event.TableModelListener;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author fangi
 */
public class SQLTableModel extends AbstractTableModel{
     private ArrayList columnNames ;
     private ArrayList rowData;
     private String select_query;
      private String error_message;

    SQLTableModel(Object[][] object, Object[] string) {
        rowData=convetToArrayList(object);
        columnNames=convetToArrayList(string);
        select_query = null;
        error_message = null;
        
    }

    SQLTableModel(String error_mesage) {
        columnNames = new ArrayList();
        columnNames.add(error_mesage);
        rowData = new ArrayList();
        rowData.add(null);
        select_query = null;
        this.error_message=error_mesage;
    }

    public SQLTableModel() {
        columnNames = new ArrayList();
        rowData = new ArrayList();
        select_query=null;
        error_message=null;
    }
    

    public String getSelect_query() {
        return select_query;
    }

    public void setSelect_query(String select_query) {
        this.select_query = select_query;
    }

    public String getError_message() {
        return error_message;
    }
    
    
    
    @Override
    public int getRowCount() {
        return rowData.size();
    }

    @Override
    public int getColumnCount() {
        return columnNames.size();
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        
        return ((ArrayList)rowData.get(rowIndex)).get(columnIndex);
    }

    @Override
    public String getColumnName(int column) {
        return columnNames.get(column).toString();
    }
    
    public void addRow(Object[] o){
        if(o.length>0){
        rowData.add(convetToArrayList(o));
        }
    }

    public Object[] getRow(int index) {
        
        return converttoArray((ArrayList)rowData.get(index));
    }
    
    public void setColumnIdentifiers(Object[] o){
        this.columnNames=convetToArrayList(o);
        
        if(columnNames!=null)
           fireTableStructureChanged();
       
    }
    
    @Override
    public boolean isCellEditable(int row, int col)
        { return false; }
    

    @Override
    public void addTableModelListener(TableModelListener l) {
        super.addTableModelListener(l); //To change body of generated methods, choose Tools | Templates.
    }

    public SQLTableModel(ArrayList columnNames, ArrayList rowData) {
        this.columnNames = columnNames;
        this.rowData = rowData;
    }
    

    private ArrayList convetToArrayList(Object[] data) {
    if(data==null)
        return null;
    ArrayList a= new ArrayList(data.length);
    for(int i=0; i<data.length;i++)
            a.add(data[i]);
    return a;
    }
    private ArrayList convetToArrayList(Object[][] data) {
     if(data==null)
        return null;
    ArrayList a= new ArrayList(data.length);
    for(int i=0; i<data.length;i++)
            a.add(convetToArrayList(data[i]));
    return a;
    }
    private Object[] converttoArray(ArrayList d) {
        if(d.isEmpty())
            return null;
        Object[]  o = new Object[d.size()];
        for(int i=0;i<d.size();i++)
            o[i]=d.get(i);
        return o;
    }

}
