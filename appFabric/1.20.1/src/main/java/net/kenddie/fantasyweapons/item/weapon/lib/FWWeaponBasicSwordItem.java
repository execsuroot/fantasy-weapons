package net.kenddie.fantasyweapons.item.weapon.lib;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;

public class FWWeaponBasicSwordItem extends SwordItem {

    public FWWeaponBasicSwordItem(Tier tier, int damage, float speed, Item.Properties properties) {
        super(tier, damage, speed, properties);
    }
}