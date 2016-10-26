package com.gurney.wmp.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by gerra on 26/10/2016.
 */
public class ModItems {
    public static ItemBase itemRedBlock1;

    public static void init() {
        itemRedBlock1 = register(new ItemBase("itemRedBlock1").setCreativeTab(CreativeTabs.DECORATIONS));
    }

    private static <T  extends Item> T register(T item){
        GameRegistry.register(item);

        if (item instanceof ItemBase){
            ((ItemBase)item).registerItemModel();
        }

        return item;
    }
}
