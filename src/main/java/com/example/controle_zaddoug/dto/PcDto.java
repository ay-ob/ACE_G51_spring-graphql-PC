package com.example.controle_zaddoug.dto;


import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

@Builder
@ToString

public class PcDto {
    private String proce;
    private String ram;
    private String hardDrave;
    private double price;
    private String macAddress;
}