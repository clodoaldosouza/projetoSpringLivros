package com.souza.livros.services;

import com.souza.livros.model.Livro;
import com.souza.livros.repository.LivroRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class LivroService {
    private final LivroRepository livroRepository;

    @Autowired
    public LivroService(LivroRepository livroRepository) {
        this.livroRepository = livroRepository;
    }

    public Livro create(Livro livro) {
        log.info("ASIN: {}, ISBN: {}, autor: {}, titulo: {}", livro.getAsin(), livro.getIsbn(), livro.getAutor(), livro.getTitulo());
        livroRepository.save(livro);
        return livro;
    }

    public List<Livro> listAll() {
        return livroRepository.findAll();
    }
}
