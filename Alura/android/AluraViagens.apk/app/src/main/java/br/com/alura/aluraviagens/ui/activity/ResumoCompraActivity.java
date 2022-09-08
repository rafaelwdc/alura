package br.com.alura.aluraviagens.ui.activity;

import static br.com.alura.aluraviagens.ui.activity.PacoteActivityConstantes.CHAVE_PACOTE;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import br.com.alura.aluraviagens.model.Pacote;
import br.com.alura.aluraviagens.util.DataUtil;
import br.com.alura.aluraviagens.util.MoedaUtil;
import br.com.alura.aluraviagens.util.ResourceUtil;

public class ResumoCompraActivity extends AppCompatActivity {

    public static final String TITULO_APPBAR = "Resumo da Compra";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resumo_compra);

        setTitle(TITULO_APPBAR);
        carregaPacoteRecebido();
    }

    private void carregaPacoteRecebido() {
        Intent intent = getIntent();
        if (intent.hasExtra(CHAVE_PACOTE)) {
            Pacote pacote = (Pacote) intent.getSerializableExtra(CHAVE_PACOTE);
            inicializaCampos(pacote);
        }
    }

    private void inicializaCampos(Pacote pacote) {
        mostraLocal(pacote);
        mostraImagem(pacote);
        mostraData(pacote);
        mostraPreco(pacote);
    }

    private void mostraPreco(Pacote pacoteSaoPaulo) {
        TextView preco = findViewById(R.id.resumo_compra_preco_pacote);
        String moedaBrasileira = MoedaUtil.formataParaBrasileiro(pacoteSaoPaulo.getPreco());
        preco.setText(moedaBrasileira);
    }

    private void mostraData(Pacote pacoteSaoPaulo) {
        TextView data = findViewById(R.id.resumo_compra_data_viagem);
        String periodoEmTexto = DataUtil.periodoEmTexto(pacoteSaoPaulo.getDias());
        data.setText(periodoEmTexto);
    }

    private void mostraImagem(Pacote pacoteSaoPaulo) {
        ImageView imagem = findViewById(R.id.resumo_compra_imagem_pacote);
        Drawable drawableDoPacote = ResourceUtil.devolveDrawbable(this, pacoteSaoPaulo.getImagem());
        imagem.setImageDrawable(drawableDoPacote);
    }

    private void mostraLocal(Pacote pacoteSaoPaulo) {
        TextView local = findViewById(R.id.resumo_compra_local_pacote);
        local.setText(pacoteSaoPaulo.getLocal());
    }
}