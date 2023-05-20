package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.dto.Sample;

public interface SampleRepository extends JpaRepository<Sample, Integer> {

}
