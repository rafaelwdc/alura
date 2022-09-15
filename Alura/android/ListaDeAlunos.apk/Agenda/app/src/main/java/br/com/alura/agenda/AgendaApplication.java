package br.com.alura.agenda;

import android.app.Application;

import androidx.room.Room;

import br.com.alura.agenda.dao.AlunoDAOLowLevel;
import br.com.alura.agenda.database.AgendaDatabase;
import br.com.alura.agenda.database.dao.RoomAlunoDAO;
import br.com.alura.agenda.model.Aluno;

public class AgendaApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        criaAlunosDeTeste();
    }

    private void criaAlunosDeTeste() {
        AgendaDatabase database = Room
                .databaseBuilder(this,
                        AgendaDatabase.class,
                        "agenda.db")
                .build();
        RoomAlunoDAO dao = database.getRoomAlunoDao();
        dao.salva(new Aluno("Rafael", "41 999 777 999", "eu@wdc.com"));
        dao.salva(new Aluno("Patricky", "41 999 777 999", "ele@wdc.com"));
    }
}
