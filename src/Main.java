public class Main {

  public static void main(String... args) {
    Main main = new Main();

    Estudiante[] estudiantes =
        {new Estudiante("Juan", 24), new Estudiante("Erica", 20),
            new Estudiante("Emilio", 23), new Estudiante("Karina", 21),
            new Estudiante("Eduardo", 24), new Estudiante("Tomas", 25),};

    System.out
        .println("Cantidad de estudiantes: " + main.getTotal(estudiantes));
    System.out.println("Edad minima: " + main.getEdadMin(estudiantes));
    System.out.println("Edad maxima: " + main.getEdadMax(estudiantes));
    System.out.println("Edad promedio: " + main.getEdadPromedio(estudiantes));
    main.imprimirEstudiantes(estudiantes);
  }

  public int getTotal(Estudiante[] estudiantes) {
    return estudiantes.length;
  }

  public int getEdadMin(Estudiante[] estudiantes) {
    int edad = estudiantes[0].getEdad();
    int longitud = estudiantes.length;

    for (int i = 1; i < longitud; i++) {
      if (estudiantes[i].getEdad() < edad) {
        edad = estudiantes[i].getEdad();
      }
    }

    return edad;
  }

  public int getEdadMax(Estudiante[] estudiantes) {
    int edad = 0;
    for (Estudiante estudiante : estudiantes) {
      if (estudiante.getEdad() > edad) {
        edad = estudiante.getEdad();
      }
    }

    return edad;
  }

  public double getEdadPromedio(Estudiante[] estudiantes) {
    double sumaEdades = 0;
    double totalEstudiantes = getTotal(estudiantes);

    for (Estudiante estudiante : estudiantes) {
      sumaEdades += estudiante.getEdad();
    }

    return sumaEdades / totalEstudiantes;
  }

  public void imprimirEstudiantes(Estudiante[] estudiantes) {
    System.out.println();

    for (Estudiante estudiante : estudiantes) {
      System.out.println("Nombre: " + estudiante.getNombre() + " Edad: "
          + estudiante.getEdad());
    }
  }

}
