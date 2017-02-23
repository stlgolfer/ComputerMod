package xyz.amtstl.computermod.misc;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import scala.Int;
import xyz.amtstl.computermod.preinit.ModBlocks;

public class ModHelper {
	// Collections
	public static List<Block> MyModBlocks = new ArrayList<Block>();
	public static List<Item> MyModItems = new ArrayList<Item>();
	public static List<CreativeTabs> MyModCreativeTabs = new ArrayList<CreativeTabs>();
	public static List<String> help = new ArrayList<String>();
	
	// Startup
	public static void ModHelperStart() {
		help.add(0, "public static CreativeTabs tab = new CreativeTabs('Community Mod') {@Override public ItemStack getTabIconItem() {return new ItemStack(computer);}};");
	}
	
	
	/// Registries
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
	public static void registerRenderItems(String modid, Item item, String itemregistryname){
		System.out.println("Now Rendering @: " + modid  + ":" + itemregistryname);
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(modid  + ":" + itemregistryname, "inventory"));
	}
	// Item Render
	/// End Model Renders
	
	// For Deployment
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		ModHelperStart();
		System.out.println("Mod Helper 2017");
		System.out.println(String.valueOf(help.get(scanner.nextInt())));
	}
}