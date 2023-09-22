package com.github.hadaward.explorationcore.item

import com.github.hadaward.explorationcore.ExplorationCoreMod
import net.fabricmc.fabric.api.item.v1.FabricItemSettings
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents
import net.minecraft.item.Item
import net.minecraft.item.ItemGroups
import net.minecraft.registry.Registries
import net.minecraft.registry.Registry
import net.minecraft.util.Identifier

object ModItems {
    private val adamantite_ingot: Item = registerItem("adamantite_ingot", Item(FabricItemSettings()))

    private fun addItemsToIngredientsItemGroup(entries: FabricItemGroupEntries) {
        entries.add(adamantite_ingot)
    }

    private fun registerItem(name: String, item: Item): Item {
        return Registry.register(Registries.ITEM, Identifier(ExplorationCoreMod.mod_id, name), item);
    }

    fun registerModItems() {
        ExplorationCoreMod.logger.info("Registering Mod Items for " + ExplorationCoreMod.mod_id);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientsItemGroup)
    }
}