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

    public static final RegistryObject<Item> ALEXANDRITE_ITEM = ITEMS.register("alexandrite_item", () -> new Item(
                    new Item.Properties().setId(ITEMS.key("alexandrite_item"))));

    public static final RegistryObject<Item> RAW_ALEXANDRITE_ITEM = ITEMS.register("raw_alexandrite_item", () -> new Item(
            new Item.Properties().setId(ITEMS.key("raw_alexandrite_item"))));

    public static final RegistryObject<Item> ALEXANDRITE_BLOCK_ITEM = ITEMS.register("alexandrite_block_item", () -> new BlockItem(
            ModBlocks.ALEXANDRITE_BLOCK.get(), new Item.Properties().setId(ITEMS.key("alexandrite_block_item"))));

    public static final RegistryObject<Item> RAW_ALEXANDRITE_BLOCK_ITEM = ITEMS.register("raw_alexandrite_block_item", () -> new BlockItem(
            ModBlocks.RAW_ALEXANDRITE_BLOCK.get(), new Item.Properties().setId(ITEMS.key("raw_alexandrite_block_item"))));

    public static final RegistryObject<Item> BLUEPRINT_BUILDER_BLOCK_ITEM = ITEMS.register("blueprint_builder_block_item", () -> new BlockItem(
            ModBlocks.BLUEPRINT_BUILDER_BLOCK.get(), new Item.Properties().setId(ITEMS.key("blueprint_builder_block_item"))));

    public static final RegistryObject<Item> ALEXANDRITE_ORE = ITEMS.register("alexandrite_ore", () -> new BlockItem(
            ModBlocks.ALEXANDRITE_ORE.get(), new Item.Properties().setId(ITEMS.key("alexandrite_ore"))));

    public static final RegistryObject<Item> DEEPSLATE_ALEXANDRITE_ORE = ITEMS.register("deepslate_alexandrite_ore", () -> new BlockItem(
            ModBlocks.DEEPSLATE_ALEXANDRITE_ORE.get(), new Item.Properties().setId(ITEMS.key("deepslate_alexandrite_ore"))));

}
