package com.example.controle_zaddoug.service;

import com.example.controle_zaddoug.dto.PcDto;

import java.util.List;

public interface PcService {
    public PcDto savePc(PcDto pcDto);

    public boolean deletePc(Long id);

    public List<PcDto> getPcByProce(String model);

    public List<PcDto> getPcByProceAndPrice(String proce, double price);

    public List<PcDto> savePcs(List<PcDto> pcDtos);

}