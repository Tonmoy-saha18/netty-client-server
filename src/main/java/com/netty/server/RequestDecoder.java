package com.netty.server;

import com.netty.model.RequestData;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.ReplayingDecoder;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;

public class RequestDecoder extends ReplayingDecoder<RequestData> {
    private final Charset charset = StandardCharsets.UTF_8;
    @Override
    protected void decode(ChannelHandlerContext channelHandlerContext, ByteBuf byteBuf, List<Object> list) throws Exception {
        RequestData requestData = new RequestData();
        requestData.setIntValue(byteBuf.readInt());
        int strlen = byteBuf.readInt();
        requestData.setStringValue(byteBuf.readCharSequence(strlen, charset).toString());
        list.add(requestData);
    }
}
