package com.example.controle_zaddoug;

import com.example.controle_zaddoug.dto.PcDto;
import com.example.controle_zaddoug.service.PcService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class ControleZaddougApplication {

	public static void main(String[] args) {
		SpringApplication.run(ControleZaddougApplication.class, args);
	}
	@Bean
	CommandLineRunner start(PcService pcService){
		return  args -> {
			pcService.savePcs(
					List.of(
							PcDto.builder().proce("p").ram("r8").price(9000).build()
					)

			);
		};
	}
}
