package br.dev.mcs.hrworker.repositories;

import br.dev.mcs.hrworker.entities.Worker;
import org.springframework.data.jpa.repository.JpaRepository;

//Interface that record data in the database
public interface WorkerRepository extends JpaRepository<Worker, Long> {
}
