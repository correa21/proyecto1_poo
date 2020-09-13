package pruebas;

import campus.*;
import java.util.*;

public class TestCampus{

    private static int MAXALUMNOS = 1000;
    private static int MAXPROFESORES = 1000;


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Estudiante> estudiantes = new ArrayList<Estudiante>();
        ArrayList<Profesor> profesores = new ArrayList<Profesor>();
        int selection;
        String nombreBusqueda;
        int salida;
        int i;
        for(;;){
            clearScreen();
            System.out.println("Bienvenido al sistema de la universidad patito");
            System.out.println("seleccione una opcion:");
            System.out.println("\t1)Registrar Alumno");
            System.out.println("\t2)Registrar Profesor");
            System.out.println("\t3)Consultar Alumno");
            System.out.println("\t4)Consultar Profesor");
            selection = input.nextInt();
            clearScreen();
            switch (selection)
            {
                case 1:
                    System.out.println("\t1)Nuevo Ingreso");
                    System.out.println("\t2)Otro");
                    selection = input.nextInt();
                    if (selection == 1)
                    {
                        clearScreen();
                        estudiantes.add(altaAlumnoNuevo());
                    }
                    else {
                        clearScreen();
                        estudiantes.add(altaAlumnoOtro());
                    }
                    break;
                case 2:
                    clearScreen();
                    profesores.add(altaProfesor());
                    break;
                case 3:
                    System.out.println("introduzca nombre del Alumno:");
                    nombreBusqueda = input.nextLine();//dummy read requiered
                                                      //for bug erradication
                    nombreBusqueda = input.nextLine();
                    for (i=0; i<estudiantes.size(); i++)
                    {
                        if (nombreBusqueda.equals(estudiantes.get(i).getNombre()))
                            estudiantes.get(i).desplegar();
                            System.out.printf("\n");
                    }
                    break;
                case 4:
                    System.out.println("introduzca nombre del profesor:");
                    nombreBusqueda = input.nextLine();
                    nombreBusqueda = input.nextLine();//dummy read requiered
                                                      //for bug erradication
                    for (i=0; i<profesores.size(); i++)
                    {
                        if (nombreBusqueda.equals(profesores.get(i).getNombre()))
                            profesores.get(i).desplegar();
                            System.out.printf("\n");
                    }
                    break;
                default:
                    break;
            }
            System.out.printf("\n");
            System.out.printf("Quiere continuar?\n\t1)Si\n\t2)No\n");
            salida = input.nextInt();
            if(salida != 1)
                break;
        }
        input.close();
    }
    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
    public static Estudiante altaAlumnoNuevo(){
         long expediente;
         String nombre;
         String apellidos;
         String carrera;
         int creditosOtorgados;
         int creditosTotales;
         float[] calificaciones;
         Scanner in = new Scanner(System.in);

         System.out.println("nombre:");
         nombre = in.nextLine();
         System.out.println("apellidos:");
         apellidos = in.nextLine();
         System.out.println("expediente:");
         expediente = in.nextLong();
         System.out.println("creditosTotales:");
         creditosTotales = in.nextInt();
        return(new Estudiante(expediente, nombre,
                              apellidos, creditosTotales));
    }
    public static Estudiante altaAlumnoOtro(){
        long expediente;
        String nombre;
        String apellidos;
        String carrera;
        int creditosOtorgados;
        int creditosTotales;
        int numeroCalificaciones;
        float[] calificaciones;
        Scanner in = new Scanner(System.in);

        System.out.println("nombre:");
        nombre = in.nextLine();
        System.out.println("apellidos:");
        apellidos = in.nextLine();
        System.out.println("expediente:");
        expediente = in.nextLong();
        System.out.println("creditos Totales:");
        creditosTotales = in.nextInt();
        System.out.println("creditos Otorgados:");
        creditosOtorgados = in.nextInt();
        System.out.println("carrera");
        carrera = in.nextLine();
        carrera = in.nextLine();
        System.out.println("Cuantas materias está cursando");
        numeroCalificaciones = in.nextInt();
        System.out.println("introduzca la calificaciones separadas por un enter");

        calificaciones = new float[numeroCalificaciones+1];
        for(int i=0; i<numeroCalificaciones; i++ ) {
            calificaciones[i] = in.nextFloat();
        }
        return(new Estudiante(expediente, nombre,
                              apellidos, creditosTotales,
                              calificaciones, creditosOtorgados));


    }
    public static Profesor altaProfesor(){
        String nombre;
        String departamentoAdscrito;
        int aniosDeExperiencia;
        String[] materiasImpartidas;
        int numeroMaterias;
        Scanner in = new Scanner(System.in);

        System.out.println("nombre:");
        nombre = in.nextLine();
        System.out.println("Departamento Adscrito:");
        departamentoAdscrito = in.nextLine();
        System.out.println("Anios de Experiencia:");
        aniosDeExperiencia = in.nextInt();
        System.out.println("Cuantas materias está impartiendo");
        numeroMaterias = in.nextInt();
        System.out.println("introduzca las materias separadas por un enter");
        materiasImpartidas = new String[numeroMaterias+1];
        in.nextLine();
        for(int i=0; i<numeroMaterias; i++ ) {
            materiasImpartidas[i] = in.nextLine();
        }
        return(new Profesor(materiasImpartidas, nombre,
                            departamentoAdscrito, aniosDeExperiencia));
    }
}
