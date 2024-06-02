package example.controladores;

import example.model.Usuario;
import example.repositorio.UsuarioRepositorio;

import java.util.List;

public class ControladorUsuarios {
    private UsuarioRepositorio usuarioRepositorio;

    public ControladorUsuarios(UsuarioRepositorio usuarioRepositorio) {
        this.usuarioRepositorio = usuarioRepositorio;
    }

    public Usuario agregarUsuario(Usuario usuario) {
        return usuarioRepositorio.save(usuario);
    }

    public List<Usuario> listarUsuarios() {
        return usuarioRepositorio.findAll();
    }

}
