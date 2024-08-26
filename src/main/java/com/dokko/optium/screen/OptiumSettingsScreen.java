package com.dokko.optium.screen;

import com.dokko.optium.config.OptiumConfig;
import net.minecraft.client.gui.screen.Screen;
import net.uku3lig.ukulib.config.ConfigManager;
import net.uku3lig.ukulib.config.option.CyclingOption;
import net.uku3lig.ukulib.config.option.WidgetCreator;
import net.uku3lig.ukulib.config.screen.AbstractConfigScreen;

public class OptiumSettingsScreen extends AbstractConfigScreen<OptiumConfig> {
    public OptiumSettingsScreen(Screen parent, ConfigManager<OptiumConfig> manager) {
        super("optium.menu.settings", parent, manager);
    }

    @Override
    protected WidgetCreator[] getWidgets(OptiumConfig config) {
        return new WidgetCreator[] {
                CyclingOption.ofBoolean("optium.feature.zfirstpass", config.isZFirstPass(), config::setZFirstPass)
        };
    }
}
