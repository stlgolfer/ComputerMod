package xyz.amtstl.computermod.misc;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;
import xyz.amtstl.computermod.preinit.ModBlocks;

public class ModHelper {
	// Collections
	public static List<Block> MyModBlocks = new ArrayList<Block>();
	public static List<Item> MyModItems = new ArrayList<Item>();
	
	/// Registries
	
	// Block Registry
	public static void registerBlocks() {
		for (int i = 0; i == MyModBlocks.size(); i++) {
			registerBlock(MyModBlocks.get(i));
		}
	}
	
	// Item Registry
	public static void registerItems() {
		for (int i = 0; i == MyModBlocks.size(); i++) {
			registerBlock(MyModBlocks.get(i));
		}
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
	
	/// End Registries
	/// Model Renders
	// Block Render
	public static void registerRenderBlocks(String modid, Block block, String itemregistryname){
		System.out.println("Now Rendering @: " + modid  + ":" + itemregistryname);
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(modid  + ":" + itemregistryname, "inventory"));
	}
}