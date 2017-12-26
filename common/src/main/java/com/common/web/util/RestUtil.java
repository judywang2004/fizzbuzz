package com.common.web.util;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.HttpStatusCodeException;

import com.common.web.exceptions.ValidationException;

public final class RestUtil {

    private RestUtil() {
        throw new AssertionError();
    }

    //
   

    /**
     * This is to be used when an exception is
     * 
     * @param ex
     *            the not client status code exception.
     * @param message
     *            the message to show if failed to created
     */
    public static void propagateStatusCodeOnException(final HttpStatusCodeException ex, final String message) {
        if (ex.getStatusCode().value() == 409) {
            throw new ValidationException(ex.getStatusText());
        }

        throw new IllegalStateException(message);
    }
}
