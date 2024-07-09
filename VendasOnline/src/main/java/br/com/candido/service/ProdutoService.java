/**
 * 
 */
package br.com.candido.service;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import br.com.candido.dao.IProdutoDAO;
import br.com.candido.domain.Produto;
import br.com.candido.services.generic.GenericService;

/**
 * @author Douglas
 *
 */
@Stateless
public class ProdutoService extends GenericService<Produto, String> implements IProdutoService {
	
	private IProdutoDAO produtoDao;

	@Inject
	public ProdutoService(IProdutoDAO produtoDao) {
		super(produtoDao);
		this.produtoDao = produtoDao;
	}

	@Override
	public List<Produto> filtrarProdutos(String query) {
		return produtoDao.filtrarProdutos(query);
	}

}
