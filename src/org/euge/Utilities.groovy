package org.euge;

class Utilities implements Serializable {
	def steps;
	def nombreMVN;
	
	Utilities(steps , nombre) {
		this.steps = steps;
		this.nombreMVN = nombre;
	}
	
	def mvn(args) {
		def toolMVN=steps.tool "${nombreMVN}";
		steps.bat "\"${toolMVN}\\bin\\mvn\" -o ${args}"
	}
}