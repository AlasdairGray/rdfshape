
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._

import play.api.templates.PlayMagic._
import models._
import controllers._
import play.api.i18n._
import play.api.mvc._
import play.api.data._
import views.html._

/**/
object errorPage extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Throwable,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(t: Throwable):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {import play.api.i18n.Messages

Seq[Any](format.raw/*1.16*/("""

"""),format.raw/*4.1*/("""
"""),_display_(/*5.2*/main("Index")/*5.15*/ {_display_(Seq[Any](format.raw/*5.17*/("""

"""),format.raw/*7.1*/("""<h1>Exception raised</h1>
<pre>"""),_display_(/*8.7*/t/*8.8*/.getMessage),format.raw/*8.19*/("""</pre>

""")))}),format.raw/*10.2*/("""
"""))}
  }

  def render(t:Throwable): play.twirl.api.HtmlFormat.Appendable = apply(t)

  def f:((Throwable) => play.twirl.api.HtmlFormat.Appendable) = (t) => apply(t)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Fri Sep 05 16:22:57 BST 2014
                  SOURCE: /Users/Alasdair/Workspace/HCLSValidator/rdfshape-ag/rdfshape/app/views/errorPage.scala.html
                  HASH: e656b9d8e2c571ba6535eb5cdb3d072dabfaa29e
                  MATRIX: 512->1|643->15|671->48|698->50|719->63|758->65|786->67|843->99|851->100|882->111|921->120
                  LINES: 19->1|22->1|24->4|25->5|25->5|25->5|27->7|28->8|28->8|28->8|30->10
                  -- GENERATED --
              */
          