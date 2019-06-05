
package dao;

import Utilitarios.HibernateUtil;
import entidades.Mascota;
import interfaces.IMascota;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;


public class MascotaDao implements IMascota{

    @Override
    public void guardarMascota(Mascota mascota) {
        Session sesion = HibernateUtil.getSessionfactory().openSession();
        Transaction transaccion = sesion.beginTransaction();
        
        sesion.save(mascota);
        transaccion.commit();
    }
    
     @Override
    public ArrayList<Mascota> listarMascota(Session sesion) {
        ArrayList<Mascota> list = new ArrayList<>();  
        Query query = sesion.createQuery("FROM Mascota");
        list = (ArrayList<Mascota>)query.list();
        
        return list;
    
    
    }
    @Override
    public void ActualizaMascota(Session session, Mascota mascota) {
        Transaction transaction = session.beginTransaction();
        session.update(mascota);
        transaction.commit();
        session.close();

    }

    @Override
    public List<Mascota> ListaMascotaRaza(Session session) throws Exception {
        String hql = " from Mascota where Raza='Pastor Aleman'";        
        Query query = session.createQuery(hql);
        List< Mascota > lista= (List< Mascota >) query.list();
	return lista;

    }

    @Override
    public List<Mascota> EncontarMascotaNombre(Session session, String nombre) {
        String hql = " from Mascota where nombreMascota='"+nombre+"'";        
        Query query = session.createQuery(hql);
        List< Mascota > lista= (List< Mascota >) query.list();
	return lista;
        
    }

    @Override
    public Integer CuentaMascotaRegistro(Session session) throws Exception {
        String hql = "select count(*) from Mascota";
        Query query = session.createQuery(hql);
        Long FilasTab=(Long) query.uniqueResult();
        Integer cont=FilasTab.intValue();
        return cont;

    }
}
