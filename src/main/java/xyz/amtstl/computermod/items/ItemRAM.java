package xyz.amtstl.computermod.items;

import net.minecraft.item.Item;
import xyz.amtstl.computermod.preinit.ModBlocks;

public class ItemRAM extends Item {
	public ItemRAM() {
		this.setRegistryName("itemram");
		this.setUnlocalizedName("itemram");
		this.setCreativeTab(ModBlocks.tab);
	}
}