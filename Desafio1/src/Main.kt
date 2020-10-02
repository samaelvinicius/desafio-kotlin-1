import java.util.*

fun main(args: Array<String>) {

    val reader = Scanner(System.`in`)
    var dh = DigitalHouseManager()
    try {
        dh.registrarCurso("Kotlin", 10, 40)
        dh.matricularAluno("Samael", "Vinicius", 7)
        dh.registrarProfessorAdjunto("Lucas", "Gabriel", 8, 270)
        dh.registrarProfessorTitular("Felipe", "Medeiros", 9, "Kotlin")
        dh.matricularAluno(7, 10)
        dh.alocarProfessores(10, 8, 9)
        dh.listaCursos.forEach {
            println("")
            println(it)
        }

    } catch (e: Exception) {
        println("")
        println("Comando inválido, tente novamente")
    }

}
