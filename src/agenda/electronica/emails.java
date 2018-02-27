/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenda.electronica;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sql.DataSource;
import org.sqlite.SQLiteDataSource;

/**
 *
 * @author Desarrollo
 */
public class emails {
    private DataSource ds;
    private Connection conn;
    
    public emails() {
        ds = SQLDatasource.getSQLLiteDataSource();
        conn = null;
    }
    
    private Connection connectDB(){
        try {
            conn = this.ds.getConnection();
        } catch (SQLException ex) {
            Logger.getLogger(emails.class.getName()).log(Level.SEVERE, null, ex);
        }
        return conn;
    }
    
    private void disconnectDB(Connection conn){
        try {
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(emails.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    //CODIGO QUE CONSULTA CORREOS   
    public String getTablaagenda(String Useremails){
        
        conn = connectDB();
        String query = " select * from agenda";
        PreparedStatement consulta = null;
        ResultSet resultadotabla = null;
        String w = "";
        StringBuilder tabla = new StringBuilder(w);
        
        try{
            consulta = conn.prepareStatement(query);
            consulta.setString(1, Useremails);
            resultadotabla = consulta.executeQuery();
            tabla.append("Useremails|\tCorreo\n");
            while (resultadotabla.next()){
                tabla.append(resultadotabla.getInt(1)).append("\t");
                tabla.append(resultadotabla.getString(2)).append("\t");
                tabla.append(resultadotabla.getDouble(3)).append("\n");
            }
            return tabla.toString();
        } catch (SQLException ex) {
            Logger.getLogger(emails.class.getName()).log(Level.SEVERE, null, ex);
        }
        return tabla.toString();
    }
    
    public String getInformacionTablaEmails(){
        conn = connectDB();
        String query = " select * from emails";
        PreparedStatement consulta = null;
        ResultSet resultadotabla = null;
        String w = "";
        StringBuilder tabla = new StringBuilder(w);
        
        try{
            consulta = conn.prepareStatement(query);
            resultadotabla = consulta.executeQuery();
            tabla.append("Idemails|\tCorreo\n");
            while (resultadotabla.next()){
                tabla.append(resultadotabla.getInt(1)).append("\t");
                tabla.append(resultadotabla.getString(2)).append("\t");
                
            }
            return tabla.toString();
        } catch (SQLException ex) {
            Logger.getLogger(emails.class.getName()).log(Level.SEVERE, null, ex);
        }
        return tabla.toString();
    }

    String getInformacionTablaEmails(String Useremails) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    //CODIGO QUE INSERTA CORREO  
    public int insertagenda(int Idemails, String Usermails, String Namemails){
        conn = connectDB();
        String query = " insert into agenda +"
                + "(Idemails, Usermails, Namemails)" + 
                " values (?,?,?,?) ";
        PreparedStatement preStmt =null;
        try {
            preStmt = conn.prepareStatement(query);
            preStmt.setInt(1, 4);
            preStmt.setString(2, "faustino@lopez.hn");
            preStmt.setString(3, "Jose Faustino Lopez");
            //preStmt.setDouble(4, sueldo);
            boolean result = preStmt.execute();
            if(result){
                return 0;
            }
            else{
                return 1;
            }
        } catch (SQLException ex) {
            Logger.getLogger(emails.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally {
            try {
                if (preStmt != null) {
                    preStmt.close();
                }
                if (conn != null) {
                    disconnectDB(conn);
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return 0;
}
}