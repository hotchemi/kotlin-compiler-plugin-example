package com.github.hotchemi

import org.jetbrains.kotlin.psi.KtBinaryExpression
import org.jetbrains.kotlin.psi.KtProperty
import org.jetbrains.kotlin.psi.KtVisitorVoid

class ExampleVisitor : KtVisitorVoid() {
    override fun visitBinaryExpression(expression: KtBinaryExpression) {
        super.visitBinaryExpression(expression)
        println("visitBinaryExpression")
    }

    override fun visitProperty(property: KtProperty) {
        super.visitProperty(property)
        println("visitProperty")
    }
}
