/**
 * 
 */
package br.com.candido.dao;

import java.util.List;

import br.com.candido.dao.generic.IGenericDAO;
import br.com.candido.domain.Cliente;

/**
 * @author Douglas
 *
 */
public interface IClienteDAO extends IGenericDAO<Cliente, Long>{

	List<Cliente> filtrarClientes(String query);

}
