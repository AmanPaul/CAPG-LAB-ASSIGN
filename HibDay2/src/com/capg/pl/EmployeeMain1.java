package com.capg.pl;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.capg.config.JPAConfig;


public class EmployeeMain1 {
	public static void main(String args[]) {
		EntityManager em=JPAConfig.getEntityManager();
		//Query q=em.createQuery("select * from employee");
		//List li=q.getResultList();
		
		Query q=em.createQuery("select e.name, e.salary from Employee e");
		List <Object> li=q.getResultList();
		System.out.println("==================");
		for(Object obj:li) {
			Object ob[]=(Object[])obj;
			System.out.println(ob[0]+"\t"+ob[1]);
		}
		System.out.println("======================");
		
	}
}
