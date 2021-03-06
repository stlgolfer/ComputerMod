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

/**
 * <h1>ModHelper Class</h1>
 * <p>This class makes Forge mod development a little more simplified</p>
 * 
 * @author Alex M
 * @version 0.5
 * @since 2/24/17
 */

public class ModHelper {
	// Collections
	/**
	 * Collections for the mod
	 */
	public static List<Block> MyModBlocks = new ArrayList<Block>();
	public static List<Item> MyModItems = new ArrayList<Item>();
	public static List<CreativeTabs> MyModCreativeTabs = new ArrayList<CreativeTabs>();
	public static List<String> help = new ArrayList<String>();
	
	// Startup
	/** Adds help strings to the help array
	 * 
	 */
	public static void ModHelperStart() {
		help.add(0, "public static CreativeTabs tab = new CreativeTabs('Community Mod') {@Override public ItemStack getTabIconItem() {return new ItemStack(computer);}};");
	}
	
	/** Registers mod blocks from the array
	 * 
	 */
	public static void registerModBlocks(){
		for (Block i : MyModBlocks) {
			registerBlock(i);
		}
	}
	
	/**
	 * Registers mod items from the array
	 */
	public static void registerModItems() {
		for (Item i : MyModItems) {
			GameRegistry.register(i);
		}
	}
	
	/** Makes Creative Tabs
	 * Doesn't work
	 * @param tabs input tab
	 * @param name input name
	 * @param icon block selected for the icon of the creative tab
	 */
	public static void createCreativeTabs(CreativeTabs tabs, String name, final Block icon) {
		tabs = new CreativeTabs(name) {
			@Override public ItemStack getTabIconItem() {
				return new ItemStack(icon);
			}
		};
	}
	
	/// Registries
	private static void registerBlock(Block block) 
	{
		registerBlock(block, new ItemBlock(block));
	}
	
	private static void registerBlock(Block block, ItemBlock item) 
	{
		GameRegistry.register(block);
		item.setRegistryName(block.getRegistryName());
		GameRegistry.register(item);
	}
	
	/// End Registries
	
	/// Model Renders
	// Block Render
	/** Registers the renders for the blocks
	 * 
	 * @param modid is the modid
	 * @param block is the block
	 * @param itemregistryname registry name from the desired block
	 */
	public static void registerRenderBlocks(String modid, Block block, String itemregistryname){
		System.out.println("Now Rendering @: " + modid  + ":" + itemregistryname);
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(modid  + ":" + itemregistryname, "inventory"));
	}
	/** Registers the renders for the items
	 * 
	 * @param modid is the modid
	 * @param item is the item
	 * @param itemregistryname is the registry name from the desired item
	 */
	public static void registerRenderItems(String modid, Item item, String itemregistryname){
		System.out.println("Now Rendering @: " + modid  + ":" + itemregistryname);
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(modid  + ":" + itemregistryname, "inventory"));
	}
	// Item Render
	/// End Model Renders
	
	// For Deployment
	/** Deployment
	 * 
	 * @param args
	 */
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		ModHelperStart();
		System.out.println("Mod Helper 2017");
		System.out.println(String.valueOf(help.get(scanner.nextInt())));
	}
}