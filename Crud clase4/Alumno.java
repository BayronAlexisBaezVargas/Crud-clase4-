public class Alumno {
    private int id_alumno;
    private String Nombre_alumno;
    private int edad;
    private String membresia;
    
    public Alumno(int id, String nombre, int edad, String membresia) {
        this.id_alumno = id;
        this.Nombre_alumno = nombre;
        this.edad = edad;
        this.membresia = membresia;
    }

    public int getId_alumno() {
        return id_alumno;
    }

    public String getNombre_alumno() {
        return Nombre_alumno;
    }

    public int getEdad() {
        return edad;
    }

    public String getMembresia() {
        return membresia;
    }

    public void setId_alumno(int id_alumno) {
        this.id_alumno = id_alumno;
    }

    public void setNombre_alumno(String Nombre_alumno) {
        this.Nombre_alumno = Nombre_alumno;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setMembresia(String membresia) {
        this.membresia = membresia;
    }
   
    @Override
    public String toString() {
        return "Alumno{" + "id_alumno=" + id_alumno + ", Nombre_alumno=" + Nombre_alumno + ", edad=" + edad + ", membresia=" + membresia + '}';
    }
    
    
    

}