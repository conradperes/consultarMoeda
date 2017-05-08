/*
 * An XML document type.
 * Localname: getUltimosValoresSerieVO
 * Namespace: http://publico.ws.casosdeuso.sgs.pec.bcb.gov.br
 * Java type: br.gov.bcb.pec.sgs.casosdeuso.ws.publico.GetUltimosValoresSerieVODocument
 *
 * Automatically generated - do not modify.
 */
package br.gov.bcb.pec.sgs.casosdeuso.ws.publico.impl;
/**
 * A document containing one getUltimosValoresSerieVO(@http://publico.ws.casosdeuso.sgs.pec.bcb.gov.br) element.
 *
 * This is a complex type.
 */
public class GetUltimosValoresSerieVODocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.gov.bcb.pec.sgs.casosdeuso.ws.publico.GetUltimosValoresSerieVODocument
{
    private static final long serialVersionUID = 1L;
    
    public GetUltimosValoresSerieVODocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETULTIMOSVALORESSERIEVO$0 = 
        new javax.xml.namespace.QName("http://publico.ws.casosdeuso.sgs.pec.bcb.gov.br", "getUltimosValoresSerieVO");
    
    
    /**
     * Gets the "getUltimosValoresSerieVO" element
     */
    public br.gov.bcb.pec.sgs.casosdeuso.ws.publico.GetUltimosValoresSerieVODocument.GetUltimosValoresSerieVO getGetUltimosValoresSerieVO()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.gov.bcb.pec.sgs.casosdeuso.ws.publico.GetUltimosValoresSerieVODocument.GetUltimosValoresSerieVO target = null;
            target = (br.gov.bcb.pec.sgs.casosdeuso.ws.publico.GetUltimosValoresSerieVODocument.GetUltimosValoresSerieVO)get_store().find_element_user(GETULTIMOSVALORESSERIEVO$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "getUltimosValoresSerieVO" element
     */
    public void setGetUltimosValoresSerieVO(br.gov.bcb.pec.sgs.casosdeuso.ws.publico.GetUltimosValoresSerieVODocument.GetUltimosValoresSerieVO getUltimosValoresSerieVO)
    {
        generatedSetterHelperImpl(getUltimosValoresSerieVO, GETULTIMOSVALORESSERIEVO$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "getUltimosValoresSerieVO" element
     */
    public br.gov.bcb.pec.sgs.casosdeuso.ws.publico.GetUltimosValoresSerieVODocument.GetUltimosValoresSerieVO addNewGetUltimosValoresSerieVO()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.gov.bcb.pec.sgs.casosdeuso.ws.publico.GetUltimosValoresSerieVODocument.GetUltimosValoresSerieVO target = null;
            target = (br.gov.bcb.pec.sgs.casosdeuso.ws.publico.GetUltimosValoresSerieVODocument.GetUltimosValoresSerieVO)get_store().add_element_user(GETULTIMOSVALORESSERIEVO$0);
            return target;
        }
    }
    /**
     * An XML getUltimosValoresSerieVO(@http://publico.ws.casosdeuso.sgs.pec.bcb.gov.br).
     *
     * This is a complex type.
     */
    public static class GetUltimosValoresSerieVOImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.gov.bcb.pec.sgs.casosdeuso.ws.publico.GetUltimosValoresSerieVODocument.GetUltimosValoresSerieVO
    {
        private static final long serialVersionUID = 1L;
        
        public GetUltimosValoresSerieVOImpl(org.apache.xmlbeans.SchemaType sType)
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
        public long getIn1()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IN1$2, 0);
                if (target == null)
                {
                    return 0L;
                }
                return target.getLongValue();
            }
        }
        
        /**
         * Gets (as xml) the "in1" element
         */
        public org.apache.xmlbeans.XmlLong xgetIn1()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlLong target = null;
                target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(IN1$2, 0);
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
                org.apache.xmlbeans.XmlLong target = null;
                target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(IN1$2, 0);
                if (target == null) return false;
                return target.isNil();
            }
        }
        
        /**
         * Sets the "in1" element
         */
        public void setIn1(long in1)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IN1$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(IN1$2);
                }
                target.setLongValue(in1);
            }
        }
        
        /**
         * Sets (as xml) the "in1" element
         */
        public void xsetIn1(org.apache.xmlbeans.XmlLong in1)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlLong target = null;
                target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(IN1$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlLong)get_store().add_element_user(IN1$2);
                }
                target.set(in1);
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
                org.apache.xmlbeans.XmlLong target = null;
                target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(IN1$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlLong)get_store().add_element_user(IN1$2);
                }
                target.setNil();
            }
        }
    }
}
