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

    public static final RegistryObject<Item> alexandrite = ITEMS.register("alexandrite", () -> new Item(
                    new Item.Properties().setId(ITEMS.key("alexandrite"))));

    public static final RegistryObject<Item> RAW_alexandrite = ITEMS.register("raw_alexandrite", () -> new Item(
            new Item.Properties().setId(ITEMS.key("raw_alexandrite"))));

    public static final RegistryObject<Item> alexandrite_block = ITEMS.register("alexandrite_block", () -> new BlockItem(
            ModBlocks.ALEXANDRITE_BLOCK.get(), new Item.Properties().setId(ITEMS.key("alexandrite_block"))));

    public static final RegistryObject<Item> RAW_alexandrite_block = ITEMS.register("raw_alexandrite_block", () -> new BlockItem(
            ModBlocks.RAW_ALEXANDRITE_BLOCK.get(), new Item.Properties().setId(ITEMS.key("raw_alexandrite_block"))));

    public static final RegistryObject<Item> blueprint_builder = ITEMS.register("blueprint_builder", () -> new BlockItem(
            ModBlocks.blueprint_builder.get(), new Item.Properties().setId(ITEMS.key("blueprint_builder"))));

    public static final RegistryObject<Item> ALEXANDRITE_ORE_ITEM = ITEMS.register("alexandrite_ore", () -> new BlockItem(
            ModBlocks.ALEXANDRITE_ORE_BLOCK.get(), new Item.Properties().setId(ITEMS.key("alexandrite_ore"))));

    public static final RegistryObject<Item> DEEPSLATE_ALEXANDRITE_ORE_ITEM = ITEMS.register("deepslate_alexandrite_ore", () -> new BlockItem(
            ModBlocks.DEEPSLATE_ALEXANDRITE_ORE_BLOCK.get(), new Item.Properties().setId(ITEMS.key("deepslate_alexandrite_ore"))));

}
