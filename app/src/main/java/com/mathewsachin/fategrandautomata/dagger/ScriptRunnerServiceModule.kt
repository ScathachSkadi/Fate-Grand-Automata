package com.mathewsachin.fategrandautomata.dagger

import android.accessibilityservice.AccessibilityService
import android.app.Service
import com.mathewsachin.fategrandautomata.accessibility.ScriptRunnerService
import dagger.Module
import dagger.Provides

@Module(subcomponents = [ScriptComponent::class])
class ScriptRunnerServiceModule(val service: ScriptRunnerService) {
    @ServiceScope
    @Provides
    fun provideScriptRunnerService() = service

    @ServiceScope
    @Provides
    fun provideAccessibilityService(): AccessibilityService = service

    @ServiceScope
    @Provides
    fun provideService(): Service = service
}