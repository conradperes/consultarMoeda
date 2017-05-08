/*
 * An XML document type.
 * Localname: getValorEspecial
 * Namespace: http://publico.ws.casosdeuso.sgs.pec.bcb.gov.br
 * Java type: br.gov.bcb.pec.sgs.casosdeuso.ws.publico.GetValorEspecialDocument
 *
 * Automatically generated - do not modify.
 */
package br.gov.bcb.pec.sgs.casosdeuso.ws.publico;


/**
 * A document containing one getValorEspecial(@http://publico.ws.casosdeuso.sgs.pec.bcb.gov.br) element.
 *
 * This is a complex type.
 */
public interface GetValorEspecialDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GetValorEspecialDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s0BA5C3AE1505FFF757C7F20C5DFAB492").resolveHandle("getvalorespecial9926doctype");
    
    /**
     * Gets the "getValorEspecial" element
     */
    br.gov.bcb.pec.sgs.casosdeuso.ws.publico.GetValorEspecialDocument.GetValorEspecial getGetValorEspecial();
    
    /**
     * Sets the "getValorEspecial" element
     */
    void setGetValorEspecial(br.gov.bcb.pec.sgs.casosdeuso.ws.publico.GetValorEspecialDocument.GetValorEspecial getValorEspecial);
    
    /**
     * Appends and returns a new empty "getValorEspecial" element
     */
    br.gov.bcb.pec.sgs.casosdeuso.ws.publico.GetValorEspecialDocument.GetValorEspecial addNewGetValorEspecial();
    
    /**
     * An XML getValorEspecial(@http://publico.ws.casosdeuso.sgs.pec.bcb.gov.br).
     *
     * This is a complex type.
     */
    public interface GetValorEspecial extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GetValorEspecial.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s0BA5C3AE1505FFF757C7F20C5DFAB492").resolveHandle("getvalorespecial15e8elemtype");
        
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
            public static br.gov.bcb.pec.sgs.casosdeuso.ws.publico.GetValorEspecialDocument.GetValorEspecial newInstance() {
              return (br.gov.bcb.pec.sgs.casosdeuso.ws.publico.GetValorEspecialDocument.GetValorEspecial) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static br.gov.bcb.pec.sgs.casosdeuso.ws.publico.GetValorEspecialDocument.GetValorEspecial newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (br.gov.bcb.pec.sgs.casosdeuso.ws.publico.GetValorEspecialDocument.GetValorEspecial) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static br.gov.bcb.pec.sgs.casosdeuso.ws.publico.GetValorEspecialDocument newInstance() {
          return (br.gov.bcb.pec.sgs.casosdeuso.ws.publico.GetValorEspecialDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static br.gov.bcb.pec.sgs.casosdeuso.ws.publico.GetValorEspecialDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (br.gov.bcb.pec.sgs.casosdeuso.ws.publico.GetValorEspecialDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static br.gov.bcb.pec.sgs.casosdeuso.ws.publico.GetValorEspecialDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (br.gov.bcb.pec.sgs.casosdeuso.ws.publico.GetValorEspecialDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static br.gov.bcb.pec.sgs.casosdeuso.ws.publico.GetValorEspecialDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (br.gov.bcb.pec.sgs.casosdeuso.ws.publico.GetValorEspecialDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static br.gov.bcb.pec.sgs.casosdeuso.ws.publico.GetValorEspecialDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.gov.bcb.pec.sgs.casosdeuso.ws.publico.GetValorEspecialDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static br.gov.bcb.pec.sgs.casosdeuso.ws.publico.GetValorEspecialDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.gov.bcb.pec.sgs.casosdeuso.ws.publico.GetValorEspecialDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static br.gov.bcb.pec.sgs.casosdeuso.ws.publico.GetValorEspecialDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.gov.bcb.pec.sgs.casosdeuso.ws.publico.GetValorEspecialDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static br.gov.bcb.pec.sgs.casosdeuso.ws.publico.GetValorEspecialDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.gov.bcb.pec.sgs.casosdeuso.ws.publico.GetValorEspecialDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static br.gov.bcb.pec.sgs.casosdeuso.ws.publico.GetValorEspecialDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.gov.bcb.pec.sgs.casosdeuso.ws.publico.GetValorEspecialDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static br.gov.bcb.pec.sgs.casosdeuso.ws.publico.GetValorEspecialDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.gov.bcb.pec.sgs.casosdeuso.ws.publico.GetValorEspecialDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static br.gov.bcb.pec.sgs.casosdeuso.ws.publico.GetValorEspecialDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.gov.bcb.pec.sgs.casosdeuso.ws.publico.GetValorEspecialDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static br.gov.bcb.pec.sgs.casosdeuso.ws.publico.GetValorEspecialDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.gov.bcb.pec.sgs.casosdeuso.ws.publico.GetValorEspecialDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static br.gov.bcb.pec.sgs.casosdeuso.ws.publico.GetValorEspecialDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (br.gov.bcb.pec.sgs.casosdeuso.ws.publico.GetValorEspecialDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static br.gov.bcb.pec.sgs.casosdeuso.ws.publico.GetValorEspecialDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (br.gov.bcb.pec.sgs.casosdeuso.ws.publico.GetValorEspecialDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static br.gov.bcb.pec.sgs.casosdeuso.ws.publico.GetValorEspecialDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (br.gov.bcb.pec.sgs.casosdeuso.ws.publico.GetValorEspecialDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static br.gov.bcb.pec.sgs.casosdeuso.ws.publico.GetValorEspecialDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (br.gov.bcb.pec.sgs.casosdeuso.ws.publico.GetValorEspecialDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static br.gov.bcb.pec.sgs.casosdeuso.ws.publico.GetValorEspecialDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (br.gov.bcb.pec.sgs.casosdeuso.ws.publico.GetValorEspecialDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static br.gov.bcb.pec.sgs.casosdeuso.ws.publico.GetValorEspecialDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (br.gov.bcb.pec.sgs.casosdeuso.ws.publico.GetValorEspecialDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
