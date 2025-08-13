package blueprint_architect;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import static blueprint_architect.BlueprintArchitect.MODID;
import static blueprint_architect.item.ModItems.ALEXANDRITE_ITEM;
import static blueprint_architect.item.ModItems.ITEMS;

public class CreativeTabs {

    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MODID);

    public static final RegistryObject<CreativeModeTab> CREATIVE_TAB = CREATIVE_MODE_TABS.register("creative_tab", () -> CreativeModeTab.builder()
            // Set name of tab to display
            .title(Component.translatable("creativetab." + MODID + ".creative_tab"))
            // Set icon of creative tab
            .icon(() -> new ItemStack(ALEXANDRITE_ITEM.get()))
            // Add default items to tab
            .withTabsBefore(CreativeModeTabs.SPAWN_EGGS)
            .displayItems((params, output) -> {
                for (RegistryObject<Item> item : ITEMS.getEntries()) {
                    output.accept(item.get());
                }
            })
            .build()
    );

    // Add the example block item to the building blocks tab
    public static void addCreative(BuildCreativeModeTabContentsEvent event) {
        return;
//        if (event.getTabKey() == CreativeModeTabs.INGREDIENTS) {
//            for (RegistryObject<Item> item : ITEMS.getEntries()) {
//                event.accept(item.get());
//            }
//        }
    }
}
