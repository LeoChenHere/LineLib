package org.leochen.line;

import lombok.extern.slf4j.Slf4j;
import org.leochen.javaLib.result.ResultCode;
import org.leochen.line.structure.Push;
import org.leochen.line.structure.Reply;
import org.leochen.line.structure.events.Message;
import org.leochen.javaLib.utils.HttpUtil;
import org.leochen.javaLib.utils.JsonUtil;

import java.util.ArrayList;

@Slf4j
public class LineUtil {

    String channelToken;
    public LineUtil(String channelToken){
        this.channelToken = channelToken;
    }

    public void linePush(String userId, String message) {
        String uri = "https://api.line.me/v2/bot/message/push";

        ArrayList<Message> messagesList = new ArrayList<>();
        messagesList.add(new Message(Message.type.text.name(), message, ""));
        Push push = new Push(userId, messagesList);
        log.info(JsonUtil.toJsonString(push));

        String result = (new HttpUtil()).httpPost(uri, channelToken, JsonUtil.toJsonString(push));
        log.info("LinePush result: "+result);
        log.info(ResultCode.SUCCESS.getMessage());
    }

    public void lineReply(String replyToken, String messageStr, String quoteToken) {
        String uri = "https://api.line.me/v2/bot/message/reply";

        ArrayList<Message> messagesList = new ArrayList<>();
        messagesList.add(new Message(Message.type.text.name(), messageStr, quoteToken));
        Reply reply = new Reply(replyToken, messagesList);
        log.info(JsonUtil.toJsonString(reply));

        String result = (new HttpUtil()).httpPost(uri, channelToken, JsonUtil.toJsonString(reply));
        log.info("LineReply result: "+result);
        log.info(ResultCode.SUCCESS.getMessage());
    }

}
