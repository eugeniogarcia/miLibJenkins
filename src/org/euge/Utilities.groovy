package org.euge;


/* Podemos ejecutarlo en un pipeline asi
@Library('utils') import org.euge.Utilities
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