package xyz.amtstl.computermod.preinit;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import xyz.amtstl.computermod.items.ItemCPU;
import xyz.amtstl.computermod.items.ItemCrumpet;
import xyz.amtstl.computermod.items.ItemGPU;
import xyz.amtstl.computermod.items.ItemMotherboard;
import xyz.amtstl.computermod.items.ItemRAM;
import xyz.amtstl.computermod.misc.ModHelper;

public class ModItems {
	public static Item motherboard;
	public static Item gpu;
	public static Item cpu;
	public static Item ram;
	public static Item crumpet;
	
	public static void preInit(){
		motherboard = new ItemMotherboard();
		gpu = new ItemGPU();
		cpu = new ItemCPU();
		ram = new ItemRAM();
		crumpet = new ItemCrumpet();
		
		ModHelper.MyModItems.add(ModItems.motherboard);
		ModHelper.MyModItems.add(ModItems.gpu);
		ModHelper.MyModItems.add(cpu);
		ModHelper.MyModItems.add(ram);
		ModHelper.MyModItems.add(crumpet);
		
		ModHelper.registerModItems();
		
		GameRegistry.addShapedRecipe(new ItemStack(motherboard, 2), new Object[] {"#I#", "III", "#I#", '#', Items.CLAY_BALL, 'I', Blocks.SAND});
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.gpu), new Object[] {"EEE", "#I#", "EEE", 'E', Blocks.OBSIDIAN, '#', Items.REDSTONE, 'I', ModItems.cpu});
		GameRegistry.addShapedRecipe(new ItemStack(cpu, 1), new Object[] {"#I#", "AEA", "#I#", '#', Blocks.STONE, 'I', Blocks.IRON_BLOCK, 'E', Items.GOLD_NUGGET, 'A', Items.REDSTONE});
		GameRegistry.addShapedRecipe(new ItemStack(ram, 2), new Object[] {"###", "#I#", "###", '#', Blocks.IRON_BARS, 'I', ModItems.cpu});
		GameRegistry.addShapedRecipe(new ItemStack(crumpet, 1), new Object[] {"###", "#I#", "###", '#', Items.BREAD, 'I', Items.CAKE});
	}
}