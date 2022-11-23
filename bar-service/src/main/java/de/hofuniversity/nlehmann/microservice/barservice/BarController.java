package de.hofuniversity.nlehmann.microservice.barservice;

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
public class BarController {

    private final BarRepository repository;

    @Autowired
    public BarController(BarRepository repository){
        this.repository = repository;
    }

    @GetMapping
    public ResponseEntity<List<BarEntity>> getBars(){
        return ResponseEntity.ok(repository.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<BarEntity> getBarById(@PathVariable Long id){
        Optional<BarEntity> optional = repository.findById(id);
        if (optional.isEmpty()){
            return ResponseEntity.notFound().build();
        }else {
            return ResponseEntity.ok(optional.get());
        }
    }

}
