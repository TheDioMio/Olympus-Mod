package net.thediomio.firstmod.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.thediomio.firstmod.FirstMod;
import net.thediomio.firstmod.block.ModBlocks;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MOD_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, FirstMod.MODID);

    public static void register(IEventBus eventBus) {
        CREATIVE_MOD_TABS.register(eventBus);
    }

    public static final RegistryObject<CreativeModeTab> TUTORIAL_TAB = CREATIVE_MOD_TABS.register("tutorial_tab",
    () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.SAPPHIRE.get()))
            .title(Component.translatable("creativetab.tutorial_tab"))
            .displayItems((itemDisplayParameters, output) -> {
              output.accept(ModItems.SAPPHIRE.get());
              output.accept(ModBlocks.SAPPHIRE_BLOCK.get());
              output.accept(ModItems.ORICHALCUM_INGOT.get());
              output.accept(ModBlocks.ORICHALCUM_ORE.get());
              output.accept(ModItems.RAW_ORICHALCUM.get());
            })
            .build());
}
