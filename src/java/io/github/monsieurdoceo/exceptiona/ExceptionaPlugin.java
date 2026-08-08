package io.github.monsieurdoceo.exceptiona;

import org.bukkit.plugin.java.JavaPlugin;

public final class ExceptionaPlugin extends JavaPlugin {
    @Override
        public void onEnable() {
            getLogger().info("MyPaperPlugin for Paper 1.21.10 has been enabled!");
        }

        @Override
        public void onDisable() {
            getLogger().info("MyPaperPlugin has been disabled.");
        }
}
