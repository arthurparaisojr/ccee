package br.com.powercompany.ccee.service;

import br.com.powercompany.ccee.model.Leitura;
import br.com.powercompany.ccee.model.Regiao;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class Services implements IService {
    @Override
    public List<Leitura> getLeitura() {
        List<Leitura> result = new ArrayList<>();
        return result;
    }
    @Override
    public void sendLeitura() {
        sendLeituras();
    }
    private void sendLeituras() {

    }
}