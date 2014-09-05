// @SOURCE:/Users/Alasdair/Workspace/HCLSValidator/rdfshape-ag/rdfshape/conf/routes
// @HASH:c4840a8c45ea456ca8809bed8f16c87f766a15dc
// @DATE:Fri Sep 05 16:13:50 BST 2014

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.Router.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._
import _root_.controllers.Assets.Asset

import Router.queryString


// @LINE:16
// @LINE:14
// @LINE:13
// @LINE:10
// @LINE:7
// @LINE:6
package controllers {

// @LINE:16
class ReverseWebJarAssets {


// @LINE:16
def at(file:String): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "webjars/" + implicitly[PathBindable[String]].unbind("file", file))
}
                        

}
                          

// @LINE:14
// @LINE:13
class ReverseValidator {


// @LINE:14
def validate_get(rdf:String, syntaxRDF:Option[String] = None, showRDF:Boolean = true, schema:Option[String] = None, iri:Option[String] = None, cut:Int = 1, withIncoming:Boolean = false, withAny:Boolean = false, showSchema:Boolean = true): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "validator" + queryString(List(Some(implicitly[QueryStringBindable[String]].unbind("rdf", rdf)), if(syntaxRDF == None) None else Some(implicitly[QueryStringBindable[Option[String]]].unbind("syntaxRDF", syntaxRDF)), if(showRDF == true) None else Some(implicitly[QueryStringBindable[Boolean]].unbind("showRDF", showRDF)), if(schema == None) None else Some(implicitly[QueryStringBindable[Option[String]]].unbind("schema", schema)), if(iri == None) None else Some(implicitly[QueryStringBindable[Option[String]]].unbind("iri", iri)), if(cut == 1) None else Some(implicitly[QueryStringBindable[Int]].unbind("cut", cut)), if(withIncoming == false) None else Some(implicitly[QueryStringBindable[Boolean]].unbind("withIncoming", withIncoming)), if(withAny == false) None else Some(implicitly[QueryStringBindable[Boolean]].unbind("withAny", withAny)), if(showSchema == true) None else Some(implicitly[QueryStringBindable[Boolean]].unbind("showSchema", showSchema)))))
}
                        

// @LINE:13
def validate_post(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "validator")
}
                        

}
                          

// @LINE:10
class ReverseAssets {


// @LINE:10
def at(file:String): Call = {
   implicit val _rrc = new ReverseRouteContext(Map(("path", "/public")))
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                        

}
                          

// @LINE:7
// @LINE:6
class ReverseApplication {


// @LINE:7
def about(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "about")
}
                        

// @LINE:6
def index(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix)
}
                        

}
                          
}
                  


// @LINE:16
// @LINE:14
// @LINE:13
// @LINE:10
// @LINE:7
// @LINE:6
package controllers.javascript {
import ReverseRouteContext.empty

// @LINE:16
class ReverseWebJarAssets {


// @LINE:16
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.WebJarAssets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "webjars/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        

}
              

// @LINE:14
// @LINE:13
class ReverseValidator {


// @LINE:14
def validate_get : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Validator.validate_get",
   """
      function(rdf,syntaxRDF,showRDF,schema,iri,cut,withIncoming,withAny,showSchema) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "validator" + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("rdf", rdf), (syntaxRDF == null ? null : (""" + implicitly[QueryStringBindable[Option[String]]].javascriptUnbind + """)("syntaxRDF", syntaxRDF)), (showRDF == null ? null : (""" + implicitly[QueryStringBindable[Boolean]].javascriptUnbind + """)("showRDF", showRDF)), (schema == null ? null : (""" + implicitly[QueryStringBindable[Option[String]]].javascriptUnbind + """)("schema", schema)), (iri == null ? null : (""" + implicitly[QueryStringBindable[Option[String]]].javascriptUnbind + """)("iri", iri)), (cut == null ? null : (""" + implicitly[QueryStringBindable[Int]].javascriptUnbind + """)("cut", cut)), (withIncoming == null ? null : (""" + implicitly[QueryStringBindable[Boolean]].javascriptUnbind + """)("withIncoming", withIncoming)), (withAny == null ? null : (""" + implicitly[QueryStringBindable[Boolean]].javascriptUnbind + """)("withAny", withAny)), (showSchema == null ? null : (""" + implicitly[QueryStringBindable[Boolean]].javascriptUnbind + """)("showSchema", showSchema))])})
      }
   """
)
                        

// @LINE:13
def validate_post : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Validator.validate_post",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "validator"})
      }
   """
)
                        

}
              

// @LINE:10
class ReverseAssets {


// @LINE:10
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        

}
              

// @LINE:7
// @LINE:6
class ReverseApplication {


// @LINE:7
def about : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.about",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "about"})
      }
   """
)
                        

// @LINE:6
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + """"})
      }
   """
)
                        

}
              
}
        


// @LINE:16
// @LINE:14
// @LINE:13
// @LINE:10
// @LINE:7
// @LINE:6
package controllers.ref {


// @LINE:16
class ReverseWebJarAssets {


// @LINE:16
def at(file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.WebJarAssets.at(file), HandlerDef(this.getClass.getClassLoader, "", "controllers.WebJarAssets", "at", Seq(classOf[String]), "GET", """""", _prefix + """webjars/$file<.+>""")
)
                      

}
                          

// @LINE:14
// @LINE:13
class ReverseValidator {


// @LINE:14
def validate_get(rdf:String, syntaxRDF:Option[String], showRDF:Boolean, schema:Option[String], iri:Option[String], cut:Int, withIncoming:Boolean, withAny:Boolean, showSchema:Boolean): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Validator.validate_get(rdf, syntaxRDF, showRDF, schema, iri, cut, withIncoming, withAny, showSchema), HandlerDef(this.getClass.getClassLoader, "", "controllers.Validator", "validate_get", Seq(classOf[String], classOf[Option[String]], classOf[Boolean], classOf[Option[String]], classOf[Option[String]], classOf[Int], classOf[Boolean], classOf[Boolean], classOf[Boolean]), "GET", """""", _prefix + """validator""")
)
                      

// @LINE:13
def validate_post(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Validator.validate_post(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Validator", "validate_post", Seq(), "POST", """""", _prefix + """validator""")
)
                      

}
                          

// @LINE:10
class ReverseAssets {


// @LINE:10
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this.getClass.getClassLoader, "", "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      

}
                          

// @LINE:7
// @LINE:6
class ReverseApplication {


// @LINE:7
def about(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.about(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "about", Seq(), "GET", """""", _prefix + """about""")
)
                      

// @LINE:6
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.index(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "index", Seq(), "GET", """ Home page""", _prefix + """""")
)
                      

}
                          
}
        
    