package xyz.amtstl.computermod.preinit;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import xyz.amtstl.computermod.items.ItemCPU;
import xyz.amtstl.computermod.items.ItemGPU;
import xyz.amtstl.computermod.items.ItemMotherboard;
import xyz.amtstl.computermod.misc.ModHelper;

public class ModItems {
	public static Item motherboard;
	public static Item gpu;
	public static Item cpu;
	
	public static void preInit(){
		motherboard = new ItemMotherboard();
		gpu = new ItemGPU();
		cpu = new ItemCPU();
		
		ModHelper.MyModItems.add(ModItems.motherboard);
		ModHelper.MyModItems.add(ModItems.gpu);
		ModHelper.MyModItems.add(cpu);
		
		ModHelper.registerModItems();
		
		GameRegistry.addShapedRecipe(new ItemStack(motherboard, 2), new Object[] {"#I#", "III", "#I#", '#', Items.CLAY_BALL, 'I', Blocks.SAND});
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.gpu), new Object[] {"EEE", "#I#", "EEE", 'E', Blocks.OBSIDIAN, '#', Items.REDSTONE, 'I', ModItems.cpu});
		GameRegistry.addShapedRecipe(new ItemStack(cpu, 1), new Object[] {"#I#", "AEA", "#I#", '#', Blocks.STONE, 'I', Blocks.IRON_BLOCK, 'E', Items.GOLD_NUGGET, 'A', Items.REDSTONE});
	}
}