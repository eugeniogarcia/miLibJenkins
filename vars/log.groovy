/* Se puede usar en un pipeline como sigue:
@Library('utilidades')
log.info 'Starting';
log.warning 'Nothing to do!';
*/

def info(message) {
	echo "INFO: ${message}"
}

def warning(message) {
	echo "WARNING: ${message}"
}