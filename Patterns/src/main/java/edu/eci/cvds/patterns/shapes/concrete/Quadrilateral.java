package edu.eci.cvds.patterns.shapes.concrete;

import edu.eci.cvds.patterns.shapes.Shape;

/**
*Clase cuadrilatero que implementa shapes
*/

public class Quadrilateral implements Shape {
	/**
	*Retorna el numero de lados de un cuadrilatero
	*/
    public int getNumberOfEdges() {
        return 4;
    }
}