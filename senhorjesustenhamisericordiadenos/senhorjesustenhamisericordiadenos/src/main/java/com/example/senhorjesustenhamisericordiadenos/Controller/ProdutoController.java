package com.example.senhorjesustenhamisericordiadenos.Controller;
package com.example.senhorjesustenhamisericordiadenos.Repository;
import com.example.senhorjesustenhamisericordiadenos.Entity.Produto;
import com.example.senhorjesustenhamisericordiadenos.Repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    @Autowired
    private ProdutoRepository produtoRepository;

    @PostMapping
    public Produto criarProduto(@RequestBody Produto produto) {
        return produtoRepository.save(produto);
    }

    @PutMapping("/{id}")
    public Produto atualizarProduto(@PathVariable Long id, @RequestBody Produto produto) {
        produto.setId(id);
        return produtoRepository.save(produto);
    }

    @DeleteMapping("/{id}")
    public void deletarProduto(@PathVariable Long id) {
        produtoRepository.deleteById(id);
    }

    @GetMapping("/{id}")
    public Optional<Produto> buscarProdutoPorId(@PathVariable Long id) {
        return produtoRepository.findById(id);
    }

    @GetMapping
    public List<Produto> buscarTodosProdutos() {
        return produtoRepository.findAll();
    }

    @GetMapping("/nome/{nome}")
    public List<Produto> buscarProdutosPorNome(@PathVariable String nome) {
        return produtoRepository.findByNomeContaining(nome);
    }
}