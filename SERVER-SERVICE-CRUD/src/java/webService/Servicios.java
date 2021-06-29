/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webService;

import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import modelo.User;
import modelo.UserDAO;

/**
 *
 * @author Andy
 */
@WebService(serviceName = "Servicios")
public class Servicios {

    UserDAO userDAO = new UserDAO();

    @WebMethod(operationName = "listar")
    public List<User> listar() {
        List datos = userDAO.listar();
        return datos;
    }

    @WebMethod(operationName = "agregar")
    public String agregar(@WebParam(name = "firstName") String firstName, @WebParam(name = "lastName") String lastName, @WebParam(name = "phone") String phone, @WebParam(name = "email") String email) {
        String datos = userDAO.agregar(firstName, lastName, phone, email);
        return datos;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "obtenerPorId")
    public User listarID(@WebParam(name = "id") int id) {
        User user = userDAO.obtenerPorId(id);
        return user;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "actualizar")
    public String Actualizar(@WebParam(name = "id") int id, @WebParam(name = "firstName") String firstName, @WebParam(name = "lastName") String lastName, @WebParam(name = "phone") String phone, @WebParam(name = "email") String email) {
        String datos = userDAO.actualizar(id, firstName, lastName, phone, email);
        return datos;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "eliminar")
    public User Eliminar(@WebParam(name = "id") int id) {
        User u = userDAO.eliminar(id);
        return u;
    }

}
