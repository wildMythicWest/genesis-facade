package com.genesis.facade;

import com.genesis.common.domain.InputDataWrapper;

public interface MapperService {

    InputDataWrapper mapDataToType(String data, String customerId);
}
