package scala.meta

import scala.meta.internal.hosts.dotty.contexts.{Compiler => Compiler}
import scala.meta.internal.hosts.dotty.contexts.{Proxy => ProxyImpl}

trait Context extends SemanticContext with InteractiveContext

object Context {
  def apply(artifacts: Artifact*)(implicit resolver: Resolver): Context = {
    new ProxyImpl(Compiler(), Domain(artifacts: _*)) {
      override def toString = s"""Context(${artifacts.mkString(", ")})"""
    }
  }
}
