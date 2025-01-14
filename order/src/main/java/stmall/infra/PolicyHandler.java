package stmall.infra;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import javax.naming.NameParser;
import javax.naming.NameParser;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;
import stmall.config.kafka.KafkaProcessor;
import stmall.domain.*;

//<<< Clean Arch / Inbound Adaptor
@Service
@Transactional
public class PolicyHandler {

    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString) {}

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='DiliveryStarted'"
    )
    public void wheneverDiliveryStarted_UpdateOrderStatus(
        @Payload DiliveryStarted diliveryStarted
    ) {
        DiliveryStarted event = diliveryStarted;
        System.out.println(
            "\n\n##### listener UpdateOrderStatus : " + diliveryStarted + "\n\n"
        );

        // Sample Logic //
        Order.updateOrderStatus(event);
    }
}
//>>> Clean Arch / Inbound Adaptor
