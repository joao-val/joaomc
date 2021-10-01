package com.joaoval.joaomc.domain;

import com.joaoval.joaomc.domain.enums.PaymentStatus;

import javax.persistence.Entity;
import java.util.Date;

@Entity
public class PaymentWithBankSlip extends Payment{
    static public final long serialVersionUID = 1L;

    private Date dueDate;
    private Date paymentDate;

    public PaymentWithBankSlip() {
    }

    public PaymentWithBankSlip(Integer id, PaymentStatus status, Order order, Date dueDate, Date paymentDate) {
        super(id, status, order);
        this.dueDate = dueDate;
        this.paymentDate = paymentDate;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public Date getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(Date paymentDate) {
        this.paymentDate = paymentDate;
    }
}
