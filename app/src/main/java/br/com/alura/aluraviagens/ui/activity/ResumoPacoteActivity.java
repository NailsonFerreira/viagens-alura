package br.com.alura.aluraviagens.ui.activity;

import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.math.BigDecimal;

import br.com.alura.aluraviagens.R;
import br.com.alura.aluraviagens.model.Pacote;
import br.com.alura.aluraviagens.util.DiasUtil;
import br.com.alura.aluraviagens.util.MoedaUtil;
import br.com.alura.aluraviagens.util.ResourceUtil;

public class ResumoPacoteActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resumo_pacote);

        Pacote pacoteFoz = new Pacote("Foz do Iguaçu", "foz_do_iguacu_pr", 8, new BigDecimal("680.26"));

        TextView local = findViewById(R.id.resumo_local);
        local.setText(pacoteFoz.getLocal());

        ImageView imagem = findViewById(R.id.resumo_imagem);
        Drawable drawableDePacote = ResourceUtil.retornaDrawable(this, pacoteFoz.getImagem());
        imagem.setImageDrawable(drawableDePacote);

        TextView dias = findViewById(R.id.resumo_dias);
        String diasEmTexto = DiasUtil.formataDias(pacoteFoz.getDias());
        dias.setText(diasEmTexto);

        TextView preco = findViewById(R.id.resumo_preco);
        String moedaEmTexto = MoedaUtil.formataParaBr(pacoteFoz.getPreco());
        preco.setText(moedaEmTexto);


    }
}
