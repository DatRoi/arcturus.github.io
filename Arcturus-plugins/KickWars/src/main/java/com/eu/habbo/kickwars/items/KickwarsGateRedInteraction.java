package com.eu.habbo.kickwars.items;

import com.eu.habbo.habbohotel.games.GameTeamColors;
import com.eu.habbo.habbohotel.items.Item;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created on 19-12-2015 13:46.
 */
public class KickwarsGateRedInteraction extends KickwarsGateInteraction
{
    public KickwarsGateRedInteraction(ResultSet set, Item baseItem) throws SQLException
    {
        super(set, baseItem, GameTeamColors.RED);
    }

    public KickwarsGateRedInteraction(int id, int userId, Item item, String extradata, int limitedStack, int limitedSells)
    {
        super(id, userId, item, extradata, limitedStack, limitedSells, GameTeamColors.RED);
    }
}
