package br.dev.mcs.hrpayroll.services;

import br.dev.mcs.hrpayroll.entities.Payment;
import br.dev.mcs.hrpayroll.entities.Worker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@Service
public class PaymentServices {

    @Value("${hr-worker.host}")
    private String workerHost;

    @Autowired
    private RestTemplate restTemplate;

    public Payment getPayment(Long workerId, int days){
        Map<String, String> uriVarebles = new HashMap<>();
        uriVarebles.put("id",""+workerId);

        Worker worker = restTemplate.getForObject(workerHost + "/workers/{id}", Worker.class, uriVarebles);
        return new Payment(worker.getName(), worker.getDailyIncome(), days);
    }
}
