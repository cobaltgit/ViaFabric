package com.viaversion.fabric.mc116.providers;

import com.viaversion.fabric.common.config.VFConfig;
import com.viaversion.fabric.common.provider.VFVersionProvider;
import com.viaversion.fabric.mc116.ViaFabric;
import com.viaversion.fabric.mc116.service.ProtocolAutoDetector;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import io.netty.channel.ChannelPipeline;
import net.minecraft.network.ClientConnection;

import java.net.InetSocketAddress;
import java.util.concurrent.CompletableFuture;
import java.util.logging.Logger;

public class VRVersionProvider extends VFVersionProvider {

    @Override
    protected Logger getLogger() {
        return ViaFabric.JLOGGER;
    }

    @Override
    protected VFConfig getConfig() {
        return ViaFabric.config;
    }

    @Override
    protected CompletableFuture<ProtocolVersion> detectVersion(InetSocketAddress address) {
        return ProtocolAutoDetector.detectVersion(address);
    }

    @Override
    protected boolean isMulticonnectHandler(ChannelPipeline pipe) {
        return pipe.get(ClientConnection.class).getPacketListener()
                .getClass().getName().startsWith("net.earthcomputer.multiconnect");
    }
}