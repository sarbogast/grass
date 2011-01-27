import grails.test.*

class GrassTagLibTests extends TagLibUnitTestCase {
    protected void setUp() {
        super.setUp()
    }

    protected void tearDown() {
        super.tearDown()
    }

    void testResourcesWithoutFramework() {
        shouldFail(IllegalArgumentException) {
            new GrassTagLib().resources()
        }
    }

    /*void testResourcesWithBlueprint() {
        mockTagLib(GrassTagLib)
        def response = new GrassTagLib().resources(framework:'blueprint')
        assertEquals """<link href="" media="screen, projection" rel="stylesheet" type="text/css" />
  <link href="" media="print" rel="stylesheet" type="text/css" />
  <!--[if lt IE 8]>
    <link href="" media="screen, projection" rel="stylesheet" type="text/css" />
  <![endif]-->""", new GrassTagLib().resources(framework:'blueprint')
    }*/
}
