package com.genesis.facade;

import com.genesis.common.domain.InputDataWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MapperServiceImpl implements MapperService {

    @Autowired
    private TypeResolver typeResolver;

    @Override
    public InputDataWrapper mapDataToType(String data, String customerId) {
        return InputDataWrapper.builder()
                .data(data)
                .type(typeResolver.resolve(customerId))
                .build();
    }
}
