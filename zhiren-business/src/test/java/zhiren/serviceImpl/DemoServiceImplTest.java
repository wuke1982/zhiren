package zhiren.serviceImpl;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import zhiren.config.ZhiRenConfig;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class DemoServiceImplTest {

    @Autowired
    private ZhiRenConfig zhiRenConfig;

    @Test
    public void demo() {
        System.out.println(zhiRenConfig.getVersion());
    }
}