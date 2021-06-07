package br.com.fiap.gt.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;

import br.com.fiap.gt.bean.Rating;
import br.com.fiap.gt.bean.RatingPK;
import br.com.fiap.gt.bean.RentalCompany;
import br.com.fiap.gt.bean.User;
import br.com.fiap.gt.dao.RatingDao;

public class RatingDaoImpl extends GenericDaoImpl<Rating, RatingPK> implements RatingDao{

	public RatingDaoImpl(EntityManager em) {
		super(em);
	}

	@Override
	public Long countByRentalCompany(RentalCompany rentalCompany) {
		return em.createNamedQuery("Rating.CountByRentalCompany", Long.class)
		.setParameter("rc", rentalCompany).getSingleResult();
	}

	@Override
	public List<Rating> findByUser(User user) {
		return em.createNamedQuery("Rating.FindByUser", Rating.class)
		.setParameter("u", user).setMaxResults(20).getResultList();
	}

}
