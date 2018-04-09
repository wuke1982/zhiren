package zhiren.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import zhiren.config.ZhiRenConfig;
import zhiren.mapper.DemoMapper;
import zhiren.model.Demo;
import zhiren.service.DemoService;

import java.util.Random;


@Service(value = "demo")
@Transactional
public class DemoServiceImpl implements DemoService {

    @Autowired
    private DemoMapper demoMapper;

    @Autowired
    private ZhiRenConfig zhiRenConfig;

    @Override
    public void demo() {
        Random random = new Random(100);
        //System.out.println(zhiRenConfig.getVersion());
        Demo dd = new Demo();
        dd.setId(random.nextInt());
        dd.setCode("12");
        dd.setName("2131");
        demoMapper.insert(dd);
        //int i = 1 / 0;
        dd.setId(random.nextInt());
        dd.setCode("12");
        dd.setName("2131");
        demoMapper.insert(dd);
    }
}
