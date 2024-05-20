package com.app.service.impl;

import com.app.entities.Product;
import com.app.persistence.IProductDAO;
import com.app.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

@Service
public class ProductService implements IProductService {

    @Autowired
    private IProductDAO iProductDAO;



    @Override
    public List<Product> findAll() {
        return iProductDAO.findAll();
    }

    @Override
    public Optional<Product> findById(Long id) {
        return iProductDAO.findById(id);

    }

    @Override
    public void save(Product product) {
        iProductDAO.save(product);
    }

    @Override
    public void delete(Product product) {
        iProductDAO.delete(product);
    }

    @Override
    public List<Product> findByPriceInRange(BigDecimal min, BigDecimal max) {
        return iProductDAO.findByPriceInRange(min, max);
    }
}
