package com.willfp.ecoenchants.nms.API;

import org.bukkit.block.Block;
import org.bukkit.entity.Player;

/**
 * NMS Interface for breaking blocks as player
 */
public interface BlockBreakWrapper {
    void breakBlock(Player player, Block block);
}
