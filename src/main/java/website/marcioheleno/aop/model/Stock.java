package website.marcioheleno.aop.model;

import lombok.Data;

@Data
public class Stock {

    private int quantity;

    public Stock(int quantity) {
        super();
        this.quantity = quantity;
    }
}
