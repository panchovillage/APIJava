package ao.teste.primeiro_exemplo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import Model.Produto;

@Repository
public  interface ProdutoRepository extends JpaRepository<Produto, Integer> {

   
}
