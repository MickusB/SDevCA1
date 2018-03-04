
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._

object projects extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[String,List[models.Project],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(hello: String, projects: List[models.Project]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

def /*3.2*/scripts/*3.9*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*3.13*/("""
    """),format.raw/*4.5*/("""<script src=""""),_display_(/*4.19*/routes/*4.25*/.Assets.versioned("javascripts/jquery-3.2.1.slim.js")),format.raw/*4.78*/(""""></script>
    <script type="text/javascript">
            $(document).ready(function () """),format.raw/*6.43*/("""{"""),format.raw/*6.44*/("""
                """),format.raw/*7.17*/("""$('.dropdown-toggle').dropdown();
            """),format.raw/*8.13*/("""}"""),format.raw/*8.14*/(""");
    </script>
""")))};
Seq[Any](format.raw/*1.49*/(""" """),format.raw/*1.50*/("""<!Michael Brady X00136103>

"""),format.raw/*10.2*/("""

"""),_display_(/*12.2*/main("JCMB Inc. Projects", scripts)/*12.37*/ {_display_(Seq[Any](format.raw/*12.39*/("""
    """),format.raw/*13.5*/("""<div class="wrapper">
        <div class="row">
            <div class="col-sm-2 project filter">
                <h4>Filter</h4>
            </div>
            """),_display_(/*18.14*/for(p<-projects) yield /*18.30*/ {_display_(Seq[Any](format.raw/*18.32*/("""
            """),format.raw/*19.13*/("""<div class="col-sm-10 project">
                <img src="assets/images/brain.jpg">
                <h1>"""),_display_(/*21.22*/p/*21.23*/.getProjectName),format.raw/*21.38*/("""</h1>
                <h3>"""),_display_(/*22.22*/p/*22.23*/.getCategory),format.raw/*22.35*/("""</h3>
                <h4>"""),_display_(/*23.22*/p/*23.23*/.getDescription),format.raw/*23.38*/("""</h4>
                <form action=""""),_display_(/*24.32*/routes/*24.38*/.HomeController.project(new String(p.getProjectName))),format.raw/*24.91*/("""">
                    <button type="submit" class="btn btn-success" value="View project">View</button>
                </form>
                <div class="clear"></div>
            </div>
            """)))}),format.raw/*29.14*/("""
        """),format.raw/*30.9*/("""</div>
    </div>
""")))}),format.raw/*32.2*/("""
"""))
      }
    }
  }

  def render(hello:String,projects:List[models.Project]): play.twirl.api.HtmlFormat.Appendable = apply(hello,projects)

  def f:((String,List[models.Project]) => play.twirl.api.HtmlFormat.Appendable) = (hello,projects) => apply(hello,projects)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Mar 04 10:29:05 GMT 2018
                  SOURCE: C:/Users/micha/Documents/GitHub/SDevCA1/play-java-seed/app/views/projects.scala.html
                  HASH: e45ee94c0da8ce0ef52646ac3452864a4f7fc766
                  MATRIX: 972->1|1097->80|1111->87|1191->91|1223->97|1263->111|1277->117|1350->170|1469->262|1497->263|1542->281|1616->328|1644->329|1703->48|1731->49|1788->349|1819->354|1863->389|1903->391|1936->397|2130->564|2162->580|2202->582|2244->596|2378->703|2388->704|2424->719|2479->747|2489->748|2522->760|2577->788|2587->789|2623->804|2688->842|2703->848|2777->901|3015->1108|3052->1118|3103->1139
                  LINES: 28->1|32->3|32->3|34->3|35->4|35->4|35->4|35->4|37->6|37->6|38->7|39->8|39->8|42->1|42->1|44->10|46->12|46->12|46->12|47->13|52->18|52->18|52->18|53->19|55->21|55->21|55->21|56->22|56->22|56->22|57->23|57->23|57->23|58->24|58->24|58->24|63->29|64->30|66->32
                  -- GENERATED --
              */
          