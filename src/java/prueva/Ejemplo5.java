package prueva;

import Utilitarios.HibernateUtil;
import dao.MascotaDao;
import entidades.Mascota;
import java.util.ArrayList;
import org.hibernate.Session;

public class Ejemplo5 {

    public static void main(String[] args) {
        
        ArrayList<Mascota> lista = new ArrayList<>();
        MascotaDao mascotadao = new MascotaDao();
        Session sesion = HibernateUtil.getSessionfactory().openSession();
        lista = (ArrayList<Mascota>) mascotadao.EncontarMascotaNombre(sesion, "Sandor");

        for (Mascota mascota : lista) {
            System.out.println("Mascota: " + mascota.getNombreMascota() + " / Dueño: " + mascota.getNombreCliente());
        }

    }
}
