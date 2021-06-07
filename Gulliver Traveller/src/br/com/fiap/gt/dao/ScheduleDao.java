package br.com.fiap.gt.dao;
import java.util.List;

import br.com.fiap.gt.bean.RentalCompany;
import br.com.fiap.gt.bean.Schedule;

public interface ScheduleDao extends GenericDao<Schedule, Integer>{

	//Buscar hor�rios por locadora de carros
	List<Schedule> findByRentalCompany(RentalCompany rentalCompany);
}
