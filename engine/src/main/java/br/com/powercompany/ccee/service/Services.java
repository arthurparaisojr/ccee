package br.com.powercompany.ccee.service;

import br.com.powercompany.ccee.datalayer.LeituraDl;
import br.com.powercompany.ccee.model.Leitura;
import br.com.powercompany.ccee.model.Regiao;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

@Service
public class Services implements IService {
    @Override
    public List<Leitura> getLeitura() throws ParseException {
        return new LeituraDl().getLeitura();
    }
    @Override
    public boolean sendLeitura() {
        try {
            return true;
        }
        catch (Exception e) {
            return false;
        }
    }
}