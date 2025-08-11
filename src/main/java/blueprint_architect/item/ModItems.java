package blueprint_architect.item;

import blueprint_architect.BlueprintArchitect;
import blueprint_architect.block.ModBlocks;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, BlueprintArchitect.MODID);

    public static final RegistryObject<Item> TEST_ITEM = ITEMS.register("test_item", () -> new Item(
                    new Item.Properties().setId(ITEMS.key("test_item"))));

    public static final RegistryObject<Item> RAW_TEST_ITEM = ITEMS.register("raw_test_item", () -> new Item(
            new Item.Properties().setId(ITEMS.key("raw_test_item"))));

    public static final RegistryObject<Item> TEST_BLOCK_ITEM = ITEMS.register("test_block_item", () -> new BlockItem(
            ModBlocks.TEST_BLOCK.get(), new Item.Properties().setId(ITEMS.key("test_block_item"))));

    public static final RegistryObject<Item> RAW_TEST_BLOCK_ITEM = ITEMS.register("raw_test_block_item", () -> new BlockItem(
            ModBlocks.TEST_BLOCK.get(), new Item.Properties().setId(ITEMS.key("raw_test_block_item"))));
}
