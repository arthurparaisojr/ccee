package br.com.powercompany.ccee.service;

import br.com.powercompany.ccee.model.Leitura;
import br.com.powercompany.ccee.model.Regiao;

import java.util.List;

public interface IService {
    public List<Leitura> getLeitura();
    public void sendLeitura();
}
