package com.iftm.trabalho04.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.iftm.trabalho04.models.Imovel;
import com.iftm.trabalho04.repositories.ImovelRepository;

@Service
public class ImovelService {

    @Autowired
    private ImovelRepository repository;

    @Cacheable("imovel")
    public List<Imovel> findAll() {
        var imoveis = repository.findAll();
        System.out.println("Resposta do banco de dados...");
        return imoveis;
    }

    @Cacheable(value = "imovel", key = "#id")
    public Imovel findById(String id) {
        System.out.println("Resposta do banco de dados...");
        return repository.findById(id).get();
    }

    @CacheEvict(value = "imovel", allEntries = true)
    public Imovel create(Imovel imovel) {
        return repository.save(imovel);
    }

    @CacheEvict(value = "imovel", allEntries = true)
    public Imovel update(Imovel imovel) {

        var dbImovel = repository.findById(imovel.getId());
        var curImovel = dbImovel.get();
        curImovel.setArea(imovel.getArea());
        curImovel.setEndereco(imovel.getEndereco());
        curImovel.setPreco(imovel.getPreco());
        return repository.save(curImovel);
    }

    @CacheEvict(value = "imovel", allEntries = true)
    public Imovel delete(String id) {
        repository.deleteById(id);
        return repository.findById(id).get();
    }

}
