package com.example.controle_zaddoug.mapper;

import com.example.controle_zaddoug.dao.entities.Pc;
import com.example.controle_zaddoug.dto.PcDto;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;


@Component
public class PcMapper {

    private final ModelMapper mapper = new ModelMapper();
    public Pc fromPcDtoToPc(PcDto pcDto){
        return mapper.map(pcDto, Pc.class);
    }
    public PcDto fromPcToPcDto(Pc pc){
        return mapper.map(pc, PcDto.class);
    }

}