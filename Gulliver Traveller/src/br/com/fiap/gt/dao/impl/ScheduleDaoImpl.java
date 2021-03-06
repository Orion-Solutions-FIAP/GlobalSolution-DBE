package br.com.fiap.gt.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;

import br.com.fiap.gt.bean.RentalCompany;
import br.com.fiap.gt.bean.Schedule;
import br.com.fiap.gt.dao.ScheduleDao;

public class ScheduleDaoImpl extends GenericDaoImpl<Schedule, Integer> implements ScheduleDao {

	public ScheduleDaoImpl(EntityManager em) {
		super(em);
	}

	@Override
	public List<Schedule> findByRentalCompany(RentalCompany rentalCompany) {		
		return em.createNamedQuery("Schedule.FindByRentalCompany", Schedule.class)
		.setParameter("rc", rentalCompany).getResultList();
	}

}
