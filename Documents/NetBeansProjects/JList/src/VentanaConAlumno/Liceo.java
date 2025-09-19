/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package VentanaConAlumno;

import java.util.ArrayList;


public class Liceo {
    ArrayList<Alumno> listaAlumno = new ArrayList<>();
    public ArrayList<Alumno> getListaAlumno() {
        return listaAlumno;
    }

    public void setListaAlumno(ArrayList<Alumno> listaAlumno) {
        this.listaAlumno = listaAlumno;
    }

    
    
   public ArrayList<Alumno> alumnosDiurno(){
    ArrayList<Alumno> alumnosDiurnos = new ArrayList<>();
    for(Alumno a : this.listaAlumno) { // Debes iterar sobre la lista principal de alumnos
        if(a.isEsDiurno()){
            alumnosDiurnos.add(a);
        }
    }
    return alumnosDiurnos;
}
    
    public void addAlumno(Alumno a){
        listaAlumno.add(a);
    }
    
    @Override
    public String toString() {
        return "Liceo{" + "listaAlumno=" + listaAlumno + '}';
    }
    
    
}
