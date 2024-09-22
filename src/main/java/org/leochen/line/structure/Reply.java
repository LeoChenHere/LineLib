package org.leochen.line.structure;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.leochen.line.structure.events.Message;

import java.util.ArrayList;

@Data
@AllArgsConstructor
public class Reply {
    private String replyToken;
    private ArrayList<Message> messages;
}
