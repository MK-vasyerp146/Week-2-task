package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Entity.VasyERP;

@Repository
public interface VasyRepository extends JpaRepository<VasyERP, Integer> {

}
