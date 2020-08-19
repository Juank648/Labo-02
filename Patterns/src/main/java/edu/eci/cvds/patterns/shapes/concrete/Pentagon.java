package edu.eci.cvds.patterns.shapes.concrete;

import edu.eci.cvds.patterns.shapes.Shape;

/**
*Clase Pentagono que implementa a Shape
*/
public class Pentagon implements Shape {
	/**
	*Retorna el numero de lados de un pentagono
	*/
    public int getNumberOfEdges() {
        return 5;
    }
}