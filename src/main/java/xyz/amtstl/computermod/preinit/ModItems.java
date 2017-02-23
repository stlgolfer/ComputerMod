package xyz.amtstl.computermod.preinit;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import xyz.amtstl.computermod.items.ItemMotherboard;
import xyz.amtstl.computermod.misc.ModHelper;

public class ModItems {
	public static Item motherboard;
	
	public static void preInit(){
		motherboard = new ItemMotherboard();
		
		ModHelper.MyModItems.add(ModItems.motherboard);
		
		ModHelper.registerModItems();
		
		GameRegistry.addShapedRecipe(new ItemStack(motherboard, 2), new Object[] {"#I#", "III", "#I#", '#', Items.CLAY_BALL, 'I', Blocks.SAND});
	}
}