package edu.eci.cvds.patterns.shapes;
import edu.eci.cvds.patterns.shapes.concrete.*;

/**
*Fabrica de Shape que crea un shape segun tipoFigura
*/

public class ShapeFactory{
	public static Shape create(RegularShapeType tipoFigura){
		Shape figura;
		switch(tipoFigura){
			case Triangle:
				figura= new Triangle();
				break;
			case Quadrilateral:
				figura= new Quadrilateral();
				break;
			case Pentagon:
				figura= new Pentagon();
				break;
			case Hexagon:
				figura= new Hexagon();
				break;
			default:
				return null;
		}
		return figura;
		
	}
	
		
}		
	