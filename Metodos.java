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
    public ObjEstudiante ConsultarEstudiante(int cedula, LinkedList<ObjEstudiante> p){
        ObjEstudiante o = new ObjEstudiante();
        for (ObjEstudiante obj : p) {
            if (o.getCedula()==cedula){
                o.setCedula(cedula);
                o.setNombre(obj.getNombre());
                o.setCarne(obj.getCarne());
            }
            else if (o.getCedula() != cedula){
                System.out.println("Estudiante no encontrado");
            }
        }
        return o;
    }

    public LinkedList<ObjEstudiante> ModificarEstudiante(int cedula, LinkedList<ObjEstudiante> p, Scanner sc){
        for (ObjEstudiante o : p) {
            if (o.getCedula()==cedula){
                System.out.println("Ingrese el nombre: ");
                o.setNombre(sc.next());
                System.out.println("Ingrese el carnet: ");
                o.setCarne(sc.next());
            }
            else if (o.getCedula() != cedula){
                System.out.println("Estudiante no encontrado");
            }
        }
        return p;
    }

    public LinkedList<ObjEstudiante> EliminarEstudiante(int cedula, LinkedList<ObjEstudiante> p, Scanner sc){
        p.removeIf(x -> x.getCedula() == cedula);
        
        return p;
    }
}
