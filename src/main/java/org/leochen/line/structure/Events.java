package org.leochen.line.structure;

import lombok.Data;
import org.leochen.line.structure.events.DeliveryContext;
import org.leochen.line.structure.events.Message;
import org.leochen.line.structure.events.Source;

@Data
public class Events {
    private String type;
    private Message message;
    private String webhookEventId;
    private DeliveryContext deliveryContext;
    private Long timestamp;
    private Source source;
    private String replyToken;
    private String mode;
}
