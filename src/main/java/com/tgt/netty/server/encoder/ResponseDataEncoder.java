package com.tgt.netty.server.encoder;

import com.tgt.netty.server.model.ResponseData;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;

public class ResponseDataEncoder
        extends MessageToByteEncoder<ResponseData> {

    @Override
    protected void encode(ChannelHandlerContext ctx,
                          ResponseData msg, ByteBuf out) throws Exception {
//        System.out.println("----------- here in encode ------------"+ msg.getIntValue());
        out.writeInt(msg.getIntValue());
    }
}
