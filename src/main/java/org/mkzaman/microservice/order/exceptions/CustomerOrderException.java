package org.mkzaman.microservice.order.exceptions;

import org.zalando.problem.AbstractThrowableProblem;

import static org.zalando.problem.Status.BAD_REQUEST;
import static org.zalando.problem.Status.INTERNAL_SERVER_ERROR;

public class CustomerOrderException extends AbstractThrowableProblem {
    public CustomerOrderException(final String uuid, final String reason) {
        super(ErrorConstants.CUSTOMER_MICROSERVICE, "Customer Microservice Error", INTERNAL_SERVER_ERROR, String.format("For Order UUID: %s, Customer Microservice Messageg: %s", uuid, reason));
    }

    public CustomerOrderException(final String uuid, final int response) {
        super(ErrorConstants.CUSTOMER_MICROSERVICE, "Customer Microservice Bad Request", BAD_REQUEST, String.format("For Order UUID: %s, Customer Microservice Response: %d", uuid, response));
    }
}
