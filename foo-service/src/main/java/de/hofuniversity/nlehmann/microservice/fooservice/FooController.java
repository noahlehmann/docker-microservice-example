package de.hofuniversity.nlehmann.microservice.fooservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/")
public class FooController {

    private final FooRepository repository;

    @Autowired
    public FooController(FooRepository repository){
        this.repository = repository;
    }

    @GetMapping
    public ResponseEntity<List<FooEntity>> getFoos(){
        return ResponseEntity.ok(repository.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<FooEntity> getFooById(@PathVariable Long id){
        Optional<FooEntity> optional = repository.findById(id);
        if (optional.isEmpty()){
            return ResponseEntity.notFound().build();
        }else {
            return ResponseEntity.ok(optional.get());
        }
    }

}
