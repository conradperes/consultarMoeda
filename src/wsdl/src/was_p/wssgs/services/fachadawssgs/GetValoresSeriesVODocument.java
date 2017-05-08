/*
 * An XML document type.
 * Localname: getValoresSeriesVO
 * Namespace: https://was-p/wssgs/services/FachadaWSSGS
 * Java type: was_p.wssgs.services.fachadawssgs.GetValoresSeriesVODocument
 *
 * Automatically generated - do not modify.
 */
package was_p.wssgs.services.fachadawssgs;


/**
 * A document containing one getValoresSeriesVO(@https://was-p/wssgs/services/FachadaWSSGS) element.
 *
 * This is a complex type.
 */
public interface GetValoresSeriesVODocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GetValoresSeriesVODocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s0BA5C3AE1505FFF757C7F20C5DFAB492").resolveHandle("getvaloresseriesvoc19ddoctype");
    
    /**
     * Gets the "getValoresSeriesVO" element
     */
    was_p.wssgs.services.fachadawssgs.GetValoresSeriesVODocument.GetValoresSeriesVO getGetValoresSeriesVO();
    
    /**
     * Sets the "getValoresSeriesVO" element
     */
    void setGetValoresSeriesVO(was_p.wssgs.services.fachadawssgs.GetValoresSeriesVODocument.GetValoresSeriesVO getValoresSeriesVO);
    
    /**
     * Appends and returns a new empty "getValoresSeriesVO" element
     */
    was_p.wssgs.services.fachadawssgs.GetValoresSeriesVODocument.GetValoresSeriesVO addNewGetValoresSeriesVO();
    
    /**
     * An XML getValoresSeriesVO(@https://was-p/wssgs/services/FachadaWSSGS).
     *
     * This is a complex type.
     */
    public interface GetValoresSeriesVO extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GetValoresSeriesVO.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s0BA5C3AE1505FFF757C7F20C5DFAB492").resolveHandle("getvaloresseriesvo9a35elemtype");
        
        /**
         * Gets the "in0" element
         */
        defaultnamespace.ArrayOfflong getIn0();
        
        /**
         * Tests for nil "in0" element
         */
        boolean isNilIn0();
        
        /**
         * Sets the "in0" element
         */
        void setIn0(defaultnamespace.ArrayOfflong in0);
        
        /**
         * Appends and returns a new empty "in0" element
         */
        defaultnamespace.ArrayOfflong addNewIn0();
        
        /**
         * Nils the "in0" element
         */
        void setNilIn0();
        
        /**
         * Gets the "in1" element
         */
        org.xmlsoap.schemas.soap.encoding.String getIn1();
        
        /**
         * Tests for nil "in1" element
         */
        boolean isNilIn1();
        
        /**
         * Sets the "in1" element
         */
        void setIn1(org.xmlsoap.schemas.soap.encoding.String in1);
        
        /**
         * Appends and returns a new empty "in1" element
         */
        org.xmlsoap.schemas.soap.encoding.String addNewIn1();
        
        /**
         * Nils the "in1" element
         */
        void setNilIn1();
        
        /**
         * Gets the "in2" element
         */
        org.xmlsoap.schemas.soap.encoding.String getIn2();
        
        /**
         * Tests for nil "in2" element
         */
        boolean isNilIn2();
        
        /**
         * Sets the "in2" element
         */
        void setIn2(org.xmlsoap.schemas.soap.encoding.String in2);
        
        /**
         * Appends and returns a new empty "in2" element
         */
        org.xmlsoap.schemas.soap.encoding.String addNewIn2();
        
        /**
         * Nils the "in2" element
         */
        void setNilIn2();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static was_p.wssgs.services.fachadawssgs.GetValoresSeriesVODocument.GetValoresSeriesVO newInstance() {
              return (was_p.wssgs.services.fachadawssgs.GetValoresSeriesVODocument.GetValoresSeriesVO) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static was_p.wssgs.services.fachadawssgs.GetValoresSeriesVODocument.GetValoresSeriesVO newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (was_p.wssgs.services.fachadawssgs.GetValoresSeriesVODocument.GetValoresSeriesVO) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static was_p.wssgs.services.fachadawssgs.GetValoresSeriesVODocument newInstance() {
          return (was_p.wssgs.services.fachadawssgs.GetValoresSeriesVODocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static was_p.wssgs.services.fachadawssgs.GetValoresSeriesVODocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (was_p.wssgs.services.fachadawssgs.GetValoresSeriesVODocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static was_p.wssgs.services.fachadawssgs.GetValoresSeriesVODocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (was_p.wssgs.services.fachadawssgs.GetValoresSeriesVODocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static was_p.wssgs.services.fachadawssgs.GetValoresSeriesVODocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (was_p.wssgs.services.fachadawssgs.GetValoresSeriesVODocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static was_p.wssgs.services.fachadawssgs.GetValoresSeriesVODocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (was_p.wssgs.services.fachadawssgs.GetValoresSeriesVODocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static was_p.wssgs.services.fachadawssgs.GetValoresSeriesVODocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (was_p.wssgs.services.fachadawssgs.GetValoresSeriesVODocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static was_p.wssgs.services.fachadawssgs.GetValoresSeriesVODocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (was_p.wssgs.services.fachadawssgs.GetValoresSeriesVODocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static was_p.wssgs.services.fachadawssgs.GetValoresSeriesVODocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (was_p.wssgs.services.fachadawssgs.GetValoresSeriesVODocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static was_p.wssgs.services.fachadawssgs.GetValoresSeriesVODocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (was_p.wssgs.services.fachadawssgs.GetValoresSeriesVODocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static was_p.wssgs.services.fachadawssgs.GetValoresSeriesVODocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (was_p.wssgs.services.fachadawssgs.GetValoresSeriesVODocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static was_p.wssgs.services.fachadawssgs.GetValoresSeriesVODocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (was_p.wssgs.services.fachadawssgs.GetValoresSeriesVODocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static was_p.wssgs.services.fachadawssgs.GetValoresSeriesVODocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (was_p.wssgs.services.fachadawssgs.GetValoresSeriesVODocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static was_p.wssgs.services.fachadawssgs.GetValoresSeriesVODocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (was_p.wssgs.services.fachadawssgs.GetValoresSeriesVODocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static was_p.wssgs.services.fachadawssgs.GetValoresSeriesVODocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (was_p.wssgs.services.fachadawssgs.GetValoresSeriesVODocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static was_p.wssgs.services.fachadawssgs.GetValoresSeriesVODocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (was_p.wssgs.services.fachadawssgs.GetValoresSeriesVODocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static was_p.wssgs.services.fachadawssgs.GetValoresSeriesVODocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (was_p.wssgs.services.fachadawssgs.GetValoresSeriesVODocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static was_p.wssgs.services.fachadawssgs.GetValoresSeriesVODocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (was_p.wssgs.services.fachadawssgs.GetValoresSeriesVODocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static was_p.wssgs.services.fachadawssgs.GetValoresSeriesVODocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (was_p.wssgs.services.fachadawssgs.GetValoresSeriesVODocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
