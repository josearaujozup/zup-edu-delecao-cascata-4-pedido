package br.com.zup.edu.pedido.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.zup.edu.pedido.model.ItemDePedido;

public interface ItemDePedidoRepository extends JpaRepository<ItemDePedido, Long>{

}
