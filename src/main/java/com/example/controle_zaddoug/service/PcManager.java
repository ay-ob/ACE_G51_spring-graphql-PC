package com.example.controle_zaddoug.service;


import com.example.controle_zaddoug.dao.entities.Pc;
import com.example.controle_zaddoug.dao.repositories.PcRepository;
import com.example.controle_zaddoug.dto.PcDto;
import com.example.controle_zaddoug.mapper.PcMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class PcManager implements PcService {

    private PcRepository pcRepository;
    private PcMapper pcMapper;

    @Override
    public PcDto savePc(PcDto pcDto) {

        Pc pc = pcMapper.fromPcDtoToPc(pcDto);
        pc = pcRepository.save(pc);
        pcDto = pcMapper.fromPcToPcDto(pc);
        return pcDto;
    }

    @Override
    public boolean deletePc(Long id) {
        try {
            pcRepository.deleteById(id);
            return true;
        } catch (Exception exception) {
            return false;
        }
    }

    @Override
    public List<PcDto> getPcByProce(String proce) {
        List<Pc> pcs = pcRepository.findByProce(proce);
        List<PcDto> pcDtos = new ArrayList<>();
        for (Pc pc : pcs) {
            pcDtos.add(pcMapper.fromPcToPcDto(pc));
        }
        return pcDtos;
    }

    @Override
    public List<PcDto> getPcByProceAndPrice(String proce, double price) {
        List<Pc> pcs = pcRepository.findByProceAndPrice(proce, price);
        List<PcDto> pcDtos = new ArrayList<>();
        for (Pc pc : pcs) {
            pcDtos.add(pcMapper.fromPcToPcDto(pc));
        }
        return pcDtos;
    }

    @Override
    public List<PcDto> savePcs(List<PcDto> pcDtos) {

        List<Pc> pcs = new ArrayList<>();
        for (PcDto pcDto : pcDtos) {
            pcs.add(pcMapper.fromPcDtoToPc(pcDto));
        }

        pcs = pcRepository.saveAll(pcs);

        pcDtos = new ArrayList<>();
        for (Pc pc : pcs) {
            pcDtos.add(pcMapper.fromPcToPcDto(pc));
        }
        return pcDtos;
    }
}
