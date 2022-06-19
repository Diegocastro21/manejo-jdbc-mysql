package test;

import datos.PersonaDAO;
import domain.Persona;

import java.util.List;

public class TestManejoPersonas {
    public static void main(String[] args) {
        PersonaDAO personaDAO = new PersonaDAO();

        /*Persona personaNueva = new Persona("Rodolfo","Hernandez","petro2022@gmail.com","313442291");
        personaDAO.insertar(personaNueva);*/

        Persona personaModificar = new Persona(5, "Fico","Presidente","fiquito@gmail.com", "31252393233");
        personaDAO.actualizar(personaModificar);

        Persona personaEliminar = new Persona(5);
        personaDAO.eliminar(personaEliminar);

        List<Persona> personas = personaDAO.seleccionar();
        personas.forEach(System.out::println);



    }
}
