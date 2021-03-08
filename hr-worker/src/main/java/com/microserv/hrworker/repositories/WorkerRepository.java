package com.microserv.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.microserv.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long>{

}
