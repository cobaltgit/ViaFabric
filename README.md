# ViaFabric

[![ViaVersion Discord](https://img.shields.io/badge/chat-on%20discord-blue.svg)](https://viaversion.com/discord)
[![CurseForge Downloads](http://cf.way2muchnoise.eu/full_viafabric_downloads.svg)](https://viaversion.com/fabric)
[![CurseForge Versions](http://cf.way2muchnoise.eu/versions/viafabric.svg)](https://viaversion.com/fabric)
[![Download on Modrinth](https://img.shields.io/badge/download-modrinth-green)](https://modrinth.com/mod/viafabric)
<!-- ^ GitHub seems to not like this https -->

### Client-side and server-side ViaVersion implementation for Fabric

Allows the connection to/from different Minecraft versions on your Minecraft client/server (LAN worlds too)

This mod can be installed on 1.8.9, 1.14.4, 1.15.2, 1.16.5, 1.17.1, 1.18.2 with Fabric Loader.

## Dependencies

| Dependency                                    | Download                                                       |
|-----------------------------------------------|----------------------------------------------------------------|
| (Bundled) ViaVersion                          | https://viaversion.com/                                        |
| (Bundled) Cotton Client Commands (MC 1.14-15) | https://jitpack.io/#TinfoilMC/ClientCommands                   |
| Fabric API (MC 1.14+)                         | https://www.curseforge.com/minecraft/mc-mods/fabric-api        |
| Legacy Fabric API (MC 1.8.9)                  | https://www.curseforge.com/minecraft/mc-mods/legacy-fabric-api |

Note: ViaVersion is designed for Vanilla Minecraft servers. It probably will not work with modded registry entries or
registry synchronization (fabric-registry-sync mod).

## ViaVersion

### How can I install ViaBackwards/ViaRewind?:

- Just drop them into mods folder. Make sure you are using versions compatible with the ViaVersion version you are
  using.
- CurseForge links:
  [ViaBackwards](https://www.curseforge.com/minecraft/mc-mods/viabackwards)
  [ViaRewind](https://www.curseforge.com/minecraft/mc-mods/viarewind)

### What versions can ViaVersion, ViaBackwards and ViaRewind translate?:

- **With [ViaVersion](https://viaversion.com)**:
  Your server can accept newer versions. Your client can connect to older versions.

- **Adding [ViaBackwards](https://viaversion.com/backwards) (and
  optionally [ViaRewind](https://viaversion.com/rewind))**:
  Your server can accept older versions. Your client can connect to newer versions.

- Server-side: See https://viaversion.com/

- Client-side:

|               | 1.8.x | 1.9.x | 1.10-1.14.4 | 1.15.x | 1.16.x | 1.17.x | 1.18.x | 1.19.x |
|---------------|-------|-------|-------------|--------|--------|--------|--------|--------|
| 1.8.9 client  | ✓     | ⏪     | ⏪           | ⏪      | ⏪      | ⏪      | ⏪      | ⏪ |
| 1.14.x client | ✓     | ✓     | ✓           | ⟲      | ⟲      | ⟲      | ⟲      | ⟲ |
| 1.15.x client | ✓     | ✓     | ✓           | ✓      | ⟲      | ⟲      | ⟲      | ⟲ |
| 1.16.x client | ✓     | ✓     | ✓           | ✓      | ✓      | ⟲      | ⟲      | ⟲ |
| 1.17.x client | ✓     | ✓     | ✓           | ✓      | ✓      | ✓      | ⟲      | ⟲ |
| 1.18.x client | ✓     | ✓     | ✓           | ✓      | ✓      | ✓      | ✓      | ⟲ |
| 1.19.x client | ✓     | ✓     | ✓           | ✓      | ✓      | ✓      | ✓      | ✓ |

✓ = [ViaVersion](https://viaversion.com) ⟲ = [ViaBackwards](https://viaversion.com/backwards) ⏪
= [ViaRewind](https://viaversion.com/rewind)

### Can ViaVersion, ViaBackwards and ViaRewind support snapshots?:

- Check https://ci.viaversion.com/ for development builds with snapshot support

## Alternatives

### Client-side:

- [ClientViaVersion](https://github.com/Gerrygames/ClientViaVersion): Discontinued 5zig plugin.
- [multiconnect](https://www.curseforge.com/minecraft/mc-mods/multiconnect): Fabric mod for connecting to older
  versions: down to 1.11 (stable) and 1.8 (experimental).
- [ViaForge](https://www.curseforge.com/minecraft/mc-mods/viaforge): Fork of ViaFabric porting it to Forge.

### Server-side

- [ProtocolSupport](https://protocol.support/): Bukkit plugin for older client versions (down to 1.4.7).
- [ViaVersion](https://viaversion.com): Plugin for BungeeCord, CraftBukkit, SpongeCommon and Velocity servers.

### Standalone proxy:

- [DirtMultiversion](https://github.com/DirtPowered/DirtMultiversion): Proxy allowing to connect down to Beta 1.3 with
  newer Minecraft client versions.
- [VIAaaS](https://github.com/ViaVersion/VIAaaS): Standalone ViaVersion proxy with ViaBackwards and ViaRewind, allowing
  you to connect without a mod installed on your client. Supports online mode.

### Cool things to try:

- [Geyser](https://geysermc.org/): Plugins, Fabric mod and a standalone proxy for allowing Bedrock Edition on Java
  Edition servers.
- [PolyMc](https://github.com/TheEpicBlock/PolyMc): Fabric mods which translates modded items and blocks, allowing
  vanilla to connect using resource packs.

## Commands

### Commands:

- There're 3 server-side alias ``/viaversion``, ``/vvfabric`` and ``/viaver``, and a client-side command
  ``/viafabricclient`` for Minecraft 1.14+ (OP permission level 3 is required for these commands, received
  by [Entity Status Packet](https://wiki.vg/Entity_statuses#Player))

## Configs

### Configuration:

- ViaVersion configuration is available at ``.minecraft/config/viafabric/viaversion.yml``
- ViaFabric configuration is at ``.minecraft/config/viafabric/viafabric.yml``

### How can I disable client-side ViaFabric?:

- You can disable it in the menu or by setting global protocol version to -1 (this will keep per-server translations
  still enabled)

### How to use protocol detection?:

- For using globally, set the protocol to AUTO or -2. For using in a specific
  server: ``ddns.example.com._v-2.viafabric``
- The protocol detector will try to ping with the client native protocol version, differently than multiconnect which
  uses -1 version, which may detect the native server version.

### How can I set the version for specific servers?:

- Append ._v(VERSION).viafabric.
- Examples: ``minigame.example.com._v1_8.viafabric``, ``native.example.com._v-1.viafabric``
  , ``auto.example.com._v-2.viafabric``

## multiconnect

### Does it work with multiconnect at same time on client?:

- Yes, ViaFabric can be used with multiconnect. ViaFabric will send to its version auto detector the closest non-beta
  supported version. (multiconnect beta-supported versions are currently < 1.11))

### Differences with multiconnect:

|                        | ViaVersion                        | multiconnect                                  |
|------------------------|-----------------------------------|-----------------------------------------------|
| Designed for           | servers                           | clients                                       |
| Can be installed on    | multiple client/server versions   | latest client version                         |
| Objectives             | simply implement ViaVersion       | version support with fixes to version changes |
| How does it work?      | modifying packets at network code | modifying client code more deeply             |
| Triggering anti-cheats | very likely                       | less likely                                   |

## WARNING

**I cannot guarantee that this mod is allowed on every (or even any) server. This mod may cause problems with anti cheat
plugins. USE AT OWN RISK**
