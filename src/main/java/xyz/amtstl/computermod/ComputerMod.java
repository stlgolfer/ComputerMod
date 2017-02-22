package xyz.amtstl.computermod;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import xyz.amtstl.computermod.preinit.ModBlocks;

@Mod(modid = Resources.MOD_ID, name = Resources.MOD_NAME, version = Resources.VERSION)
public class ComputerMod {
	
	@EventHandler
	public static void preInit(FMLPreInitializationEvent event) {
		ModBlocks.preInit();
	}
	
	@EventHandler
	public static void init(FMLInitializationEvent event) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(ModBlocks.computer), 0, new ModelResourceLocation("computermod:blockcomputer", "inventory"));
	}
}