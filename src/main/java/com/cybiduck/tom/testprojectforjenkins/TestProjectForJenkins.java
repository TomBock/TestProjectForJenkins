package com.cybiduck.tom.testprojectforjenkins;

import org.bukkit.plugin.java.JavaPlugin;

public final class TestProjectForJenkins extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println("TestProjectForJenkins is activated.");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
