package com.joaoval.joaomc.dto;

import com.joaoval.joaomc.domain.Category;

import java.io.Serializable;

public class CategoryDTO implements Serializable {
    static public final long serialVersionUID = 1L;

    private Integer id;
    private String name;

    public CategoryDTO(){
    }

    public CategoryDTO(Category obj){
        id = obj.getId();
        name = obj.getName();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
