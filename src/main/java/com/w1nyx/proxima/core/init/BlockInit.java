package com.w1nyx.proxima.core.init;

import com.w1nyx.proxima.Proxima;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockInit {

	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS,
			Proxima.MOD_ID);

	public static final RegistryObject<Block> FIRST_BLOCK = BLOCKS.register("first_block",
			() -> new Block(AbstractBlock.Properties.of(Material.METAL, MaterialColor.COLOR_BLUE)
					.strength(3f, 3f)
					.harvestTool(ToolType.PICKAXE)
					.harvestLevel(2)
					.sound(SoundType.METAL).requiresCorrectToolForDrops()));
}
