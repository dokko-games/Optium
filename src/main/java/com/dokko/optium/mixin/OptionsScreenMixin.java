package com.dokko.optium.mixin;

import com.dokko.optium.screen.OptiumSettingsScreen;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.screen.option.OptionsScreen;
import net.minecraft.client.gui.widget.ButtonWidget;
import net.minecraft.text.Text;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(OptionsScreen.class)
public abstract class OptionsScreenMixin extends Screen {
    protected OptionsScreenMixin(Text title) {
        super(title);
    }

    @Inject(method = "init", at = @At("RETURN"))
    public void addButton(CallbackInfo ci) {
        //yes uku I got this from your mod any problem?
        ButtonWidget credits = this.children().stream()
                .filter(c -> c instanceof ButtonWidget b && b.getMessage().equals(Text.translatable("options.accessibility")))
                .map(ButtonWidget.class::cast)
                .findFirst()
                .orElseGet(() -> ButtonWidget.builder(Text.empty(), b -> {}).build()); // should never happen
        this.addDrawableChild(ButtonWidget.builder(Text.translatable("optium.menu.settings"), (button) ->
                this.client.setScreen(new OptiumSettingsScreen(this))).dimensions(credits.getRight()+2, credits.getY(), 80, 20).build());
    }
}
