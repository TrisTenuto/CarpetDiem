package net.tristenuto.CarpetExpansion.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.tristenuto.CarpetExpansion.CarpetExpansion;
import net.tristenuto.CarpetExpansion.block.ModBlocks;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, CarpetExpansion.MOD_ID);

    public static final RegistryObject<CreativeModeTab> CARPET_TAB = CREATIVE_MODE_TABS.register("carpet_expansion_tab",
            () -> CreativeModeTab.builder()
                    .title(Component.translatable("tab.carpet_expansion_tab"))
                    .icon(() -> new ItemStack(ModBlocks.ARCADE.get()))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModBlocks.ARCADE.get());
                        output.accept(ModBlocks.AQUA.get());
                        output.accept(ModBlocks.CROCODILE.get());
                        output.accept(ModBlocks.DAISY.get());
                        output.accept(ModBlocks.FLORAL.get());
                        output.accept(ModBlocks.FRACTAL.get());
                        output.accept(ModBlocks.GINGHAM.get());
                        output.accept(ModBlocks.GREEK.get());
                        output.accept(ModBlocks.LINES.get());
                        output.accept(ModBlocks.RAINBOW.get());
                        output.accept(ModBlocks.RIPPLES.get());
                        output.accept(ModBlocks.STRIPED.get());
                        output.accept(ModBlocks.SUN.get());
                        output.accept(ModBlocks.VINE.get());
                        output.accept(ModBlocks.WEAVE.get());
                        output.accept(ModBlocks.WHOOSH.get());
                    }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
