package com.dokko.optium.screen;

import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.text.Text;

public class OptiumSettingsScreen extends Screen {

    private final Screen parent;

    public OptiumSettingsScreen(Screen parent) {
        super(Text.translatable("optium.menu.settings"));
        this.parent = parent;
    }

    @Override
    public void close() {
        this.client.setScreen(this.parent);
    }

    @Override
    public void render(DrawContext context, int mouseX, int mouseY, float delta) {
        super.render(context, mouseX, mouseY, delta);
    }
}
