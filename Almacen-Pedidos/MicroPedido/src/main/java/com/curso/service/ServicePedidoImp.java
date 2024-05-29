package com.curso.service;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.curso.dao.DaoPedido;
import com.curso.model.Pedido;
import com.curso.model.Producto;

@Service
public class ServicePedidoImp implements ServicePedido {
	@Autowired
	DaoPedido dao;

	@Autowired
	RestTemplate template;

	private final String url = "http://localhost:8000/productos";

	@Override
	public void altaPedido(Pedido pedido) {

		int codigo = pedido.getCodigoProducto();
		int ud = pedido.getUnidades();
		String urlProducto = url + "/" + codigo;

		Producto prodActualizar = template.getForObject(urlProducto, Producto.class);

		if (prodActualizar.getStock() > ud) {
			prodActualizar.setStock(prodActualizar.getStock() - ud);
			template.put(url, prodActualizar);
			dao.save(pedido);
		}
	}

	@Override
	public List<Pedido> listarPedidos() {

		return dao.findAll();
	}

	@Override
	public void borrarPedido(int codigoPedido) {

		dao.deleteById(codigoPedido);
	}

}
