class Estudiante(nombre: String,  edad: Int, open val carrera: String):Persona(nombre, edad){

    /*
    (vuelve a dejar la propiedad edad pública)
    TODO
     */


    override fun toString(): String {
        return "${super.toString()}, carrera: $carrera"
    }

    override fun actividad() {
        println("$nombre está estudiando")
    }

}