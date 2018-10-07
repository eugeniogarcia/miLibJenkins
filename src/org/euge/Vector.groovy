package org.euge;

class Vector {
	public float x,y,z;
	
	Vector (x,y,z){
		this.x=x;
		this.y=y;
		this.z=z;
	}
	
	public float modulo(){
		return (x*x)+(y*y)+(z*z);
	}
	
}