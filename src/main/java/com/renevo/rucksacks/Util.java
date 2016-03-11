package com.renevo.rucksacks;

import net.minecraft.util.ResourceLocation;
import net.minecraft.util.StatCollector;

import java.util.Locale;

public final class Util {
    private Util() {}

    public static final String MODID = "rucksacks";

    public static final String RESOURCE = MODID.toLowerCase(Locale.US);

    public static String resource(String res) {
        return String.format("%s:%s", RESOURCE, res);
    }

    public static ResourceLocation getResource(String res) {
        return new ResourceLocation(RESOURCE, res);
    }

    public static String prefix(String name) {
        return String.format("%s.%s", RESOURCE, name.toLowerCase(Locale.US));
    }

    public static String makeLocString(String unclean) {
        return unclean.toLowerCase(Locale.US).replaceAll(" ", "");
    }

    public static String translateRecursive(String key, Object... params) {
        return StatCollector.translateToLocal(StatCollector.translateToLocalFormatted(key, params));
    }
}
