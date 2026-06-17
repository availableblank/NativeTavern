package com.miaomiaoxworld.nativetavern

import android.app.Application
import android.app.NotificationChannel
import android.app.NotificationManager
import android.os.Build

class NativeTavernApplication : Application() {

    companion object {
        const val CHANNEL_TTS = "tts_playback"
        const val CHANNEL_BACKUP = "backup_sync"
        const val CHANNEL_GENERAL = "general"
    }

    override fun onCreate() {
        super.onCreate()
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            val manager = getSystemService(NOTIFICATION_SERVICE) as NotificationManager
            manager.createNotificationChannels(
                listOf(
                    NotificationChannel(
                        CHANNEL_TTS,
                        getString(R.string.channel_tts_name),
                        NotificationManager.IMPORTANCE_LOW
                    ).apply {
                        description = getString(R.string.channel_tts_desc)
                        setShowBadge(false)
                    },
                    NotificationChannel(
                        CHANNEL_BACKUP,
                        getString(R.string.channel_backup_name),
                        NotificationManager.IMPORTANCE_DEFAULT
                    ).apply {
                        description = getString(R.string.channel_backup_desc)
                    },
                    NotificationChannel(
                        CHANNEL_GENERAL,
                        getString(R.string.channel_general_name),
                        NotificationManager.IMPORTANCE_DEFAULT
                    ).apply {
                        description = getString(R.string.channel_general_desc)
                    }
                )
            )
        }
    }
}