package example.controladores;

import example.repositorio.BaseDatosIngrediente;
import example.model.Ingrediente;

import java.util.List;

public class ControladorInventario {
    private BaseDatosIngrediente ingredienteRepositorio;

    public ControladorInventario(BaseDatosIngrediente ingredienteRepositorio) {
        this.ingredienteRepositorio = ingredienteRepositorio;
    }

    public Ingrediente guardarIngrediente(Ingrediente ingrediente) {
        return ingredienteRepositorio.guardarIngrediente(ingrediente);
    }

    public List<Ingrediente> listarIngredientes() {
        return ingredienteRepositorio.findAll();
    }

}

