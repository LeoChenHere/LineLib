package org.leochen.line.structure.events;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Source {
    private String type;
    private String groupId;
    private String roomId;
    private String userId;

    public enum type {
        user,
        group,
        room
    }
}
