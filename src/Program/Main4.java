package Program;

import Entities.*;

import java.math.BigDecimal;
import java.util.List;
import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int num = 0;

        Professor professor = new Professor("Sheldon", 26, "Física");
        Turma turma = new Turma("Amarela", Materias.FISICA, TurnoEnum.MANHÃ);
        turma.setProfessores(professor);


        Professor professor1 = new Professor("Leonard", 25, "Física");
        Aluno aluno1 = new Aluno("Raj", 25, 123456);
        Turma turma1 = new Turma("Azul", Materias.MATEMATICA, TurnoEnum.NOITE);
        turma.setProfessores(professor1);
        turma.setAlunos(aluno1);



        while (num != 1){

            System.out.print("\nDIGITE O NOME DO ALUNO: ");
            String nomeAluno = entrada.next();

            System.out.print("DIGITE A IDADE DO ALUNO " + nomeAluno + ": ");
            int idadeAluno = entrada.nextInt();

            System.out.print("DIGITE O NÚMERO DA MATRÍCULA PARA O ALUNO " + nomeAluno + ": ");
            Integer numeroMatricula = entrada.nextInt();

            Aluno aluno = new Aluno(nomeAluno, idadeAluno, numeroMatricula);
            turma.setAlunos(aluno);

            System.out.print("N1: ");
            double n1 = entrada.nextDouble();

            System.out.print("N2: ");
            double n2 = entrada.nextDouble();

            System.out.print("N3: ");
            double n3 = entrada.nextDouble();

            System.out.print("N4: ");
            double n4 = entrada.nextDouble();


            aluno.mediaAluno(n1, n2, n3, n4);
            //System.out.println(aluno);


            num = entrada.nextInt();
        }

        for (Aluno alun : turma.getAlunos()){
            System.out.println(alun.getNome());
            System.out.println(alun.toString());
        }


        /*
        int x = 0;

        while (x != 1){
            try {
                System.out.print("ABDU: ");
                x = entrada.nextInt();
            }catch (Exception e){
                System.out.println("ERROR");
                x = 1;
            }

        }

         */

        Escola escola = new Escola();
        escola.setTurmas(turma);
        escola.setTurmas(turma1);

        for (Turma turm : escola.getTurmas()){
            System.out.println(turm.getNomeDaTurma());
            System.out.println("---------------------");
        }

        String nomeTurma = "Laranja";

        for (Turma t : escola.getTurmas()){
            if (t.getNomeDaTurma().equals(nomeTurma)){
                System.out.println("SIM");
                break;
            }
        }

        escola.getTurmas().forEach(e ->System.out.println(e.getNomeDaTurma()));

        boolean resp = escola.buscarTurma("azul", escola.getTurmas());
        System.out.println(resp);




        entrada.close();

    }
}
