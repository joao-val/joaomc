package com.joaoval.joaomc.domain;

import com.joaoval.joaomc.domain.enums.PaymentStatus;

import javax.persistence.Entity;

@Entity
public class CardPayment extends Payment{
    static public final long serialVersionUID = 1L;

    private Integer numberOfInstallments;

    public CardPayment() {
    }

    public CardPayment(Integer id, PaymentStatus status, Order order, Integer numberOfInstallments) {
        super(id, status, order);
        this.numberOfInstallments = numberOfInstallments;
    }

    public Integer getNumberOfInstallments() {
        return numberOfInstallments;
    }

    public void setNumberOfInstallments(Integer numberOfInstallments) {
        this.numberOfInstallments = numberOfInstallments;
    }
}
