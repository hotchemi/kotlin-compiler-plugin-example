package com.github.hotchemi

import org.gradle.api.Project
import org.gradle.api.tasks.SourceSet
import org.gradle.api.tasks.compile.AbstractCompile
import org.jetbrains.kotlin.gradle.plugin.KotlinGradleSubplugin
import org.jetbrains.kotlin.gradle.plugin.SubpluginOption

class ExampleKotlinGradleSubplugin : KotlinGradleSubplugin<AbstractCompile> {
    companion object {
        val ANNOTATIONS_ARG_NAME = "annotation"
        val GROUP_NAME = "com.github.hotchemi"
        val ARTIFACT_NAME = "gradle-compiler-plugin-example"
        val COMPILER_PLUGIN_ID = "com.github.hotchemi.gradle.subplugin.example"
    }

    override fun isApplicable(project: Project, task: AbstractCompile) = true

    override fun apply(project: Project, kotlinCompile: AbstractCompile, javaCompile: AbstractCompile,
                       variantData: Any?, javaSourceSet: SourceSet?): List<SubpluginOption> {
        println("ExampleKotlinGradleSubplugin loaded")
        return listOf(SubpluginOption(ANNOTATIONS_ARG_NAME, "exampleValue"))
    }

    override fun getArtifactName() = ARTIFACT_NAME
    override fun getGroupName() = GROUP_NAME
    override fun getCompilerPluginId() = COMPILER_PLUGIN_ID
}