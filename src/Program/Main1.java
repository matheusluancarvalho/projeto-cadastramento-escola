package Program;

import Entities.*;

import java.math.BigDecimal;

public class Main1 {
    public static void main(String[] args) {


        Professor professor = new Professor("Sheldon Cooper", 35,
                "Bacharelado em Física");

        Professor professor2 = new Professor("Leonard", 35,
                "Bacharelado em Física");


        Aluno aluno1 = new Aluno("Howard Wolowitz", 18, 123456);


        Turma turma = new Turma("Turma1", Materias.FISICA, TurnoEnum.NOITE);


        turma.setProfessores(professor);
        turma.setProfessores(professor2);
        turma.setAlunos(aluno1);


        for (Professor p : turma.getProfessores()){
            if(p.getIdade() < 18){
                System.out.println("Professor " + p.getNome() + " é menor de idade");

            } else {
                System.out.println(p.getNome());
            }
        }

        System.out.println(turma.getMaterias());

        if (turma.getMaterias().equals(Materias.MATEMATICA)){
            System.out.println("Deu certo");
        } else {
            System.out.println("Outra matéria");
        }


        for (Professor p : turma.getProfessores()){
            if (turma.getProfessores().isEmpty()){
                System.out.println("Não existe professor");
            }
            else {
                System.out.println("Tem professor");
                System.out.println(p.getNome());
            }

        }




        System.out.println(turma.getProfessores().get(0).getNome());

        turma.matricularAluno(aluno1);

        //System.out.println(nota1.getNota1());

        System.out.println("Professor ");

        /*

        BigDecimal media = new BigDecimal(0);
        BigDecimal n1 = new BigDecimal(6);
        BigDecimal n2 = new BigDecimal(6);
        BigDecimal n3 = new BigDecimal(6);
        BigDecimal n4 = new BigDecimal(6);
        aluno1.setN1(n1);
        aluno1.setN2(n2);
        aluno1.setN3(n3);
        aluno1.setN4(n4);

        media = n1.add(n2).add(n3).add(n4).divide(new BigDecimal(4));
        //media = media.divide(new BigDecimal(4));


        System.out.println(media);

         */

        // aluno.setNotas(...);

        //turma(Professor, Alunos, materia)

    }
}
