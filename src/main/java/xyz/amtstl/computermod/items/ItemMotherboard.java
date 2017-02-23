package xyz.amtstl.computermod.items;

import net.minecraft.item.Item;
import xyz.amtstl.computermod.preinit.ModBlocks;

public class ItemMotherboard extends Item {
	public ItemMotherboard() {
		this.setRegistryName("itemmotherboard");
		this.setUnlocalizedName("itemmotherboard");
		this.setCreativeTab(ModBlocks.tab);
	}
}