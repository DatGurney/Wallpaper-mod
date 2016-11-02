package com.gurney.wmp.proxy;

import com.gurney.wmp.CONSTANTS;
import com.gurney.wmp.WallpaperMod;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;

public class ClientProxy extends CommonProxy{
    @Override
    public void registerItemRenderer(Item item, int meta, String id){
        ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(CONSTANTS.MOD_ID + ":" + id, "inventory"));
    }
}
