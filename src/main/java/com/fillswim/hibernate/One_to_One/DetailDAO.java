package com.fillswim.hibernate.One_to_One;

import com.fillswim.hibernate.One_to_One.Entity.Detail;
import com.fillswim.hibernate.One_to_One.Entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.util.List;

public class DetailDAO {

    //Обновление Сохранение или обновление данных
    public void saveDetail(Detail detail) {

        try (SessionFactory sessionFactory =
                     new Configuration()
                             .configure("hibernate.cfg.xml")
                             .buildSessionFactory();
             Session session = sessionFactory.getCurrentSession()) {

            Transaction transaction = session.beginTransaction();
            session.merge(detail);
            transaction.commit();
        }
    }

    // Чтение данных
    public Detail getDetail(int id) {

        Detail detail = new Detail();

        try (SessionFactory sessionFactory =
                     new Configuration()
                             .configure("hibernate.cfg.xml")
                             .buildSessionFactory();
             Session session = sessionFactory.getCurrentSession()) {

            Transaction transaction = session.beginTransaction();
            detail = session.get(Detail.class, id);
            transaction.commit();
        }

        return detail;
    }

    // Получение всех записей из БД
    public List<Detail> getAllDetails() {

        List<Detail> details = null;

        try (SessionFactory sessionFactory =
                     new Configuration()
                             .configure("hibernate.cfg.xml")
                             .buildSessionFactory();
             Session session = sessionFactory.getCurrentSession()) {

            Transaction transaction = session.beginTransaction();
            details = session
                    .createQuery("from Detail ", Detail.class).getResultList();
            transaction.commit();
        }

        return details;
    }

    // Поиск информации о сотруднике по городу его проживания
    public List<Detail> findByCity(String cityName) {

        List<Detail> details = null;

        try (SessionFactory sessionFactory =
                     new Configuration()
                             .configure("hibernate.cfg.xml")
                             .buildSessionFactory();
             Session session = sessionFactory.getCurrentSession()) {

            Transaction transaction = session.beginTransaction();

            Query query = session
                    .createQuery("from Detail where city = :name", Detail.class);
            query.setParameter("name", cityName);

            details = query.getResultList();

            transaction.commit();
        }

        return details;
    }

    // Удаление данных
    public void deleteDetail(int id) {

        try (SessionFactory sessionFactory =
                     new Configuration()
                             .configure("hibernate.cfg.xml")
                             .buildSessionFactory();
             Session session = sessionFactory.getCurrentSession()) {

            Transaction transaction = session.beginTransaction();
            Detail detail = session.get(Detail.class, id);
            session.delete(detail);
            transaction.commit();
        }
    }

}
