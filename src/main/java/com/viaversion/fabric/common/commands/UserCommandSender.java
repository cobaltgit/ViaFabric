/*
 * This file is part of ViaFabric - https://github.com/ViaVersion/ViaFabric
 * Copyright (C) 2018-2024 ViaVersion and contributors
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.viaversion.fabric.common.commands;

import com.viaversion.viaversion.api.Via;
import com.viaversion.viaversion.api.command.ViaCommandSender;
import com.viaversion.viaversion.api.connection.UserConnection;

import java.util.UUID;

public class UserCommandSender implements ViaCommandSender {
    private final UserConnection con;

    public UserCommandSender(UserConnection con) {
        this.con = con;
    }

    @Override
    public boolean hasPermission(String s) {
        return false;
    }

    @Override
    public void sendMessage(String s) {
        Via.getPlatform().sendMessage(getUUID(), s);
    }

    @Override
    public UUID getUUID() {
        return con.getProtocolInfo().getUuid();
    }

    @Override
    public String getName() {
        return con.getProtocolInfo().getUsername();
    }
}
