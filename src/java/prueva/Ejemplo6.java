
package prueva;

import Utilitarios.HibernateUtil;
import dao.MascotaDao;
import org.hibernate.Session;

public class Ejemplo6 {

    
    public static void main(String[] args) throws Exception {
        MascotaDao mascotaDao = new MascotaDao();
        Session session = HibernateUtil.getSessionfactory().openSession();
        int cantidaMascota = mascotaDao.CuentaMascotaRegistro(session);
        
        System.out.println("Cantidad de Mascotas:"+cantidaMascota);
    }
    
}
