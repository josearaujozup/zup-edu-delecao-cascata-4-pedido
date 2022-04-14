package br.com.zup.edu.pedido.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.zup.edu.pedido.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long>{

}
