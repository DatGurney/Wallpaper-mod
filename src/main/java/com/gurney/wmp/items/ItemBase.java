package com.gurney.wmp.items;

import com.gurney.wmp.WallpaperMod;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

//A class which allows me to easily create items
public class ItemBase extends Item {
    protected String name;

    public  ItemBase(String name) {
        this.name = name;
        setUnlocalizedName(name);
        setRegistryName(name);
    }
    public void registerItemModel() {
        WallpaperMod.proxy.registerItemRenderer(this, 0, name);
    }

    @Override
    public ItemBase setCreativeTab(CreativeTabs tab) {
        super.setCreativeTab(tab);
        return this;
    }
}