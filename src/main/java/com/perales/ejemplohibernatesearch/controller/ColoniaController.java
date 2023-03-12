package com.perales.ejemplohibernatesearch.controller;

import com.perales.ejemplohibernatesearch.entity.Colonia;
import com.perales.ejemplohibernatesearch.service.ColoniaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("/colonia")
public class ColoniaController {
    @Autowired
    private ColoniaService coloniaService;

    @GetMapping("/index")
    private boolean index(){
        return coloniaService.index();
    }

    @GetMapping("/{nombre}")
    List<Colonia> search(@PathVariable String nombre){
        return coloniaService.search(nombre);
    }
}
