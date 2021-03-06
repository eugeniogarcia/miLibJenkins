package org.euge;

class Utilities implements Serializable {
	def steps;
	def nombreMVN;
	
	Utilities(steps , nombre) {
		this.steps = steps;
		this.nombreMVN = nombre;
	}
	
	public boolean mvn(args) {
		def toolMVN=steps.tool "${nombreMVN}";
		try{
			steps.bat "\"${toolMVN}\\bin\\mvn\" -o ${args}"
		}
		catch(Exception ex) {
			println(ex.getMessage());
			println(ex.getStackTrace());
			return false;
		}
		return true;
	}
}