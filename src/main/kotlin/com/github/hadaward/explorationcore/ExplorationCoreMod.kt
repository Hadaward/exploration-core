package com.github.hadaward.explorationcore

import com.github.hadaward.explorationcore.item.ModItems
import net.fabricmc.api.ModInitializer
import org.slf4j.LoggerFactory

object ExplorationCoreMod : ModInitializer {
	val logger = LoggerFactory.getLogger("exploration-core")!!
	var mod_id = "exploration-core"

	override fun onInitialize() {
		ModItems.registerModItems()
	}
}