package org.euge;
import org.euge.Point;

class Operaciones {
	private Vector ref;
	
	Operaciones (Point ref){
		this.ref=ref;
	}
	
	public Vector resta(Point A, Point B){
		return new Vector(A.x-B.x,A.y-B.y,A.z-B.z);
	}

	public Vector suma(Point A, Point B){
		return new Vector(A.x+B.x,A.y+B.y,A.z+B.z);
	}	
	
	public Vector multiplica(float c, Point A){
		return new Vector(A.x*c,A.y*c,A.z*c);
	}	
	
	public Vector absoluto(Point A){
		return suma(A,ref);
	}	
	
}