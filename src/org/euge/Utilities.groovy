package org.euge;


/* Podemos ejecutarlo en un pipeline asi:
//utilidades es el nombre que le hemos dado a la libreria en la configuracion global de jenkins
@Library('utilidades') import org.euge.Utilities
def utils = new Utilities(this, "miMaven");

node {
	utils.mvn 'clean package'
}
*/

/*
If the library needs to access global variables, such as env, those should be explicitly passed into the
library classes, or methods, in a similar manner.
*/

class Utilities implements Serializable {
	def steps;
	def nombreMVN;
	
	Utilities(steps , nombre) {
		this.steps = steps;
		this.nombreMVN = nombre;
	}
	
	def mvn(args) {
		def toolMVN=steps.tool "${nombreMVN}";
		steps.bat "${toolMVN}\\bin\\mvn -o ${args}"
	}
}