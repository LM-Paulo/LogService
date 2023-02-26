package br.com.cendrethecoffeee.LogService.service;

import br.com.cendrethecoffeee.LogService.entity.LogEntity;
import br.com.cendrethecoffeee.LogService.repository.LogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LogService {

    @Autowired
    LogRepository logRepository;

    public void registerTransaction(LogEntity logEntity) {
        logRepository.save(logEntity);
    }
}
