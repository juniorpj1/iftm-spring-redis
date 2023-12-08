package com.iftm.trabalho04.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.iftm.trabalho04.models.Imovel;
import com.iftm.trabalho04.services.ImovelService;

@RestController
@RequestMapping("/api/imoveis")
public class ImovelController {

    @Autowired
    private ImovelService service;

    @GetMapping
    public List<Imovel> findAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Imovel findById(@PathVariable("id") String id) {
        return service.findById(id);
    }

    @PostMapping
    public Imovel create(@RequestBody Imovel imovel) {
        return service.create(imovel);
    }

    @PutMapping
    public Imovel update(@RequestBody Imovel imovel) {
        return service.update(imovel);
    }

    @DeleteMapping("/{id}")
    public Imovel delete(@PathVariable("id") String id) {
        return service.delete(id);
    }
}
