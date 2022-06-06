/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author ASUS
 */
   public class Read {
    public ResultSet exec(String qry) throws SQLException, Exception{
       
        Connection kon = connect.getConnection();
        java.sql.Statement query = kon.createStatement();
        java.sql.ResultSet res;     
        res = query.executeQuery(qry);
        return res;
            
    }
     }