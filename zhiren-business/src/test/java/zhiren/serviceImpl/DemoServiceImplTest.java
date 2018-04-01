package zhiren.serviceImpl;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import zhiren.service.DemoService;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = DemoServiceImpl.class)
public class DemoServiceImplTest {

    @Autowired
    private DemoService demoService;

    @Test
    public void demo() {
        demoService.demo();
    }
}