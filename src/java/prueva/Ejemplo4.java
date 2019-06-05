package prueva;

import Utilitarios.HibernateUtil;
import dao.MascotaDao;
import entidades.Mascota;
import java.util.ArrayList;
import org.hibernate.Session;

public class Ejemplo4 {

    public static void main(String[] args) throws Exception {
        
        ArrayList<Mascota> lista = new ArrayList<>();
        MascotaDao mascotadao = new MascotaDao();
        Session sesion = HibernateUtil.getSessionfactory().openSession();
        lista = (ArrayList<Mascota>) mascotadao.ListaMascotaRaza(sesion);

        for (Mascota mascota : lista) {
            System.out.println("Nombre: " + mascota.getNombreMascota() + " Raza: " + mascota.getRaza());
        }

    }
}
