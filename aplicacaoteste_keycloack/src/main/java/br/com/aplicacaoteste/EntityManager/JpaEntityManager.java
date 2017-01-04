package br.com.aplicacaoteste.EntityManager;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JpaEntityManager {

	private EntityManagerFactory factory = Persistence.createEntityManagerFactory("crud_cliente_jpa");
	private EntityManager em = factory.createEntityManager();

	public EntityManager getEntityManager(){
		return em;
	}
}