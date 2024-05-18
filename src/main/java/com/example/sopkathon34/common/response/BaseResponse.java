package com.example.sopkathon34.common.response;


public record BaseResponse<T>(
        int status,
        String message,
        T data
) {

    public static BaseResponse<Void> success(SuccessMessage successMessage) {
        return new BaseResponse<Void>(successMessage.getStatus(),successMessage.getMessage(), null);
    }

    public static <T> BaseResponse<T> success(SuccessMessage successMessage, T data) {
        return new BaseResponse<T>(successMessage.getStatus(), successMessage.getMessage(),data);
    }

    public static <T> BaseResponse<T> fail(String message) {
        return new BaseResponse<T>(400, message, null);
    }

}
