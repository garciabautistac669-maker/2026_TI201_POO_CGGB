/*
 * 2026 ITESS-TICS
 * Periodo: Enero-Junio
 * Asignatura: programación Orientada a Objetos
 * Docente: Fracisco javier Montecillo Puente
 * Descripción: Tema 1. Entorno de desarrollo 
 *              1.2 Proceso de desarrollo de aplicaciones
 * Programador: CGGB
 * Fecha: 09 febrero 2026
 *
 */
package tema1ide;

import java.util.logging.Logger;

public class Student {

    public Student() {
    this.controlNumber; 
    this.name;
    this.carrer;
    this.gender;      

    }
    private String controlNumber;
    private String name;
    private String carrer;
    private String gender;

    public Student(String controlNumber, String name, String carrer, String gender) {
        this.controlNumber = controlNumber;
        this.name = name;
        this.carrer = carrer;
        this.gender = gender;
    }
    private static final Logger LOG = Logger.getLogger(Student.class.getName());

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

    public static Logger getLOG() {
        return LOG;
    }
}