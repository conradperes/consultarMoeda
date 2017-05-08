/*
 * An XML document type.
 * Localname: getValoresSeriesXML
 * Namespace: http://publico.ws.casosdeuso.sgs.pec.bcb.gov.br
 * Java type: br.gov.bcb.pec.sgs.casosdeuso.ws.publico.GetValoresSeriesXMLDocument
 *
 * Automatically generated - do not modify.
 */
package br.gov.bcb.pec.sgs.casosdeuso.ws.publico;


/**
 * A document containing one getValoresSeriesXML(@http://publico.ws.casosdeuso.sgs.pec.bcb.gov.br) element.
 *
 * This is a complex type.
 */
public interface GetValoresSeriesXMLDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GetValoresSeriesXMLDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s0BA5C3AE1505FFF757C7F20C5DFAB492").resolveHandle("getvaloresseriesxml04f6doctype");
    
    /**
     * Gets the "getValoresSeriesXML" element
     */
    br.gov.bcb.pec.sgs.casosdeuso.ws.publico.GetValoresSeriesXMLDocument.GetValoresSeriesXML getGetValoresSeriesXML();
    
    /**
     * Sets the "getValoresSeriesXML" element
     */
    void setGetValoresSeriesXML(br.gov.bcb.pec.sgs.casosdeuso.ws.publico.GetValoresSeriesXMLDocument.GetValoresSeriesXML getValoresSeriesXML);
    
    /**
     * Appends and returns a new empty "getValoresSeriesXML" element
     */
    br.gov.bcb.pec.sgs.casosdeuso.ws.publico.GetValoresSeriesXMLDocument.GetValoresSeriesXML addNewGetValoresSeriesXML();
    
    /**
     * An XML getValoresSeriesXML(@http://publico.ws.casosdeuso.sgs.pec.bcb.gov.br).
     *
     * This is a complex type.
     */
    public interface GetValoresSeriesXML extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GetValoresSeriesXML.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s0BA5C3AE1505FFF757C7F20C5DFAB492").resolveHandle("getvaloresseriesxml5aa6elemtype");
        
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
            public static br.gov.bcb.pec.sgs.casosdeuso.ws.publico.GetValoresSeriesXMLDocument.GetValoresSeriesXML newInstance() {
              return (br.gov.bcb.pec.sgs.casosdeuso.ws.publico.GetValoresSeriesXMLDocument.GetValoresSeriesXML) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static br.gov.bcb.pec.sgs.casosdeuso.ws.publico.GetValoresSeriesXMLDocument.GetValoresSeriesXML newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (br.gov.bcb.pec.sgs.casosdeuso.ws.publico.GetValoresSeriesXMLDocument.GetValoresSeriesXML) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static br.gov.bcb.pec.sgs.casosdeuso.ws.publico.GetValoresSeriesXMLDocument newInstance() {
          return (br.gov.bcb.pec.sgs.casosdeuso.ws.publico.GetValoresSeriesXMLDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static br.gov.bcb.pec.sgs.casosdeuso.ws.publico.GetValoresSeriesXMLDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (br.gov.bcb.pec.sgs.casosdeuso.ws.publico.GetValoresSeriesXMLDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static br.gov.bcb.pec.sgs.casosdeuso.ws.publico.GetValoresSeriesXMLDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (br.gov.bcb.pec.sgs.casosdeuso.ws.publico.GetValoresSeriesXMLDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static br.gov.bcb.pec.sgs.casosdeuso.ws.publico.GetValoresSeriesXMLDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (br.gov.bcb.pec.sgs.casosdeuso.ws.publico.GetValoresSeriesXMLDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static br.gov.bcb.pec.sgs.casosdeuso.ws.publico.GetValoresSeriesXMLDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.gov.bcb.pec.sgs.casosdeuso.ws.publico.GetValoresSeriesXMLDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static br.gov.bcb.pec.sgs.casosdeuso.ws.publico.GetValoresSeriesXMLDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.gov.bcb.pec.sgs.casosdeuso.ws.publico.GetValoresSeriesXMLDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static br.gov.bcb.pec.sgs.casosdeuso.ws.publico.GetValoresSeriesXMLDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.gov.bcb.pec.sgs.casosdeuso.ws.publico.GetValoresSeriesXMLDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static br.gov.bcb.pec.sgs.casosdeuso.ws.publico.GetValoresSeriesXMLDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.gov.bcb.pec.sgs.casosdeuso.ws.publico.GetValoresSeriesXMLDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static br.gov.bcb.pec.sgs.casosdeuso.ws.publico.GetValoresSeriesXMLDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.gov.bcb.pec.sgs.casosdeuso.ws.publico.GetValoresSeriesXMLDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static br.gov.bcb.pec.sgs.casosdeuso.ws.publico.GetValoresSeriesXMLDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.gov.bcb.pec.sgs.casosdeuso.ws.publico.GetValoresSeriesXMLDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static br.gov.bcb.pec.sgs.casosdeuso.ws.publico.GetValoresSeriesXMLDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.gov.bcb.pec.sgs.casosdeuso.ws.publico.GetValoresSeriesXMLDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static br.gov.bcb.pec.sgs.casosdeuso.ws.publico.GetValoresSeriesXMLDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.gov.bcb.pec.sgs.casosdeuso.ws.publico.GetValoresSeriesXMLDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static br.gov.bcb.pec.sgs.casosdeuso.ws.publico.GetValoresSeriesXMLDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (br.gov.bcb.pec.sgs.casosdeuso.ws.publico.GetValoresSeriesXMLDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static br.gov.bcb.pec.sgs.casosdeuso.ws.publico.GetValoresSeriesXMLDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (br.gov.bcb.pec.sgs.casosdeuso.ws.publico.GetValoresSeriesXMLDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static br.gov.bcb.pec.sgs.casosdeuso.ws.publico.GetValoresSeriesXMLDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (br.gov.bcb.pec.sgs.casosdeuso.ws.publico.GetValoresSeriesXMLDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static br.gov.bcb.pec.sgs.casosdeuso.ws.publico.GetValoresSeriesXMLDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (br.gov.bcb.pec.sgs.casosdeuso.ws.publico.GetValoresSeriesXMLDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static br.gov.bcb.pec.sgs.casosdeuso.ws.publico.GetValoresSeriesXMLDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (br.gov.bcb.pec.sgs.casosdeuso.ws.publico.GetValoresSeriesXMLDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static br.gov.bcb.pec.sgs.casosdeuso.ws.publico.GetValoresSeriesXMLDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (br.gov.bcb.pec.sgs.casosdeuso.ws.publico.GetValoresSeriesXMLDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
