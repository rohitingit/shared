package com.shared.common.decode;


import java.io.IOException;

import org.apache.commons.io.IOUtils;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.http.HttpStatus;

import com.shared.common.exception.RequestException;

import feign.Response;
import feign.codec.ErrorDecoder;

/**
 * @author Rohit
 *
 */
public class FeignErrorDecoder implements ErrorDecoder {

	private ErrorDecoder delegate = new ErrorDecoder.Default();
	
	@Override
	public RequestException decode(String methodKey, Response response) {
        HttpStatus statusCode = HttpStatus.valueOf(response.status());
        String message;
        String responseMessage;
        byte[] responseBody;
        try {
            responseBody = IOUtils.toByteArray(response.body().asInputStream());
            message = new String(responseBody);
            JSONObject jsonObj = new JSONObject(message);
            responseMessage = (String) jsonObj.get("responseMessage");
            if(responseMessage.trim().isEmpty()){
            	responseMessage = "Internal server error";
            	statusCode = HttpStatus.INTERNAL_SERVER_ERROR;
            }
        } catch (IOException | JSONException e) {
            throw new RuntimeException("Failed to process response body.", e);
        }

        if (response.status() >= 400 && response.status() <= 599) {
            return new RequestException(responseMessage, statusCode);
        }
        return (RequestException) delegate.decode(methodKey, response);
	}
}

