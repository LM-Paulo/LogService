package br.com.cendrethecoffeee.LogService.entity;

import br.com.cendrethecoffeee.LogService.dto.LogDto;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Data
public class LogEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

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

    public void ToEntity(LogDto logDto){
        this.responsibleUser = logDto.getResponsibleUser();
        this.modifierObject = logDto.getModifierObject();
        this.changeDescription = logDto.getChangeDescription();
        this.modifieldObjectId = logDto.getModifieldObjectId();
        this.modificationDate = logDto.getModificationDate();
    }



}
