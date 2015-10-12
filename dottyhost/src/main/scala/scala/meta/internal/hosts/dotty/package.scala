package scala.meta
package internal.hosts

package object dotty {
  implicit class XtensionScalahostDebug(debug: org.scalameta.debug.Debug.type) {
    def scalahost = sys.props("scalahost.debug") != null
  }
}