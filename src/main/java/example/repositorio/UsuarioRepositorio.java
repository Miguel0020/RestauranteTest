
package example.repositorio;

import example.model.Usuario;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class UsuarioRepositorio {
    private List<Usuario> usuarios = new ArrayList<>();

    public Usuario save(Usuario usuario) {
        usuarios.add(usuario);
        return usuario;
    }

    public List<Usuario> findAll() {
        return usuarios;
    }

    public Optional<Usuario> findById(Long id) {
        return usuarios.stream().filter(u -> u.getId().equals(id)).findFirst();
    }
}
