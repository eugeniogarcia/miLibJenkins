/* Se puede usar como si fuera un paso en el pipeline:
saluda 'Nico'
saluda() /* invoke with default arguments */
*/

def call(String name = 'Nani') {
	echo "Hola, ${name}."
}