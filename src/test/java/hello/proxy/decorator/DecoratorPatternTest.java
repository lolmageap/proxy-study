package hello.proxy.decorator;

import hello.proxy.decorator.code.DecoratorPatternClient;
import hello.proxy.decorator.code.MessageDecorator;
import hello.proxy.decorator.code.RealComponent;
import hello.proxy.decorator.code.TimeDecorator;
import org.junit.jupiter.api.Test;

public class DecoratorPatternTest {

    @Test
    void testNoDecorator(){
        RealComponent component = new RealComponent();
        DecoratorPatternClient client = new DecoratorPatternClient(component);

        client.execute();
    }

    @Test
    void testDecoratorV1(){
        RealComponent component = new RealComponent();
        MessageDecorator messageDecorator = new MessageDecorator(component);
        DecoratorPatternClient client = new DecoratorPatternClient(messageDecorator);

        client.execute();

    }

    @Test
    void testDecoratorV2(){
        RealComponent component = new RealComponent();
        MessageDecorator messageDecorator = new MessageDecorator(component);
        TimeDecorator timeDecorator = new TimeDecorator(messageDecorator);
        DecoratorPatternClient client = new DecoratorPatternClient(timeDecorator);

        client.execute();

    }

}
