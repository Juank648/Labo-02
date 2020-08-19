package edu.eci.cvds.patterns.shapes.concrete;

import edu.eci.cvds.patterns.shapes.Shape;

/**
*Clase Hexagono que implementa la clase shape
*/
public class Hexagon implements Shape {
	/**
	*Retorna el numero de lados de un hexagono
	*/
    public int getNumberOfEdges() {
        return 6;
    }
}