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
	public void generate(Random rand, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {

	    generateOverworld(rand, chunkX, chunkZ, world);
	    generateNether(rand, chunkX, chunkZ, world);
	    generateEnd(rand, chunkX, chunkZ, world);

	}

	private void generateOverworld(Random rand, int chunkX, int chunkZ, World world) {

	  generateOverworld(world, rand, chunkX * 16, chunkZ * 16);

	}

	private void generateNether(Random rand, int chunkX, int chunkZ, World world) {

	  generateNether(world, rand, chunkX * 16, chunkZ * 16);

	}

	private void generateEnd(Random rand, int chunkX, int chunkZ, World world) {

	  generateEnd(world, rand, chunkX * 16, chunkZ * 16);

	}

	public void generateOverworld(World world, Random rand, int blockXPos, int blockZPos) {

	  addOreSpawn(BaseDiplomka.crystallobsidianore, Blocks.stone, world, rand, blockXPos, blockZPos, 16, 16, 1, 2, 1, 1, 10, 5, 6);

	}

	public void generateNether(World world, Random rand, int blockXPos, int blockZPos) {

	  addOreSpawn(BaseDiplomka.crystallobsidianore, Blocks.netherrack, world, rand, blockXPos, blockZPos, 16, 16, 1, 2, 1, 1, 10, 5, 6);

	}

	public void generateEnd(World world, Random rand, int blockXPos, int blockZPos) {

	  addOreSpawn(BaseDiplomka.crystallobsidianore, Blocks.end_stone, world, rand, blockXPos, blockZPos, 16, 16, 1, 2, 1, 1, 10, 5, 6);

	}

	/**
	  * Добавляет генерацию руды в Minecraft. Просто воспользуйтесь этим методом для регистрации генерируемых руд.

	  * @param block              Блок, который хотите генерировать
	  * @param block replace      Блок, рядом с которым хотите генерировать
	  * @param world              Мир (не измерение), в котором этот блок должен генерироваться
	  * @param random             Случайное число для получения координат генерации блока
	  * @param blockXPos          Число для того, чтобы было пустое место по координатам X для метода генерации (использует кварцевая руда)
	  * @param blockZPos          Число для того, чтобы было пустое место по координатам Z для метода генерации (использует кварцевая руда)
	  * @param maxX               Число, которое настроит максимальную X координату для генерации руды на оси X на чанк
	  * @param maxZ               Число, которое настроит максимальную Z координату для генерации руды на оси Z на чанк
	  * @param minVeinSize        Минимальное число блоков руды в одной жиле
	  * @param maxVeinSize        Максимальное число блоков руды в одной жиле
	  * @param minVeinsPerChunk   Минимальное число жил в чанке
	  * @param maxVeinsPerChunk   Максимальное число жил в чанке
	  * @param chancesToSpawn     Шанс генерации блоков на чанк в процентах
	  * @param minY               Минимальная координата Y на которой руда может сгенерироваться
	  * @param maxY               Максимальная координата Y на которой руда может сгенерироваться
	**/

	public static void addOreSpawn(Block ore, Block replace, World world, Random rand, int blockXPos, int blockZPos, int maxX, int maxZ,
	int minVeinSize, int maxVeinSize, int minVeinsPerChunk, int maxVeinsPerChunk, int chanceToSpawn, int minY, int maxY) {
	  if (rand.nextInt(101) < (100 - chanceToSpawn)) return;
	  int veins = rand.nextInt(maxVeinsPerChunk - minVeinsPerChunk + 1) + minVeinsPerChunk;
	  for (int i = 0; i < veins; i++) {
	    int posX = blockXPos + rand.nextInt(maxX);
	    int posY = minY + rand.nextInt(maxY - minY);
	    int posZ = blockZPos + rand.nextInt(maxZ);
	    (new WorldGenMinable(ore, minVeinSize + rand.nextInt(maxVeinSize - minVeinSize + 1),
	      replace)).generate(world, rand, posX, posY, posZ);
	  }
	}
}
