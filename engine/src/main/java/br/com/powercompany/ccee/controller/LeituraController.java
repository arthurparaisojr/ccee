package br.com.powercompany.ccee.controller;

import br.com.powercompany.ccee.model.Leitura;
import br.com.powercompany.ccee.service.Services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;
import java.util.List;


@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping(value = "/api")
public class LeituraController {

    @Autowired
    private Services service;

    @GetMapping("leitura")
    public List<Leitura> saveStudent() throws ParseException {
        return service.getLeitura();
    }
}
