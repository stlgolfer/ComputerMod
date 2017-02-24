package xyz.amtstl.computermod.blocks;

import java.awt.TextComponent;

import org.fusesource.jansi.Ansi.Color;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.World;
import xyz.amtstl.computermod.Resources;
import xyz.amtstl.computermod.misc.HTTPHandler;
import xyz.amtstl.computermod.preinit.ModBlocks;

public class BlockComputer extends Block {
	private static boolean computer_status;
	
	public BlockComputer() {
		super(Material.ROCK);
		
		computer_status = false;
		this.setRegistryName("blockcomputer");
		this.setUnlocalizedName("blockcomputer");
		this.setCreativeTab(ModBlocks.tab);
	}
	
	/**
	 * Event listener for when the block is clicked
	 * Looks at computer_status
	 */
	@Override
	public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ)
    {
		if (!worldIn.isRemote){
			// check side, if the side is south, then contact chat server
			if (facing.equals(facing.SOUTH)) {
				try {
					playerIn.sendMessage(new TextComponentString(HTTPHandler.sendGet(Resources.CHAT_GET_IP)));
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			else if(!facing.equals(facing.SOUTH)) {
				if (computer_status == true) {
					playerIn.sendMessage(new TextComponentString("§aComputer is on!"));
					computer_status = false;
				}
				else if (computer_status == false) {
					playerIn.sendMessage(new TextComponentString("§cComputer is off!"));
					computer_status = true;
				}
			}
		}
        return true;
    }
}