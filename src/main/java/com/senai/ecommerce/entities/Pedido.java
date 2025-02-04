package com.senai.ecommerce.entities;

import java.time.Instant;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_produto")
public class Pedido {
	private long id;
	private Instant momento;
	private StatusDoPedido status;

}
