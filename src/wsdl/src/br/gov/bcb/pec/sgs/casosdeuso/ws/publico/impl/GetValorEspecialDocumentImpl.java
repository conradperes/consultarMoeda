/*
 * An XML document type.
 * Localname: getValorEspecial
 * Namespace: http://publico.ws.casosdeuso.sgs.pec.bcb.gov.br
 * Java type: br.gov.bcb.pec.sgs.casosdeuso.ws.publico.GetValorEspecialDocument
 *
 * Automatically generated - do not modify.
 */
package br.gov.bcb.pec.sgs.casosdeuso.ws.publico.impl;
/**
 * A document containing one getValorEspecial(@http://publico.ws.casosdeuso.sgs.pec.bcb.gov.br) element.
 *
 * This is a complex type.
 */
public class GetValorEspecialDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.gov.bcb.pec.sgs.casosdeuso.ws.publico.GetValorEspecialDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetValorEspecialDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETVALORESPECIAL$0 = 
        new javax.xml.namespace.QName("http://publico.ws.casosdeuso.sgs.pec.bcb.gov.br", "getValorEspecial");
    
    
    /**
     * Gets the "getValorEspecial" element
     */
    public br.gov.bcb.pec.sgs.casosdeuso.ws.publico.GetValorEspecialDocument.GetValorEspecial getGetValorEspecial()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.gov.bcb.pec.sgs.casosdeuso.ws.publico.GetValorEspecialDocument.GetValorEspecial target = null;
            target = (br.gov.bcb.pec.sgs.casosdeuso.ws.publico.GetValorEspecialDocument.GetValorEspecial)get_store().find_element_user(GETVALORESPECIAL$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "getValorEspecial" element
     */
    public void setGetValorEspecial(br.gov.bcb.pec.sgs.casosdeuso.ws.publico.GetValorEspecialDocument.GetValorEspecial getValorEspecial)
    {
        generatedSetterHelperImpl(getValorEspecial, GETVALORESPECIAL$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "getValorEspecial" element
     */
    public br.gov.bcb.pec.sgs.casosdeuso.ws.publico.GetValorEspecialDocument.GetValorEspecial addNewGetValorEspecial()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.gov.bcb.pec.sgs.casosdeuso.ws.publico.GetValorEspecialDocument.GetValorEspecial target = null;
            target = (br.gov.bcb.pec.sgs.casosdeuso.ws.publico.GetValorEspecialDocument.GetValorEspecial)get_store().add_element_user(GETVALORESPECIAL$0);
            return target;
        }
    }
    /**
     * An XML getValorEspecial(@http://publico.ws.casosdeuso.sgs.pec.bcb.gov.br).
     *
     * This is a complex type.
     */
    public static class GetValorEspecialImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.gov.bcb.pec.sgs.casosdeuso.ws.publico.GetValorEspecialDocument.GetValorEspecial
    {
        private static final long serialVersionUID = 1L;
        
        public GetValorEspecialImpl(org.apache.xmlbeans.SchemaType sType)
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
