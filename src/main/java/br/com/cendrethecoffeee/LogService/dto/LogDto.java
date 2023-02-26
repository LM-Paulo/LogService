package br.com.cendrethecoffeee.LogService.dto;



import lombok.Data;

import java.time.LocalDateTime;

@Data
public class LogDto {

    private String responsibleUser;

    private String modifierObject ;

    private String changeDescription;

    private String modifiedObjectId;

   private LocalDateTime modificationDate;
}
