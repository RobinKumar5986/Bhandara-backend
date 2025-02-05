package com.bhandara.bhandara_api.response;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
/**
 * @author robin kumar
 * */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class RestResponse<T> {

    private T data;

    private RestStatus status;

    private String code;

    private String message;

    // private PageMetadata pageMetadata;


    public static <T> RestResponse<T> ok( T data){
        return standard(RestStatus.SUCCESS, data, null, null);
    }

    public static <T> RestResponse<T> error(String message, String errorCode){
        return standard(RestStatus.ERROR, null, message, errorCode);
    }

    public static <T> RestResponse<T> failed(String message, String errorCode){
        return standard(RestStatus.FAIL, null, message, errorCode);
    }

    public static <T> RestResponse<T> standard(RestStatus status, T data, String message, String code){
        return new RestResponse<T>(data, status, code, message);
    }

    public static <T> RestResponse<T> badRequest(String errors) {
        RestResponse<T> response = new RestResponse<>();
        response.setStatus(RestStatus.BAD_REQUEST);
        response.setMessage(errors);
        return response;
    }

    public static <T> RestResponse<T> badRequest() {
        RestResponse<T> response = new RestResponse<>();
        response.setStatus(RestStatus.BAD_REQUEST);
        return response;
    }

    public static <T> RestResponse<T> ok() {
        RestResponse<T> response = new RestResponse<>();
        response.setStatus(RestStatus.SUCCESS);
        return response;
    }

	/*public static <T> Response<T> ok(T payload) {
		Response<T> response = new Response<>();
		response.setStatus(Response.Status.OK);
		response.setPayload(payload);
		return response;
	}*/

    public static <T> RestResponse<T> unauthorized() {
        RestResponse<T> response = new RestResponse<>();
        response.setStatus(RestStatus.UNAUTHORIZED);
        return response;
    }

    public static <T> RestResponse<T> validationException() {
        RestResponse<T> response = new RestResponse<>();
        response.setStatus(RestStatus.VALIDATION_EXCEPTION);
        return response;
    }

    public static <T> RestResponse<T> wrongCredentials() {
        RestResponse<T> response = new RestResponse<>();
        response.setStatus(RestStatus.WRONG_CREDENTIALS);
        return response;
    }

    public static <T> RestResponse<T> accessDenied() {
        RestResponse<T> response = new RestResponse<>();
        response.setStatus(RestStatus.ACCESS_DENIED);
        return response;
    }

    public static <T> RestResponse<T> exception() {
        RestResponse<T> response = new RestResponse<>();
        response.setStatus(RestStatus.EXCEPTION);
        return response;
    }

    public static <T> RestResponse<T> notFound() {
        RestResponse<T> response = new RestResponse<>();
        response.setStatus(RestStatus.NOT_FOUND);
        return response;
    }

    public static <T> RestResponse<T> duplicateEntity() {
        RestResponse<T> response = new RestResponse<>();
        response.setStatus(RestStatus.DUPLICATE_ENTITY);
        return response;
    }

    public void addErrorMsgToResponse(String errorMsg, Exception ex) {
        setMessage(errorMsg);
    }

}

