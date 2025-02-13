fun main() {

    val persona1 = Persona("Iván", 22)

    println(persona1.nombre)
    println(persona1.edad)
    persona1.cumple()


    println(persona1.edad)
    println(persona1)

    val estudiante1 = Estudiante("Aroa",22,"turismo")
    println(estudiante1)

    println(persona1.actividad())
    println(estudiante1.actividad())
}