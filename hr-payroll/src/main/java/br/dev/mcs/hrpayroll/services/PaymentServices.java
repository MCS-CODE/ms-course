package br.dev.mcs.hrpayroll.services;

import br.dev.mcs.hrpayroll.entities.Payment;
import org.springframework.stereotype.Service;

@Service
public class PaymentServices {
    public Payment getPayment(Long workerId, int days){
        return new Payment("Bob", 100.0, days);
    }
}
