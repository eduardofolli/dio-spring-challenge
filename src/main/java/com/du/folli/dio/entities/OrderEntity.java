package com.du.folli.dio.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;

@Entity
@Table(name = "pedidos")
@Data
public class OrderEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id = null;

    @NotNull(message = "quantidade could not be null value")
    private Integer quantidade = null;

    @NotNull(message = "dataEnvio could not be null value")
    private LocalDateTime dataEnvio = null;

    @NotNull(message = "instrument could not be null value")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(nullable = false)
    private InstrumentEntity instrument;


}
