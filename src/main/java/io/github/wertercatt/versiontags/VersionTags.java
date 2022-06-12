package io.github.wertercatt.versiontags;

import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.base.api.entrypoint.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import net.minecraft.SharedConstants;
import net.minecraft.client.ClientBrandRetriever;
import net.minecraft.client.Minecraft;



public class VersionTags implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod name as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger("Bring Back Version Tags!");

	@Override
	public void onInitialize(ModContainer mod) {
		String versionTag = "Minecraft " + SharedConstants.getCurrentVersion().getName() + " (" + Minecraft.getInstance().getLaunchedVersion() + "/" + ClientBrandRetriever.getClientModName() + ")";
		LOGGER.info("Hello Quilt world from {}!", mod.metadata().name());
		LOGGER.info("I think the Version Tag is: " + versionTag);
	}
}
