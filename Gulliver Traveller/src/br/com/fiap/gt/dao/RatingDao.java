package br.com.fiap.gt.dao;

import java.util.List;

import br.com.fiap.gt.bean.Rating;
import br.com.fiap.gt.bean.RatingPK;
import br.com.fiap.gt.bean.RentalCompany;
import br.com.fiap.gt.bean.User;

public interface RatingDao extends GenericDao<Rating, RatingPK> {

	//Contar avaliações por Locadora de Carros
	Long countByRentalCompany(RentalCompany rentalCompany);
	
	//Buscar avaliações por usuário
	List<Rating> findByUser(User user);
}
