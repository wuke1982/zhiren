package zhiren.filter;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import zhiren.dto.ResponseDto;

@ControllerAdvice
public class ExceptionHandle {

    /* 表明这个handler只处理什么类型的异常
     * */
    @ExceptionHandler
    // 返回值为json或者其他对象
    @ResponseBody
    public ResponseDto handle(Exception e) {
        return new ResponseDto(false,e.getMessage(),null);
    }
}

