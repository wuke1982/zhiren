package zhiren.filter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import zhiren.dto.BaseRespDTO;
import zhiren.dto.ResultStatus;

@ControllerAdvice
public class ExceptionHandle {

    private Logger logger =  LoggerFactory.getLogger(this.getClass());

    /* 表明这个handler只处理什么类型的异常
     * */
    @ExceptionHandler
    // 返回值为json或者其他对象
    @ResponseBody
    public BaseRespDTO<?> handle(Exception e) {
        logger.error("", e);
        BaseRespDTO baseResp = new BaseRespDTO();
        baseResp.setMessage(e.getMessage());
        if (e instanceof org.springframework.web.servlet.NoHandlerFoundException) {
            baseResp.setCode(ResultStatus.http_status_not_found.getErrorCode());
        } else {
            baseResp.setCode(ResultStatus.http_status_internal_server_error.getErrorCode());
        }
        baseResp.setData("");
        return baseResp;
    }
}

