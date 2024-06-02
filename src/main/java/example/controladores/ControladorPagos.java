package example.controladores;

import example.model.Pago;
import example.repositorio.PagoRepositorio;

import java.util.List;

public class ControladorPagos {

    private PagoRepositorio pagoRepositorio;

    public ControladorPagos(PagoRepositorio pagoRepositorio) {
        this.pagoRepositorio = pagoRepositorio;
    }

    public Pago procesarPago(Pago pago) {
        return pagoRepositorio.save(pago);
    }

    public List<Pago> listarPagos() {
        return pagoRepositorio.findAll();
    }

}
