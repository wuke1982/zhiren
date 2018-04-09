package zhiren.web;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import zhiren.dto.BaseRespDTO;
import zhiren.dto.ResultStatus;
import zhiren.service.DemoService;

import java.util.concurrent.CompletableFuture;

/**
 * @author zh
 * @ClassName zhiren.web.DemoController
 * @Description
 */
@Api(value = "测试", description = "仅仅用于测试")
@RestController
public class DemoController {

    @Autowired
    private DemoService demoService;
    /**
     * 根据ID查询用户
     * @param id
     * @return
     */
    @ApiOperation(value="获取用户详细信息", notes="根据url的id来获取用户详细信息")
    @ApiImplicitParam(name = "id", value = "用户ID", required = true, dataType = "Integer", paramType = "path")
    @RequestMapping(value = "/saveUserInfo",method = RequestMethod.GET)
    public CompletableFuture<BaseRespDTO<String>> saveUserInfo(Integer id){
        return  CompletableFuture.supplyAsync(() -> {
            demoService.demo();
            return new BaseRespDTO(ResultStatus.SUCCESS.getErrorCode(),"ok","hahhahah");
        });
    }
}
