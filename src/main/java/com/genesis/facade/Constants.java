package com.genesis.facade;

public class Constants {

    public static class RabbitMQ {
        public static final String TOPIC_EXCHANGE_NAME = "input-exchange";

        public static final String QUEUE_NAME = "input-queue";

        public static final String ROUTING_PREFIX = "input.";
        public static final String ROUTING_KEY = ROUTING_PREFIX + "#";
    }
}
