package Program;

import Entities.*;

import java.util.Locale;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int respostaMenu = 0;
        int respostaSwitch;

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
            System.out.println("DIGITE 2 PARA VERIFICAR CADASTRO DAS TURMAS");
            System.out.println("DIGITE QUALQUER NÚMERO PARA SAIR");
            System.out.print("\nRESPOSTA: ");

            try {
                respostaSwitch = entrada.nextInt(); // g
            }catch (Exception e){
                System.out.println(nomeUsuario + " VOCÊ DIGITOU UMA LETRA AO INVÉS DE UM NÚMERO");
                System.out.println("POR PADRÃO IREMOS FINALIZAR O PROGRAMA");
                respostaSwitch = 3;
            }

            switch (respostaSwitch) {
                case 1:

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

                    System.out.println("\nAGORA VAMOS CADASTRAR O(S) PROFESSOR(ES) DA TURMA "
                            + nomeDaTurma);

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

                        Aluno aluno = new Aluno(nomeAluno, idadeAluno, numeroMatricula);
                        turma.setAlunos(aluno);

                        System.out.println("CADSTRO DO ALUNO " + nomeAluno +
                                " FOI REALIZADO COM SUCESSO!");

                        System.out.println("DIGITE AS NOTAS DO ALUNO " + nomeAluno + " A SEGUIR");


                        System.out.print("\nN1: ");
                        double n1 = entrada.nextDouble();

                        System.out.print("N2: ");
                        double n2 = entrada.nextDouble();

                        System.out.print("N3: ");
                        double n3 = entrada.nextDouble();

                        System.out.print("N4: ");
                        double n4 = entrada.nextDouble();


                        aluno.mediaAluno(n1, n2, n3, n4);

                        System.out.println("DIGITE 1 PARA FINALIZAR O CADASTRO");
                        System.out.println("DIGITE QUALQUER NÚMERO PARA CONTINUAR O CADASTRO");
                        System.out.print("RESPOSTA: ");

                        try {
                            saidaRespostaAluno = entrada.nextInt();
                        } catch (Exception e){
                            System.out.println("VOCÊ DIGITOU UMA LETRA AO INVÉS DE UMA NÚMERO");
                            System.out.println("COMO PADRÃO, IREMOS FINALIZAR O CADASTRAMENTO DOS ALUNOS!");
                            saidaRespostaAluno = 1;
                        }

                    }

                    Escola escola = new Escola();
                    escola.setTurmas(turma);

                    for (Turma t : escola.getTurmas()){
                        System.out.println("\n---------------------");
                        System.out.println(t.getNomeDaTurma());
                        System.out.println("---------------------");
                    }

                    System.out.println("\n\nCADASTRO REALIZADO COM SUCESSO!");
                    respostaMenu = 2;
                    break;

                case 2:
                    System.out.println("2");
                    respostaMenu = 2;
                    break;
                default:
                    System.out.println("\nATÉ MAIS!");
                    respostaMenu = 1;
                    // respostaMenu = entrada.nextInt();
            }




        }





        entrada.close();
    }
}
