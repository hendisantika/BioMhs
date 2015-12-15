/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hendi.biomhs.ui;

import java.util.List;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Uchiha Itachi
 */
public class MhsTblModel extends AbstractTableModel{
    private List <Mahasiswa> listMahasiswa = new ArrayList<>();
    
    public void insert(Mahasiswa mhsInsert){
        listMahasiswa.add(mhsInsert);
        fireTableDataChanged();
    }
    
    public void update(int index, Mahasiswa MhsUpdate){
        listMahasiswa.add(MhsUpdate);
        fireTableDataChanged();
    }
    
    public void delete(int index){
        listMahasiswa.remove(index);
        fireTableDataChanged();
    }
    
    public Mahasiswa getMhs(int index){
        return listMahasiswa.get(index);
    }
    
    public void setListMhs(List<Mahasiswa> listMhsBaru){
        listMahasiswa = listMhsBaru;
        fireTableDataChanged();
    }
    
    @Override
    public int getRowCount(){
        return listMahasiswa.size();
    }
    
    @Override
    public int getColumnCount(){
        return 4;
    }
   
    /**
     *
     * @param column
     * @return
     */
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex){
            case 0:
                return rowIndex + 1;
            case 1:
                return listMahasiswa.get(rowIndex).getNim();
            case 2:
                return listMahasiswa.get(rowIndex).getNama();
            case 3: 
                return listMahasiswa.get(rowIndex).getJeniskelamin();
            default:
                return null;
        } 
    }
    
   @Override
   public String getColumnName(int column){
       switch(column){
            case 0:
                return "No";
            case 1:
                return "NIM";
            case 2:
                return "Nama";
            case 3:
                return "Jenis Kelamin";
            default:
                return null;
        }
   }
             
}
