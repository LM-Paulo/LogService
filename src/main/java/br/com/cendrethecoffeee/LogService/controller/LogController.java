package br.com.cendrethecoffeee.LogService.controller;

import br.com.cendrethecoffeee.LogService.dto.LogDto;
import br.com.cendrethecoffeee.LogService.service.LogService;
import jakarta.persistence.NoResultException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.jboss.logging.Logger;

@RestController
@RequestMapping("api/log")
public class LogController {

    static Logger logger = Logger.getLogger(LogController.class.getName());

    @Autowired
    LogService logService;


    @PostMapping("resgister-transaction")
    public ResponseEntity<?> registerTransaction(@RequestBody LogDto logDto){
        try {
            logService.registerTransaction(logDto);
        }catch (Exception ex){
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("unable to create transaction record -> ");
            stringBuilder.append(ex.getMessage());
            logger.log(Logger.Level.ERROR,stringBuilder);
            return ResponseEntity.ok(stringBuilder.toString());
        }
        return ResponseEntity.ok("Transaction created successfully");

    }


    @GetMapping("list-transactions")
    public ResponseEntity<?> listTransactions(@RequestParam("properties") String properties,
                                              @RequestParam("direction")  Sort.Direction direction,
                                              @RequestParam("page") Integer page,
                                              @RequestParam("size") Integer size){
        try {
            return ResponseEntity.ok(logService.listTransactions(direction,properties,page,size));
        }catch (NoResultException ex){
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Isn't possible the perform a select! Cause -> ");
            stringBuilder.append(ex.getMessage());
            return ResponseEntity.ok(stringBuilder.toString());
        }
    }
}
