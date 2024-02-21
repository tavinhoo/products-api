package com.example.springboot.models;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "CATEGORY")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class CategoryModel {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_category;
    @Column(nullable = false)
    private String name;

    @OneToMany(mappedBy = "category")
    private List<ProductModel> productModelList;
}
