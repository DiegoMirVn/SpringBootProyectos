package com.curso.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.curso.model.Pedido;
import com.curso.model.Producto;

@Service
public class ServiceGestorImpl implements ServiceGestor {

	@Autowired
	RestTemplate template;

	private final String urlPedido = "http://localhost:7000/pedidos";
	private final String urlProducto = "http://localhost:8000/productos";

	@Override
	public List<Pedido> aceptarPedido(Pedido pedido) {

		int codigo = pedido.getCodigoProducto();
		int ud = pedido.getUnidades();

		Producto prodRevisar = template.getForObject(urlProducto + "/" + codigo, Producto.class);

		if (prodRevisar.getStock() > ud) {
			prodRevisar.setStock(prodRevisar.getStock() - ud);
			template.put(urlProducto, prodRevisar);
			template.postForLocation(urlPedido, pedido);
		}
		Pedido[] arrayPedidosActualizada = template.getForObject(urlPedido, Pedido[].class);
		List<Pedido> listaPedidosActualizada = Arrays.asList(arrayPedidosActualizada);
		return listaPedidosActualizada;
	}

	@Override
	public List<Pedido> cancelarPedido(int codigo) {

		Pedido pedido = template.getForObject(urlPedido + "/" + codigo, Pedido.class);

		int codigoProdBorrar = pedido.getCodigoProducto();
		int unidadesProdBorrar = pedido.getUnidades();

		Producto producto = template.getForObject(urlProducto + "/" + codigoProdBorrar, Producto.class);

		producto.setStock(producto.getStock() + unidadesProdBorrar);
		template.put(urlProducto, producto);

		template.delete(urlPedido + "/" + codigo);
		
		Pedido[] arrayPedidosActualizada = template.getForObject(urlPedido, Pedido[].class);
		List<Pedido> listaPedidosActualizada = Arrays.asList(arrayPedidosActualizada);
		return listaPedidosActualizada;
	}

}
