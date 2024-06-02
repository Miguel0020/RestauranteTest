package example.controladores;

import example.model.Usuario;
import example.repositorio.BaseDatosRegistro;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith({MockitoExtension.class})
class ControladorRegistroTest {
    @Mock
    private BaseDatosRegistro baseDatosRegistro;

    ControladorRegistroTest() {
    }

    @Test
    void registrar() {
        Usuario usuarioEntrada = new Usuario();
        Usuario usuarioSalida = new Usuario();
        ControladorRegistro controladorRegistro = new ControladorRegistro(this.baseDatosRegistro);
        Mockito.when(this.baseDatosRegistro.guardar(usuarioEntrada)).thenReturn(null);
        Mockito.when(this.baseDatosRegistro.obtener(usuarioEntrada)).thenReturn(usuarioSalida);
        Usuario usuarioResultado = controladorRegistro.registrar(usuarioEntrada);
        Assertions.assertEquals(usuarioResultado, usuarioSalida);
    }

}
