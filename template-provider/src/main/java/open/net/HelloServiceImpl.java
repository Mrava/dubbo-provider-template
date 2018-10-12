package open.net;

import com.alibaba.dubbo.config.annotation.Service;
import open.net.api.HelloService;

@Service(version = "1.0.0")
public class HelloServiceImpl implements HelloService {
    @Override
    public String say() {
        return "hello";
    }
}
