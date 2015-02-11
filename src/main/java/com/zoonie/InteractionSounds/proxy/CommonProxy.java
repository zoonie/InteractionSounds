package com.zoonie.InteractionSounds.proxy;

import java.io.File;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import com.zoonie.InteractionSounds.configuration.Config;
import com.zoonie.InteractionSounds.network.ServerHandler;

public class CommonProxy
{
	public void preInit(FMLPreInitializationEvent event)
	{
		handlerSetup();
		configSetup(event.getSuggestedConfigurationFile());
	}

	private void handlerSetup()
	{
		MinecraftForge.EVENT_BUS.register(new ServerHandler());
	}

	private void configSetup(File file)
	{
		Configuration config = new Configuration(file);
		new Config(config);
		config.save();
	}
}
