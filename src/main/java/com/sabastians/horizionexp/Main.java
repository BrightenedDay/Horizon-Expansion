package com.sabastians.horizionexp;

import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

@Mod(
		modid = Main.MODID,
		name = Main.NAME,
		version = Main.VERSION,
		dependencies = "required-after:dio@[2.2,]",
		acceptedMinecraftVersions = "[1.12,)"
	)
public class Main
{
    public static final String MODID = "horizionexp";
    public static final String NAME = "Horizon Expansion";
    public static final String VERSION = "1.0";

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
    }
    
    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
    }
}