/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import uas_prak.umum;

/**
 *
 * @author ASUS
 */
public class dokter extends umum{
      public void save(umum umum) {
       
        try{
          Connection con = connect.getConnection();
          String sql = "INSERT INTO dokter (id_dokter,nama,harga,jadwal,spesialis,jam) VALUES (?,?,?,?,?,?)";
          PreparedStatement ps = con.prepareStatement(sql);
          ps.setString(1,umum.getId());
          ps.setString(2,umum.getNamad());
          ps.setString(3,umum.getHrg());
          ps.setString(4,umum.getJdwl());
          ps.setString(5,umum.getSpsls());
          ps.setString(6,umum.getJam());
         
          ps.executeUpdate();
          JOptionPane.showMessageDialog(null, "Saved");
          
        }
        catch(Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error");
        }
        
    }
      public void update(umum umum){
           try{
          Connection con = connect.getConnection();
          String sql = "UPDATE dokter SET nama=?,harga=?,jadwal=?,spesialis=?,jam=? WHERE id_dokter=?";
          PreparedStatement ps = con.prepareStatement(sql);
          ps.setString(6,umum.getId());
          ps.setString(1,umum.getNamad());
          ps.setString(2,umum.getHrg());
          ps.setString(3,umum.getJdwl());
          ps.setString(4,umum.getSpsls());
          ps.setString(5,umum.getJam());
         
          ps.executeUpdate();
          JOptionPane.showMessageDialog(null, "Saved");
          
        }
        catch(Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error");
        }
        
      }
       public void delete(umum umum){
           try{
          Connection con = connect.getConnection();
          String sql = "delete from dokter WHERE id_dokter=?";
          PreparedStatement ps = con.prepareStatement(sql);
          ps.setString(1,umum.getId());
        
         
          ps.executeUpdate();
          JOptionPane.showMessageDialog(null, "deleted");
          
        }
        catch(Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error");
        } 
     }
        public umum  cari(String id) throws SQLException, Exception{
         umum st = new umum() {
         } ;    
           try{
          Connection con = connect.getConnection();
          String sql =  "UPDATE dokter SET nama=?,harga=?,jadwal=?,spesialis=?,jam=? WHERE id_dokter=?";
          PreparedStatement ps = con.prepareStatement(sql);
          ps.setString(1, id);
          ResultSet rs = ps.executeQuery();
            if(rs.next()){
            st.setId(rs.getString("id_dokter"));
            st.setNamad(rs.getNString("nama"));
            st.setHrg(rs.getNString("harga"));
            st.setJdwl(rs.getNString("jadwal"));
            st.setSpsls(rs.getNString("speseialis"));
            st.setJam(rs.getNString("jam"));
         
          ps.executeUpdate();
          JOptionPane.showMessageDialog(null, "Updated");
          
            }}catch(Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error");
        } 
        return st;
           }
    
}
