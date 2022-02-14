package Program;

import Entities.*;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int respostaMenu = 0;
        int respostaEscolha;
        int respostaVoltarMenu = 0;
        int respostaVoltarMenu1 = 0;

        int saidaRespostaProfessor = 0;
        int saidaRespostaAluno = 0;
        String nomeDaTurma;
        int escolhaMateria;
        int escolhaTurno;
        var x = Materias.FISICA;
        var y = TurnoEnum.MANHÃ;

        System.out.println("*************OLÁ! SEJA BEM VINDO A ESCOLA RAIO DE LUZ!*************");

        System.out.print("\nDIGITE O SEU NOME PARA CONTINUAR: ");
        String nomeUsuario = entrada.next().toUpperCase(Locale.ROOT);

        while (respostaMenu != 1) {

            System.out.println("\n\n*******ESCOLHA UMA DAS OPÇÕES A SEGUIR " + nomeUsuario + "*******");
            System.out.println("\nDIGITE 1 PARA CADASTRAR UMA TURMA");
            System.out.println("DIGITE QUALQUER NÚMERO PARA SAIR");
            System.out.print("\nRESPOSTA: ");

            try{
                respostaEscolha = entrada.nextInt();

                if (respostaEscolha == 1){
                    System.out.println("\nVAMOS CADASTRAR A TURMA");

                    System.out.print("DIGITE O NOME DA TURMA: ");
                    nomeDaTurma = entrada.next().toUpperCase(Locale.ROOT);

                    //-------------CADASTRAMENTO DA ESCOLHA DA DISCIPLINA----------------------------
                    System.out.println("\n\nESCOLHA A MATÉRIA DA TURMA");
                    try {
                        System.out.println("DIGITE 1 PARA FÍSICA");
                        System.out.println("DIGITE 2 PARA MATEMÁTICA");
                        System.out.println("DIGITE 3 PARA PORTUGUÊS");
                        System.out.println("DIGITE 4 PARA HISTÓRIA");
                        System.out.println("DIGITE 5 PARA GEOGRAFIA");
                        System.out.print("\nRESPOSTA: ");
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

                    //------------------------CADASTRAMENTO DO TURNO---------------------------------
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

                    //---------------------------CADASTRAMENTO DA TURMA------------------------------
                    Turma turma = new Turma(nomeDaTurma, x, y);

                    System.out.println("\nAGORA VAMOS CADASTRAR O(S) PROFESSOR(ES) DA TURMA " + nomeDaTurma);

                    //------------------------CADASTRAMENTO DOS PROFESSORES--------------------------
                    while (saidaRespostaProfessor != 1){

                        System.out.print("\nDIGITE O NOME DO PROFESSOR A CADASTRAR NA TURMA: ");
                        String nomeProfessor = entrada.next().toUpperCase(Locale.ROOT);

                        System.out.print("DIGITE A IDADE DO PROFESSOR " + nomeProfessor + ": ");
                        Integer idadeProfessor = entrada.nextInt();

                        System.out.print("DIGITE A FORMAÇÃO DO PROFESSOR " + nomeProfessor + ": ");
                        String formacaoProfessor = entrada.next().toUpperCase(Locale.ROOT);

                        Professor professor = new Professor(nomeProfessor, idadeProfessor, formacaoProfessor);
                        turma.setProfessores(professor);

                        System.out.println("\nCADASTRO REALIZADO COM SUCESSO!");

                        System.out.println("\nSELECIONE UMA DAS OPÇÕES!");
                        System.out.println("DIGITE 1 PARA FINALIZAR CADASTRO");
                        System.out.println("DIGITE QUALQUER NÚMERO PARA CONTINUAR CADASTRO");
                        System.out.print("\nRESPOSTA: ");
                        saidaRespostaProfessor = entrada.nextInt();
                    }

                    System.out.println("\nAGORA PARA FINALIZAR, VAMOS CADASTRAR OS ALUNOS!");

                    //----------------------CADASTRAMENTO DOS ALUNOS---------------------------------

                    while (saidaRespostaAluno != 1) {

                        System.out.print("\nDIGITE O NOME DO ALUNO: ");
                        String nomeAluno = entrada.next().toUpperCase(Locale.ROOT);

                        System.out.print("DIGITE A IDADE DO ALUNO " + nomeAluno + ": ");
                        int idadeAluno = entrada.nextInt();

                        System.out.print("DIGITE O NÚMERO DA MATRÍCULA PARA O ALUNO " + nomeAluno + ": ");
                        Integer numeroMatricula = entrada.nextInt();

                        Aluno aluno = new Aluno(nomeAluno, idadeAluno, numeroMatricula);

                        if (!turma.matricularAluno(aluno)){
                            System.out.println("ALUNO(A) " + nomeAluno + " NÃO PODE SER CADASTRADO!");
                            System.out.println("ALUNO(A) " + nomeAluno + " É MENOR DE IDADE PARA O TURNO NOTURNO!");
                        } else {

                            System.out.println("ALUNO(A) " + nomeAluno + " FOI CADASTRADO COM SUCESSO!");
                            System.out.println("\nDIGITE AS NOTAS DO ALUNO(A) " + nomeAluno);


                            System.out.print("N1: ");
                            double n1 = entrada.nextDouble();

                            System.out.print("N2: ");
                            double n2 = entrada.nextDouble();

                            System.out.print("N3: ");
                            double n3 = entrada.nextDouble();

                            System.out.print("N4: ");
                            double n4 = entrada.nextDouble();

                            aluno.mediaAluno(n1, n2, n3, n4);
                        }

                        System.out.println("\nESCOLHA UMA DAS OPÇÕES");
                        System.out.println("DIGITE QUALQUER NÚMERO PARA CONTINUAR CADASTRO");
                        System.out.println("DIGITE 1 PARA FINALIZAR CADASTRO");
                        System.out.print("\nRESPOSTA: ");
                        saidaRespostaAluno = entrada.nextInt();

                    }

                    //-------------------------CADASTRO DAS TURMAS NA ESCOLA-------------------------
                    Escola escola = new Escola();
                    escola.setTurmas(turma);

                    while (respostaVoltarMenu != 2){
                        System.out.println("\n\nESCOLHA UMA DAS OPÇÕES ABAIXO!");
                        System.out.println("DIGITE 1 PARA VER OS DADOS CADASTRADOS");
                        System.out.println("DIGITE QUALQUER NÚMERO PARA VOLTAR AO MENU PRINCIPAL");
                        System.out.print("\nRESPOSTA: ");

                        try{
                            respostaVoltarMenu = entrada.nextInt();

                            if (respostaVoltarMenu == 1){

                                System.out.println("\n\n**********************DADOS CADASTRADOS**********************");

                                System.out.println("\nTURMAS DA ESCOLA RAIO DE LUZ");
                                System.out.println("\n");

                                for (Turma tm : escola.getTurmas()){
                                    System.out.println("----------------------------------------");
                                    System.out.println(tm.getNomeDaTurma());
                                    System.out.println("----------------------------------------");
                                }

                                System.out.println("\n\n<><><><><><><><><><><><><><>PROFESSORES DA TURMA "
                                        + nomeDaTurma + "<><><><><><><><><><><><><><>");
                                System.out.println("\n");

                                for (Professor pf : turma.getProfessores()){
                                    System.out.println("----------------------------------------");
                                    System.out.println(pf.getNome());
                                    System.out.println("----------------------------------------");
                                }

                                System.out.println("\n\n<><><><><><><><><><><><><><>NOME DOS ALUNOS E MÉDIAS<><><><><><><><><><><><><><>");
                                System.out.println("\n");

                                for (Aluno aln : turma.getAlunos()){
                                    System.out.println("----------------------------------------");
                                    System.out.println(aln.getNome());
                                    System.out.println(aln.aprovacao());
                                    System.out.println("----------------------------------------");
                                }
                                System.out.println(turma.getAlunos().size());
                                respostaVoltarMenu = 3;
                            } else {
                                System.out.println("\n\nVOLTANDO AO MENU PRINCIPAL!\n\n");
                                respostaVoltarMenu = 2;
                                respostaMenu = 2;
                            }

                        }catch (Exception e){
                            System.out.println("ERROR! VOLTANDO AO MENU PRINCIPAL!\n");
                            respostaVoltarMenu = 1;
                            respostaMenu = 2;
                        }
                    }
                } else {
                    System.out.println("BYE");
                    respostaMenu = 1;
                }

            }catch (Exception e){
                System.out.println("VOCÊ DIGITOU UMA LETRA AO INVÉS DE UM NÚMERO");
                System.out.println("POR PADRÃO IRÁ ENCERRAR A SESSÃO. BYE!");
                respostaMenu = 1;
            }
        }
        entrada.close();
    }
}