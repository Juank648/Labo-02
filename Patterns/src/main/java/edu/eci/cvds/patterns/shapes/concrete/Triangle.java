package edu.eci.cvds.patterns.shapes.concrete;

import edu.eci.cvds.patterns.shapes.Shape;

/**
*Clase triangulo que implementa a shapes
*/

public class Triangle implements Shape {
	/**
	*Retorna el numero de lados de un triangulo
	*/
    public int getNumberOfEdges() {
        return 3;
    }
}