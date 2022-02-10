package Program;

import Entities.*;

import java.util.Locale;
import java.util.Scanner;

public class MainPrincipal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int resposta = 0;
        int saida = 0;
        int respostaSaida = 0;

        System.out.print("DIGITE SEU NOME PARA INICIAR: ");
        String nome = entrada.nextLine().toUpperCase(Locale.ROOT);

        try {
            System.out.println("\nSEJAM BEM-VINDO A ESCOLA HOGWARTS, " + nome + "!");
            System.out.println("\nVAMOS REALIZAR OS CADASTROS NECESSÁRIOS ?");
            System.out.println("DIGITE 1 - SIM, QUERO CONTINUAR!");
            System.out.println("DIGITE 2 - NÃO! FAREI ISSO MAIS TARDE!");
            System.out.print("\nRESPOSTA: ");
            resposta = entrada.nextInt();
        } catch (Exception e) {
            System.out.println("ERROR!");
        }


        if (resposta == 1){
            while (respostaSaida != 1){

                int saidaRespostaProfessor = 0;
                int saidaRespostaAluno = 0;
                String nomeDaTurma;
                int escolhaMateria;
                int escolhaTurno;
                var x = Materias.FISICA;
                var y = TurnoEnum.MANHÃ;


                System.out.println("VAMOS COMEÇAR!");

                System.out.print("\nESCOLHA O NOME DA TURMA: ");
                nomeDaTurma = entrada.next();

                System.out.println("ESCOLHA A MATÉRIA DA TURMA");
                try{
                    System.out.println("DIGITE 1 PARA FÍSICA");
                    System.out.println("DIGITE 2 PARA MATEMÁTICA");
                    System.out.println("DIGITE 3 PARA PORTUGUÊS");
                    System.out.println("DIGITE 4 PARA HISTÓRIA");
                    System.out.println("DIGITE 5 PARA GEOGRAFIA");
                    System.out.print("RESPOSTA: ");
                    escolhaMateria = entrada.nextInt();

                    switch (escolhaMateria){
                        case 1:
                            System.out.println("\nMATÉRIA FÍSICA SELECIONADA!");
                            break;
                        case 2:
                            System.out.println("\nMATÉRIA MATEMÁTICA SELECIONADA!");
                            x = Materias.MATEMATICA;
                            break;
                        case 3:
                            System.out.println("\nMATÉRIA PORTUGUÊS SELECIONADA!");
                            x = Materias.PORTUGUES;
                            break;
                        case 4:
                            System.out.println("\nMATÉRIA HISTÓRIA SELECIONADA!");
                            x = Materias.HISTORIA;
                            break;
                        case 5:
                            System.out.println("\nMATÉRIA GEOGRAFIA SELECIONADA!");
                            x = Materias.GEOGRAFIA;
                            break;
                        default:
                            System.out.println("\nOPÇÃO NÃO IDENTIFICADA!");
                            System.out.println("POR PADRÃO, SERÁ CADASTRADO FÍSICA!");
                    }
                }catch (Exception e){
                    System.out.println("\nERROR! VALOR DIFERENTE DE UM NÚMERO.");
                    System.out.println("POR PADRÃO, SERÁ CADASTRADO COMO FÍSICA!");
                }

                System.out.println("\nMUITO BEM! AGORA SELECIONE O TURNO DA TURMA");

                try{
                    System.out.println("ESCOLHA UMA DAS OPÇÕES!");
                    System.out.println("DIGITE 1 - TURNO MANHÃ");
                    System.out.println("DIGITE 2 - TURNO TARDE");
                    System.out.println("DIGITE 3 - TURNO NOITE");
                    System.out.print("\nRESPOSTA: ");
                    escolhaTurno = entrada.nextInt();

                    switch (escolhaTurno){
                        case 1:
                            System.out.println("\nTURNO MANHÃ SELECIONADA!");
                            break;
                        case 2:
                            System.out.println("\nTURNO TARDE SELECIONADA!");
                            y = TurnoEnum.TARDE;
                            break;
                        case 3:
                            System.out.println("\nTURNO NOITE SELECIONADA!");
                            y = TurnoEnum.NOITE;
                            break;
                        default:
                            System.out.println("\nNÚMERO INVÁLIDO!");
                            System.out.println("POR PADRÃO SERÁ SELECIONADO TURNO MANHÃ!");
                    }
                }catch (Exception e){
                    System.out.println("\nERROR! VALOR DIFERENTE DE NÚMERO.");
                    System.out.println("POR PADRÃO, SERÁ SELECIONADO TURNO MANHÃ!");
                }

                Turma turma = new Turma(nomeDaTurma, x, y);

                System.out.println("\nAGORA VAMOS CADASTRAR O(S) PROFESSOR(ES) DA TURMA " + nomeDaTurma);

                while (saidaRespostaProfessor != 1){

                    System.out.print("\nDIGITE O NOME DO PROFESSOR A CADASTRAR NA TURMA: ");
                    String nomeProfessor = entrada.next();

                    System.out.print("DIGITE A IDADE DO PROFESSOR " + nomeProfessor + ": ");
                    Integer idadeProfessor = entrada.nextInt();

                    System.out.print("DIGITE A FORMAÇÃO DO PROFESSOR " + nomeProfessor + ": ");
                    String formacaoProfessor = entrada.next();

                    Professor professor = new Professor(nomeProfessor, idadeProfessor, formacaoProfessor);
                    turma.setProfessores(professor);

                    System.out.println("\nCADASTRO REALIZADO COM SUCESSO!");

                    System.out.println("\nSELECIONE UMA DAS OPÇÕES!");
                    System.out.println("DIGITE 1 PARA FINALIZAR CADASTRO");
                    System.out.println("DIGITE QUALQUER NÚMERO PARA CONTINUAR CADASTRO");
                    System.out.print("\nRESPOSTA: ");
                    saidaRespostaProfessor = entrada.nextInt();
                }

                System.out.println("\nPARA FINALIZAR, VAMOS CADASTRAR OS ALUNOS NA TURMA "
                        + nomeDaTurma + "!");

                while (saidaRespostaAluno != 1){

                    System.out.print("\nDIGITE O NOME DO ALUNO: ");
                    String nomeAluno = entrada.next();

                    System.out.print("DIGITE A IDADE DO ALUNO " + nomeAluno + ": ");
                    int idadeAluno = entrada.nextInt();

                    System.out.print("DIGITE O NÚMERO DA MATRÍCULA PARA O ALUNO " + nomeAluno + ": ");
                    Integer numeroMatricula = entrada.nextInt();

                    if (idadeAluno < 18 && turma.getTurno() == TurnoEnum.NOITE){
                        System.out.println("ALUNO " + nomeAluno + " NÃO PODE SER CADASTRADO NA TURMA "
                                + nomeDaTurma + "!");
                        System.out.println(nomeAluno + " É MENOR DE IDADE E NÃO PODE ESTUDAR A NOITE!");
                    } else {
                        System.out.println("ALUNO " + nomeAluno + " CADASTRADO COM SUCESSO!");

                        Aluno aluno = new Aluno(nomeAluno, idadeAluno, numeroMatricula);
                        turma.setAlunos(aluno);
                        //turma.matricularAluno(aluno);
                    }

                    System.out.println("\nESCOLHA UMA DAS OPÇÕES");
                    System.out.println("DIGITE QUALQUER NÚMERO PARA CONTINUAR CADASTRO");
                    System.out.println("DIGITE 1 PARA FINALIZAR CADASTRO");
                    System.out.print("\nRESPOSTA: ");
                    saidaRespostaAluno = entrada.nextInt();
                }

                System.out.println("------------------------DADOS CADASTRADOS------------------------");

                System.out.println("NOME DA TURMA: " + turma.getNomeDaTurma());

                System.out.println("\nNOME DO(S) PROFESSORES");

                for (Professor professor : turma.getProfessores()){
                    System.out.println(professor.getNome());
                }
                System.out.println("\nNOME DOS ALUNOS");

                for (Aluno aluno : turma.getAlunos()){
                    System.out.println(aluno.getNome());
                }
                System.out.println("--------------------------------------------------------------");

                System.out.println("\nCADASTRO DA TURMA, PROFESSORES E ALUNOS COM SUCESSO!");
                System.out.println("SE QUISER CADASTRAR OUTRA TURMA DIGITE QUALQUER NÚMERO");
                System.out.println("CASO QUEIRA FINALIZAR O CADASTRAMENTO, DIGITE 1 PARA SAIR");
                System.out.println("\nRESPOSTA: ");
                respostaSaida = entrada.nextInt();
            }

        } else {
            System.out.println("TUDO BEM! ATÉ MAIS :)");
        }

    }
}
