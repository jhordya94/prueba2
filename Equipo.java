/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Negocio;

/**
 *
 * @author usuario
 */
public class Equipo {
   ///Atributos
    private String nombreEquipo;
    private Jugador jugadores[];
   ///Contrutor
    public Equipo(){
        this.jugadores = new Jugador[11];
    }
    
    public Equipo(String nomEq){
            this.nombreEquipo = nomEq;
            this.jugadores = new Jugador[11];
    }
   ///Operaciones
    
    public void crearJugador(String nombre, int edad, int num, String pos){
        Jugador jugadorTemp = new Jugador(nombre, edad, num, pos);
        for (int i=0; i<= 10;i++){
            if (this.jugadores[i]==null){
                this.jugadores[i] = jugadorTemp;
            }
        }
        this.jugadores[0] = jugadorTemp;
    
    }
    /**
     * @return the nombreEquipo
     */
    public String getNombreEquipo() {
        return nombreEquipo;
    }

    /**
     * @param nombreEquipo the nombreEquipo to set
     */
    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    /**
     * @return the jugadores
     */
    public Jugador[] getJugadores() {
        return jugadores;
    }

    /**
     * @param jugadores the jugadores to set
     */
    public void setJugadores(Jugador[] jugadores) {
        this.jugadores = jugadores;
    }

    
}
