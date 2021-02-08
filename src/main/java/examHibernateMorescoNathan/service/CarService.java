package examHibernateMorescoNathan.service;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import examHibernateMorescoNathan.utils.HibernateUtil;

public class CarService {

	private SessionFactory sessionFactory;

    public CarService() {
        this.sessionFactory = HibernateUtil.getSessionFactory();
    }

    public List getMarquesCountCars(){
        Session session = this.sessionFactory.getCurrentSession();
        session.beginTransaction();
        String hql = "SELECT count(c) FROM Car c GROUP BY c.marque ORDER BY c.marque asc;";

        Query query = session.createQuery(hql);

        List cars = query.getResultList();

        session.close();

        return cars;
    }

    public List getNbCars(){
        Session session = this.sessionFactory.getCurrentSession();
        session.beginTransaction();
        String hql = "SELECT count(c) FROM Car c";

        Query query = session.createQuery(hql);

        List cars = query.getResultList();

        session.close();

        return cars;
    }
    
    public List get10LastCars(){
        Session session = this.sessionFactory.getCurrentSession();
        session.beginTransaction();
        String hql = "SELECT c FROM Car c ORDER BY c.date_ajout";

        Query query = session.createQuery(hql);

        List cars = query.getResultList();

        session.close();

        return cars;
    }
}