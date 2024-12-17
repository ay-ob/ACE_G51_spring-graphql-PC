package com.example.controle_zaddoug.web;


import com.example.controle_zaddoug.dto.PcDto;
import com.example.controle_zaddoug.service.PcService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.graphql.data.method.annotation.QueryMapping;

import java.util.List;

@RestController
@AllArgsConstructor
public class PcGraphQLController {

    private PcService pcService ;

    @MutationMapping
    public PcDto savePc(@Argument @Valid PcDto pc){
        return pcService.savePc(pc);
    }

    @MutationMapping
    public Boolean deletePc(@Argument Long id){
        return pcService.deletePc(id);
    }


    @QueryMapping
    public List<PcDto> getPcByProce(@Argument String proce){
        return pcService.getPcByProce(proce);
    }

    @QueryMapping
    public List<PcDto> getPcByProceAndPrice(@Argument String proce, @Argument double price){
        return pcService.getPcByProceAndPrice(proce, price);
    }
}