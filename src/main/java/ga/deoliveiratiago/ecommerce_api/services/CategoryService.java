package ga.deoliveiratiago.ecommerce_api.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ga.deoliveiratiago.ecommerce_api.domain.Category;
import ga.deoliveiratiago.ecommerce_api.repositories.CategoryRepository;

@Service
public class CategoryService {
  @Autowired
  private CategoryRepository repository;

  public Category find(Integer id) {
    Optional<Category> obj = repository.findById(id);
    return obj.orElse(null);
  }
}
