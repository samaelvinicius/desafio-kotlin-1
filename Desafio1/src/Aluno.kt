class Aluno (nome: String, sobrenome: String, cod: Int) {

    var nome = nome
    var sobrenome = sobrenome
    var codigoAluno = cod

    override fun toString(): String {
        return "Aluno (Nome: ='$nome', Sobrenome: ='$sobrenome', Código: =$codigoAluno)"
    }

}