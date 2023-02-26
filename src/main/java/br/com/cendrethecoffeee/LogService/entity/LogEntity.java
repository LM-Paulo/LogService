package br.com.cendrethecoffeee.LogService.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Data
public class LogEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private String responsibleUser;

    @Column(nullable = false)
    private String modifierObject ;

    @Column(nullable = false)
    private String changeDescription;

    @Column(nullable = false)
    private String modifieldObjectId;

    @Column(nullable = false)
    private LocalDateTime modificationDate;



}
