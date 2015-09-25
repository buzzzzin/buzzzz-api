package in.buzzzz.v1.data.response;

import in.buzzzz.data.response.ResponseData;

public class ResponseDto implements ResponseData {

    private String message;
    private Object data;
    private Integer status = 1;

    public ResponseDto() {
    }

    public ResponseDto(Object data) {
        if (data != null) {
            this.data = data;
        } else {
            this.data = "";
        }
    }

    public ResponseDto(Object data, String message) {
        this.data = data;
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
