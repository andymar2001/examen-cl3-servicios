
package webservice;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.3.0
 * Generated source version: 2.2
 * 
 */
@WebService(name = "Servicios", targetNamespace = "http://webService/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface Servicios {


    /**
     * 
     * @return
     *     returns java.util.List<webservice.User>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "listar", targetNamespace = "http://webService/", className = "webservice.Listar")
    @ResponseWrapper(localName = "listarResponse", targetNamespace = "http://webService/", className = "webservice.ListarResponse")
    @Action(input = "http://webService/Servicios/listarRequest", output = "http://webService/Servicios/listarResponse")
    public List<User> listar();

    /**
     * 
     * @param id
     * @return
     *     returns webservice.User
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "eliminar", targetNamespace = "http://webService/", className = "webservice.Eliminar")
    @ResponseWrapper(localName = "eliminarResponse", targetNamespace = "http://webService/", className = "webservice.EliminarResponse")
    @Action(input = "http://webService/Servicios/eliminarRequest", output = "http://webService/Servicios/eliminarResponse")
    public User eliminar(
        @WebParam(name = "id", targetNamespace = "")
        int id);

    /**
     * 
     * @param firstName
     * @param lastName
     * @param phone
     * @param id
     * @param email
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "actualizar", targetNamespace = "http://webService/", className = "webservice.Actualizar")
    @ResponseWrapper(localName = "actualizarResponse", targetNamespace = "http://webService/", className = "webservice.ActualizarResponse")
    @Action(input = "http://webService/Servicios/actualizarRequest", output = "http://webService/Servicios/actualizarResponse")
    public String actualizar(
        @WebParam(name = "id", targetNamespace = "")
        int id,
        @WebParam(name = "firstName", targetNamespace = "")
        String firstName,
        @WebParam(name = "lastName", targetNamespace = "")
        String lastName,
        @WebParam(name = "phone", targetNamespace = "")
        String phone,
        @WebParam(name = "email", targetNamespace = "")
        String email);

    /**
     * 
     * @param firstName
     * @param lastName
     * @param phone
     * @param email
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "agregar", targetNamespace = "http://webService/", className = "webservice.Agregar")
    @ResponseWrapper(localName = "agregarResponse", targetNamespace = "http://webService/", className = "webservice.AgregarResponse")
    @Action(input = "http://webService/Servicios/agregarRequest", output = "http://webService/Servicios/agregarResponse")
    public String agregar(
        @WebParam(name = "firstName", targetNamespace = "")
        String firstName,
        @WebParam(name = "lastName", targetNamespace = "")
        String lastName,
        @WebParam(name = "phone", targetNamespace = "")
        String phone,
        @WebParam(name = "email", targetNamespace = "")
        String email);

    /**
     * 
     * @param id
     * @return
     *     returns webservice.User
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "obtenerPorId", targetNamespace = "http://webService/", className = "webservice.ObtenerPorId")
    @ResponseWrapper(localName = "obtenerPorIdResponse", targetNamespace = "http://webService/", className = "webservice.ObtenerPorIdResponse")
    @Action(input = "http://webService/Servicios/obtenerPorIdRequest", output = "http://webService/Servicios/obtenerPorIdResponse")
    public User obtenerPorId(
        @WebParam(name = "id", targetNamespace = "")
        int id);

}
