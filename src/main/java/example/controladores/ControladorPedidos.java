package example.controladores;

import example.model.Pedido;
import example.repositorio.PedidoRepositorio;

import java.util.List;

public class ControladorPedidos {
    private PedidoRepositorio pedidoRepositorio;

    public ControladorPedidos(PedidoRepositorio pedidoRepositorio) {
        this.pedidoRepositorio = pedidoRepositorio;
    }

    public Pedido agregarPedido(Pedido pedido) {
        return pedidoRepositorio.save(pedido);
    }

    public List<Pedido> listarPedidos() {
        return pedidoRepositorio.findAll();
    }

}
