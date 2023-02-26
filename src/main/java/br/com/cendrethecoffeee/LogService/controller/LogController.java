package br.com.cendrethecoffeee.LogService.controller;

import br.com.cendrethecoffeee.LogService.service.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class LogController {

    @Autowired
    LogService logService;
}
