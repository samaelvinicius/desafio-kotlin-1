class DigitalHouseManager {

    var listaAlunos = ArrayList<Aluno>()
    var listaProfessores = ArrayList<Professor>()
    var listaCursos = ArrayList<Curso>()
    var listaMatriculas = ArrayList<Matricula>()

    fun registrarCurso(nome: String, codigoCurso: Int, quantidadeMaximaDeAlunos: Int) {
        listaCursos.add(Curso(nome, codigoCurso, quantidadeMaximaDeAlunos))
    }

    fun excluirCurso(codigoCurso: Int) {
        listaCursos.forEach {
            if (it.codCurso == codigoCurso)
                listaCursos.remove(it);
        }
    }

    fun registrarProfessorAdjunto(nome: String, sobrenome: String, codigoProfessor: Int, quantidadeDeHoras: Int) {
        listaProfessores.add(ProfessorAssistente(nome, sobrenome, codigoProfessor, 0, quantidadeDeHoras))
    }

    fun registrarProfessorTitular(nome: String, sobrenome: String, codigoProfessor: Int, especialidade: String) {
        listaProfessores.add(ProfessorTitular(nome, sobrenome, codigoProfessor, 0, especialidade))
    }

    fun excluirProfessor(codigoProfessor: Int) {
        listaProfessores.forEach {
            if (it.codigoProfessor == codigoProfessor)
                listaProfessores.remove(it);
        }
    }

    fun matricularAluno(nome: String, sobrenome: String, codigoAluno: Int) {
        listaAlunos.add(Aluno(nome, sobrenome, codigoAluno))
    }

    fun matricularAluno(codigoAluno: Int, codigoCurso: Int) {
        var cursoExistente = false
        var alunoExistente = false
        lateinit var MatricularAluno:Aluno
        var maximoAluno = 1;
        listaAlunos.forEach {
            if (it.codigoAluno == codigoAluno) {
                alunoExistente = true
                MatricularAluno =it;
            }
        }
        listaCursos.forEach {
            if (it.codCurso == codigoCurso) {
                cursoExistente = true
                maximoAluno = it.maxAlunos
                if (alunoExistente) {
                    it.alunosMatriculados.add(MatricularAluno)
                }
            }
        }
        if (cursoExistente && alunoExistente) {
            if (listaMatriculas.size < maximoAluno) {
                println("")
                println("O aluno foi matriculado")
                listaMatriculas.add(Matricula(codigoAluno, codigoCurso))
            }
            else
                println("Não foi possível realizar a matrícula porque não há vagas.")
        }
        else
            println("Não for possível concluir a matrícula")
    }

    fun alocarProfessores (codigoCurso: Int, codigoProfessorTitular: Int, codigoProfessorAdjunto: Int) {
        var titularExistente = false
        var adjuntoExistente = false
        listaProfessores.forEach {
            if (it is ProfessorTitular && it.codigoProfessor == codigoProfessorTitular)
                titularExistente = true
            if (it is ProfessorAssistente && it.codigoProfessor == codigoProfessorAdjunto)
                adjuntoExistente = true
        }
        listaCursos.forEach {
            if (it.codCurso == codigoCurso && adjuntoExistente && titularExistente) {
                it.professorAdjunto = codigoProfessorAdjunto
                it.professorTitular = codigoProfessorTitular
            }


        }
    }
}
