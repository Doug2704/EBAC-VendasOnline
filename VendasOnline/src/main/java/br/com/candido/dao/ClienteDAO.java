/**
 * 
 */
package br.com.candido.dao;

import java.util.List;

import javax.persistence.TypedQuery;

import br.com.candido.dao.generic.GenericDAO;
import br.com.candido.domain.Cliente;

/**
 * @author Douglas
 *
 */
public class ClienteDAO extends GenericDAO<Cliente, Long> implements IClienteDAO {

	public ClienteDAO() {
		super(Cliente.class);
	}

	@Override
	public List<Cliente> filtrarClientes(String query) {
		TypedQuery<Cliente> tpQuery = 
				this.entityManager.createNamedQuery("Cliente.findByNome", this.persistenteClass);
		tpQuery.setParameter("nome", "%" + query + "%");
        return tpQuery.getResultList();
		
	}

}
