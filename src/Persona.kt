import java.time.LocalDate


open class Persona (var nombre: String, edad: Int, private val fechaNacimiento: String) {

    val fechaNacimientoSplit = fechaNacimiento.split("/")

    val fechaHoy = LocalDate.now()
    var edad = (fechaHoy.year - fechaNacimientoSplit[2].toInt())
        //private set

    init{
        try{
            require(nombre.isNotEmpty()){"El nombre no puede estar vacío"}
        }catch(e: IllegalArgumentException){
            println("Error: ${e.message}")
        }

        try{
            require(edad > 0){"La edad debe ser un número positivo"}
        }catch(e: IllegalArgumentException){
            println("Error: ${e.message}")
        }

    }




    fun cumple(){
        edad += 1
    }

    override fun toString(): String {
        return "Persona(nombre = $nombre, edad = $edad)"
    }



    open fun actividad(): String {
        return "$nombre está realizando una actividad"
    }

}