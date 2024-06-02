package example.repositorio;

import example.model.Pago;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class PagoRepositorio {

    private List<Pago> pagos = new ArrayList<>();

    public Pago save(Pago pago) {
        pagos.add(pago);
        return pago;
    }

    public List<Pago> findAll() {
        return pagos;
    }

    public Optional<Pago> findById(Long id) {
        return pagos.stream().filter(pago -> pago.getId().equals(id)).findFirst();
    }

    public void deleteById(Long id) {
        pagos.removeIf(pago -> pago.getId().equals(id));
    }
}
