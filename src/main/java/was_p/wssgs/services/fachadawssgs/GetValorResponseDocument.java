/*
 * An XML document type.
 * Localname: getValorResponse
 * Namespace: https://was-p/wssgs/services/FachadaWSSGS
 * Java type: was_p.wssgs.services.fachadawssgs.GetValorResponseDocument
 *
 * Automatically generated - do not modify.
 */
package was_p.wssgs.services.fachadawssgs;


/**
 * A document containing one getValorResponse(@https://was-p/wssgs/services/FachadaWSSGS) element.
 *
 * This is a complex type.
 */
public interface GetValorResponseDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GetValorResponseDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s0BA5C3AE1505FFF757C7F20C5DFAB492").resolveHandle("getvalorresponse49c0doctype");
    
    /**
     * Gets the "getValorResponse" element
     */
    was_p.wssgs.services.fachadawssgs.GetValorResponseDocument.GetValorResponse getGetValorResponse();
    
    /**
     * Sets the "getValorResponse" element
     */
    void setGetValorResponse(was_p.wssgs.services.fachadawssgs.GetValorResponseDocument.GetValorResponse getValorResponse);
    
    /**
     * Appends and returns a new empty "getValorResponse" element
     */
    was_p.wssgs.services.fachadawssgs.GetValorResponseDocument.GetValorResponse addNewGetValorResponse();
    
    /**
     * An XML getValorResponse(@https://was-p/wssgs/services/FachadaWSSGS).
     *
     * This is a complex type.
     */
    public interface GetValorResponse extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GetValorResponse.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s0BA5C3AE1505FFF757C7F20C5DFAB492").resolveHandle("getvalorresponsebb95elemtype");
        
        /**
         * Gets the "getValorReturn" element
         */
        org.xmlsoap.schemas.soap.encoding.Decimal getGetValorReturn();
        
        /**
         * Tests for nil "getValorReturn" element
         */
        boolean isNilGetValorReturn();
        
        /**
         * Sets the "getValorReturn" element
         */
        void setGetValorReturn(org.xmlsoap.schemas.soap.encoding.Decimal getValorReturn);
        
        /**
         * Appends and returns a new empty "getValorReturn" element
         */
        org.xmlsoap.schemas.soap.encoding.Decimal addNewGetValorReturn();
        
        /**
         * Nils the "getValorReturn" element
         */
        void setNilGetValorReturn();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static was_p.wssgs.services.fachadawssgs.GetValorResponseDocument.GetValorResponse newInstance() {
              return (was_p.wssgs.services.fachadawssgs.GetValorResponseDocument.GetValorResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static was_p.wssgs.services.fachadawssgs.GetValorResponseDocument.GetValorResponse newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (was_p.wssgs.services.fachadawssgs.GetValorResponseDocument.GetValorResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static was_p.wssgs.services.fachadawssgs.GetValorResponseDocument newInstance() {
          return (was_p.wssgs.services.fachadawssgs.GetValorResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static was_p.wssgs.services.fachadawssgs.GetValorResponseDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (was_p.wssgs.services.fachadawssgs.GetValorResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static was_p.wssgs.services.fachadawssgs.GetValorResponseDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (was_p.wssgs.services.fachadawssgs.GetValorResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static was_p.wssgs.services.fachadawssgs.GetValorResponseDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (was_p.wssgs.services.fachadawssgs.GetValorResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static was_p.wssgs.services.fachadawssgs.GetValorResponseDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (was_p.wssgs.services.fachadawssgs.GetValorResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static was_p.wssgs.services.fachadawssgs.GetValorResponseDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (was_p.wssgs.services.fachadawssgs.GetValorResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static was_p.wssgs.services.fachadawssgs.GetValorResponseDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (was_p.wssgs.services.fachadawssgs.GetValorResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static was_p.wssgs.services.fachadawssgs.GetValorResponseDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (was_p.wssgs.services.fachadawssgs.GetValorResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static was_p.wssgs.services.fachadawssgs.GetValorResponseDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (was_p.wssgs.services.fachadawssgs.GetValorResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static was_p.wssgs.services.fachadawssgs.GetValorResponseDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (was_p.wssgs.services.fachadawssgs.GetValorResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static was_p.wssgs.services.fachadawssgs.GetValorResponseDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (was_p.wssgs.services.fachadawssgs.GetValorResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static was_p.wssgs.services.fachadawssgs.GetValorResponseDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (was_p.wssgs.services.fachadawssgs.GetValorResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static was_p.wssgs.services.fachadawssgs.GetValorResponseDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (was_p.wssgs.services.fachadawssgs.GetValorResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static was_p.wssgs.services.fachadawssgs.GetValorResponseDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (was_p.wssgs.services.fachadawssgs.GetValorResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static was_p.wssgs.services.fachadawssgs.GetValorResponseDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (was_p.wssgs.services.fachadawssgs.GetValorResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static was_p.wssgs.services.fachadawssgs.GetValorResponseDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (was_p.wssgs.services.fachadawssgs.GetValorResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static was_p.wssgs.services.fachadawssgs.GetValorResponseDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (was_p.wssgs.services.fachadawssgs.GetValorResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static was_p.wssgs.services.fachadawssgs.GetValorResponseDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (was_p.wssgs.services.fachadawssgs.GetValorResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
