/*
 * An XML document type.
 * Localname: getValoresSeriesXML
 * Namespace: http://publico.ws.casosdeuso.sgs.pec.bcb.gov.br
 * Java type: br.gov.bcb.pec.sgs.casosdeuso.ws.publico.GetValoresSeriesXMLDocument
 *
 * Automatically generated - do not modify.
 */
package br.gov.bcb.pec.sgs.casosdeuso.ws.publico.impl;
/**
 * A document containing one getValoresSeriesXML(@http://publico.ws.casosdeuso.sgs.pec.bcb.gov.br) element.
 *
 * This is a complex type.
 */
public class GetValoresSeriesXMLDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.gov.bcb.pec.sgs.casosdeuso.ws.publico.GetValoresSeriesXMLDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetValoresSeriesXMLDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETVALORESSERIESXML$0 = 
        new javax.xml.namespace.QName("http://publico.ws.casosdeuso.sgs.pec.bcb.gov.br", "getValoresSeriesXML");
    
    
    /**
     * Gets the "getValoresSeriesXML" element
     */
    public br.gov.bcb.pec.sgs.casosdeuso.ws.publico.GetValoresSeriesXMLDocument.GetValoresSeriesXML getGetValoresSeriesXML()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.gov.bcb.pec.sgs.casosdeuso.ws.publico.GetValoresSeriesXMLDocument.GetValoresSeriesXML target = null;
            target = (br.gov.bcb.pec.sgs.casosdeuso.ws.publico.GetValoresSeriesXMLDocument.GetValoresSeriesXML)get_store().find_element_user(GETVALORESSERIESXML$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "getValoresSeriesXML" element
     */
    public void setGetValoresSeriesXML(br.gov.bcb.pec.sgs.casosdeuso.ws.publico.GetValoresSeriesXMLDocument.GetValoresSeriesXML getValoresSeriesXML)
    {
        generatedSetterHelperImpl(getValoresSeriesXML, GETVALORESSERIESXML$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "getValoresSeriesXML" element
     */
    public br.gov.bcb.pec.sgs.casosdeuso.ws.publico.GetValoresSeriesXMLDocument.GetValoresSeriesXML addNewGetValoresSeriesXML()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.gov.bcb.pec.sgs.casosdeuso.ws.publico.GetValoresSeriesXMLDocument.GetValoresSeriesXML target = null;
            target = (br.gov.bcb.pec.sgs.casosdeuso.ws.publico.GetValoresSeriesXMLDocument.GetValoresSeriesXML)get_store().add_element_user(GETVALORESSERIESXML$0);
            return target;
        }
    }
    /**
     * An XML getValoresSeriesXML(@http://publico.ws.casosdeuso.sgs.pec.bcb.gov.br).
     *
     * This is a complex type.
     */
    public static class GetValoresSeriesXMLImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.gov.bcb.pec.sgs.casosdeuso.ws.publico.GetValoresSeriesXMLDocument.GetValoresSeriesXML
    {
        private static final long serialVersionUID = 1L;
        
        public GetValoresSeriesXMLImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName IN0$0 = 
            new javax.xml.namespace.QName("", "in0");
        private static final javax.xml.namespace.QName IN1$2 = 
            new javax.xml.namespace.QName("", "in1");
        private static final javax.xml.namespace.QName IN2$4 = 
            new javax.xml.namespace.QName("", "in2");
        
        
        /**
         * Gets the "in0" element
         */
        public defaultnamespace.ArrayOfflong getIn0()
        {
            synchronized (monitor())
            {
                check_orphaned();
                defaultnamespace.ArrayOfflong target = null;
                target = (defaultnamespace.ArrayOfflong)get_store().find_element_user(IN0$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Tests for nil "in0" element
         */
        public boolean isNilIn0()
        {
            synchronized (monitor())
            {
                check_orphaned();
                defaultnamespace.ArrayOfflong target = null;
                target = (defaultnamespace.ArrayOfflong)get_store().find_element_user(IN0$0, 0);
                if (target == null) return false;
                return target.isNil();
            }
        }
        
        /**
         * Sets the "in0" element
         */
        public void setIn0(defaultnamespace.ArrayOfflong in0)
        {
            generatedSetterHelperImpl(in0, IN0$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "in0" element
         */
        public defaultnamespace.ArrayOfflong addNewIn0()
        {
            synchronized (monitor())
            {
                check_orphaned();
                defaultnamespace.ArrayOfflong target = null;
                target = (defaultnamespace.ArrayOfflong)get_store().add_element_user(IN0$0);
                return target;
            }
        }
        
        /**
         * Nils the "in0" element
         */
        public void setNilIn0()
        {
            synchronized (monitor())
            {
                check_orphaned();
                defaultnamespace.ArrayOfflong target = null;
                target = (defaultnamespace.ArrayOfflong)get_store().find_element_user(IN0$0, 0);
                if (target == null)
                {
                    target = (defaultnamespace.ArrayOfflong)get_store().add_element_user(IN0$0);
                }
                target.setNil();
            }
        }
        
        /**
         * Gets the "in1" element
         */
        public org.xmlsoap.schemas.soap.encoding.String getIn1()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.xmlsoap.schemas.soap.encoding.String target = null;
                target = (org.xmlsoap.schemas.soap.encoding.String)get_store().find_element_user(IN1$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Tests for nil "in1" element
         */
        public boolean isNilIn1()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.xmlsoap.schemas.soap.encoding.String target = null;
                target = (org.xmlsoap.schemas.soap.encoding.String)get_store().find_element_user(IN1$2, 0);
                if (target == null) return false;
                return target.isNil();
            }
        }
        
        /**
         * Sets the "in1" element
         */
        public void setIn1(org.xmlsoap.schemas.soap.encoding.String in1)
        {
            generatedSetterHelperImpl(in1, IN1$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "in1" element
         */
        public org.xmlsoap.schemas.soap.encoding.String addNewIn1()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.xmlsoap.schemas.soap.encoding.String target = null;
                target = (org.xmlsoap.schemas.soap.encoding.String)get_store().add_element_user(IN1$2);
                return target;
            }
        }
        
        /**
         * Nils the "in1" element
         */
        public void setNilIn1()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.xmlsoap.schemas.soap.encoding.String target = null;
                target = (org.xmlsoap.schemas.soap.encoding.String)get_store().find_element_user(IN1$2, 0);
                if (target == null)
                {
                    target = (org.xmlsoap.schemas.soap.encoding.String)get_store().add_element_user(IN1$2);
                }
                target.setNil();
            }
        }
        
        /**
         * Gets the "in2" element
         */
        public org.xmlsoap.schemas.soap.encoding.String getIn2()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.xmlsoap.schemas.soap.encoding.String target = null;
                target = (org.xmlsoap.schemas.soap.encoding.String)get_store().find_element_user(IN2$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Tests for nil "in2" element
         */
        public boolean isNilIn2()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.xmlsoap.schemas.soap.encoding.String target = null;
                target = (org.xmlsoap.schemas.soap.encoding.String)get_store().find_element_user(IN2$4, 0);
                if (target == null) return false;
                return target.isNil();
            }
        }
        
        /**
         * Sets the "in2" element
         */
        public void setIn2(org.xmlsoap.schemas.soap.encoding.String in2)
        {
            generatedSetterHelperImpl(in2, IN2$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "in2" element
         */
        public org.xmlsoap.schemas.soap.encoding.String addNewIn2()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.xmlsoap.schemas.soap.encoding.String target = null;
                target = (org.xmlsoap.schemas.soap.encoding.String)get_store().add_element_user(IN2$4);
                return target;
            }
        }
        
        /**
         * Nils the "in2" element
         */
        public void setNilIn2()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.xmlsoap.schemas.soap.encoding.String target = null;
                target = (org.xmlsoap.schemas.soap.encoding.String)get_store().find_element_user(IN2$4, 0);
                if (target == null)
                {
                    target = (org.xmlsoap.schemas.soap.encoding.String)get_store().add_element_user(IN2$4);
                }
                target.setNil();
            }
        }
    }
}
