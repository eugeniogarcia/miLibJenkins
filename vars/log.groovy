/* Se puede usar en un pipeline como sigue:
@Library('utilidades')
log.info 'Empezando';
log.warning 'Nada que hacer!';
*/

def info(message) {
	echo "INFO: ${message}"
}

def warning(message) {
	echo "WARNING: ${message}"
}