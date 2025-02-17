fun main() {

    val persona1 = Persona("Iván", 22, "08/08/1998")

    println(persona1.nombre)
    println(persona1.edad)
    persona1.cumple()


    println(persona1.edad)
    println(persona1)

    val estudiante1 = Estudiante("Aroa",22,"turismo", "12/08/2003")
    println(estudiante1)

    println(persona1.actividad())
    println(estudiante1.actividad())

    val estudiante2 = Estudiante("", -22, "Pintura", "12/08/2006")
    println(estudiante2)
}