package com.gurney.wmp;

import com.gurney.wmp.blocks.ModBlocks;
import com.gurney.wmp.items.ModItems;
import com.gurney.wmp.proxy.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = CONSTANTS.MOD_ID, name = CONSTANTS.NAME, version = CONSTANTS.VERSION, acceptedMinecraftVersions = CONSTANTS.MINECRAFT_VERSIONS)
public class WallpaperMod {

    @Mod.Instance
    public static  WallpaperMod instance;

    @SidedProxy(clientSide = CONSTANTS.CLIENT_PROXY_CLASS, serverSide = CONSTANTS.COMMON_PROXY_CLASS)
    public static CommonProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        ModItems.init();
        ModBlocks.init();

        System.out.println("Loading. PreInit");
    }
    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {
        System.out.println("Loading. Init");
    }
    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        System.out.println("Loading. PostInit");
    }


}

