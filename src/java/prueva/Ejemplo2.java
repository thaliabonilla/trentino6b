/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueva;

import Utilitarios.HibernateUtil;
import dao.MascotaDao;
import entidades.Mascota;
import java.util.ArrayList;
import org.hibernate.Session;

/**
 *
 * @author IESTP TRENTINO
 */
public class Ejemplo2 {

    public static void main(String[] args) {
        ArrayList<Mascota> lista = new ArrayList<>();
        
        MascotaDao mascotadao = new MascotaDao();
        
        Session sesion = HibernateUtil.getSessionfactory().openSession();
        
        lista = mascotadao.listarMascota(sesion);
        
        for(Mascota mascota : lista){
            System.out.println(mascota.getNombreMascota());
        }
    
    }
    
}
