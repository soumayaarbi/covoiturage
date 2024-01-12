package tn.esprit.utilis;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {
    private String user="root";
    private String pass="";

    private String url="jdbc:mysql://localhost/covoiturage";
    public static DbConnection instance ;
     private Connection cnx ;

     private DbConnection(){
         try {
             cnx= DriverManager.getConnection(url,user,pass);
             System.out.println("connexion établie");
         } catch (SQLException e) {
             System.err.println(e.getMessage());
         }
     }
     public static DbConnection getInstance(){
         if (instance==null) instance=new DbConnection();
         return instance ;
     }

    public Connection getCnx() {
        return cnx;
    }
}
