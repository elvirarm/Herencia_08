open class Persona (val nombre: String, var edad: Int) {


    /*
    Modifica la clase Persona para que no acepte nombres vacíos y edades negativas. Utiliza un constructor primario con valores por defecto para edad.
    Prueba a crear un estudiante con una edad negativa, controlando las excepciones y mostrando el mensaje de error específico.

    TODO
     */


    fun cumple(){
        edad += 1
    }

    override fun toString(): String {
        return "Persona(nombre = $nombre, edad = $edad)"
    }

    /*

    Modifica la clase Persona para que reciba la fecha de nacimiento por el constructor, y se almacene en una propiedad privada. Modificar la edad para que no se pueda modificar, pero se pueda consultar su valor, calculándolo con respecto a la fecha de nacimiento.

     TODO

     */


    open fun actividad(){
        println("$nombre está realizando una actividad")
    }

}