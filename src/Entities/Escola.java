package Entities;

import java.util.ArrayList;
import java.util.List;

public class Escola {

    public Escola() {
        this.turmas = new ArrayList<>();
    }

    private List<Turma> turmas;

    public List<Turma> getTurmas() {
        return turmas;
    }

    public void setTurmas(Turma turma) {
        turmas.add(turma);
    }


    public boolean buscarTurma(String nomeTurma, List<Turma> turmas){
        for (Turma t : turmas){
            if (t.getNomeDaTurma().equals(nomeTurma)){
                return true;
            }
        }
        return false;
    }


}
