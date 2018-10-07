package org.euge;
import org.euge.Point;

class Operaciones {
	
	public Vector resta(Point A, Point B){
		return new Vector(A.x-B.x,A.y-B.y,A.z-B.z);
	}

	public Vector suma(Point A, Point B){
		return new Vector(A.x+B.x,A.y+B.y,A.z+B.z);
	}	
	
	public Vector multiplica(float c, Point A){
		return new Vector(A.x*c,A.y*c,A.z*c);
	}	
	
}