package net.silentchaos512.lib;

import java.util.Map;

import com.google.common.collect.Maps;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.Instance;
import net.silentchaos512.lib.util.LocalizationHelper;

@Mod(modid = SilentLib.MOD_ID, name = SilentLib.MOD_ID, version = "@VERSION@", dependencies = SilentLib.DEPENDENCIES)
public class SilentLib {

  public static final String MOD_ID = "SilentLib";
  public static final String DEPENDENCIES = "required-after:Forge@[12.16.0.1826,);";

  @Instance(MOD_ID)
  public static SilentLib instance;

  private final Map<String, LocalizationHelper> locHelpers = Maps.newHashMap();

  public LocalizationHelper getLocalizationHelperForMod(String modId) {

    return locHelpers.get(modId.toLowerCase());
  }

  public void registerLocalizationHelperForMod(String modId, LocalizationHelper loc) {

    locHelpers.put(modId.toLowerCase(), loc);
  }
}
