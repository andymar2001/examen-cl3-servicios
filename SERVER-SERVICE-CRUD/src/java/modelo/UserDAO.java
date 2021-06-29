/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import com.sun.tools.xjc.reader.xmlschema.bindinfo.BIConversion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Andy
 */
public class UserDAO implements CRUD {

    PreparedStatement ps;
    ResultSet rs;
    Connection con;
    Conexion conexion = new Conexion();
    User user = new User();
    int res;
    String msj;

    @Override
    public List listar() {
        List<User> usuarios = new ArrayList<>();
        String sql = "select * from user";

        try {
            con = conexion.getConexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                User user = new User();
                user.setId(rs.getInt("id"));
                user.setFirstName(rs.getString("firstName"));
                user.setLastName(rs.getString("lastName"));
                user.setPhone(rs.getString("phone"));
                user.setEmail(rs.getString("email"));
                usuarios.add(user);
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return usuarios;
    }

    @Override
    public User obtenerPorId(int id) {
        String sql = "select * from user where id=" + id;
        try {
            con = conexion.getConexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                user.setId(rs.getInt("id"));
                user.setFirstName(rs.getString("firstName"));
                user.setLastName(rs.getString("lastName"));
                user.setPhone(rs.getString("phone"));
                user.setEmail(rs.getString("email"));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return user;
    }

    @Override
    public String agregar(String firstName, String lastName, String phone, String email) {
        String sql = "insert into user(firstName, lastName, phone, email) values(?,?,?,?)";
        try {
            con = conexion.getConexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, firstName);
            ps.setString(2, lastName);
            ps.setString(3, phone);
            ps.setString(4, email);
            res = ps.executeUpdate();
            if (res == 1) {
                msj = "Usuario Agregado";
            } else {
                msj = "Error";
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return msj;

    }

    @Override
    public String actualizar(int id, String firstName, String lastName, String phone, String email) {
        String sql = "update user set firstName=?, lastName=?, phone=?, email=? where id=" + id;
        try {
            con = conexion.getConexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, firstName);
            ps.setString(2, lastName);
            ps.setString(3, phone);
            ps.setString(4, email);
            res = ps.executeUpdate();
            if (res == 1) {
                msj = "Usuario Actualizado";
            } else {
                msj = "Error";
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return msj;
    }

    @Override
    public User eliminar(int id) {
        String sql = "delete from user where id=" + id;
        try {
            con = conexion.getConexion();
            ps = con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return user;
    }

}
