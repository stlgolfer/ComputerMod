package xyz.amtstl.computermod.preinit;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;
import xyz.amtstl.computermod.blocks.BlockComputer;

public class ModBlocks {
	public static CreativeTabs tab;
	
	public static Block computer;
	
	public static void preInit() {
		// register blocks here
		computer = new BlockComputer();
		registerBlock(computer);
	}
	
	public static void registerBlock(Block block) 
	{
		registerBlock(block, new ItemBlock(block));
	}
	
	public static void registerBlock(Block block, ItemBlock item) 
	{
		GameRegistry.register(block);
		item.setRegistryName(block.getRegistryName());
		GameRegistry.register(item);
	}
}