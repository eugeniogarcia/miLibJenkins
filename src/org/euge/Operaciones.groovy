package org.euge;
import org.euge.Vector;

class Operaciones {
	
	public Vector resta(Vector A, Vector B){
		return new Vector(A.x-B.x,A.y-B.y,A.z-B.z);
	}

	public Vector suma(Vector A, Vector B){
		return new Vector(A.x+B.x,A.y+B.y,A.z+B.z);
	}	
	
	public Vector multiplica(float c, Vector A){
		return new Vector(A.x*c,A.y*c,A.z*c);
	}	
	
}