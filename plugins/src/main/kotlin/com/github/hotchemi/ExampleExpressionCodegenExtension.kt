package com.github.hotchemi

import org.jetbrains.kotlin.codegen.*
import org.jetbrains.kotlin.codegen.extensions.ExpressionCodegenExtension
import org.jetbrains.kotlin.codegen.state.GenerationState
import org.jetbrains.kotlin.descriptors.ClassDescriptor
import org.jetbrains.kotlin.psi.KtClassOrObject
import org.jetbrains.kotlin.resolve.calls.model.ResolvedCall

class ExampleCodegenExtension : ExpressionCodegenExtension {
    override fun applyFunction(receiver: StackValue, resolvedCall: ResolvedCall<*>, c: ExpressionCodegenExtension.Context): StackValue? {
        println("applyFunction")
        return null
    }

    override fun applyProperty(receiver: StackValue, resolvedCall: ResolvedCall<*>, c: ExpressionCodegenExtension.Context): StackValue? {
        println("applyProperty")
        return null
    }

    override fun generateClassSyntheticParts(classBuilder: ClassBuilder, state: GenerationState, classOrObject: KtClassOrObject, descriptor: ClassDescriptor) {
        super.generateClassSyntheticParts(classBuilder, state, classOrObject, descriptor)
        println("generateClassSyntheticParts")
    }
}
