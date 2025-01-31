package org.leochen.line.structure;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.leochen.line.structure.events.Message;

import java.util.ArrayList;

@Data
@AllArgsConstructor
public class Push {
    private String to;
    private ArrayList<Message> messages;
}
