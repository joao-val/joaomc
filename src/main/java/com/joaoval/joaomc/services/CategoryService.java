package com.joaoval.joaomc.services;

import com.joaoval.joaomc.domain.Category;
import com.joaoval.joaomc.repositories.CategoryRepository;
import com.joaoval.joaomc.services.exception.DataIntegrityException;
import com.joaoval.joaomc.services.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository repo;

    public Category search(Integer id) {
        Optional<Category> obj = repo.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException(
                "Object not found! Id: " + id + ", Type: " + Category.class.getName()));
    }

    public Category insert(Category obj) {
        obj.setId(null);
        return repo.save(obj);
    }

    public Category update(Category obj) {
        search(obj.getId());
        return repo.save(obj);
    }

    public void delete(Integer id){
        repo.findById(id);
        try {
            repo.deleteById(id);
        }
        catch (DataIntegrityViolationException e) {
            throw new DataIntegrityException("It is not possible to delete a category that has products");
        }
    }

    public List<Category> findAll(){
        return repo.findAll();
    }

}
