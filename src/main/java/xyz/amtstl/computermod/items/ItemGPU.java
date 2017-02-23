package xyz.amtstl.computermod.items;

import net.minecraft.item.Item;
import xyz.amtstl.computermod.preinit.ModBlocks;

public class ItemGPU extends Item {
	public ItemGPU() {
		this.setRegistryName("itemgpu");
		this.setUnlocalizedName("itemgpu");
		this.setCreativeTab(ModBlocks.tab);
	}
}