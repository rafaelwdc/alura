package br.com.alura.agenda.ui;

import android.app.AlertDialog;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.ListView;

import br.com.alura.agenda.model.Aluno;
import br.com.alura.agenda.ui.adapter.ListaAlunosAdapter;

public class ListaAlunoView {
    public void confirmaRemocao(final MenuItem item) {
        new AlertDialog
                .Builder(this)
                .setTitle("Removendo Aluno")
                .setMessage("Tem certeza que quer remover o aluno?")
                .setPositiveButton("Sim", (dialogInterface, i) -> {
                    AdapterView.AdapterContextMenuInfo menuInfo =
                            (AdapterView.AdapterContextMenuInfo) item.getMenuInfo();
                    Aluno alunoEscolhido = adapter.getItem(menuInfo.position);
                    remove(alunoEscolhido);
                })
                .setNegativeButton("Não", null)
                .show();
    }

    public void atualizaAlunos() {
        adapter.atualiza(dao.todos());
    }

    public void remove(Aluno aluno) {
        dao.remove(aluno);
        adapter.remove(aluno);
    }

    public void configuraAdapter(ListView listaDeAlunos) {
        adapter = new ListaAlunosAdapter(this);
        listaDeAlunos.setAdapter(adapter);
    }
}
