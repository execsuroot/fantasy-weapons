package net.kenddie.fantasyweapons.item;

import net.kenddie.fantasyweapons.FantasyWeapons;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class FWCreativeModTabs {

    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, FantasyWeapons.MOD_ID);

    public static final RegistryObject<CreativeModeTab> FANTASY_WEAPONS_TAB =
            CREATIVE_MODE_TABS.register(
                    "fw_tab",
                    () -> CreativeModeTab.builder()
                            .icon(() -> new ItemStack(FWItems.WEAPON_ECLIPSE_SOLDIER_SPEAR.get()))
                            .title(Component.translatable("itemGroup." + FantasyWeapons.MOD_ID + ".fw_tab"))
                            .displayItems((pParameters, pOutput) -> {
                                pOutput.accept(FWItems.BLAZING_STONE.get());
                                pOutput.accept(FWItems.WEAPON_FATES_BEACON.get());
                                pOutput.accept(FWItems.WEAPON_DRAGONSLAYER_HALBERD.get());
                                pOutput.accept(FWItems.WEAPON_ECLIPSE_SOLDIER_SPEAR.get());
                                pOutput.accept(FWItems.WEAPON_HERO_CLAYMORE.get());
                                pOutput.accept(FWItems.WEAPON_THIEF_DAGGER.get());
                                pOutput.accept(FWItems.WEAPON_GOLDEN_HORNS_BATTLEAXE.get());
                                pOutput.accept(FWItems.WEAPON_WANDERING_WIZARD_SWORD.get());
                                pOutput.accept(FWItems.WEAPON_DARK_LORD_SWORD.get()); 
                                pOutput.accept(FWItems.WEAPON_SUNSET_WINGS_CLAYMORE.get()); 
                                pOutput.accept(FWItems.WEAPON_CHESS_BOARD_KNIGHT_POLEARM.get()); 
                                pOutput.accept(FWItems.WEAPON_HEFTY_CLUB.get()); 
                                pOutput.accept(FWItems.WEAPON_GOLDEN_HALBERD.get()); 
                                pOutput.accept(FWItems.WEAPON_OLD_BROADSWORD.get()); 
                                pOutput.accept(FWItems.WEAPON_OLD_DAGGER.get()); 
                                pOutput.accept(FWItems.WEAPON_OLD_BLADE.get()); 
                                pOutput.accept(FWItems.WEAPON_KINGSLAAYER.get()); 
                                pOutput.accept(FWItems.WEAPON_CURSED_BLADE.get()); 
                                pOutput.accept(FWItems.WEAPON_FURY_OF_THE_STORM.get()); 
                                pOutput.accept(FWItems.WEAPON_DRAGONS_DOOM.get()); 
                                pOutput.accept(FWItems.WEAPON_CRIMSON_REAPER.get()); 
                                pOutput.accept(FWItems.WEAPON_SHARP_SWORD.get()); 
                                pOutput.accept(FWItems.WEAPON_INFECTED_SHARP_SWORD.get()); 
                                pOutput.accept(FWItems.WEAPON_SHARP_CURVED_SWORD.get()); 
                                pOutput.accept(FWItems.WEAPON_INFECTED_SHARP_CURVED_SWORD.get()); 
                                pOutput.accept(FWItems.WEAPON_SHARP_SPEAR.get()); 
                                pOutput.accept(FWItems.WEAPON_INFECTED_SHARP_SPEAR.get());
                                pOutput.accept(FWItems.WEAPON_BLACK_KATANA.get());
                            })
                            .build()
            );


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}