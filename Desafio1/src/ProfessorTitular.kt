class ProfessorTitular(
    nome: String, sobrenome: String, tempo: Int, cod: Int,
    esp: String) : Professor (nome, sobrenome, tempo, cod) {

    var especialiade = esp

    override fun toString(): String {
        return "Professor Titular (Especialidade: ='$especialiade')"
    }

}