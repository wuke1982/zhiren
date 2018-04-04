package zhiren.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import zhiren.mapper.DemoMapper;
import zhiren.model.Demo;
import zhiren.service.DemoService;


@Service(value = "demo")
@Transactional
public class DemoServiceImpl implements DemoService {

    @Autowired
    private DemoMapper demoMapper;

    @Override
    public void demo() {
        Demo dd = new Demo();
        dd.setId(1);
        dd.setCode("12");
        dd.setName("2131");
        demoMapper.insert(dd);
        //int i = 1 / 0;
        dd.setId(2);
        dd.setCode("12");
        dd.setName("2131");
        demoMapper.insert(dd);
    }
}
