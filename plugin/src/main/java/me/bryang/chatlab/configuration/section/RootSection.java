package me.bryang.chatlab.configuration.section;

import me.bryang.chatlab.configuration.ConfigurationSection;
import org.spongepowered.configurate.objectmapping.ConfigSerializable;
import org.spongepowered.configurate.objectmapping.meta.Comment;

@ConfigSerializable
@SuppressWarnings("FieldMayBeFinal")
public class RootSection extends ConfigurationSection {

    @Comment("Private message format")
    public PrivateMessage privateMessage = new PrivateMessage();
    public Reply reply = new Reply();
    public ChatFormat chatFormat = new ChatFormat();

    @Comment("Ignore input messages")
    public Ignore ignore = new Ignore();


    @ConfigSerializable
    public static class PrivateMessage {
        public String fromSender = "<red>[MSG] <dark_gray>| <white>You <dark_gray>»<green> <target> <dark_grey>: <white><message>";
        public String toReceptor = "<red>[MSG] <dark_gray>| <green><sender> <dark_gray>» <white>You <dark_grey>: <white><message>";
    }

    @ConfigSerializable
    public static class Reply {
        @Comment("Message to notify when the player he's talking to left")
        public String left = "<green>[Chat] <gray>| <white>The player <green><target> <white>you were talking to, has left the server.";
    }

    @ConfigSerializable
    public static class Ignore{

        @Comment("Message when the player input a target to ignore")
        public String ignoredPlayer = "<red>[Ignore] <dark_gray> | <white>You ignored a player. <green>[<player>]<green>";

        @Comment("Message when the player input a target to unignore")
        public String unignoredPlayer = "<red>[Ignore] <dark_gray> | <white>You unignored a player. <green>[<player>]<green>";
    }
    @ConfigSerializable
    public static class ChatFormat {

        @Comment("Enable option")
        public boolean enabled = false;

        @Comment("Format when you chat (Permission to use tags (clab.colors)")
        public String format = "<white><player> <grey>: <white><message>";
    }

}
