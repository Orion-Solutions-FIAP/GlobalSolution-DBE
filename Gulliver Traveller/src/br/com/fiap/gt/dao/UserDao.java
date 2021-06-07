package br.com.fiap.gt.dao;

import br.com.fiap.gt.bean.User;

public interface UserDao extends GenericDao<User, Integer>{

	//Buscar usuário por e-mail
	User findByEmail(String email);
}
