package com.tis.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tis.model.Train;

public interface TrainRepository extends JpaRepository<Train,Integer>{

}
