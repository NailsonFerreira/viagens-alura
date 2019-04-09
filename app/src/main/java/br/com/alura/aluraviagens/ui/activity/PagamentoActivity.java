package br.com.alura.aluraviagens.ui.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.math.BigDecimal;

import br.com.alura.aluraviagens.R;
import br.com.alura.aluraviagens.model.Pacote;
import br.com.alura.aluraviagens.util.MoedaUtil;

public class PagamentoActivity extends AppCompatActivity {

    public static final String PAGAMENTO = "Pagamento";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pagamento);
        setTitle(PAGAMENTO);

        Pacote pacoteFoz = new Pacote("Foz do Iguaçu","foz_do_iguacu_pr", 10, new BigDecimal(1100.00));

        mostraPreco(pacoteFoz);


    }

    private void mostraPreco(Pacote pacote) {
        TextView preco = findViewById(R.id.pagamento_preco_pacote);
        String moedaBrasileira = MoedaUtil.formataParaBr(pacote.getPreco());
        preco.setText(moedaBrasileira);
    }
}
