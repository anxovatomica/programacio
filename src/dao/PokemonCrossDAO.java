/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.*;
import Exceptions.*;
import Modelo.*;

/**
 *
 * @author alu2016355
 */
public class PokemonCrossDAO {
    Connection conexion;
    
    public void insertarUser(User u) throws SQLException, ExceptionsPokemons {
//        if (existeCocinero(u)) {
//            throw new ExceptionsPokemons("ERROR: Ya existe un cocinero con ese nombre");
//        }
        String insert = "insert into user values (?, ?, ?, ?, ?, ?);";
        PreparedStatement ps = conexion.prepareStatement(insert);
        ps.setString(1, u.getUsername());
        ps.setString(2, u.getPassword());
        ps.setInt(3, u.getStucoins());
        ps.setInt(4, u.getLevel());
        ps.setString(5, u.getPlace());
        ps.setInt(6, u.getPoints());
        ps.executeUpdate();
        ps.close();
    }
     // ********************* Conectar / Desconectar ****************************
    public void conectar() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/stucomcrossing";
        String user = "root";
        String pass = "";
        conexion = DriverManager.getConnection(url, user, pass);
    }

    public void desconectar() throws SQLException {
        if (conexion != null) {
            conexion.close();
        }
    }
}
