/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import uas_prak.umum;

/**
 *
 * @author ASUS
 */
public class pembayaran extends umum{
   
    
    
    public void save (umum umum){
         try{
          Connection con = connect.getConnection();
          String sql = "INSERT INTO pembayaran (id_pembayaran,no_ktp,id_dokter,harga) VALUES (?,?,?,?)";
          PreparedStatement ps = con.prepareStatement(sql);
          ps.setString(1,umum.getId_pembayaran());
          ps.setString(2,umum.getNo_ktp());
          ps.setString(3,umum.getId());
          ps.setString(4,umum.getHrg());
       
         
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
            String sql = "delete from pembayaran WHERE id_pembayaran=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1,umum.getId_pembayaran());
            ps.executeUpdate();
             JOptionPane.showMessageDialog(null, "deleted");
          
        }
        catch(Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error");
        } 
        }
    public void update (umum umum){
         try{
          Connection con = connect.getConnection();
          String sql = "UPDATE pembayaran SET no_ktp=?,id_dokter=?,harga=? WHERE id_pembayaran=?";
          PreparedStatement ps = con.prepareStatement(sql);
          ps.setString(4,umum.getId_pembayaran());
          ps.setString(1,umum.getNo_ktp());
          ps.setString(2,umum.getId());
          ps.setString(3,umum.getHrg());
       
         
          ps.executeUpdate();
          JOptionPane.showMessageDialog(null, "Saved");
          
        }
        catch(Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error");
        }
    }
//  public void getharga(String harga) throws Exception{
//     try{
//      Connection con = connect.getConnection();
//      String sql = "SELECT harga FROM dokter where id_dokter=";
//      PreparedStatement ps = con.prepareStatement(sql);
//      
//       ps.executeUpdate();
//          JOptionPane.showMessageDialog(null, "Saved");
//          
//        }
//        catch(Exception e){
//            e.printStackTrace();
//            JOptionPane.showMessageDialog(null, "Error");
//        }
//  }
}
