
class GrassTagLib {
    static namespace = "grass"

	def resources = { attributes ->
        if(!attributes || !attributes.framework) throw new IllegalArgumentException("'framework' attribute is required on grass:resources element")

        if(attributes.framework == "blueprint"){
            out << '<link href="' + g.resource(dir:'css', file:'screen.css') + '" media="screen, projection" rel="stylesheet" type="text/css" />\n'
            out << '<link href="' + g.resource(dir:'css', file:'print.css') + '" media="print" rel="stylesheet" type="text/css" />\n'
            out << '<!--[if lt IE 8]>\n'
            out << '    <link href="' + g.resource(dir:'css',file:'ie.css') + '" media="screen, projection" rel="stylesheet" type="text/css" />\n'
            out << '<![endif]-->\n'
        } else if(attributes.framework == "yui"){
            out << '<link href="' + resource(dir:'css',file:'screen.css') + '" media="screen, projection" rel="stylesheet" type="text/css" />\n'
        }

	}
}
