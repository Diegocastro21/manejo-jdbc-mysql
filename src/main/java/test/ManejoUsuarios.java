package test;

import datos.UsuarioJDBC;
import domain.Usuario;

import java.util.List;

public class ManejoUsuarios {
    public static void main(String[] args) {

        UsuarioJDBC usuarioJdbc = new UsuarioJDBC();

        //Ejecutando listado usuarios
        List<Usuario> usuarios = usuarioJdbc.seleccionar();

        usuarios.forEach(System.out::println);

        //insertar nuevo usuario
        Usuario usuarion = new Usuario("petro.paraco","2020");
        usuarioJdbc.insertar(usuarion);

        //Modificar usuario existente
        Usuario usuario = new Usuario(2,"rodolfito","456");
        usuarioJdbc.actualizar(usuario);

        usuarioJdbc.eliminar(new Usuario(1));
    }
}
