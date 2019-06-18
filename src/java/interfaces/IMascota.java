/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import entidades.Mascota;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author IESTP TRENTINO
 */
public interface IMascota {
    public abstract void guardarMascota(Mascota mascota);
    public abstract ArrayList<Mascota> listarMascota();
    public abstract void ActualizaMascota(Mascota mascota);
    
    public abstract List<Mascota>ListaMascotaRaza(Session sesion)throws Exception;
    public abstract List<Mascota>EncontarMascotaNombre(Session sesion, String nombre);
    public abstract Integer CuentaMascotaRegistro(Session sesion)throws Exception;
    public abstract boolean delete(Mascota mascota);
}
