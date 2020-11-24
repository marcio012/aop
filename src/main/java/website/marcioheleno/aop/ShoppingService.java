package website.marcioheleno.aop;

import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import website.marcioheleno.aop.model.OrderDao;
import website.marcioheleno.aop.model.StockDao;

@Log4j2
@Service
public class ShoppingService {

    @Autowired
    private StockDao stockDao;

    @Autowired
    private OrderDao orderDao;

    public void checkAndPlaceOrder() {
        int avaliableQuantity = stockDao.retrieveStock().getQuantity();
        log.info("Retrived Stock - {}", avaliableQuantity);
        if (avaliableQuantity > 0) {
            orderDao.placeOrder(avaliableQuantity);
        }
    }
}
