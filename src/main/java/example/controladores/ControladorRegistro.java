package example.controladores;

import example.model.Usuario;
import example.repositorio.BaseDatosRegistro;

public class ControladorRegistro {
    private BaseDatosRegistro baseDatosRegistro;
    private Usuario usuario;

    public ControladorRegistro(BaseDatosRegistro baseDatosRegistro) {
        this.baseDatosRegistro = baseDatosRegistro;
    }
    public Usuario guardarUsuario(Usuario usuario) {
        return baseDatosRegistro.obtener(usuario);

}
    public Usuario registrar(Usuario usuario) {
        this.baseDatosRegistro.guardar(usuario);
        return usuario;
    }

}
