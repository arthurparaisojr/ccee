package br.com.powercompany.ccee.datalayer;

import br.com.powercompany.ccee.model.Leitura;

import java.util.List;

public class LeituraDl {
    private static List<Leitura> leitura;

    public static List<Leitura> getLeitura() {
        return leitura;
    }

    public static void setLeitura(List<Leitura> leitura) {
        LeituraDl.leitura = leitura;
    }
}
