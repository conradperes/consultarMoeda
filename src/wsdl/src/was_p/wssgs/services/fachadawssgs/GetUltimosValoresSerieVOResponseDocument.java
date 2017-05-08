/*
 * An XML document type.
 * Localname: getUltimosValoresSerieVOResponse
 * Namespace: https://was-p/wssgs/services/FachadaWSSGS
 * Java type: was_p.wssgs.services.fachadawssgs.GetUltimosValoresSerieVOResponseDocument
 *
 * Automatically generated - do not modify.
 */
package was_p.wssgs.services.fachadawssgs;


/**
 * A document containing one getUltimosValoresSerieVOResponse(@https://was-p/wssgs/services/FachadaWSSGS) element.
 *
 * This is a complex type.
 */
public interface GetUltimosValoresSerieVOResponseDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GetUltimosValoresSerieVOResponseDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s0BA5C3AE1505FFF757C7F20C5DFAB492").resolveHandle("getultimosvaloresserievoresponsece04doctype");
    
    /**
     * Gets the "getUltimosValoresSerieVOResponse" element
     */
    was_p.wssgs.services.fachadawssgs.GetUltimosValoresSerieVOResponseDocument.GetUltimosValoresSerieVOResponse getGetUltimosValoresSerieVOResponse();
    
    /**
     * Sets the "getUltimosValoresSerieVOResponse" element
     */
    void setGetUltimosValoresSerieVOResponse(was_p.wssgs.services.fachadawssgs.GetUltimosValoresSerieVOResponseDocument.GetUltimosValoresSerieVOResponse getUltimosValoresSerieVOResponse);
    
    /**
     * Appends and returns a new empty "getUltimosValoresSerieVOResponse" element
     */
    was_p.wssgs.services.fachadawssgs.GetUltimosValoresSerieVOResponseDocument.GetUltimosValoresSerieVOResponse addNewGetUltimosValoresSerieVOResponse();
    
    /**
     * An XML getUltimosValoresSerieVOResponse(@https://was-p/wssgs/services/FachadaWSSGS).
     *
     * This is a complex type.
     */
    public interface GetUltimosValoresSerieVOResponse extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GetUltimosValoresSerieVOResponse.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s0BA5C3AE1505FFF757C7F20C5DFAB492").resolveHandle("getultimosvaloresserievoresponse4915elemtype");
        
        /**
         * Gets the "getUltimosValoresSerieVOReturn" element
         */
        br.gov.bcb.pec.sgs.casosdeuso.ws.comum.WSSerieVO getGetUltimosValoresSerieVOReturn();
        
        /**
         * Tests for nil "getUltimosValoresSerieVOReturn" element
         */
        boolean isNilGetUltimosValoresSerieVOReturn();
        
        /**
         * Sets the "getUltimosValoresSerieVOReturn" element
         */
        void setGetUltimosValoresSerieVOReturn(br.gov.bcb.pec.sgs.casosdeuso.ws.comum.WSSerieVO getUltimosValoresSerieVOReturn);
        
        /**
         * Appends and returns a new empty "getUltimosValoresSerieVOReturn" element
         */
        br.gov.bcb.pec.sgs.casosdeuso.ws.comum.WSSerieVO addNewGetUltimosValoresSerieVOReturn();
        
        /**
         * Nils the "getUltimosValoresSerieVOReturn" element
         */
        void setNilGetUltimosValoresSerieVOReturn();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static was_p.wssgs.services.fachadawssgs.GetUltimosValoresSerieVOResponseDocument.GetUltimosValoresSerieVOResponse newInstance() {
              return (was_p.wssgs.services.fachadawssgs.GetUltimosValoresSerieVOResponseDocument.GetUltimosValoresSerieVOResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static was_p.wssgs.services.fachadawssgs.GetUltimosValoresSerieVOResponseDocument.GetUltimosValoresSerieVOResponse newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (was_p.wssgs.services.fachadawssgs.GetUltimosValoresSerieVOResponseDocument.GetUltimosValoresSerieVOResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static was_p.wssgs.services.fachadawssgs.GetUltimosValoresSerieVOResponseDocument newInstance() {
          return (was_p.wssgs.services.fachadawssgs.GetUltimosValoresSerieVOResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static was_p.wssgs.services.fachadawssgs.GetUltimosValoresSerieVOResponseDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (was_p.wssgs.services.fachadawssgs.GetUltimosValoresSerieVOResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static was_p.wssgs.services.fachadawssgs.GetUltimosValoresSerieVOResponseDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (was_p.wssgs.services.fachadawssgs.GetUltimosValoresSerieVOResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static was_p.wssgs.services.fachadawssgs.GetUltimosValoresSerieVOResponseDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (was_p.wssgs.services.fachadawssgs.GetUltimosValoresSerieVOResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static was_p.wssgs.services.fachadawssgs.GetUltimosValoresSerieVOResponseDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (was_p.wssgs.services.fachadawssgs.GetUltimosValoresSerieVOResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static was_p.wssgs.services.fachadawssgs.GetUltimosValoresSerieVOResponseDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (was_p.wssgs.services.fachadawssgs.GetUltimosValoresSerieVOResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static was_p.wssgs.services.fachadawssgs.GetUltimosValoresSerieVOResponseDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (was_p.wssgs.services.fachadawssgs.GetUltimosValoresSerieVOResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static was_p.wssgs.services.fachadawssgs.GetUltimosValoresSerieVOResponseDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (was_p.wssgs.services.fachadawssgs.GetUltimosValoresSerieVOResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static was_p.wssgs.services.fachadawssgs.GetUltimosValoresSerieVOResponseDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (was_p.wssgs.services.fachadawssgs.GetUltimosValoresSerieVOResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static was_p.wssgs.services.fachadawssgs.GetUltimosValoresSerieVOResponseDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (was_p.wssgs.services.fachadawssgs.GetUltimosValoresSerieVOResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static was_p.wssgs.services.fachadawssgs.GetUltimosValoresSerieVOResponseDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (was_p.wssgs.services.fachadawssgs.GetUltimosValoresSerieVOResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static was_p.wssgs.services.fachadawssgs.GetUltimosValoresSerieVOResponseDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (was_p.wssgs.services.fachadawssgs.GetUltimosValoresSerieVOResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static was_p.wssgs.services.fachadawssgs.GetUltimosValoresSerieVOResponseDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (was_p.wssgs.services.fachadawssgs.GetUltimosValoresSerieVOResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static was_p.wssgs.services.fachadawssgs.GetUltimosValoresSerieVOResponseDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (was_p.wssgs.services.fachadawssgs.GetUltimosValoresSerieVOResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static was_p.wssgs.services.fachadawssgs.GetUltimosValoresSerieVOResponseDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (was_p.wssgs.services.fachadawssgs.GetUltimosValoresSerieVOResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static was_p.wssgs.services.fachadawssgs.GetUltimosValoresSerieVOResponseDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (was_p.wssgs.services.fachadawssgs.GetUltimosValoresSerieVOResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static was_p.wssgs.services.fachadawssgs.GetUltimosValoresSerieVOResponseDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (was_p.wssgs.services.fachadawssgs.GetUltimosValoresSerieVOResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static was_p.wssgs.services.fachadawssgs.GetUltimosValoresSerieVOResponseDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (was_p.wssgs.services.fachadawssgs.GetUltimosValoresSerieVOResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
