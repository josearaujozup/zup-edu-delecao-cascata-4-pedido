package br.com.zup.edu.pedido.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.zup.edu.pedido.model.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido, Long>{

}
