package xyz.amtstl.computermod.preinit;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import xyz.amtstl.computermod.blocks.BlockComputer;
import xyz.amtstl.computermod.blocks.BlockLaptop;
import xyz.amtstl.computermod.misc.ModHelper;

public class ModBlocks {	
	public static Block computer;
	public static Block laptop;
	
	public static void preInit() {	
		// register blocks here
		computer = new BlockComputer();
		laptop = new BlockLaptop();
		
		ModHelper.MyModBlocks.add(ModBlocks.computer);
		ModHelper.MyModBlocks.add(ModBlocks.laptop);
		
		ModHelper.registerBlock(computer);
		ModHelper.registerBlock(laptop);
	}
	
	public static CreativeTabs tab = new CreativeTabs("Community Mod") {
		@Override public ItemStack getTabIconItem() {
			return new ItemStack(computer);
		}
	};
}