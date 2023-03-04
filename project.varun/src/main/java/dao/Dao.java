package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import controller.LoginController;
import dto.Candidatedetails;
import dto.LoginDetails;

public class Dao {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("dev");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	public void create(Candidatedetails c1) {
		// TODO Auto-generated method stub
		entityTransaction.begin();
		entityManager.persist(c1);
		entityTransaction.commit();

	}

	public void logindetails(LoginDetails l1) {
		entityTransaction.begin();
		entityManager.persist(l1);
		entityTransaction.commit();
	}
}
