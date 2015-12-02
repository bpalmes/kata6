/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kata6;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author usuario
 */
public class ListLoad {
    
    public static ArrayList read() throws ClassNotFoundException, SQLException{
        ArrayList<Person1> lista =   new ArrayList<>();
        
        Class.forName("org.sqlite.JDBC");
        Connection connec = DriverManager.getConnection("jdbc:sqlite:KATA.sDB");
        Statement state = (Statement) connec.createStatement();
        ResultSet rs = state.executeQuery("SELECT * FROM PEOPLE");
        
        Integer id = rs.getInt(1);
        String name = rs.getString(2);
        String genero = rs.getString(3);
        String fechaNacimiento = rs.getString(4);
        Float peso = rs.getFloat(5);
        String mail = rs.getString(6);
        lista.add(new Person1(id,name,genero,fechaNacimiento,peso,mail));
      
        return lista;
    }
    
}
