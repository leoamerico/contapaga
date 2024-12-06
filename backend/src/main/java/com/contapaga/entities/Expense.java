package com.contapaga.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "expenses")
public class Expense {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private Double value;

    @Column(nullable = false)
    private String description; 

    @ManyToOne
    @JoinColumn(name = "category_id", nullable = false)
    private Category category; 

    @ManyToOne
    @JoinColumn(name = "sub_category_id")
    private SubCategory subCategory; 

}
