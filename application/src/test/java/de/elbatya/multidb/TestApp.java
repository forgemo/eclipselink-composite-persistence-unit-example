package de.elbatya.multidb;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.HashMap;
import java.util.List;

/**
 * Created by elbatya on 23.07.16.
 */
public class TestApp {

    public void test1(){

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory( "compositePu" ,new HashMap<>());


        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(new Person(null, "John", new ContactDetails(null, "222", "phone")));
        entityManager.getTransaction().commit();



        List<ContactDetails> resultsc1 = entityManager
                .createQuery("Select a from ContactDetails a", ContactDetails.class)
                .getResultList();
        List<ContactDetails> resultsc2 = entityManager
                .createQuery("Select a from ContactDetails a", ContactDetails.class)
                .getResultList();

        entityManager.close();
    }
}
