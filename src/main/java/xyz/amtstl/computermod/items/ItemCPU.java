package xyz.amtstl.computermod.items;

import net.minecraft.item.Item;
import xyz.amtstl.computermod.preinit.ModBlocks;

public class ItemCPU extends Item {
	public ItemCPU() {
		this.setRegistryName("itemcpu");
		this.setUnlocalizedName("itemcpu");
		this.setCreativeTab(ModBlocks.tab);
	}
}