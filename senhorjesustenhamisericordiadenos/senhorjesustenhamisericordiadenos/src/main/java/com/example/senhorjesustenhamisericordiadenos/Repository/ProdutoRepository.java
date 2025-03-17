package com.example.senhorjesustenhamisericordiadenos.Repository;
import com.example.senhorjesustenhamisericordiadenos.Entity.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
    List<Produto> findByNomeContaining(String nome);
}