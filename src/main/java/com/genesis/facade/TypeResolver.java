package com.genesis.facade;

import com.genesis.common.domain.DataType;

public interface TypeResolver {

    DataType resolve(String customerId);
}
