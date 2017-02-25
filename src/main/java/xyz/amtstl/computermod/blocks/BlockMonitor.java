package xyz.amtstl.computermod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.World;
import xyz.amtstl.computermod.preinit.ModBlocks;

public class BlockMonitor extends Block {
	public static boolean monitor_status;
	
	public BlockMonitor() {
		super(Material.ROCK);
		this.setRegistryName("blockmonitor");
		this.setUnlocalizedName("blockmonitor");
		this.setCreativeTab(ModBlocks.tab);
		this.monitor_status = false;
	}
	
	@Override
	public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ)
    {
		if (!worldIn.isRemote) {
			if (facing.equals(facing.SOUTH) || facing.equals(facing.NORTH)) {
				if (monitor_status == false) {
					monitor_status = true;
					playerIn.sendMessage(new TextComponentString("Monitor is on"));
				}
				else if (monitor_status == true) {
					monitor_status = false;
					playerIn.sendMessage(new TextComponentString("Monitor is off"));
				}
			}
			else {
				System.out.println("BLOCKMONITOR: Didn't click a handled face");
			}
		}
        return true;
    }
}