package test.plugin

import grails.testing.spring.AutowiredTest
import org.grails.datastore.mapping.model.MappingContext
import org.grails.testing.GrailsUnitTest
import spock.lang.Specification

class PluginSpec extends Specification implements GrailsUnitTest, AutowiredTest {

	MappingContext grailsDomainClassMappingContext

    void 'test injection'() {
        expect:
    	grailsDomainClassMappingContext
    }

    Set<String> getIncludePlugins() {
        ['domainClass']
    }
}
