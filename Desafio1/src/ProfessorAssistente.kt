class ProfessorAssistente(
    nome: String, sobrenome: String, tempo: Int,
    cod: Int, horas: Int) : Professor (nome, sobrenome, tempo, cod) {

    var horasMonitoria = horas

    override fun toString(): String {
        return "Professor Assistente (Horas de monitoria: =$horasMonitoria)"
    }

}