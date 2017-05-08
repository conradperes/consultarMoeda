/*
 * An XML document type.
 * Localname: getValor
 * Namespace: http://publico.ws.casosdeuso.sgs.pec.bcb.gov.br
 * Java type: br.gov.bcb.pec.sgs.casosdeuso.ws.publico.GetValorDocument
 *
 * Automatically generated - do not modify.
 */
package br.gov.bcb.pec.sgs.casosdeuso.ws.publico.impl;
/**
 * A document containing one getValor(@http://publico.ws.casosdeuso.sgs.pec.bcb.gov.br) element.
 *
 * This is a complex type.
 */
public class GetValorDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.gov.bcb.pec.sgs.casosdeuso.ws.publico.GetValorDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetValorDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETVALOR$0 = 
        new javax.xml.namespace.QName("http://publico.ws.casosdeuso.sgs.pec.bcb.gov.br", "getValor");
    
    
    /**
     * Gets the "getValor" element
     */
    public br.gov.bcb.pec.sgs.casosdeuso.ws.publico.GetValorDocument.GetValor getGetValor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.gov.bcb.pec.sgs.casosdeuso.ws.publico.GetValorDocument.GetValor target = null;
            target = (br.gov.bcb.pec.sgs.casosdeuso.ws.publico.GetValorDocument.GetValor)get_store().find_element_user(GETVALOR$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "getValor" element
     */
    public void setGetValor(br.gov.bcb.pec.sgs.casosdeuso.ws.publico.GetValorDocument.GetValor getValor)
    {
        generatedSetterHelperImpl(getValor, GETVALOR$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "getValor" element
     */
    public br.gov.bcb.pec.sgs.casosdeuso.ws.publico.GetValorDocument.GetValor addNewGetValor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.gov.bcb.pec.sgs.casosdeuso.ws.publico.GetValorDocument.GetValor target = null;
            target = (br.gov.bcb.pec.sgs.casosdeuso.ws.publico.GetValorDocument.GetValor)get_store().add_element_user(GETVALOR$0);
            return target;
        }
    }
    /**
     * An XML getValor(@http://publico.ws.casosdeuso.sgs.pec.bcb.gov.br).
     *
     * This is a complex type.
     */
    public static class GetValorImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.gov.bcb.pec.sgs.casosdeuso.ws.publico.GetValorDocument.GetValor
    {
        private static final long serialVersionUID = 1L;
        
        public GetValorImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName IN0$0 = 
            new javax.xml.namespace.QName("", "in0");
        private static final javax.xml.namespace.QName IN1$2 = 
            new javax.xml.namespace.QName("", "in1");
        
        
        /**
         * Gets the "in0" element
         */
        public long getIn0()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IN0$0, 0);
                if (target == null)
                {
                    return 0L;
                }
                return target.getLongValue();
            }
        }
        
        /**
         * Gets (as xml) the "in0" element
         */
        public org.apache.xmlbeans.XmlLong xgetIn0()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlLong target = null;
                target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(IN0$0, 0);
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
                org.apache.xmlbeans.XmlLong target = null;
                target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(IN0$0, 0);
                if (target == null) return false;
                return target.isNil();
            }
        }
        
        /**
         * Sets the "in0" element
         */
        public void setIn0(long in0)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IN0$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(IN0$0);
                }
                target.setLongValue(in0);
            }
        }
        
        /**
         * Sets (as xml) the "in0" element
         */
        public void xsetIn0(org.apache.xmlbeans.XmlLong in0)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlLong target = null;
                target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(IN0$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlLong)get_store().add_element_user(IN0$0);
                }
                target.set(in0);
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
                org.apache.xmlbeans.XmlLong target = null;
                target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(IN0$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlLong)get_store().add_element_user(IN0$0);
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
    }
}
