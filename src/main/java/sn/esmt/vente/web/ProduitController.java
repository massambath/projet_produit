package sn.esmt.vente.web;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import sn.esmt.vente.entity.ProduitEntity;
import sn.esmt.vente.service.ProduitService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("produits")
@AllArgsConstructor
public class ProduitController {
  private ProduitService produitService;
  @PostMapping
  public ProduitEntity save(ProduitEntity produitEntity) {
    return produitService.save(produitEntity);
  }
  @GetMapping
  public List<ProduitEntity> all(){
    return produitService.getAll().get();
  }
  @PutMapping
  public ProduitEntity update(String ref , ProduitEntity produitEntity){
    return produitService.update(ref,produitEntity);
  }
  @DeleteMapping
  public void delete(String ref){
    produitService.delete(ref);
    produitService.getAll();
  }
  @GetMapping("/recherche{ref}")
  public Optional<List<ProduitEntity>> search(@RequestParam String ref){
    return produitService.getAll();
  }

}
