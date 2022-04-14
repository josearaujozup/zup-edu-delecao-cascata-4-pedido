package br.com.zup.edu.pedido.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import br.com.zup.edu.pedido.model.Pedido;
import br.com.zup.edu.pedido.repository.PedidoRepository;

@RestController
@RequestMapping("/pedidos")
public class DeletarPedidoController {
	
	private final PedidoRepository repository;
	
	
	public DeletarPedidoController(PedidoRepository repository) {
		this.repository = repository;
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<?> remove(@PathVariable("id") Long idPedido){
		
		Pedido pedido = repository.findById(idPedido).orElseThrow(()-> new ResponseStatusException(HttpStatus.NOT_FOUND, "Não existe cadastro de pedido para o id informado"));
		
		repository.delete(pedido);
		
		return ResponseEntity.noContent().build();
	}
	
}
