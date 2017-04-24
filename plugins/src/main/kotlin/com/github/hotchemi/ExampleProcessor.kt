package com.github.hotchemi

import com.github.hotchemi.ExampleKotlinGradleSubplugin.Companion.ANNOTATIONS_ARG_NAME
import com.github.hotchemi.ExampleKotlinGradleSubplugin.Companion.COMPILER_PLUGIN_ID
import org.jetbrains.kotlin.compiler.plugin.CliOption
import org.jetbrains.kotlin.compiler.plugin.CliOptionProcessingException
import org.jetbrains.kotlin.compiler.plugin.CommandLineProcessor
import org.jetbrains.kotlin.config.CompilerConfiguration

class ExampleProcessor : CommandLineProcessor {
    companion object {
        val ANNOTATION_OPTION = CliOption(ANNOTATIONS_ARG_NAME, "<fqname>", "Annotation qualified names",
                required = false, allowMultipleOccurrences = true)
        val PLUGIN_ID = COMPILER_PLUGIN_ID
    }

    override val pluginId = PLUGIN_ID
    override val pluginOptions = listOf(ANNOTATION_OPTION)

    override fun processOption(option: CliOption, value: String, configuration: CompilerConfiguration) {
        println("ExampleProcessor loaded")
        when (option) {
            ANNOTATION_OPTION -> configuration.put(ExampleConfigurationKeys.EXAMPLE_KEY, value)
            else -> throw CliOptionProcessingException("Unknown option: ${option.name}")
        }
    }
}
