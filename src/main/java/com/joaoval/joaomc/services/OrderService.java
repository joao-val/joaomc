package com.joaoval.joaomc.services;

import com.joaoval.joaomc.domain.Order;
import com.joaoval.joaomc.repositories.OrderRepository;
import com.joaoval.joaomc.services.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    private OrderRepository repo;

    public Order search(Integer id) {
        Optional<Order> obj = repo.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException(
                "Object not found! Id: " + id + ", Type: " + Order.class.getName()));
    }
}
