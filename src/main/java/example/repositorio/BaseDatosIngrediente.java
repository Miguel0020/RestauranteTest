package example.repositorio;

import example.model.Ingrediente;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class BaseDatosIngrediente {
    private List<Ingrediente> ingredientes = new ArrayList<>();

    public Ingrediente guardarIngrediente(Ingrediente ingrediente) {
        ingredientes.add(ingrediente);
        return ingrediente;
    }

    public List<Ingrediente> findAll() {
        return ingredientes;
    }

    public Optional<Ingrediente> findById(Long id) {
        return ingredientes.stream().filter(i -> i.getId().equals(id)).findFirst();
    }
}
