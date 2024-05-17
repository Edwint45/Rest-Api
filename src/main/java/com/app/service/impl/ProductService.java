package com.app.service.impl;

import com.app.entities.Product;
import com.app.persistence.IProductDAO;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

@Service
public class ProductService implements IProductDAO {

    private IProductDAO productDAO;



    @Override
    public List<Product> findAll() {
        return productDAO.findAll();
    }

    @Override
    public Optional<Product> findById(Long id) {
        return productDAO.findById(id);

    }

    @Override
    public void save(Product product) {
        productDAO.save(product);
    }

    @Override
    public void delete(Product product) {
        productDAO.delete(product);
    }

    @Override
    public List<Product> findByPriceInRange(BigDecimal min, BigDecimal max) {
        return productDAO.findByPriceInRange(min, max);
    }
}
