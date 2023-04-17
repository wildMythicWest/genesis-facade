package com.genesis.facade;

import com.genesis.common.domain.InputDataWrapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.function.StreamBridge;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class InputController {

    private final MapperService mapperService;
    private final StreamBridge streamBridge;

    public InputController(StreamBridge streamBridge, MapperService mapperService) {
        this.streamBridge = streamBridge;
        this.mapperService = mapperService;
    }

    @PostMapping("/api/v0/submit")
    public ResponseEntity<InputDataWrapper> submitData(@RequestBody final String data) {
        log.info("Sending data to topic {}", data);
        final InputDataWrapper dataWrapper = mapperService.mapDataToType(data,"1");
        streamBridge.send(Constants.RabbitMQ.QUEUE_NAME, dataWrapper);
        return ResponseEntity.ok(dataWrapper);
    }

}
