package org.leochen.line.structure.events.message;

import lombok.Data;
import org.leochen.line.structure.events.message.mention.Mentionees;

import java.util.ArrayList;

@Data
public class Mention {
    private ArrayList<Mentionees> mentionees;
}
