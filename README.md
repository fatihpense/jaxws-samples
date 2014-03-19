JAX-WS Samples
==============

Sample projects using JAX-WS technologies.

To deploy the samples to Glassfish just run `gradle cargoRunLocal`

### *deployment-styles*
Demonstrates several JAX-WS deployments on JSR 109-compatible application servers (e.g. Glassfish), Tomcat and as a standalone application.

### *exceptions*
Demonstrates the mapping of standard Java exceptions and soap-style exceptions with JAX-WS.

### *java-first*
Simple bottom-up JAX-WS example.

### *type-mapping*
Demonstrates type mappings from Java to WSDL/XSD and vice versa.

### *method-overloading*
Demonstrates the WSDL mapping of overloaded Java methods.

### *wsdl-styles*
Demonstrates the several WSDL styles rpc-encoded, rpc-literal, document-literal and document-literal wrapped.

### *wsimport-client*
Demonstrates the usage of the *wsimport* tool using the default wrapper style and with disabled wrapper style (plain). First run *java-first:custom* project in order to be able to access the service with the wsimport client.
