package com.pedidos360.ms_pedidos360_catalog.modelo;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "PRODUCTS")
@Data // Anotación de Lombok que genera Getters, Setters y Constructores
public class Product {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String name;
    private String category;
    private Double price;
    private Integer stock;
    private String image;
    private String description;
}