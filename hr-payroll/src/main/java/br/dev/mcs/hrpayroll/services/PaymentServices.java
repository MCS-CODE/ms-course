package br.dev.mcs.hrpayroll.services;

import br.dev.mcs.hrpayroll.entities.Payment;
import br.dev.mcs.hrpayroll.entities.Worker;
import br.dev.mcs.hrpayroll.feignclients.WorkerFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class PaymentServices {

    @Autowired
    private WorkerFeignClient workerFeignClient;

    public Payment getPayment(Long workerId, int days){

        Worker worker = workerFeignClient.findById(workerId).getBody();
        return new Payment(worker.getName(), worker.getDailyIncome(), days);
    }
}
