package tn.esprit.services;

import tn.esprit.utilis.DbConnection;

import java.sql.Connection;
import java.sql.SQLException;


import java.sql.Statement;
import java.util.List;

public class UtilsateurService implements CRUD<user> {
    private Connection cnx;
    public UtilsateurService(){
        cnx= DbConnection.getInstance().getCnx();
    }

    @Override
    public boolean insert(user user) throws SQLException {
        String req="INSERT INTO 'user' ('Nom',	'Prenom',	'Age',	'Genre',	'Tel',	'Status',	'Adresse')"
                + "VALUES ('ben othman' , 'amir' , 22 , 'homme' , 25663774 , 'en cours' , 'nabeul')";
        Statement st= cnx.createStatement();



        return st.executeUpdate(req)==-1;
    }

    @Override
    public boolean update(user user) {
        return false;
    }

    @Override
    public boolean delete(user user) {
        return false;
    }

    @Override
    public List<user> selectAll() {
        return null;
    }
}
