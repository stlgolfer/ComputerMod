package xyz.amtstl.computermod.preinit;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import xyz.amtstl.computermod.blocks.BlockComputer;
import xyz.amtstl.computermod.blocks.BlockLaptop;
import xyz.amtstl.computermod.blocks.BlockMonitor;
import xyz.amtstl.computermod.misc.ModHelper;

public class ModBlocks {
	public static Block computer;
	public static Block laptop;
	public static Block monitor;
	
	public static void preInit() {
		
		// register blocks here
		computer = new BlockComputer();
		laptop = new BlockLaptop();
		monitor = new BlockMonitor();
		
		ModHelper.MyModBlocks.add(ModBlocks.computer);
		ModHelper.MyModBlocks.add(ModBlocks.laptop);
		ModHelper.MyModBlocks.add(ModBlocks.monitor);
		
		// register creative tabs
		ModHelper.registerModBlocks();
		
		// add recipes
		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.computer), new Object[] {"#B#", "AIA", "#C#", '#', Blocks.OBSIDIAN, 'I', ModItems.motherboard, 'A', ModItems.ram, 'C', ModItems.cpu, 'B', ModItems.gpu});
		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.laptop), new Object[] {"#A#", "#I#", "EEE", '#', Blocks.OBSIDIAN, 'I', ModItems.motherboard, 'E', Blocks.STONE, 'A', Blocks.GLASS_PANE});
		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.monitor, 1), new Object[] {"###", "#I#", "#E#", '#', Blocks.STONE, 'I', ModItems.cpu, 'E', Blocks.GLASS_PANE});
	}
	
	public static CreativeTabs tab = new CreativeTabs("Computer Mod") {
		@Override public ItemStack getTabIconItem() {
			return new ItemStack(computer);
		}
	};
}