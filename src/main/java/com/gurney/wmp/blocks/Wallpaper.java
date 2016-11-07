package com.gurney.wmp.blocks;

import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class Wallpaper extends BlockBase {

    public Wallpaper(String name){
        super(Material.CLOTH, name);

        setHardness(3f);
        setResistance(5f);
    }
    @Override
    public Wallpaper setCreativeTab(CreativeTabs tab){
        super.setCreativeTab(tab);
        return this;
    }
}
