package com.scripterae03.diplomka;

import java.util.Random;

import cpw.mods.fml.common.IWorldGenerator;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;

public class COOBlockGenerator implements IWorldGenerator{
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
		switch(world.provider.dimensionId) {
		case 0 :
			//Generate our surface world
			generateSurface(world, random, chunkX*16, chunkZ*16);
		}
		
	}

	private void generateSurface(World world, Random random, int x, int z) {
		//this.addOreSpawn(Nealecraft.oreWhatever, world, random, i=blockXPos, j= blockZPos, maxX, maxZ, maxVeinSize, chancetospawn, minY, maxY); 
		this.addOreSpawn(BaseDiplomka.crystallobsidianore, world, random, x, z, 16, 16, 4+random.nextInt(6), 25, 38, 100);
		
	}

	private void addOreSpawn(Block block, World world, Random random, int blockXPos, int blockZPos, int maxX, int maxZ, int maxVeinSize, int chanceToSpawn, int minY, int maxY) {
		for(int i = 0; i < chanceToSpawn; i++) {
			int posX = blockXPos + random.nextInt(maxX);
			int posY = minY + random.nextInt(maxY - minY);
			int posZ = blockZPos + random.nextInt(maxZ);
			(new WorldGenMinable(block, maxVeinSize)).generate(world, random, posX, posY, posZ);
		}
	}
}
