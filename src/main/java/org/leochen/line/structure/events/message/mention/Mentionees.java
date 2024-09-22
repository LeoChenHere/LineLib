package org.leochen.line.structure.events.message.mention;

import lombok.Data;

@Data
public class Mentionees {
    private String index;
    private String length;
    private String type;
    private String userId;

    public enum type {
        all,
        user
    }
}
