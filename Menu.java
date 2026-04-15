import java.util.LinkedList;
import java.util.Scanner;

public class Menu{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    boolean continuar = true;
    LinkedList<ObjEstudiante> lista = new LinkedList<>();
    Metodos m = new Metodos();
    int opt = 0;
    while (continuar) {
        System.out.println("Escoja la opcion que requiere");
        System.out.println("1. Ingresar Estudiante");
        System.out.println("2. Consultar Estudiante");
        System.out.println("3. Modificar Estudiante");
        System.out.println("4. Eliminar Estudiante");
        System.out.println("5. Mostar Estudiantes");
        System.out.println("6. Importar");
        System.out.println("7. Exportar");
        System.out.println("8. Salir ");
        opt = sc.nextInt();
        switch (opt) {
            case 1:
                m.LlenarLista(lista, sc);
                break;
            case 2:
                System.out.println("REPARACION");
                break;
            case 3:
                System.out.println("REPARACION");
                break;
            case 4:        
                System.out.println("REPARACION");
                break;
            case 5:        
                m.MostrarLista(lista);
                break;
            case 6:        
                Importar i = new Importar();
                lista = i.ImportarArchivo();
                break;
            case 7:        
                Exportar e = new Exportar();
                e.exportarArchivo(lista);
                break;
            case 8:        
                continuar = false;
                break;
            default:
                System.out.println("Elija una opcion valida");
                break;
            }

        }

    }

}