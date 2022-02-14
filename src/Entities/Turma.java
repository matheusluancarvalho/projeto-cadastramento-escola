package Entities;

import java.util.ArrayList;
import java.util.List;

public class Turma {

    private String nomeDaTurma;
    private List<Aluno> alunos;
    private List<Professor> professores;
    private TurnoEnum turno;
    private Materias materias;


    public Turma(String nomeDaTurma, Materias materias, TurnoEnum turno) {
        this.nomeDaTurma = nomeDaTurma;
        this.materias = materias;
        this.turno = turno;
        this.alunos = new ArrayList<>();
        this.professores = new ArrayList<>();
    }

    public TurnoEnum getTurno() {
        return turno;
    }

    public void setTurno(TurnoEnum turno) {
        this.turno = turno;
    }

    public String getNomeDaTurma() {
        return nomeDaTurma;
    }

    public void setNomeDaTurma(String nomeDaTurma) {
        this.nomeDaTurma = nomeDaTurma;
    }

    public Materias getMaterias() {
        return materias;
    }

    public void setMaterias(Materias materias) {
        this.materias = materias;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno aluno) {
        alunos.add(aluno);
    }

    public List<Professor> getProfessores() {
        return professores;
    }

    public void setProfessores(Professor professor) {
        professores.add(professor);
    }


    public boolean matricularAluno(Aluno aluno){
        if (aluno.getIdade() < 18 && turno == TurnoEnum.NOITE){
           //System.out.println("ALUNO(A) " + aluno.getNome() + " NÃO PODE SER CADASTRADO!");
           //System.out.println("ALUNO(A) " + aluno.getNome() + " É MENOR DE IDADE PRA O TUNO NOTURNO!");
            return false;
        } else {
            alunos.add(aluno);
            //System.out.println("ALUNO(A) " + aluno.getNome() + " FOI CADASTRADO COM SUCESSO!");
            return true;
        }
    }




}
