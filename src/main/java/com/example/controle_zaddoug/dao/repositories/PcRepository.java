package com.example.controle_zaddoug.dao.repositories;


import com.example.controle_zaddoug.dao.entities.Pc;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PcRepository extends JpaRepository<Pc, Long> {

    public List<Pc> findByProce(String proce);

    public List<Pc> findByProceAndPrice(String proce, double price);
}