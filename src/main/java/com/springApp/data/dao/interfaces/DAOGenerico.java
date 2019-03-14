package com.springApp.data.dao.interfaces;

import com.springApp.interfaces.CRUD;
import org.hibernate.criterion.DetachedCriteria;

import java.util.List;

public interface DAOGenerico <T extends CRUD> {
	public boolean create(T entidad) throws Exception;
	public boolean save(T entidad) throws Exception;
	public boolean update(T entidad) throws Exception;
	public boolean saveOrUpdate(T entidad) throws Exception;
	public boolean delete(T entidad) throws Exception;
	public boolean exists(T entidad) throws Exception;
	public List<T> readAll() throws Exception;
	public List<T> readAllActives() throws Exception;
	public T findById(Long id) throws Exception;

	default public List<T> findByCriteria(DetachedCriteria criteria){
        throw new RuntimeException("Metodo FindByCriteria no Implementado!");
    }

}
