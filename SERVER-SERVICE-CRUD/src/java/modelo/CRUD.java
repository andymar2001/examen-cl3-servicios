/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.List;

/**
 *
 * @author Andy
 */
public interface CRUD {

    public List listar();

    public User obtenerPorId(int id);

    public String agregar(String firstName, String lastName, String phone, String email);

    public String actualizar(int id, String firstName, String lastName, String phone, String email);

    public User eliminar(int id);
    
}
