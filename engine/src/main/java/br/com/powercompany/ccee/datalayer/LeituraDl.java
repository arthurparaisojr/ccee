package br.com.powercompany.ccee.datalayer;

import br.com.powercompany.ccee.model.Leitura;
import br.com.powercompany.ccee.model.Regiao;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class LeituraDl {
    private static List<Leitura> leitura;

    public static List<Leitura> getLeitura() {
        List<Leitura> result = new ArrayList<>();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssX"); //.parse("2000-03-14T00:00:00-03:00");
        Date data = null;
        try {
            data = sdf.parse("2000-03-14T00:00:00-03:00");
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        java.sql.Date data2 = new java.sql.Date(data.getTime());
        Regiao regiao = new Regiao("SE",new double[] { 11.1, 22.2 , 23.3 },new double[] { 21.1, 12.2 , 23.3 });
        Leitura leitura = new Leitura(1, data2, new Regiao[] { regiao, regiao } );
        result.add(leitura);
        /*
        regiao = new Regiao("NE",new double[] { 21.1, 22.2 , 23.3 },new double[] { 21.1, 22.2 , 23.3 });
        leitura = new Leitura(1, new Date(new SimpleDateFormat("yyyy-MM-dd'T'HH:mm'Z'").parse("2000-03-14T00:00:00-03:00").getTime()), new Regiao[] { regiao, regiao } );
        result.add(leitura);
        regiao = new Regiao("N",new double[] { 31.1, 22.2 , 23.3 },new double[] { 21.1, 32.2 , 23.3 });
        leitura = new Leitura(1, new Date(new SimpleDateFormat("yyyy-MM-dd'T'HH:mm'Z'").parse("2000-03-14T00:00:00-03:00").getTime()), new Regiao[] { regiao, regiao } );
        result.add(leitura);
        regiao = new Regiao("S",new double[] { 41.1, 22.2 , 23.3 },new double[] { 21.1, 42.2 , 23.3 });
        leitura = new Leitura(1, new Date(new SimpleDateFormat("yyyy-MM-dd'T'HH:mm'Z'").parse("2000-03-14T00:00:00-03:00").getTime()), new Regiao[] { regiao, regiao } );
        result.add(leitura);
        */
        return result;
    }
}
