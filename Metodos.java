import java.util.LinkedList;
import java.util.Scanner;

public class Metodos {
    
    public LinkedList<ObjEstudiante> LlenarLista(LinkedList<ObjEstudiante> p, Scanner sc) {
        boolean pedir = true;
        while (pedir) {
            ObjEstudiante o = new ObjEstudiante();
            System.out.println("Ingrese el Nombre");
            o.setNombre(sc.next());
            System.out.println("Ingrese el Carnet");
            o.setCarne(sc.next());
            System.out.println("Ingrese la Cedula");
            o.setCedula(sc.nextInt());
            p.add(o);
            System.out.println("Desea seguir llenando? 1)SI 2)NO");
            int opt = sc.nextInt();
            if(opt == 2){
                pedir = false;
            }
        }
        return p;
    }

    public void MostrarLista(LinkedList<ObjEstudiante> p){
        for (ObjEstudiante o : p) {
            System.out.println("Nombre: " + o.getNombre());
            System.out.println("Carnet: " + o.getCedula());
            System.out.println("Cedula: " + o.getCedula());
            System.out.println("----------------------------------");
            
        }
    }
    
    public LinkedList<ObjEstudiante> Consultarstudiante(LinkedList<ObjEstudiante> p){

        return p;
    }
}
