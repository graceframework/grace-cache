package cache

import grails.boot.Grails
import grails.plugins.metadata.*

@PluginSource
class Application {
    static void main(String[] args) {
        Grails.run(Application, args)
    }
}
