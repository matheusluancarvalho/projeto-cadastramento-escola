package Entities;

import java.math.BigDecimal;

public class Aluno extends Pessoa{

    private Integer numeroDeMatricula;
    private BigDecimal n1;
    private BigDecimal n2;
    private BigDecimal n3;
    private BigDecimal n4;


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

    public BigDecimal getN1() {
        return n1;
    }

    public void setN1(BigDecimal n1) {
        this.n1 = n1;
    }

    public BigDecimal getN2() {
        return n2;
    }

    public void setN2(BigDecimal n2) {
        this.n2 = n2;
    }

    public BigDecimal getN3() {
        return n3;
    }

    public void setN3(BigDecimal n3) {
        this.n3 = n3;
    }

    public BigDecimal getN4() {
        return n4;
    }

    public void setN4(BigDecimal n4) {
        this.n4 = n4;
    }

    public BigDecimal mediaAluno(BigDecimal nota1, BigDecimal nota2,
                                 BigDecimal nota3, BigDecimal nota4){
        this.n1 = nota1;
        this.n2 = nota2;
        this.n3 = nota3;
        this.n4 = nota4;

        BigDecimal media;
        media = n1.add(n2).add(n3).add(n4).divide(new BigDecimal(4));
        return media;
    }

}
