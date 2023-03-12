package com.perales.ejemplohibernatesearch.service;

import com.perales.ejemplohibernatesearch.entity.Colonia;
import com.perales.ejemplohibernatesearch.repository.ColoniaRepository;
import jakarta.persistence.EntityManager;
import org.hibernate.search.engine.search.query.SearchResult;
import org.hibernate.search.mapper.orm.Search;
import org.hibernate.search.mapper.orm.session.SearchSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ColoniaService {

    @Autowired
    private ColoniaRepository coloniaRepository;

    @Autowired
    private EntityManager entityManager;

    public Long getCount() {
        return coloniaRepository.count();
    }

    public boolean index() {
        try{
            SearchSession searchSession = Search.session( entityManager );
            searchSession.massIndexer()
                    .startAndWait();
            return true;
        }catch ( InterruptedException ie){
            System.err.println(ie.getMessage());
            return false;
        }
    }

    public List<Colonia> search(String nombre){
        SearchSession searchSession = Search.session( entityManager );
        SearchResult<Colonia> result = searchSession.search( Colonia.class )
                .where( f -> f.match()
                        .field( "nombre" )
                        .matching( nombre )
                        .fuzzy() )
                .fetchAll();
        return result.hits();
    }
}
