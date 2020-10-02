import java.time.LocalDateTime

class Matricula constructor (val A: Int, val C: Int) {

    var aluno = A;
    var curso = C;
    var dataMatricula = LocalDateTime.now();

    override fun toString(): String {
        return "Matricula (A: =$A, C: =$C, Aluno: =$aluno, Curso: =$curso, Data da Matrícula: =$dataMatricula)"
    }

}