import java.io.BufferedReader;
import java.io.FileReader;
import java.util.LinkedList;

public class Importar {
    public LinkedList<ObjEstudiante> ImportarArchivo() {
        String rutaArchivo = "Empleados.txt";
        LinkedList<ObjEstudiante> lista = new LinkedList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) {
            String linea;
            ObjEstudiante obj = null;
            while ((linea = br.readLine()) != null) {
                if (linea.startsWith("Cedula:")) {
                    if (obj != null) {
                        lista.add(obj);
                    }
                    obj = new ObjEstudiante();
                    obj.setCedula(Integer.parseInt(linea.substring(8)));
                } else if (linea.startsWith("Nombre:")) {
                    if (obj != null) {
                        obj.setNombre(linea.substring(8));
                    }
                } else if (linea.startsWith("Apellido:")) {
                    if (obj != null) {
                        obj.setCarne(linea.substring(10));
                    }
                }
            }
            System.out.println("Archivo importado correcrtamente ");

            } catch (Exception e) {
            // TODO: handle exception
        }
        return lista;
    }

}