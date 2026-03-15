package io.github.randomusert.mods.tinutils.neoforge.plugin;


import io.github.randomusert.mods.tinutils.item.TinutilsItems;
import mezz.jei.api.IModPlugin;
import mezz.jei.api.JeiPlugin;
import mezz.jei.api.constants.VanillaTypes;
import mezz.jei.api.registration.IRecipeRegistration;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import io.github.randomusert.mods.tinutils.Tinutils;
import net.minecraft.world.item.ItemStack;



@JeiPlugin
public class TinutilsJEIPlugin implements IModPlugin {
    private static final ResourceLocation UID = ResourceLocation.fromNamespaceAndPath(Tinutils.MOD_ID, "tinutils_jei_plugin");
    @Override
    public ResourceLocation getPluginUid() {
        return UID;
    }

    @Override
    public void registerRecipes(IRecipeRegistration registration) {
        registration.addIngredientInfo(
                new ItemStack(TinutilsItems.CRUDE_DIAMOND.get()),
                VanillaTypes.ITEM_STACK,
                Component.translatable("jei.tinutils.items.crude_diamond.info"));
    }
}
