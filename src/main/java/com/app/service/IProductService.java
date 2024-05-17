package com.app.service;
import com.app.entities.Product;
import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

public interface IProductService {
    List<Product> findAll();

    Optional<Product> findById(Long id);

    void save(Product product);

    void delete(Product product);

    List<Product> findByPriceInRange(BigDecimal min, BigDecimal max);
}
