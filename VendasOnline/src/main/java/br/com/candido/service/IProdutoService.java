/**
 * 
 */
package br.com.candido.service;

import java.util.List;

import br.com.candido.domain.Produto;
import br.com.candido.services.generic.IGenericService;

/**
 * @author Douglas
 *
 */
public interface IProdutoService extends IGenericService<Produto, String> {

	List<Produto> filtrarProdutos(String query);

}
