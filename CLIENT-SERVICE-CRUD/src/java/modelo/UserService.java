package modelo;

import webservice.User;

/**
 *
 * @author Andy
 */
public class UserService {

    public UserService() {

    }

    public java.util.List<webservice.User> listar() {
        webservice.Servicios_Service service = new webservice.Servicios_Service();
        webservice.Servicios port = service.getServiciosPort();
        return port.listar();
    }

    public String agregar(java.lang.String firstName, java.lang.String lastName, java.lang.String phone, java.lang.String email) {
        webservice.Servicios_Service service = new webservice.Servicios_Service();
        webservice.Servicios port = service.getServiciosPort();
        return port.agregar(firstName, lastName, phone, email);
    }

    public User listarID(int id) {
        webservice.Servicios_Service service = new webservice.Servicios_Service();
        webservice.Servicios port = service.getServiciosPort();
        return port.obtenerPorId(id);
    }

    public String actualizar(int id, java.lang.String firstName, java.lang.String lastName, java.lang.String phone, java.lang.String email) {
        webservice.Servicios_Service service = new webservice.Servicios_Service();
        webservice.Servicios port = service.getServiciosPort();
        return port.actualizar(id, firstName, lastName, phone, email);
    }

    public User eliminar(int id) {
        webservice.Servicios_Service service = new webservice.Servicios_Service();
        webservice.Servicios port = service.getServiciosPort();
        return port.eliminar(id);
    }

}
