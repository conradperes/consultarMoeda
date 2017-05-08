/*
 * An XML document type.
 * Localname: getValoresSeriesVOResponse
 * Namespace: https://was-p/wssgs/services/FachadaWSSGS
 * Java type: was_p.wssgs.services.fachadawssgs.GetValoresSeriesVOResponseDocument
 *
 * Automatically generated - do not modify.
 */
package was_p.wssgs.services.fachadawssgs;


/**
 * A document containing one getValoresSeriesVOResponse(@https://was-p/wssgs/services/FachadaWSSGS) element.
 *
 * This is a complex type.
 */
public interface GetValoresSeriesVOResponseDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GetValoresSeriesVOResponseDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s0BA5C3AE1505FFF757C7F20C5DFAB492").resolveHandle("getvaloresseriesvoresponse9bbedoctype");
    
    /**
     * Gets the "getValoresSeriesVOResponse" element
     */
    was_p.wssgs.services.fachadawssgs.GetValoresSeriesVOResponseDocument.GetValoresSeriesVOResponse getGetValoresSeriesVOResponse();
    
    /**
     * Sets the "getValoresSeriesVOResponse" element
     */
    void setGetValoresSeriesVOResponse(was_p.wssgs.services.fachadawssgs.GetValoresSeriesVOResponseDocument.GetValoresSeriesVOResponse getValoresSeriesVOResponse);
    
    /**
     * Appends and returns a new empty "getValoresSeriesVOResponse" element
     */
    was_p.wssgs.services.fachadawssgs.GetValoresSeriesVOResponseDocument.GetValoresSeriesVOResponse addNewGetValoresSeriesVOResponse();
    
    /**
     * An XML getValoresSeriesVOResponse(@https://was-p/wssgs/services/FachadaWSSGS).
     *
     * This is a complex type.
     */
    public interface GetValoresSeriesVOResponse extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GetValoresSeriesVOResponse.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s0BA5C3AE1505FFF757C7F20C5DFAB492").resolveHandle("getvaloresseriesvoresponse90d5elemtype");
        
        /**
         * Gets the "getValoresSeriesVOReturn" element
         */
        br.gov.bcb.pec.sgs.casosdeuso.ws.comum.ArrayOffWSSerieVO getGetValoresSeriesVOReturn();
        
        /**
         * Tests for nil "getValoresSeriesVOReturn" element
         */
        boolean isNilGetValoresSeriesVOReturn();
        
        /**
         * Sets the "getValoresSeriesVOReturn" element
         */
        void setGetValoresSeriesVOReturn(br.gov.bcb.pec.sgs.casosdeuso.ws.comum.ArrayOffWSSerieVO getValoresSeriesVOReturn);
        
        /**
         * Appends and returns a new empty "getValoresSeriesVOReturn" element
         */
        br.gov.bcb.pec.sgs.casosdeuso.ws.comum.ArrayOffWSSerieVO addNewGetValoresSeriesVOReturn();
        
        /**
         * Nils the "getValoresSeriesVOReturn" element
         */
        void setNilGetValoresSeriesVOReturn();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static was_p.wssgs.services.fachadawssgs.GetValoresSeriesVOResponseDocument.GetValoresSeriesVOResponse newInstance() {
              return (was_p.wssgs.services.fachadawssgs.GetValoresSeriesVOResponseDocument.GetValoresSeriesVOResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static was_p.wssgs.services.fachadawssgs.GetValoresSeriesVOResponseDocument.GetValoresSeriesVOResponse newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (was_p.wssgs.services.fachadawssgs.GetValoresSeriesVOResponseDocument.GetValoresSeriesVOResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static was_p.wssgs.services.fachadawssgs.GetValoresSeriesVOResponseDocument newInstance() {
          return (was_p.wssgs.services.fachadawssgs.GetValoresSeriesVOResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static was_p.wssgs.services.fachadawssgs.GetValoresSeriesVOResponseDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (was_p.wssgs.services.fachadawssgs.GetValoresSeriesVOResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static was_p.wssgs.services.fachadawssgs.GetValoresSeriesVOResponseDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (was_p.wssgs.services.fachadawssgs.GetValoresSeriesVOResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static was_p.wssgs.services.fachadawssgs.GetValoresSeriesVOResponseDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (was_p.wssgs.services.fachadawssgs.GetValoresSeriesVOResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static was_p.wssgs.services.fachadawssgs.GetValoresSeriesVOResponseDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (was_p.wssgs.services.fachadawssgs.GetValoresSeriesVOResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static was_p.wssgs.services.fachadawssgs.GetValoresSeriesVOResponseDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (was_p.wssgs.services.fachadawssgs.GetValoresSeriesVOResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static was_p.wssgs.services.fachadawssgs.GetValoresSeriesVOResponseDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (was_p.wssgs.services.fachadawssgs.GetValoresSeriesVOResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static was_p.wssgs.services.fachadawssgs.GetValoresSeriesVOResponseDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (was_p.wssgs.services.fachadawssgs.GetValoresSeriesVOResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static was_p.wssgs.services.fachadawssgs.GetValoresSeriesVOResponseDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (was_p.wssgs.services.fachadawssgs.GetValoresSeriesVOResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static was_p.wssgs.services.fachadawssgs.GetValoresSeriesVOResponseDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (was_p.wssgs.services.fachadawssgs.GetValoresSeriesVOResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static was_p.wssgs.services.fachadawssgs.GetValoresSeriesVOResponseDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (was_p.wssgs.services.fachadawssgs.GetValoresSeriesVOResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static was_p.wssgs.services.fachadawssgs.GetValoresSeriesVOResponseDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (was_p.wssgs.services.fachadawssgs.GetValoresSeriesVOResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static was_p.wssgs.services.fachadawssgs.GetValoresSeriesVOResponseDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (was_p.wssgs.services.fachadawssgs.GetValoresSeriesVOResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static was_p.wssgs.services.fachadawssgs.GetValoresSeriesVOResponseDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (was_p.wssgs.services.fachadawssgs.GetValoresSeriesVOResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static was_p.wssgs.services.fachadawssgs.GetValoresSeriesVOResponseDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (was_p.wssgs.services.fachadawssgs.GetValoresSeriesVOResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static was_p.wssgs.services.fachadawssgs.GetValoresSeriesVOResponseDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (was_p.wssgs.services.fachadawssgs.GetValoresSeriesVOResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static was_p.wssgs.services.fachadawssgs.GetValoresSeriesVOResponseDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (was_p.wssgs.services.fachadawssgs.GetValoresSeriesVOResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static was_p.wssgs.services.fachadawssgs.GetValoresSeriesVOResponseDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (was_p.wssgs.services.fachadawssgs.GetValoresSeriesVOResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
