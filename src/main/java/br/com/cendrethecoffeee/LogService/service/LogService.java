package br.com.cendrethecoffeee.LogService.service;

import br.com.cendrethecoffeee.LogService.dto.LogDto;
import br.com.cendrethecoffeee.LogService.entity.LogEntity;
import br.com.cendrethecoffeee.LogService.repository.LogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

@Service
public class LogService {

    @Autowired
    LogRepository logRepository;

    public void registerTransaction(LogDto logDto) {
        LogEntity logEntity = new LogEntity();
        logEntity.ToEntity(logDto);
        logRepository.save(logEntity);
    }

    public Page<LogEntity> listTransactions(Sort.Direction direction, String properties, Integer page, Integer size){
        Pageable pageable = PageRequest.of(page,size, Sort.by(direction, properties));
        return logRepository.findAll(pageable);
    }

}
