package com.netty.server;

import com.netty.model.ResponseData;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;

public class ResponseEncoder extends MessageToByteEncoder<ResponseData> {

    @Override
    protected void encode(ChannelHandlerContext channelHandlerContext, ResponseData responseData, ByteBuf byteBuf) throws Exception {
        byteBuf.writeInt(responseData.getIntValue());
    }
}
