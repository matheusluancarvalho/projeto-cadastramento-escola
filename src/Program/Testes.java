package Program;

import Entities.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Testes {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);


        int x =0;
        ArrayList<Integer> idadeAluno = new ArrayList<>();
        ArrayList<Integer> idadeProf = new ArrayList<>();
        ArrayList<String> nomeAluno = new ArrayList<>();
        ArrayList<String> nomeProf = new ArrayList<>();

        ArrayList<Integer> matricula = new ArrayList<>();
        ArrayList<String> areaProf = new ArrayList<>();

        //numeros.add(6);
        //numeros.add(45);
        //numeros.add(10);

        Aluno aluno1 = new Aluno("Howard Wolowitz", 18, 123456);
        Turma turma = new Turma("Turma1", Materias.FISICA, TurnoEnum.NOITE);

        while (x != 1){

            System.out.print("Prof: ");
            String nomeProfessor = entrada.next();
            nomeProf.add(nomeProfessor);

            System.out.print("Idade Prof: ");
            Integer idadeProfessor = entrada.nextInt();
            idadeProf.add(idadeProfessor);

            System.out.print("Formação Prof: ");
            String formacaoProfessor = entrada.next();
            areaProf.add(formacaoProfessor);

            Professor professor = new Professor(nomeProfessor, idadeProfessor, formacaoProfessor);
            turma.setProfessores(professor);

            System.out.print("Sair ou Não: ");
            x = entrada.nextInt();
        }


        for( Professor p : turma.getProfessores()){
            System.out.println(p.getNome());
        }

        turma.getProfessores().remove(0);


        System.out.println("__________________________-");

        for( Professor p : turma.getProfessores()){
            System.out.println(p.getNome());
        }





        entrada.close();

    }
}
