/**
 * 
 */
package br.com.candido.dao;

import java.util.List;

import br.com.candido.dao.generic.IGenericDAO;
import br.com.candido.domain.Produto;

/**
 * @author Douglas
 *
 */
public interface IProdutoDAO extends IGenericDAO<Produto, String>{

	List<Produto> filtrarProdutos(String query);

}
