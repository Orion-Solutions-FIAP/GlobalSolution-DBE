package br.com.fiap.gt.dao;

import java.util.List;

import br.com.fiap.gt.bean.Car;

public interface CarDao extends GenericDao<Car, Integer> {

	//Buscar carros por Marca e se est� ativo ou n�o.
	List<Car> findByBrandAndIsActive(String brand, boolean isActive);
}
