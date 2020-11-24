package website.marcioheleno.aop.model;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Component;

@Log4j2
@Component
public class OrderDao {

    public void placeOrder(int value) {
        log.info("Place Order - {}", value);
    }
}
