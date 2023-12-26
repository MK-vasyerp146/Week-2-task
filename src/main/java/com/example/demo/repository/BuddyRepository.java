package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Entity.Buddy;

@Repository
public interface BuddyRepository extends JpaRepository<Buddy, Integer>{

}
