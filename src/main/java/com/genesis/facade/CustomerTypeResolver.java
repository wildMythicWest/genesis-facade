package com.genesis.facade;

import com.genesis.common.domain.DataType;
import org.springframework.stereotype.Service;

@Service
public class CustomerTypeResolver implements TypeResolver {

    @Override
    public DataType resolve(final String customerId) {
        return switch (customerId) {
            case "1" -> DataType.XML_V1;
            case "2" -> DataType.XML_V2;
            case "3" -> DataType.XML_V3;
            case "4" -> DataType.JSON_V1;
            case "5" -> DataType.JSON_V2;
            case "6" -> DataType.JSON_V3;
            case "7" -> DataType.RAW_V1;
            case "8" -> DataType.RAW_V2;
            case "9" -> DataType.RAW_V3;
            default -> DataType.RAW_DEFAULT;
        };
    }
}
