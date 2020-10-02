open class Professor(nome: String, sobrenome: String, tempo: Int, cod: Int) {

    var nome = nome
    var sobrenome = sobrenome
    var tempoDeCasa = tempo
    var codigoProfessor = cod

    override fun toString(): String {
        return "Professor (Nome: ='$nome', Sobrenome: ='$sobrenome', Tempo de casa: ='$tempoDeCasa', Código: ='$codigoProfessor')"
    }

}