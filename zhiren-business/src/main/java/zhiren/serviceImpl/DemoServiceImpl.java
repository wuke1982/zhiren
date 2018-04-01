package zhiren.serviceImpl;

import org.springframework.stereotype.Service;
import zhiren.service.DemoService;

@Service(value = "demo")
public class DemoServiceImpl implements DemoService {
    @Override
    public void demo() {
        System.out.println("sadsadas");

    }
}
