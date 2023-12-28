package ao.teste.primeiro_exemplo.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;
import Model.Produto;
import ao.teste.Exception.ResourceNotFoundException;

@Repository
public class ProdutoRepository_old {

    private List <Produto> produtos = new ArrayList<Produto>();
    private Integer ultimoId = 0;

    /**
     * Metodo para Retorna uma lista de  produtos
     * @return    lista de produtos
     */


    public List<Produto> obterTodos(){
        return produtos;
    }
    /**
     * Method q retorna produto encontrado pelo seu id
     * @param id Id do prod q será localizado
     * @return Retorna um produto caso encontre
     */
    public Optional <Produto> obterPorId(Integer id){
        return produtos
        .stream()
        .filter(produto -> produto.getId() == id)
        .findFirst();
    }

    /**
     * Met para add prod na lista
     * @param produto produto a ser adicionado
     * @return retorna prod add na lista
     */

    public Produto adicionar(Produto produto){
          ultimoId+=1;
          produto.setId(ultimoId);
          produtos.add(produto);

          return produto;
      
    }
    /**
     * Method para apagar um produto por id
     * @param id id a apagar
     */
    public void apagar (Integer id){
        produtos.removeIf(produto -> produto.getId() == id);
    }
/**
 * Atualizar o prod na lita
 * @param produto produto novo add na lista
 * @return retorna o produto que foi adicionado na lista
 */
    public Produto atualizar(Produto produto){
        
       Optional <Produto> produtoAchado = obterPorId(produto.getId());

       if (produtoAchado.isEmpty()) {
        throw new ResourceNotFoundException("Não achou esse produto");
       }
       apagar(produto.getId());
       //Add produto - atualizado na lista
       produtos.add(produto);

       return produto;

    }
}
