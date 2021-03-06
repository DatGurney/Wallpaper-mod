package com.gurney.wmp.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

//Where i create the new items. look at itemRedBlock1 for example
public class ModItems {
    public static ItemBase itemRedBlock1;

    public static void init() {
        itemRedBlock1 = (ItemBase) register(new ItemBase("itemRedBlock1").setMaxStackSize(1).setCreativeTab(CreativeTabs.DECORATIONS));
    }
    private static <T  extends Item> T register(T item){
        GameRegistry.register(item);

        if (item instanceof ItemBase){
            ((ItemBase)item).registerItemModel();
        }

        return item;
    }
}
