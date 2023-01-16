package net.printer.spiced.items;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.printer.spiced.SpicedMod;

public class Tools {
    public static final Item KNIFE = registerTools("knife", new Item(new FabricItemSettings()));

    public static Item registerTools(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(SpicedMod.MOD_ID, name), item);
    }

    public static void registerModTools() {
        SpicedMod.LOGGER.debug("Registering mod items for " + SpicedMod.MOD_ID);
    }
}