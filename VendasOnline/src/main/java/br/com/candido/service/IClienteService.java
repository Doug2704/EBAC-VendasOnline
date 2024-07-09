package br.com.candido.service;

import java.util.List;

import br.com.candido.domain.Cliente;
import br.com.candido.exceptions.DAOException;
import br.com.candido.services.generic.IGenericService;

/**
 * @author Douglas
 *
 */
public interface IClienteService extends IGenericService<Cliente, Long> {

	Cliente buscarPorCPF(Long cpf) throws DAOException;

	List<Cliente> filtrarClientes(String query);

}
