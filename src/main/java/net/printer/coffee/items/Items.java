package net.printer.coffee.items;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.printer.coffee.CoffeeMod;

public class Items {
    public static final Item RAW_COFFEE_BEANS = registerItem("raw_coffee_beans", new Item(new FabricItemSettings()));
    public static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(CoffeeMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        CoffeeMod.LOGGER.debug("Registering mod items for " + CoffeeMod.MOD_ID);
    }
}
