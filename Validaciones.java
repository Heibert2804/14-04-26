import java.util.Scanner;
import java.util.LinkedList;

public class Validaciones {
    public int ValidarEntero(Scanner sc){
        while (!sc.hasNextInt()) {
            System.out.println("Escriba un numero");
        }
        return sc.nextInt();
    }
    public int ValidarRango(int n1, int n2, int opt, Scanner sc){
        Validaciones v = new Validaciones();
        while (opt<n1||opt>n2) {
            System.out.println("Porfavor ingrese un rango de: "+n1+" y "+n2);
            opt = v.ValidarEntero(sc);
        }
        return sc.nextInt();
    }
    public boolean ValidarCedula(int Cedula, LinkedList<ObjEstudiante> p){
        for (ObjEstudiante o : p) {
            if(o.getCedula()==Cedula){
                return true;
            }
        }
        return false;
    }

    public boolean ValidarDimensioneNombre(String Nombre){
        if (Nombre.length()>15) {
            System.out.println("No debe suprera 15 caracteres");
            return false;
        }else{
        return true;
        }
    }


    
}
