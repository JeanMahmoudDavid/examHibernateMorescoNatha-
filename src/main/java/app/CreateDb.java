package app;

import examHibernateMorescoNathan.utils.HibernateUtil;
import org.hibernate.Session;

import java.text.ParseException;

public class CreateDb {

    public static void main(String[] args) throws ParseException {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.close();
    }
}
