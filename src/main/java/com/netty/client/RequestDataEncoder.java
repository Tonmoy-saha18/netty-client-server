package com.netty.client;

import com.netty.model.RequestData;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class RequestDataEncoder extends MessageToByteEncoder<RequestData> {
    private final Charset charset = StandardCharsets.UTF_8;
    @Override
    protected void encode(ChannelHandlerContext channelHandlerContext, RequestData requestData, ByteBuf byteBuf) throws Exception {
        byteBuf.writeInt(requestData.getIntValue());
        byteBuf.writeInt(requestData.getStringValue().length());
        byteBuf.writeCharSequence(requestData.getStringValue(), charset);
    }
}
