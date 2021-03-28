package com.w1nyx.proxima.core.init;

import com.w1nyx.proxima.Proxima;

import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {

	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS,
			Proxima.MOD_ID);
	
	public static final RegistryObject<Item> FIRST_ITEM = ITEMS.register("first_item",
			() -> new Item(new Item.Properties().tab(ItemGroup.TAB_MISC)));

	public static final RegistryObject<BlockItem> FIRST_BLOCK = ITEMS.register("first_block",
			() -> new BlockItem(BlockInit.FIRST_BLOCK.get(), new Item.Properties().tab(ItemGroup.TAB_BUILDING_BLOCKS)));
}
