package org.leochen.line.sample;

import io.github.sashirestela.openai.domain.image.Image;
import lombok.extern.slf4j.Slf4j;
import org.leochen.javaLib.utils.Util;

import java.util.List;
import java.util.Properties;

// test4


@Slf4j
public class Sample {

    private static Properties prop = Util.loadAppProperties();
    private static String lineChannelTokenFish = prop.getProperty("line.channelToken.fish");
    private static String lineChannelTokenInvest = prop.getProperty("line.channelToken.invest");

    public static void main(String[] args) {
        test1(true);
    }

    private static void test1(boolean runCheck){
        if(!runCheck){return;}

        log.info("开始");


        log.info("Result: {}", lineChannelTokenFish);
        log.info("Result: {}", lineChannelTokenInvest);
    }


}
