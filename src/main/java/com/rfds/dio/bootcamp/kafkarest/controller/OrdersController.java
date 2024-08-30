package com.rfds.dio.bootcamp.kafkarest.controller;

import com.rfds.dio.bootcamp.kafkarest.data.OrderData;
import com.rfds.dio.bootcamp.kafkarest.service.EventRegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrdersController {

    private final EventRegisterService eventRegisterService;

    public OrdersController(@Autowired EventRegisterService eventRegisterService) {
        this.eventRegisterService = eventRegisterService;
    }

    @PostMapping(path = "/api/save-order")
    public ResponseEntity<String> salvarPedido(@RequestBody OrderData order){
        eventRegisterService.addEvent("SalvarPedido", order);
        return ResponseEntity.ok("Success");
    }
}
