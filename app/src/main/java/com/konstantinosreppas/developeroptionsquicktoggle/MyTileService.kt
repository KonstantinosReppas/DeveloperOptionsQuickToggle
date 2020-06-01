package com.konstantinosreppas.developeroptionsquicktoggle

import android.content.Intent
import android.provider.Settings
import android.service.quicksettings.TileService

class MyTileService : TileService() {

    override fun onClick() {
        super.onClick()

        navigateToDeveloperOptions()
    }

    private fun navigateToDeveloperOptions() {
        val developerOptionsIntent = Intent(Settings.ACTION_APPLICATION_DEVELOPMENT_SETTINGS)
        developerOptionsIntent.flags = Intent.FLAG_ACTIVITY_NEW_TASK
        startActivity(developerOptionsIntent)
    }
}