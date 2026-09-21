// creamos la primer clase con sus atributos correspondientes
public class Alumno {
    String nombre;
    double[] calificaciones = new double[5];

    // Se crea el primer métoddo que es para el cálculo del promedio

    public double Promediocalculo(double [] calificaciones) {
        double suma = 0;

        for (int i =0; i < calificaciones.length; i++) {
            suma= suma + calificaciones[i];
        }
        return suma / calificaciones.length;
    }

    // Segundo metodo para obtener calificaciones finales

    public char obtenerCalificacion (double promedio){
        char calificacionFinal;
        if (promedio <= 50) {
            calificacionFinal = 'F';
        } else if (promedio <= 60) {
            calificacionFinal = 'E';
        } else if (promedio <= 70) {
            calificacionFinal = 'D';
        } else if (promedio <= 80) {
            calificacionFinal = 'C';
        } else if (promedio <= 90) {
            calificacionFinal = 'B';
        } else {
            calificacionFinal = 'A';
        }
        return calificacionFinal;
    }

    // Se crea metodo para ver los resultados

    public void imprimirResultado(String nombre, double promedio,
                                  char calificacion) {
        System.out.println("Nombre del estudiante: " + nombre);
        for (int i = 0; i < calificaciones.length; i++){
            System.out.println(
                    "Calificación " + (i+1) + ": " + calificaciones[i]
            );
        }
        System.out.printf("Promedio: %.2f%n", promedio);
        System.out.println("Calificación: " + calificacion);
    }

    public static  void main(String[] args) {
        Alumno estudiante = new Alumno();
        estudiante.nombre = "Axel Morales Hernandez";

        estudiante.calificaciones[0] = 90;
        estudiante.calificaciones[1] = 80;
        estudiante.calificaciones[2] = 95;
        estudiante.calificaciones[3] = 75;
        estudiante.calificaciones[4] = 92;
        double promedio = estudiante.Promediocalculo(
                estudiante.calificaciones
        );

        char calificacion = estudiante.obtenerCalificacion(promedio);

        estudiante.imprimirResultado(
                estudiante.nombre,
                promedio,
                calificacion
        );
    }
}