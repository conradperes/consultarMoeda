/*
 * An XML document type.
 * Localname: getUltimoValorVO
 * Namespace: https://was-p/wssgs/services/FachadaWSSGS
 * Java type: was_p.wssgs.services.fachadawssgs.GetUltimoValorVODocument
 *
 * Automatically generated - do not modify.
 */
package was_p.wssgs.services.fachadawssgs;


/**
 * A document containing one getUltimoValorVO(@https://was-p/wssgs/services/FachadaWSSGS) element.
 *
 * This is a complex type.
 */
public interface GetUltimoValorVODocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GetUltimoValorVODocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s0BA5C3AE1505FFF757C7F20C5DFAB492").resolveHandle("getultimovalorvo24cadoctype");
    
    /**
     * Gets the "getUltimoValorVO" element
     */
    was_p.wssgs.services.fachadawssgs.GetUltimoValorVODocument.GetUltimoValorVO getGetUltimoValorVO();
    
    /**
     * Sets the "getUltimoValorVO" element
     */
    void setGetUltimoValorVO(was_p.wssgs.services.fachadawssgs.GetUltimoValorVODocument.GetUltimoValorVO getUltimoValorVO);
    
    /**
     * Appends and returns a new empty "getUltimoValorVO" element
     */
    was_p.wssgs.services.fachadawssgs.GetUltimoValorVODocument.GetUltimoValorVO addNewGetUltimoValorVO();
    
    /**
     * An XML getUltimoValorVO(@https://was-p/wssgs/services/FachadaWSSGS).
     *
     * This is a complex type.
     */
    public interface GetUltimoValorVO extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GetUltimoValorVO.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s0BA5C3AE1505FFF757C7F20C5DFAB492").resolveHandle("getultimovalorvo3b55elemtype");
        
        /**
         * Gets the "in0" element
         */
        long getIn0();
        
        /**
         * Gets (as xml) the "in0" element
         */
        org.apache.xmlbeans.XmlLong xgetIn0();
        
        /**
         * Tests for nil "in0" element
         */
        boolean isNilIn0();
        
        /**
         * Sets the "in0" element
         */
        void setIn0(long in0);
        
        /**
         * Sets (as xml) the "in0" element
         */
        void xsetIn0(org.apache.xmlbeans.XmlLong in0);
        
        /**
         * Nils the "in0" element
         */
        void setNilIn0();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static was_p.wssgs.services.fachadawssgs.GetUltimoValorVODocument.GetUltimoValorVO newInstance() {
              return (was_p.wssgs.services.fachadawssgs.GetUltimoValorVODocument.GetUltimoValorVO) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static was_p.wssgs.services.fachadawssgs.GetUltimoValorVODocument.GetUltimoValorVO newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (was_p.wssgs.services.fachadawssgs.GetUltimoValorVODocument.GetUltimoValorVO) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static was_p.wssgs.services.fachadawssgs.GetUltimoValorVODocument newInstance() {
          return (was_p.wssgs.services.fachadawssgs.GetUltimoValorVODocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static was_p.wssgs.services.fachadawssgs.GetUltimoValorVODocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (was_p.wssgs.services.fachadawssgs.GetUltimoValorVODocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static was_p.wssgs.services.fachadawssgs.GetUltimoValorVODocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (was_p.wssgs.services.fachadawssgs.GetUltimoValorVODocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static was_p.wssgs.services.fachadawssgs.GetUltimoValorVODocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (was_p.wssgs.services.fachadawssgs.GetUltimoValorVODocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static was_p.wssgs.services.fachadawssgs.GetUltimoValorVODocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (was_p.wssgs.services.fachadawssgs.GetUltimoValorVODocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static was_p.wssgs.services.fachadawssgs.GetUltimoValorVODocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (was_p.wssgs.services.fachadawssgs.GetUltimoValorVODocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static was_p.wssgs.services.fachadawssgs.GetUltimoValorVODocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (was_p.wssgs.services.fachadawssgs.GetUltimoValorVODocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static was_p.wssgs.services.fachadawssgs.GetUltimoValorVODocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (was_p.wssgs.services.fachadawssgs.GetUltimoValorVODocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static was_p.wssgs.services.fachadawssgs.GetUltimoValorVODocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (was_p.wssgs.services.fachadawssgs.GetUltimoValorVODocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static was_p.wssgs.services.fachadawssgs.GetUltimoValorVODocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (was_p.wssgs.services.fachadawssgs.GetUltimoValorVODocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static was_p.wssgs.services.fachadawssgs.GetUltimoValorVODocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (was_p.wssgs.services.fachadawssgs.GetUltimoValorVODocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static was_p.wssgs.services.fachadawssgs.GetUltimoValorVODocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (was_p.wssgs.services.fachadawssgs.GetUltimoValorVODocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static was_p.wssgs.services.fachadawssgs.GetUltimoValorVODocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (was_p.wssgs.services.fachadawssgs.GetUltimoValorVODocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static was_p.wssgs.services.fachadawssgs.GetUltimoValorVODocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (was_p.wssgs.services.fachadawssgs.GetUltimoValorVODocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static was_p.wssgs.services.fachadawssgs.GetUltimoValorVODocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (was_p.wssgs.services.fachadawssgs.GetUltimoValorVODocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static was_p.wssgs.services.fachadawssgs.GetUltimoValorVODocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (was_p.wssgs.services.fachadawssgs.GetUltimoValorVODocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static was_p.wssgs.services.fachadawssgs.GetUltimoValorVODocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (was_p.wssgs.services.fachadawssgs.GetUltimoValorVODocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static was_p.wssgs.services.fachadawssgs.GetUltimoValorVODocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (was_p.wssgs.services.fachadawssgs.GetUltimoValorVODocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
