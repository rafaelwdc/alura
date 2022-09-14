package br.com.alura.agenda;

import android.app.Application;

import br.com.alura.agenda.dao.AlunoDAOLowLevel;
import br.com.alura.agenda.model.Aluno;

public class AgendaApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        criaAlunosDeTeste();
    }

    private void criaAlunosDeTeste() {
        AlunoDAOLowLevel dao = new AlunoDAOLowLevel(this, "agenda", null, 1);
        dao.salva(new Aluno("Rafael", "41 999 777 999", "eu@wdc.com"));
        dao.salva(new Aluno("Patricky", "41 999 777 999", "ele@wdc.com"));
    }
}
