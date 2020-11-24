package website.marcioheleno.aop.model;

import lombok.Data;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Component;

@Log4j2
@Component
@Data
public class StockDao {

    public Stock retrieveStock() {
        log.info("Return a dummy value");
        return new Stock(20);
    }

}
