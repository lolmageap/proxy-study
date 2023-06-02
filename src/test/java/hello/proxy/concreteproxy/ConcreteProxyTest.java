package hello.proxy.concreteproxy;

import hello.proxy.concreteproxy.code.ConcreteClient;
import hello.proxy.concreteproxy.code.ConcreteLogic;
import hello.proxy.concreteproxy.code.OnlyTimeProxy;
import hello.proxy.concreteproxy.code.TimeProxy;
import org.junit.jupiter.api.Test;

public class ConcreteProxyTest {

    @Test
    void testNoProxy(){
        ConcreteLogic proxy = new ConcreteLogic();
        ConcreteClient client = new ConcreteClient(proxy);
        client.execute();
    }

    @Test
    void testTimeProxy(){
        ConcreteLogic concreteLogic = new ConcreteLogic();
        TimeProxy proxy = new TimeProxy(concreteLogic);
        ConcreteClient client = new ConcreteClient(proxy);
        client.execute();
    }

    @Test
    void testOnlyTimeProxy(){
        OnlyTimeProxy proxy = new OnlyTimeProxy();
        ConcreteClient client = new ConcreteClient(proxy);
        client.execute();
    }

}
