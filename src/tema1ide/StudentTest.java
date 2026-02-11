/*
 * 2026 ITESS-TICS
 * Periodo: Enero-Junio
 * Asignatura: programación Orientada a Objetos
 * Docente: Fracisco javier Montecillo Puente
 * Descripción: Tema 1. Entorno de desarrollo 
 *              1.2 Proceso de desarrollo de aplicaciones
 * Programador: CGGB
 * Fecha: 06 febrero 2026
 *
 */
package tema1ide;


public class StudentTest {
    public static void main(String [] args){
        //Prueba del costructor default
        StudentTest studen1 = new StudentTest();
        System.out.printIn(StudentTest.toString());
        
        
    } 
}

public Student() {
    }
    
    public Student(){
    }

    public String getControlNumber() {
        return controlNumber;
    }

    public String getName() {
        return name;
    }

    public String getCarrer() {
        return carrer;
    }

    public String getGender() {
        return gender;
    }

    public void setControlNumber(String controlNumber) {
        this.controlNumber = controlNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCarrer(String carrer) {
        this.carrer = carrer;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Student{" + "controlNumber=" + controlNumber + ", name=" + name + ", carrer=" + carrer + ", gender=" + gender + '}';
    }
    
    
}

