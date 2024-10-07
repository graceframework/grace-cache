package grails.plugin.cache

import groovy.transform.CompileStatic
import org.springframework.boot.context.properties.ConfigurationProperties

/**
 * Configuration properties for the cache plugin
 *
 * @author Graeme Rocher
 * @author James Kleeh
 */
@CompileStatic
@ConfigurationProperties(value = 'grails.cache', ignoreUnknownFields = true)
class CachePluginConfiguration {

    Boolean clearAtStartup = false
    Map<String, CacheConfig> caches = [:]

    static class CacheConfig {
        Integer maxCapacity
    }

}
