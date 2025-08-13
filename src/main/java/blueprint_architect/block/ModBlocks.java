package blueprint_architect.block;

import blueprint_architect.BlueprintArchitect;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
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

    public static final RegistryObject<Block> BLUEPRINT_BUILDER_BLOCK = BLOCKS.register("blueprint_builder_block", () -> new Block(
            Block.Properties.of().setId(BLOCKS.key("blueprint_builder_block"))));
}
