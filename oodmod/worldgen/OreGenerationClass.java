package oodmod.worldgen;

import java.util.Random;

import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import oodmod.block.BlockClass;
import oodmod.main.MainClass;
import cpw.mods.fml.common.IWorldGenerator;

public class OreGenerationClass implements IWorldGenerator {

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
		
	generate(world, random, chunkX*16, chunkZ*16);
		
	}

	private void generate(World world, Random random, int x, int z) {
		
		for(int i = 0; i < 2; i++) {
			int chunkX = x + random.nextInt(16);
			int chunkY = random.nextInt(20);
			int chunkZ = z + random.nextInt(16);
			
			(new WorldGenMinable(BlockClass.KroostylOre, 4)).generate(world, random, chunkX, chunkY, chunkZ);
		}
		
	}

}