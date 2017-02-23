package xyz.amtstl.computermod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import xyz.amtstl.computermod.preinit.ModBlocks;

public class BlockLaptop extends Block {
	public BlockLaptop() {
		super(Material.ROCK);
		this.setRegistryName("blocklaptop");
		this.setUnlocalizedName("blocklaptop");
		this.setCreativeTab(ModBlocks.tab);
	}
}