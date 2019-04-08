package br.com.alura.aluraviagens.ui.activity;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import br.com.alura.aluraviagens.R;
import br.com.alura.aluraviagens.model.Pacote;
import br.com.alura.aluraviagens.util.DataUtil;
import br.com.alura.aluraviagens.util.DiasUtil;
import br.com.alura.aluraviagens.util.MoedaUtil;
import br.com.alura.aluraviagens.util.ResourceUtil;

public class ResumoPacoteActivity extends AppCompatActivity {

    public static final String TITULO_APPBAR = "Resumo do Pacote";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resumo_pacote);

        setTitle(TITULO_APPBAR);

        Pacote pacoteFoz = new Pacote("Foz do Iguaçu", "foz_do_iguacu_pr", 8, new BigDecimal("680.26"));

        mostraLocal(pacoteFoz);
        mostraImagem(pacoteFoz);
        mostraDias(pacoteFoz);
        mostraPreco(pacoteFoz);
        mostraData(pacoteFoz);

        Intent vaiParaPagamento = new Intent(ResumoPacoteActivity.this, PagamentoActivity.class);
        startActivity(vaiParaPagamento);


    }

    private void mostraData(Pacote pacoteFoz) {
        TextView data = findViewById(R.id.resumo_data);
        String dataFormatadaViagem = DataUtil.periodoEmTexto(pacoteFoz);
        data.setText(dataFormatadaViagem);
    }



    private void mostraPreco(Pacote pacote) {
        TextView preco = findViewById(R.id.resumo_preco);
        String moedaEmTexto = MoedaUtil.formataParaBr(pacote.getPreco());
        preco.setText(moedaEmTexto);
    }

    private void mostraDias(Pacote pacoteFoz) {
        TextView dias = findViewById(R.id.resumo_dias);
        String diasEmTexto = DiasUtil.formataDias(pacoteFoz.getDias());
        dias.setText(diasEmTexto);
    }

    private void mostraImagem(Pacote pacote) {
        ImageView imagem = findViewById(R.id.resumo_imagem);
        Drawable drawableDePacote = ResourceUtil.retornaDrawable(this, pacote.getImagem());
        imagem.setImageDrawable(drawableDePacote);
    }

    private void mostraLocal(Pacote pacote) {
        TextView local = findViewById(R.id.resumo_local);
        local.setText(pacote.getLocal());
    }
}
