public class ObjEstudiante {
    private String Nombre;
    private String Carne;
    private int Cedula;
    
    public ObjEstudiante(String nombre, String carne, int cedula) {
        Nombre = nombre;
        Carne = carne;
        Cedula = cedula;
    }
    public ObjEstudiante() {
    }
    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String nombre) {
        Nombre = nombre;
    }
    public String getCarne() {
        return Carne;
    }
    public void setCarne(String carne) {
        Carne = carne;
    }
    public int getCedula() {
        return Cedula;
    }
    public void setCedula(int cedula) {
        Cedula = cedula;
    }
    
}
