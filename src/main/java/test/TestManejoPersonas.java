package test;

import datos.PersonaJDBC;
import domain.Persona;

import java.util.List;

public class TestManejoPersonas {
    public static void main(String[] args) {
        PersonaJDBC personaJDBC = new PersonaJDBC();

        /*Persona personaNueva = new Persona("Rodolfo","Hernandez","petro2022@gmail.com","313442291");
        personaDAO.insertar(personaNueva);*/

        Persona personaModificar = new Persona(5, "Fico","Presidente","fiquito@gmail.com", "31252393233");
        personaJDBC.actualizar(personaModificar);

        Persona personaEliminar = new Persona(5);
        personaJDBC.eliminar(personaEliminar);

        List<Persona> personas = personaJDBC.seleccionar();
        personas.forEach(System.out::println);



    }
}
