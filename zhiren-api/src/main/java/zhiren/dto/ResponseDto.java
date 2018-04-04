package zhiren.dto;

public class ResponseDto {
    private Boolean IsSuccess;
    private String Msg;
    private Object ResponseData;

    public ResponseDto(){

    }

    public ResponseDto(Boolean isSuccess, String msg, Object responseData) {
        IsSuccess = isSuccess;
        Msg = msg;
        ResponseData = responseData;
    }

    public Boolean getSuccess() {
        return IsSuccess;
    }

    public void setSuccess(Boolean success) {
        IsSuccess = success;
    }

    public String getMsg() {
        return Msg;
    }

    public void setMsg(String msg) {
        Msg = msg;
    }

    public Object getResponseData() {
        return ResponseData;
    }

    public void setResponseData(Object responseData) {
        ResponseData = responseData;
    }
}
