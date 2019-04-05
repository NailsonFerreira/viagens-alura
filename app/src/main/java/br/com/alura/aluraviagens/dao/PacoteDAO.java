package br.com.alura.aluraviagens.dao;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import br.com.alura.aluraviagens.model.Pacote;

public class PacoteDAO {

    public List<Pacote> lista(){
        List<Pacote> pacotes = new ArrayList<>(Arrays.asList(
                new Pacote("Recife", "recife_pe", 1, new BigDecimal(250.00)),
                new Pacote("São Paulo", "sao_paulo_sp", 5, new BigDecimal(236.99)),
                new Pacote("Foz do Iguaçu", "foz_do_iguacu_pr", 0, new BigDecimal(250.00)),
                new Pacote("Rio de Janeiro", "rio_de_janeiro_rj", 5, new BigDecimal(250.90))));
        return pacotes;
    }
}
