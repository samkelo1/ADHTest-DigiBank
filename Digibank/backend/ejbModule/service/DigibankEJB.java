package service;

import javax.ejb.Local;
import javax.ejb.Stateful;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import model.DigibankEntity;

/**
 * Session Bean implementation class EmployeeEJB
 */
@Stateful
@Local
public class DigibankEJB {

   @PersistenceContext
   private EntityManager em;
    public DigibankEJB() {
        // TODO Auto-generated constructor stub
    }
    
    public void addNew(DigibankEntity employeeEntity)
    {
    	System.out.println("====Adding employee to database====");
    	em.persist(employeeEntity);
    }

}
