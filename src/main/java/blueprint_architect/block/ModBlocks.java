package blueprint_architect.block;

import blueprint_architect.BlueprintArchitect;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlocks {

    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, BlueprintArchitect.MODID);

    public static final RegistryObject<Block> ALEXANDRITE_BLOCK = BLOCKS.register("alexandrite_block", () -> new Block(
            Block.Properties.of()
                    .setId(BLOCKS.key("alexandrite_block"))
                    .strength(4f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.AMETHYST)));

    public static final RegistryObject<Block> RAW_ALEXANDRITE_BLOCK = BLOCKS.register("raw_alexandrite_block", () -> new Block(
            Block.Properties.of().setId(BLOCKS.key("raw_alexandrite_block"))
                    .strength(3f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.AMETHYST)));

    public static final RegistryObject<Block> blueprint_builder = BLOCKS.register("blueprint_builder", () -> new Block(
            Block.Properties.of().setId(BLOCKS.key("blueprint_builder"))));

    public static final RegistryObject<Block> ALEXANDRITE_ORE_BLOCK = BLOCKS.register("alexandrite_ore",
            () -> new DropExperienceBlock(UniformInt.of(2, 4), BlockBehaviour.Properties.of()
                    .setId(BLOCKS.key("alexandrite_ore"))
                    .strength(4f)
                    .requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> DEEPSLATE_ALEXANDRITE_ORE_BLOCK = BLOCKS.register("deepslate_alexandrite_ore",
            () -> new DropExperienceBlock(UniformInt.of(3, 6), BlockBehaviour.Properties.of()
                    .setId(BLOCKS.key("deepslate_alexandrite_ore"))
                    .strength(5f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.DEEPSLATE)));
}
