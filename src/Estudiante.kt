class Estudiante(nombre: String,  edad: Int, open val carrera: String, fechaNacimiento: String):Persona(nombre, edad, fechaNacimiento){




    override fun toString(): String {
        return "${super.toString()}, carrera: $carrera"
    }

    override fun actividad(): String {
        return "$nombre está estudiando"
    }

}