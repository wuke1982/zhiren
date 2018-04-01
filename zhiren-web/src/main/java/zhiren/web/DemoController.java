package zhiren.web;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zh
 * @ClassName zhiren.web.DemoController
 * @Description
 */
@Api(value = "测试", description = "仅仅用于测试")
@RestController
public class DemoController {

    /**
     * 根据ID查询用户
     * @param id
     * @return
     */
    @ApiOperation(value="获取用户详细信息", notes="根据url的id来获取用户详细信息")
    @ApiImplicitParam(name = "id", value = "用户ID", required = true, dataType = "Integer", paramType = "path")
    @RequestMapping(value = "/saveUserInfo",method = RequestMethod.GET)
    public String saveUserInfo(Integer id){
        return "123213213";
    }
}