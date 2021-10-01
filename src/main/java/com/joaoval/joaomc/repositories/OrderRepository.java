package com.joaoval.joaomc.repositories;

import com.joaoval.joaomc.domain.Category;
import com.joaoval.joaomc.domain.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order, Integer> {

}
