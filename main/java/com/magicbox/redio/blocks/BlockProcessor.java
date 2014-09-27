package com.magicbox.redio.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

import com.magicbox.redio.common.Constants;
import com.magicbox.redio.common.Instances;
import com.magicbox.redio.entities.EntityProcessor;

public class BlockProcessor extends BlockBase
{
	public BlockProcessor(Material material)
	{
		super(material);
		setHardness(3.0f);
		setStepSound(Block.soundTypeStone);
		setBlockName(Constants.Processor.BLOCK_NAME);
		setCreativeTab(Instances.creativeTab);
		setHarvestLevel("pickaxe", 1);
		setBlockTextureName(Constants.getTextureName(Constants.Processor.BLOCK_NAME));
	}

	@Override
	public TileEntity createNewTileEntity(World world, int meta)
	{
		return new EntityProcessor();
	}
}