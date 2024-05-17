package com.app.service.impl;

import com.app.entities.Maker;
import com.app.persistence.IMakerDAO;
import com.app.service.IMakerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MakerService implements IMakerService {
    @Autowired
    private IMakerDAO iMakerDAO;
    @Override
    public Optional<Maker> findById(Long id) {
        return iMakerDAO.findById(id);
    }

    @Override
    public List<Maker> findAll() {
        return iMakerDAO.findAll();
    }

    @Override
    public void save(Maker maker) {
        iMakerDAO.save(maker);
    }

    @Override
    public void deleteById(Long id) {
        iMakerDAO.deleteById(id);
    }
}
