package xyz.amtstl.computermod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import xyz.amtstl.computermod.preinit.ModBlocks;

public class BlockComputer extends Block {
	public BlockComputer() {
		super(Material.ROCK);
		
		this.setRegistryName("blockcomputer");
		this.setUnlocalizedName("blockcomputer");
		this.setCreativeTab(ModBlocks.tab);
	}
}