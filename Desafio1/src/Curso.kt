class Curso(
    curso: String, cod: Int, qtd: Int) {

    var nomeCurso = curso
    var codCurso = cod
    var professorTitular: Int = 0
    var professorAdjunto: Int = 0
    var maxAlunos = qtd
    var alunosMatriculados = ArrayList<Aluno>()

    fun adicionarUmALuno(umAluno: Aluno): Boolean {

        if (alunosMatriculados.size < maxAlunos) {
            alunosMatriculados.add(umAluno)
            return true
        }
        return false
    }

    fun excluirAluno(umAluno: Aluno) {
        alunosMatriculados.remove(umAluno)
    }

    override fun toString(): String {
        return "Curso (Curso: ='$nomeCurso', Código: =$codCurso, Prof. Titular: =$professorTitular," +
                " Prof. Adjunto: =$professorAdjunto, Máx. de alunos: =$maxAlunos, Alunos matriculados: =$alunosMatriculados)"

    }

}