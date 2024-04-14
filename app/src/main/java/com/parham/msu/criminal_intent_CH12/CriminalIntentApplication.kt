package com.parham.msu.criminal_intent_CH12

import android.app.Application

class CriminalIntentApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        CrimeRepository.initialize(this)
    }
}