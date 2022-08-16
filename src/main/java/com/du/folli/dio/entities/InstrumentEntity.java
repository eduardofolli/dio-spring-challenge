package com.du.folli.dio.entities;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Set;

@Entity
@Table(name = "instruments")
@Data
public class InstrumentEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull(message = "Instrument name could not be null value")
    private String nome;

    @NotNull(message = "status could not be null value")
    private String status;

    @NotNull(message = "categoria could not be null value")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(nullable = false)
    private CategoryEntity categoria;


}
