package gestionufps;

public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Carrera carrera = new Carrera("15","Ing de sistemas",120);
        Estudiante estudiante = new Estudiante("1152068", "Andres", "Pastrana", "Quinto", 110);
        Docente docente = new Docente("158070","Cristian","vargas","Ingeniero de sistemas",513.25,1.60,55.2);
        Administrativo administrativo = new Administrativo("13123456","Manuel","Zambrano", 2019);
        System.out.println();
        docente.calcularIMC();
        System.out.println();
        estudiante.matricularProyectoGrado(carrera);
        System.out.println();
        administrativo.antiguedad();
        
    }
    
}