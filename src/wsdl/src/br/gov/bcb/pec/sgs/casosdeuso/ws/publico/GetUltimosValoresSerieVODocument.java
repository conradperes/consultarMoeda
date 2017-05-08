/*
 * An XML document type.
 * Localname: getUltimosValoresSerieVO
 * Namespace: http://publico.ws.casosdeuso.sgs.pec.bcb.gov.br
 * Java type: br.gov.bcb.pec.sgs.casosdeuso.ws.publico.GetUltimosValoresSerieVODocument
 *
 * Automatically generated - do not modify.
 */
package br.gov.bcb.pec.sgs.casosdeuso.ws.publico;


/**
 * A document containing one getUltimosValoresSerieVO(@http://publico.ws.casosdeuso.sgs.pec.bcb.gov.br) element.
 *
 * This is a complex type.
 */
public interface GetUltimosValoresSerieVODocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GetUltimosValoresSerieVODocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s0BA5C3AE1505FFF757C7F20C5DFAB492").resolveHandle("getultimosvaloresserievof496doctype");
    
    /**
     * Gets the "getUltimosValoresSerieVO" element
     */
    br.gov.bcb.pec.sgs.casosdeuso.ws.publico.GetUltimosValoresSerieVODocument.GetUltimosValoresSerieVO getGetUltimosValoresSerieVO();
    
    /**
     * Sets the "getUltimosValoresSerieVO" element
     */
    void setGetUltimosValoresSerieVO(br.gov.bcb.pec.sgs.casosdeuso.ws.publico.GetUltimosValoresSerieVODocument.GetUltimosValoresSerieVO getUltimosValoresSerieVO);
    
    /**
     * Appends and returns a new empty "getUltimosValoresSerieVO" element
     */
    br.gov.bcb.pec.sgs.casosdeuso.ws.publico.GetUltimosValoresSerieVODocument.GetUltimosValoresSerieVO addNewGetUltimosValoresSerieVO();
    
    /**
     * An XML getUltimosValoresSerieVO(@http://publico.ws.casosdeuso.sgs.pec.bcb.gov.br).
     *
     * This is a complex type.
     */
    public interface GetUltimosValoresSerieVO extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GetUltimosValoresSerieVO.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s0BA5C3AE1505FFF757C7F20C5DFAB492").resolveHandle("getultimosvaloresserievo7ce8elemtype");
        
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
         * Gets the "in1" element
         */
        long getIn1();
        
        /**
         * Gets (as xml) the "in1" element
         */
        org.apache.xmlbeans.XmlLong xgetIn1();
        
        /**
         * Tests for nil "in1" element
         */
        boolean isNilIn1();
        
        /**
         * Sets the "in1" element
         */
        void setIn1(long in1);
        
        /**
         * Sets (as xml) the "in1" element
         */
        void xsetIn1(org.apache.xmlbeans.XmlLong in1);
        
        /**
         * Nils the "in1" element
         */
        void setNilIn1();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static br.gov.bcb.pec.sgs.casosdeuso.ws.publico.GetUltimosValoresSerieVODocument.GetUltimosValoresSerieVO newInstance() {
              return (br.gov.bcb.pec.sgs.casosdeuso.ws.publico.GetUltimosValoresSerieVODocument.GetUltimosValoresSerieVO) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static br.gov.bcb.pec.sgs.casosdeuso.ws.publico.GetUltimosValoresSerieVODocument.GetUltimosValoresSerieVO newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (br.gov.bcb.pec.sgs.casosdeuso.ws.publico.GetUltimosValoresSerieVODocument.GetUltimosValoresSerieVO) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static br.gov.bcb.pec.sgs.casosdeuso.ws.publico.GetUltimosValoresSerieVODocument newInstance() {
          return (br.gov.bcb.pec.sgs.casosdeuso.ws.publico.GetUltimosValoresSerieVODocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static br.gov.bcb.pec.sgs.casosdeuso.ws.publico.GetUltimosValoresSerieVODocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (br.gov.bcb.pec.sgs.casosdeuso.ws.publico.GetUltimosValoresSerieVODocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static br.gov.bcb.pec.sgs.casosdeuso.ws.publico.GetUltimosValoresSerieVODocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (br.gov.bcb.pec.sgs.casosdeuso.ws.publico.GetUltimosValoresSerieVODocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static br.gov.bcb.pec.sgs.casosdeuso.ws.publico.GetUltimosValoresSerieVODocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (br.gov.bcb.pec.sgs.casosdeuso.ws.publico.GetUltimosValoresSerieVODocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static br.gov.bcb.pec.sgs.casosdeuso.ws.publico.GetUltimosValoresSerieVODocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.gov.bcb.pec.sgs.casosdeuso.ws.publico.GetUltimosValoresSerieVODocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static br.gov.bcb.pec.sgs.casosdeuso.ws.publico.GetUltimosValoresSerieVODocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.gov.bcb.pec.sgs.casosdeuso.ws.publico.GetUltimosValoresSerieVODocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static br.gov.bcb.pec.sgs.casosdeuso.ws.publico.GetUltimosValoresSerieVODocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.gov.bcb.pec.sgs.casosdeuso.ws.publico.GetUltimosValoresSerieVODocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static br.gov.bcb.pec.sgs.casosdeuso.ws.publico.GetUltimosValoresSerieVODocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.gov.bcb.pec.sgs.casosdeuso.ws.publico.GetUltimosValoresSerieVODocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static br.gov.bcb.pec.sgs.casosdeuso.ws.publico.GetUltimosValoresSerieVODocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.gov.bcb.pec.sgs.casosdeuso.ws.publico.GetUltimosValoresSerieVODocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static br.gov.bcb.pec.sgs.casosdeuso.ws.publico.GetUltimosValoresSerieVODocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.gov.bcb.pec.sgs.casosdeuso.ws.publico.GetUltimosValoresSerieVODocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static br.gov.bcb.pec.sgs.casosdeuso.ws.publico.GetUltimosValoresSerieVODocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.gov.bcb.pec.sgs.casosdeuso.ws.publico.GetUltimosValoresSerieVODocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static br.gov.bcb.pec.sgs.casosdeuso.ws.publico.GetUltimosValoresSerieVODocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.gov.bcb.pec.sgs.casosdeuso.ws.publico.GetUltimosValoresSerieVODocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static br.gov.bcb.pec.sgs.casosdeuso.ws.publico.GetUltimosValoresSerieVODocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (br.gov.bcb.pec.sgs.casosdeuso.ws.publico.GetUltimosValoresSerieVODocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static br.gov.bcb.pec.sgs.casosdeuso.ws.publico.GetUltimosValoresSerieVODocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (br.gov.bcb.pec.sgs.casosdeuso.ws.publico.GetUltimosValoresSerieVODocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static br.gov.bcb.pec.sgs.casosdeuso.ws.publico.GetUltimosValoresSerieVODocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (br.gov.bcb.pec.sgs.casosdeuso.ws.publico.GetUltimosValoresSerieVODocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static br.gov.bcb.pec.sgs.casosdeuso.ws.publico.GetUltimosValoresSerieVODocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (br.gov.bcb.pec.sgs.casosdeuso.ws.publico.GetUltimosValoresSerieVODocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static br.gov.bcb.pec.sgs.casosdeuso.ws.publico.GetUltimosValoresSerieVODocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (br.gov.bcb.pec.sgs.casosdeuso.ws.publico.GetUltimosValoresSerieVODocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static br.gov.bcb.pec.sgs.casosdeuso.ws.publico.GetUltimosValoresSerieVODocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (br.gov.bcb.pec.sgs.casosdeuso.ws.publico.GetUltimosValoresSerieVODocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
