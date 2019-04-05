package com.project.test;

import com.project.model.Address;
import com.project.model.Customer;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.Date;

public class TestPersist {

    public static void main(String[] args) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("persistence");
        EntityManager manager = factory.createEntityManager();
        EntityTransaction transaction = manager.getTransaction();

        /*
        * output'da biz goreciyik ki, address sinifindeki addressId o customer table'a foreign key olaraq elave edilib
        * bunun menasi nedir?
        * yeni elaqelendirib table'lari, misal ucun filan userin adi,familyasi,dogumili,address yerinde 1 yazilir
        * ve gedib baxiriq ki, id'si 1 olan address table'inda addressler nedir.. yeni customerin addresini sadece nomreliyir
        * ve o nomre ile basqa table'da saxliyir bu qeder besit.
        *
        * */


        //Gelin deyer elave edek
        Customer customer = new Customer("Shahin","Rashidbayli",new Date());
        Address address = new Address("Azerbaijan","Baku","Neapol");

        customer.setAddress(address);

        transaction.begin();
        manager.persist(customer);
        //manager.persist(address); // Customer class'inda  @OneToOne(cascade = CascadeType.PERSIST) yazdigimiza gore artiq burda persist etmesek de olar
        transaction.commit();



    }

}
