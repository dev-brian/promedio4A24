import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class promedioGrupo {
    // Declarando variables globales
    public static BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
    public static String entrada;
    // declaración de un arreglo de tipo TDA
    public static Alumno[] alumnos;

    public static void leerAlumnos() throws IOException {
        String matricula, nombre;
        System.out.println("Solicitud  de información de cada estudiante");
        for (int i = 0; i < alumnos.length; i++) {
            System.out.println("------------------------\n Escribe la matricula:");
            entrada = buffer.readLine();
            matricula = entrada;
            System.out.println("Escribe el nombre:");
            entrada = buffer.readLine();
            nombre = entrada;
            // Creación de un objeto Alumno (POJO)
            Alumno a = new Alumno(nombre, matricula);
            // Leyendo calificadciónes
            System.out.println("Escribe calificación de estructuras: ");
            entrada = buffer.readLine();
            a.setEstructuras(Double.parseDouble(entrada));

            System.out.println("Escribe calificación de inglés: ");
            entrada = buffer.readLine();
            a.setIngles(Double.parseDouble(entrada));

            System.out.println("Escribe calificación de IoT: ");
            entrada = buffer.readLine();
            a.setIot(Double.parseDouble(entrada));

            a.setPromedio();
            // Agregando un alumno al arreglo
            alumnos[i] = a;
        }
    }

    public static void main(String[] args) throws IOException {
        int n; // Cantidad de alumnos en el grupo
        // Declaracion de un arreglo de tipo TDA
        // Alumno[] alumnos;
        /*
         * double[] calificaciones; // Calificaciones de cada alumno
         * double suma = 0; // Suma de todas las calificaciones
         * double promedio;
         */
        // Solicitar al usuario la cantidad de alumnos

        System.out.println("Programa que calcula el promedio de un grupo \n ------------------------------------");
        // Recuperando el tamaño del grupo
        System.out.println("Ingrese la cantidad de alumnos en el grupo: ");
        entrada = buffer.readLine(); // lecturas del teclado
        n = Integer.parseInt(entrada); // Concersion de String a entero
        // Contruir el arreglo alumnos
        alumnos = new Alumno[n];

        // calificaciones = new double[n]; // Creando el arreglo de calificaciones

        // Recuperando las calificaciones de cada alumno
        /*
         * for (int i = 0; i < calificaciones.length; i++) {
         * System.out.println("Ingrese la calificacion del alumno [" + (i + 1) + "]: ");
         * entrada = buffer.readLine(); // lecturas del teclado
         * calificaciones[i] = Double.parseDouble(entrada);
         * suma += calificaciones[i];
         * }
         */
        // promedio = suma / n;
        // mostrar las calificaiones de cada alumno
        /*
         * System.out.
         * println("----------------------- /n Las calificaciones de cada alumno son: "
         * );
         * for (double calificacion : calificaciones) {
         * System.out.println(calificacion);
         * }
         * 
         * System.out.println("----------------------- /n El promedio del grupo es: " +
         * promedio);
         */
    }
}
