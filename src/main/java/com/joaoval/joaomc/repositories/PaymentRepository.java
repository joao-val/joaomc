package com.joaoval.joaomc.repositories;

import com.joaoval.joaomc.domain.Address;
import com.joaoval.joaomc.domain.Payment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentRepository extends JpaRepository<Payment, Integer> {

}
