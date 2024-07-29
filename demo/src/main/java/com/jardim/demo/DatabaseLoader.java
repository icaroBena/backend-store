package com.jardim.demo;

import com.jardim.demo.entity.Product;
import com.jardim.demo.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DatabaseLoader implements CommandLineRunner {

    private final ProductRepository repository;

    @Autowired
    public DatabaseLoader(ProductRepository repository) {
        this.repository = repository;
    }

    @Override
    public void run(String... strings) throws Exception {
        this.repository.save(new Product("Adubo Orgânico", "Adubo de alta qualidade para preparação do solo", "preparacao-do-solo"));
        this.repository.save(new Product("Enxada", "Ferramenta essencial para preparação do solo", "preparacao-do-solo"));
        this.repository.save(new Product("Sementes de Árvores", "Sementes para plantação de árvores variadas", "plantacao-de-arvores"));
        this.repository.save(new Product("Regador", "Regador para manutenção de grama e plantas", "manutencao-de-grama"));
    }
}
