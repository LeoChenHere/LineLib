package org.leochen.line.structure;

import lombok.Data;

import java.util.ArrayList;

@Data
public class WebhookData {
    private String destination;
    private ArrayList<Events> events;
}
