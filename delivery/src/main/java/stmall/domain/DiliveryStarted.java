package stmall.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import stmall.domain.*;
import stmall.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class DiliveryStarted extends AbstractEvent {

    private Long id;
    private Long orderid;
    private Long productid;
    private String productname;
    private Integer qty;
    private String address;
    private String status;

    public DiliveryStarted(Delivery aggregate) {
        super(aggregate);
    }

    public DiliveryStarted() {
        super();
    }
}
//>>> DDD / Domain Event
