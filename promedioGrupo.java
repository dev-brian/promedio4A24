import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class promedioGrupo {
    public static void main(String[] args) throws IOException {
        int n; // Cantidad de alumnos en el grupo
        double[] calificaciones; // Calificaciones de cada alumno
        double suma = 0; // Suma de todas las calificaciones
        double promedio;
        // Solicitar al usuario la cantidad de alumnos
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        String entrada;
        System.out.println("Programa que calcula el promedio de un grupo \n ------------------------------------");
        // Recuperando el tamaño del grupo
        System.out.println("Ingrese la cantidad de alumnos en el grupo: ");
        entrada = buffer.readLine(); // lecturas del teclado
        n = Integer.parseInt(entrada);

        calificaciones = new double[n]; // Creando el arreglo de calificaciones

        // Recuperando las calificaciones de cada alumno
        for (int i = 0; i < calificaciones.length; i++) {
            System.out.println("Ingrese la calificacion del alumno [" + (i + 1) + "]: ");
            entrada = buffer.readLine(); // lecturas del teclado
            calificaciones[i] = Double.parseDouble(entrada);
            suma += calificaciones[i];
        }
        promedio = suma / n;
        // mostrar las calificaiones de cada alumno
        System.out.println("----------------------- /n Las calificaciones de cada alumno son: ");
        for (double calificacion : calificaciones) {
            System.out.println(calificacion);
        }

        System.out.println("----------------------- /n El promedio del grupo es: " + promedio);
    }
}
