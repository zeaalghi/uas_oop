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
public class pasien extends umum{
     public void save(umum umum) {
       
        try{
          Connection con = connect.getConnection();
          String sql = "INSERT INTO pasien (no_ktp,nama,alamat,no_hp,tgl_lahir) VALUES (?,?,?,?,?)";
          PreparedStatement ps = con.prepareStatement(sql);
          ps.setString(1,umum.getNo_ktp());
          ps.setString(2,umum.getNama());
          ps.setString(3,umum.getAlamat());
          ps.setString(4,umum.getHp());
          ps.setString(5,umum.getTgl_lahir());
         
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
          String sql = "UPDATE pasien SET nama=?,alamat=?,no_hp=?,tgl_lahir=? WHERE no_ktp=?";
          PreparedStatement ps = con.prepareStatement(sql);
          ps.setString(5,umum.getNo_ktp());
          ps.setString(1,umum.getNama());
          ps.setString(2,umum.getAlamat());
          ps.setString(3,umum.getHp());
          ps.setString(4,umum.getTgl_lahir());
         
          ps.executeUpdate();
          JOptionPane.showMessageDialog(null, "Updated");
          
        }
        catch(Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error");
        } 
     }
     public void delete(umum umum){
           try{
          Connection con = connect.getConnection();
          String sql = "delete from pasien WHERE no_ktp=?";
          PreparedStatement ps = con.prepareStatement(sql);
          ps.setString(1,umum.getNo_ktp());
        
         
          ps.executeUpdate();
          JOptionPane.showMessageDialog(null, "deleted");
          
        }
        catch(Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error");
        } 
     }
     public umum  cari(String no_ktp) throws SQLException, Exception{
         umum st = new umum() {
         } ;    
           try{
          Connection con = connect.getConnection();
          String sql = "UPDATE pasien SET nama=?,alamat=?,no_hp=?,tgl_lahir=? WHERE no_ktp=?";
          PreparedStatement ps = con.prepareStatement(sql);
          ps.setString(1, no_ktp);
          ResultSet rs = ps.executeQuery();
            if(rs.next()){
            st.setNo_ktp(rs.getString("no_ktp"));
            st.setNama(rs.getNString("nama"));
            st.setAlamat(rs.getNString("alamat"));
            st.setHp(rs.getNString("no_hp"));
            st.setTgl_lahir(rs.getNString("tgl_lahir"));
         
          ps.executeUpdate();
          JOptionPane.showMessageDialog(null, "Updated");
          
            }}catch(Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error");
        } 
        return st;
           }
 
}
