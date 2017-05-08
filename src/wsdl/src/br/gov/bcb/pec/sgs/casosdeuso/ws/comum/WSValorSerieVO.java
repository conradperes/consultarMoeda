/*
 * XML Type:  WSValorSerieVO
 * Namespace: http://comum.ws.casosdeuso.sgs.pec.bcb.gov.br
 * Java type: br.gov.bcb.pec.sgs.casosdeuso.ws.comum.WSValorSerieVO
 *
 * Automatically generated - do not modify.
 */
package br.gov.bcb.pec.sgs.casosdeuso.ws.comum;


/**
 * An XML WSValorSerieVO(@http://comum.ws.casosdeuso.sgs.pec.bcb.gov.br).
 *
 * This is a complex type.
 */
public interface WSValorSerieVO extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(WSValorSerieVO.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s0BA5C3AE1505FFF757C7F20C5DFAB492").resolveHandle("wsvalorserievo3deetype");
    
    /**
     * Gets the "ano" element
     */
    int getAno();
    
    /**
     * Gets (as xml) the "ano" element
     */
    org.apache.xmlbeans.XmlInt xgetAno();
    
    /**
     * Sets the "ano" element
     */
    void setAno(int ano);
    
    /**
     * Sets (as xml) the "ano" element
     */
    void xsetAno(org.apache.xmlbeans.XmlInt ano);
    
    /**
     * Gets the "anoFim" element
     */
    int getAnoFim();
    
    /**
     * Gets (as xml) the "anoFim" element
     */
    org.apache.xmlbeans.XmlInt xgetAnoFim();
    
    /**
     * Sets the "anoFim" element
     */
    void setAnoFim(int anoFim);
    
    /**
     * Sets (as xml) the "anoFim" element
     */
    void xsetAnoFim(org.apache.xmlbeans.XmlInt anoFim);
    
    /**
     * Gets the "bloqueado" element
     */
    boolean getBloqueado();
    
    /**
     * Gets (as xml) the "bloqueado" element
     */
    org.apache.xmlbeans.XmlBoolean xgetBloqueado();
    
    /**
     * Sets the "bloqueado" element
     */
    void setBloqueado(boolean bloqueado);
    
    /**
     * Sets (as xml) the "bloqueado" element
     */
    void xsetBloqueado(org.apache.xmlbeans.XmlBoolean bloqueado);
    
    /**
     * Gets the "bloqueioLiberado" element
     */
    boolean getBloqueioLiberado();
    
    /**
     * Gets (as xml) the "bloqueioLiberado" element
     */
    org.apache.xmlbeans.XmlBoolean xgetBloqueioLiberado();
    
    /**
     * Sets the "bloqueioLiberado" element
     */
    void setBloqueioLiberado(boolean bloqueioLiberado);
    
    /**
     * Sets (as xml) the "bloqueioLiberado" element
     */
    void xsetBloqueioLiberado(org.apache.xmlbeans.XmlBoolean bloqueioLiberado);
    
    /**
     * Gets the "dia" element
     */
    int getDia();
    
    /**
     * Gets (as xml) the "dia" element
     */
    org.apache.xmlbeans.XmlInt xgetDia();
    
    /**
     * Sets the "dia" element
     */
    void setDia(int dia);
    
    /**
     * Sets (as xml) the "dia" element
     */
    void xsetDia(org.apache.xmlbeans.XmlInt dia);
    
    /**
     * Gets the "diaFim" element
     */
    int getDiaFim();
    
    /**
     * Gets (as xml) the "diaFim" element
     */
    org.apache.xmlbeans.XmlInt xgetDiaFim();
    
    /**
     * Sets the "diaFim" element
     */
    void setDiaFim(int diaFim);
    
    /**
     * Sets (as xml) the "diaFim" element
     */
    void xsetDiaFim(org.apache.xmlbeans.XmlInt diaFim);
    
    /**
     * Gets the "mes" element
     */
    int getMes();
    
    /**
     * Gets (as xml) the "mes" element
     */
    org.apache.xmlbeans.XmlInt xgetMes();
    
    /**
     * Sets the "mes" element
     */
    void setMes(int mes);
    
    /**
     * Sets (as xml) the "mes" element
     */
    void xsetMes(org.apache.xmlbeans.XmlInt mes);
    
    /**
     * Gets the "mesFim" element
     */
    int getMesFim();
    
    /**
     * Gets (as xml) the "mesFim" element
     */
    org.apache.xmlbeans.XmlInt xgetMesFim();
    
    /**
     * Sets the "mesFim" element
     */
    void setMesFim(int mesFim);
    
    /**
     * Sets (as xml) the "mesFim" element
     */
    void xsetMesFim(org.apache.xmlbeans.XmlInt mesFim);
    
    /**
     * Gets the "oid" element
     */
    long getOid();
    
    /**
     * Gets (as xml) the "oid" element
     */
    org.apache.xmlbeans.XmlLong xgetOid();
    
    /**
     * Sets the "oid" element
     */
    void setOid(long oid);
    
    /**
     * Sets (as xml) the "oid" element
     */
    void xsetOid(org.apache.xmlbeans.XmlLong oid);
    
    /**
     * Gets the "oidSerie" element
     */
    long getOidSerie();
    
    /**
     * Gets (as xml) the "oidSerie" element
     */
    org.apache.xmlbeans.XmlLong xgetOidSerie();
    
    /**
     * Sets the "oidSerie" element
     */
    void setOidSerie(long oidSerie);
    
    /**
     * Sets (as xml) the "oidSerie" element
     */
    void xsetOidSerie(org.apache.xmlbeans.XmlLong oidSerie);
    
    /**
     * Gets the "svalor" element
     */
    org.xmlsoap.schemas.soap.encoding.String getSvalor();
    
    /**
     * Tests for nil "svalor" element
     */
    boolean isNilSvalor();
    
    /**
     * Sets the "svalor" element
     */
    void setSvalor(org.xmlsoap.schemas.soap.encoding.String svalor);
    
    /**
     * Appends and returns a new empty "svalor" element
     */
    org.xmlsoap.schemas.soap.encoding.String addNewSvalor();
    
    /**
     * Nils the "svalor" element
     */
    void setNilSvalor();
    
    /**
     * Gets the "valor" element
     */
    org.xmlsoap.schemas.soap.encoding.Decimal getValor();
    
    /**
     * Tests for nil "valor" element
     */
    boolean isNilValor();
    
    /**
     * Sets the "valor" element
     */
    void setValor(org.xmlsoap.schemas.soap.encoding.Decimal valor);
    
    /**
     * Appends and returns a new empty "valor" element
     */
    org.xmlsoap.schemas.soap.encoding.Decimal addNewValor();
    
    /**
     * Nils the "valor" element
     */
    void setNilValor();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static br.gov.bcb.pec.sgs.casosdeuso.ws.comum.WSValorSerieVO newInstance() {
          return (br.gov.bcb.pec.sgs.casosdeuso.ws.comum.WSValorSerieVO) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static br.gov.bcb.pec.sgs.casosdeuso.ws.comum.WSValorSerieVO newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (br.gov.bcb.pec.sgs.casosdeuso.ws.comum.WSValorSerieVO) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static br.gov.bcb.pec.sgs.casosdeuso.ws.comum.WSValorSerieVO parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (br.gov.bcb.pec.sgs.casosdeuso.ws.comum.WSValorSerieVO) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static br.gov.bcb.pec.sgs.casosdeuso.ws.comum.WSValorSerieVO parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (br.gov.bcb.pec.sgs.casosdeuso.ws.comum.WSValorSerieVO) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static br.gov.bcb.pec.sgs.casosdeuso.ws.comum.WSValorSerieVO parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.gov.bcb.pec.sgs.casosdeuso.ws.comum.WSValorSerieVO) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static br.gov.bcb.pec.sgs.casosdeuso.ws.comum.WSValorSerieVO parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.gov.bcb.pec.sgs.casosdeuso.ws.comum.WSValorSerieVO) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static br.gov.bcb.pec.sgs.casosdeuso.ws.comum.WSValorSerieVO parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.gov.bcb.pec.sgs.casosdeuso.ws.comum.WSValorSerieVO) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static br.gov.bcb.pec.sgs.casosdeuso.ws.comum.WSValorSerieVO parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.gov.bcb.pec.sgs.casosdeuso.ws.comum.WSValorSerieVO) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static br.gov.bcb.pec.sgs.casosdeuso.ws.comum.WSValorSerieVO parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.gov.bcb.pec.sgs.casosdeuso.ws.comum.WSValorSerieVO) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static br.gov.bcb.pec.sgs.casosdeuso.ws.comum.WSValorSerieVO parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.gov.bcb.pec.sgs.casosdeuso.ws.comum.WSValorSerieVO) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static br.gov.bcb.pec.sgs.casosdeuso.ws.comum.WSValorSerieVO parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.gov.bcb.pec.sgs.casosdeuso.ws.comum.WSValorSerieVO) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static br.gov.bcb.pec.sgs.casosdeuso.ws.comum.WSValorSerieVO parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.gov.bcb.pec.sgs.casosdeuso.ws.comum.WSValorSerieVO) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static br.gov.bcb.pec.sgs.casosdeuso.ws.comum.WSValorSerieVO parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (br.gov.bcb.pec.sgs.casosdeuso.ws.comum.WSValorSerieVO) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static br.gov.bcb.pec.sgs.casosdeuso.ws.comum.WSValorSerieVO parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (br.gov.bcb.pec.sgs.casosdeuso.ws.comum.WSValorSerieVO) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static br.gov.bcb.pec.sgs.casosdeuso.ws.comum.WSValorSerieVO parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (br.gov.bcb.pec.sgs.casosdeuso.ws.comum.WSValorSerieVO) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static br.gov.bcb.pec.sgs.casosdeuso.ws.comum.WSValorSerieVO parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (br.gov.bcb.pec.sgs.casosdeuso.ws.comum.WSValorSerieVO) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static br.gov.bcb.pec.sgs.casosdeuso.ws.comum.WSValorSerieVO parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (br.gov.bcb.pec.sgs.casosdeuso.ws.comum.WSValorSerieVO) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static br.gov.bcb.pec.sgs.casosdeuso.ws.comum.WSValorSerieVO parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (br.gov.bcb.pec.sgs.casosdeuso.ws.comum.WSValorSerieVO) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
