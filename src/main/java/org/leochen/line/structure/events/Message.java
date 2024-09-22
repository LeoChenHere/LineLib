package org.leochen.line.structure.events;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.leochen.line.structure.events.message.Emojis;
import org.leochen.line.structure.events.message.Mention;

import java.util.ArrayList;

@Data
@NoArgsConstructor
@RequiredArgsConstructor
public class Message {
    @NonNull
    private String type;
    @NonNull
    private String text;
    private Long id;
    private String quoteToken;
    private ArrayList<Emojis> emojis;
    private Mention mention;

    public enum type {
        text,
        sticker,
        image,
        video,
        audio,
        location,
        imagemap,
        uri,
        message,
        clipboard,
        flex
    }
}
