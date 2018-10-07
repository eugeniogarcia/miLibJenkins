package org.euge;

//
//def z = new org.euge.Zot()
//z.checkOutFrom("pruebaCICD.git")

def checkOutFrom(repo) {
	//git url: "https://github.com/eugeniogarcia/pruebaCICD.git"
	git url: "https://github.com/eugeniogarcia/${repo}"
}