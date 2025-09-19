package VentanaConAlumno;

public class Alumno {
    private String nombre;
    private int edad;
    private boolean esDiurno;
    private String ci;

    public Alumno(String nombre, int edad, boolean esDiurno, String ci) {
        this.nombre = nombre;
        this.edad = edad;
        this.esDiurno = esDiurno;
        this.ci = ci;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean isEsDiurno() {
        return esDiurno;
    }

    public void setEsDiurno(boolean esDiurno) {
        this.esDiurno = esDiurno;
    }

    public String getCi() {
        return ci;
    }

    public void setCi(String ci) {
        this.ci = ci;
    }

    public boolean equals(Alumno o){
        return this.ci.equals(o.getCi());
    }
     
    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", edad=" + edad + ", esDiurno=" + esDiurno + ", ci=" + ci + '}';
    }
 
    
    
}
