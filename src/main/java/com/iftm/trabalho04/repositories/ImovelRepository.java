package com.iftm.trabalho04.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.iftm.trabalho04.models.Imovel;

@Repository
public interface ImovelRepository extends MongoRepository<Imovel, String> {

}
