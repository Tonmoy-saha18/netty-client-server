package com.netty.client;

import com.netty.model.RequestData;
import com.netty.model.ResponseData;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.ReplayingDecoder;

import java.util.List;

public class ResponseDataDecoder extends ReplayingDecoder<ResponseData> {
    @Override
    protected void decode(ChannelHandlerContext channelHandlerContext, ByteBuf byteBuf, List<Object> list) throws Exception {
        ResponseData responseData = new ResponseData();
        responseData.setIntValue(byteBuf.readInt());
        list.add(byteBuf);
    }
}
