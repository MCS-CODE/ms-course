package br.dev.mcs.hrworker.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity //Indicate that it is an Entity monitored by JPA.
@Table(name = "tb_worker") //Creating table and naming.
public class Worker {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //For id be generated auto.
    private Long id;
    private String name;
    private Double dailyIncome;

    public Worker() {}

    public Worker(Long id, String name, Double dalyIncome) {
        this.id = id;
        this.name = name;
        this.dailyIncome = dalyIncome;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getDailyIncome() {
        return dailyIncome;
    }

    public void setDailyIncome(Double dailyIncome) {
        this.dailyIncome = dailyIncome;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Worker)) return false;
        Worker worker = (Worker) o;
        return Objects.equals(getId(), worker.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}
