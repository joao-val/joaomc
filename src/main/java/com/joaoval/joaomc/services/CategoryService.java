package com.joaoval.joaomc.services;

import com.joaoval.joaomc.domain.Category;
import com.joaoval.joaomc.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository repo;

    public Category search(Integer id) {
        Optional<Category> obj = repo.findById(id);
        return obj.orElse(null);
    }

}
