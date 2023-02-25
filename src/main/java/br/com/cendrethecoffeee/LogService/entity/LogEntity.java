package br.com.cendrethecoffeee.LogService.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
public class LogEntity {

    @Id
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
