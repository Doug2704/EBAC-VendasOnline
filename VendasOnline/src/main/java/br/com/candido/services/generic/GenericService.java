/**
 * 
 */
package br.com.candido.services.generic;

import java.io.Serializable;
import java.util.Collection;

import br.com.candido.dao.generic.IGenericDAO;
import br.com.candido.domain.Persistente;
import br.com.candido.exceptions.DAOException;
import br.com.candido.exceptions.MaisDeUmRegistroException;
import br.com.candido.exceptions.TableException;
import br.com.candido.exceptions.TipoChaveNaoEncontradaException;

/**
 * @author Douglas
 *
 */
public abstract class GenericService<T extends Persistente, E extends Serializable> 
	implements IGenericService<T, E> {
	
	protected IGenericDAO<T, E> dao;
	
	public GenericService(IGenericDAO<T, E> dao) {
		this.dao = dao;
	}
	

	@Override
	public T cadastrar(T entity) throws TipoChaveNaoEncontradaException, DAOException {
		return this.dao.cadastrar(entity);
	}

	@Override
	public void excluir(T entity) throws DAOException {
		this.dao.excluir(entity);
	}

	@Override
	public T alterar(T entity) throws TipoChaveNaoEncontradaException, DAOException {
		return this.dao.alterar(entity);
	}

	@Override
	public T consultar(E valor) throws MaisDeUmRegistroException, TableException, DAOException {
		return this.dao.consultar(valor);
	}

	@Override
	public Collection<T> buscarTodos() throws DAOException {
		return this.dao.buscarTodos();
	}
	

}
