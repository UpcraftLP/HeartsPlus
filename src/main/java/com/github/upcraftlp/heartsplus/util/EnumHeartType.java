package com.github.upcraftlp.heartsplus.util;

import com.github.upcraftlp.heartsplus.Reference;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.MathHelper;

import java.util.Locale;

/**
 * @author UpcraftLP
 */
public enum EnumHeartType {

    RED,
    BLACK,
    WHITE;
    //ROTTEN; //TODO rotten type

    private final ResourceLocation texture;

    EnumHeartType() {
        this.texture = new ResourceLocation(Reference.MODID, "textures/items/" + this.name().toLowerCase(Locale.ROOT) + "_heart.png");
    }

    public ResourceLocation getTextureLocation() {
        return this.texture;
    }

    public static EnumHeartType getTypeFromStack(ItemStack stack) {
        return values()[MathHelper.clamp(stack.getMetadata(), 0, values().length)];
    }
}
