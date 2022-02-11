package Entities;

import java.math.BigDecimal;

public class Aluno extends Pessoa{

    private Integer numeroDeMatricula;
    private double n1;
    private double n2;
    private double n3;
    private double n4;


    public Aluno(String nome, Integer idade, Integer numeroDeMatricula) {
        super(nome, idade);
        this.numeroDeMatricula = numeroDeMatricula;
    }

    public Integer getNumeroDeMatricula() {
        return numeroDeMatricula;
    }

    public void setNumeroDeMatricula(Integer numeroDeMatricula) {
        this.numeroDeMatricula = numeroDeMatricula;
    }

    public double getN1() {
        return n1;
    }

    public void setN1(double n1) {
        this.n1 = n1;
    }

    public double getN2() {
        return n2;
    }

    public void setN2(double n2) {
        this.n2 = n2;
    }

    public double getN3() {
        return n3;
    }

    public void setN3(double n3) {
        this.n3 = n3;
    }

    public double getN4() {
        return n4;
    }

    public void setN4(double n4) {
        this.n4 = n4;
    }

    public double mediaAluno(double nota1, double nota2,
                                 double nota3, double nota4){
        this.n1 = nota1;
        this.n2 = nota2;
        this.n3 = nota3;
        this.n4 = nota4;

        double media = 0;

        media = (n1 + n2 + n3 + n4)/4;

       // BigDecimal media;
        //media = n1.add(n2).add(n3).add(n4).divide(new BigDecimal(4));
        return media;
    }


    public String toString(){

        if (mediaAluno(n1, n2, n3, n4) < 6){
            return "Reprovado" + "\nMédia: " + mediaAluno(n1, n2, n3, n4);
        } else {
            return "Aprovado" + "\nMédia: " + mediaAluno(n1, n2, n3, n4);
        }
    }



}
