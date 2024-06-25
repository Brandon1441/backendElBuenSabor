package com.example.backendElBuenSabor.controllers;
import com.example.backendElBuenSabor.services.BaseService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.backendElBuenSabor.entities.Base;
import java.io.Serializable;
import java.util.List;
import java.util.Optional;

public abstract class BaseController <E extends Base, ID extends Serializable >{
    protected BaseService<E, ID> service;

    public BaseController(BaseService<E, ID> service){
        this.service =service;
    }

    @PostMapping()
    public ResponseEntity<E> create(@RequestBody E entity) throws Exception{
        E entidadCreada = service.crear(entity);
        return ResponseEntity.ok(entidadCreada);
    }
    @GetMapping("{id}")
    public Optional<E> getById(@PathVariable ID id) throws Exception{
        return service.buscarPorId(id);
    }

    @GetMapping()
    public ResponseEntity<List<E>> list() throws Exception{
        List<E> entities = service.listar();
        return ResponseEntity.ok(entities);
    }
    @PutMapping()
    public ResponseEntity<E> update(@RequestBody E entity) throws Exception{
        E entidadAct = service.actualizar(entity);
        return ResponseEntity.ok(entidadAct);
    }
    @DeleteMapping("{id}")
    public void delete(@PathVariable ID id) throws Exception{
        service.eliminar(id);
    }
}
