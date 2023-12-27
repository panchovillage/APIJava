package ao.teste.primeiro_exemplo.Service;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Model.Produto;
import ao.teste.primeiro_exemplo.repository.ProdutoRepository;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;


    /**
     * Met para obter uma lista e produtos
     * @return
     */
    public List <Produto> obterTodos(){
        return produtoRepository.obterTodos();
    }

    
    /**
     * @param id
     * @return
     */
    public Optional <Produto> obterPorId(Integer id){
        return produtoRepository.obterPorId(id);
    }
    
 /**
     * Met para add prod na lista
     * @param produto produto a ser adicionado
     * @return retorna prod add na lista
     */

     public Produto adicionar(Produto produto){
        //regras
      return produtoRepository.adicionar(produto);    
  }

   /**
     * Method para apagar um produto por id
     * @param id id a apagar
     */
    public void apagar (Integer id){
        produtoRepository.apagar(id);
    }

    /**
 * Atualizar o prod na lita
 * @param id
 * @param produto produto novo add na lista
 * @return retorna o produto que foi adicionado na lista
 */
    public Produto atualizar(Integer id,Produto produto){
        produto.setId(id);

        return produtoRepository.atualizar(produto);
       

    }

}
