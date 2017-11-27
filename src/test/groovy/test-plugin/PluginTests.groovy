package test.plugin

import junit.framework.TestCase
import grails.test.mixin.TestMixin
import grails.test.mixin.support.GrailsUnitTestMixin

@TestMixin(GrailsUnitTestMixin)
class PluginTests extends TestCase {

	// Trying to inject Grails Domain Class Mapping Context
	def grailsDomainClassMappingContext

    public void testInjection() {
    	assert grailsDomainClassMappingContext != null
    }

}
