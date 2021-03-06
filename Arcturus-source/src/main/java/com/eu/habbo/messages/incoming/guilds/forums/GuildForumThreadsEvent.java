package com.eu.habbo.messages.incoming.guilds.forums;

import com.eu.habbo.Emulator;
import com.eu.habbo.messages.incoming.MessageHandler;
import com.eu.habbo.messages.outgoing.guilds.forums.GuildForumDataComposer;
import com.eu.habbo.messages.outgoing.guilds.forums.GuildForumThreadsComposer;

public class GuildForumThreadsEvent extends MessageHandler
{
    @Override
    public void handle() throws Exception
    {
        int groupdId = this.packet.readInt();
        int index = this.packet.readInt();

        this.client.sendResponse(new GuildForumThreadsComposer(Emulator.getGameEnvironment().getGuildForumManager().getGuildForum(groupdId), index));
        this.client.sendResponse(new GuildForumDataComposer(Emulator.getGameEnvironment().getGuildForumManager().getGuildForum(groupdId), this.client.getHabbo()));
        //TODO read guild id;
    }
}