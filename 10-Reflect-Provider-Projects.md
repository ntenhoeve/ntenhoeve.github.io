<div id="content">
 <h1 id="ReflectProviderProjects">Reflect Provider Projects</h1> 
 <p> <a id="ReferenceName_reflect-framework_reflect_reflect-core_src_main_java_nth_reflect_fw_documentation_reflectproviderprojects.java"></a> </p>
 <p> <a href="ReferenceName_reflect-framework_reflect_reflect-core_src_main_java_nth_reflect_fw_layer5provider_provider.java">Provider</a> objects can have different implementations. Depending on the type of application you can write your own implementation of a provider or use or extend one of the <a href="ReferenceName_reflect-core old_reflect_reflect-core_src_main_java_nth_reflect_fw_documentation_reflectproviderprojects.java">ReflectProviderProjects</a> that come with the framework. In example, depending on your application you might need a different <a href="05-The-Provider-Layer#TheProviderLayer_AuthorizationProvider">AuthorizationProvider</a> such as: </p> 
 <ul> 
  <li>hard coded authorization</li> 
  <li>file based authorization</li> 
  <li>database authorization</li> 
  <li>web container authorization (e.g. <a href="https://tomcat.apache.org/tomcat-7.0-doc/realm-howto.html">Apache Tomcat Realm</a>)</li> 
  <li><a href="https://nl.wikipedia.org/wiki/Lightweight_Directory_Access_Protocol">LDAP</a></li> 
  <li><a href="https://nl.wikipedia.org/wiki/Active_Directory">Active directory</a></li> 
  <li>or other</li> 
 </ul> 
 <p> If you wish to use a non default <a href="ReferenceName_reflect-framework_reflect_reflect-core_src_main_java_nth_reflect_fw_layer5provider_provider.java">Provider</a>, you need to register a <a href="ReferenceName_reflect-framework_reflect_reflect-core_src_main_java_nth_reflect_fw_layer5provider_provider.java">Provider</a> by overwriting the matching <a href="01-The-Reflect-Framework#TheReflectFramework_TheReflectApplication">ReflectApplication.get ...ProviderClass()</a> method. </p> 
 <p> The following sections will describe the optional <a href="ReferenceName_reflect-core old_reflect_reflect-core_src_main_java_nth_reflect_fw_documentation_reflectproviderprojects.java">ReflectProviderProjects</a> that come with the <a href="01-The-Reflect-Framework#TheReflectFramework">ReflectFramework</a>. </p> 
 <h2 id="ReflectProviderProjects_ReflectProviderTomcatAuthorization">ReflectProviderTomcatAuthorization</h2> 
 <p> TODO </p> 
 <p></p> 
</div>