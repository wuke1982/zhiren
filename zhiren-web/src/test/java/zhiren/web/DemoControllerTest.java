package zhiren.web;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import zhiren.ZhirenApplication;
import zhiren.config.ZhiRenConfig;
import zhiren.service.DemoService;

import javax.annotation.Resource;

/**
 * Created by Solley
 * Created Time  2018/4/9.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = ZhirenApplication.class)
public class DemoControllerTest {

    @Autowired
    private ZhiRenConfig zhiRenConfig;

    @Resource(name = "demo")
    private DemoService demoService;

    @Test
    public void demo() {
        demoService.demo();
        System.out.println(zhiRenConfig.getVersion());
    }

    @Test
    public void saveUserInfo() {
        System.out.println("sadsadsad");
    }
}