package Entities;

import java.math.BigDecimal;

public class Professor extends Pessoa{

    private String areaDeFormacao;

    public Professor(String nome, Integer idade, String areaDeFormacao) {
        super(nome, idade);
        this.areaDeFormacao = areaDeFormacao;
    }

    public String getAreaDeFormacao() {
        return areaDeFormacao;
    }

    public void setAreaDeFormacao(String areaDeFormacao) {
        this.areaDeFormacao = areaDeFormacao;
    }

    /*
    public double calcularNota(Aluno aluno){
        BigDecimal media;
        media = aluno.getN1().add(aluno.getN2()).add(aluno.getN3()).add(aluno.getN4()).divide(new BigDecimal(4));
        return media;
    }

     */
}
