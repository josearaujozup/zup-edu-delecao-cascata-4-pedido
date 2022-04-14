package br.com.zup.edu.pedido.model;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Pedido {

    @Id
    @GeneratedValue
    private Long id;


    private String numero;
    private BigDecimal total;


    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    private List<ItemDePedido> itens;

}
