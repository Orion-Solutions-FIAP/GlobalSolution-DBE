package br.com.fiap.gt.dao;

import java.util.List;

import br.com.fiap.gt.bean.Rating;
import br.com.fiap.gt.bean.RatingPK;
import br.com.fiap.gt.bean.RentalCompany;
import br.com.fiap.gt.bean.User;

public interface RatingDao extends GenericDao<Rating, RatingPK> {

	//Contar avalia��es por Locadora de Carros
	Long countByRentalCompany(RentalCompany rentalCompany);
	
	//Buscar avalia��es por usu�rio
	List<Rating> findByUser(User user);
}
