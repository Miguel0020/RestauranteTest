package example.repositorio;

import example.model.Pedido;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class PedidoRepositorio {
    private List<Pedido> pedidos = new ArrayList<>();

    public Pedido save(Pedido pedido) {
        pedidos.add(pedido);
        return pedido;
    }

    public List<Pedido> findAll() {
        return pedidos;
    }

    public Optional<Pedido> findById(Long id) {
        return pedidos.stream().filter(p -> p.getId().equals(id)).findFirst();
    }
}
