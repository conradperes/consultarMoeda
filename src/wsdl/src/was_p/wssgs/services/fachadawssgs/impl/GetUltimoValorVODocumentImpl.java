/*
 * An XML document type.
 * Localname: getUltimoValorVO
 * Namespace: https://was-p/wssgs/services/FachadaWSSGS
 * Java type: was_p.wssgs.services.fachadawssgs.GetUltimoValorVODocument
 *
 * Automatically generated - do not modify.
 */
package was_p.wssgs.services.fachadawssgs.impl;
/**
 * A document containing one getUltimoValorVO(@https://was-p/wssgs/services/FachadaWSSGS) element.
 *
 * This is a complex type.
 */
public class GetUltimoValorVODocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements was_p.wssgs.services.fachadawssgs.GetUltimoValorVODocument
{
    private static final long serialVersionUID = 1L;
    
    public GetUltimoValorVODocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETULTIMOVALORVO$0 = 
        new javax.xml.namespace.QName("https://was-p/wssgs/services/FachadaWSSGS", "getUltimoValorVO");
    
    
    /**
     * Gets the "getUltimoValorVO" element
     */
    public was_p.wssgs.services.fachadawssgs.GetUltimoValorVODocument.GetUltimoValorVO getGetUltimoValorVO()
    {
        synchronized (monitor())
        {
            check_orphaned();
            was_p.wssgs.services.fachadawssgs.GetUltimoValorVODocument.GetUltimoValorVO target = null;
            target = (was_p.wssgs.services.fachadawssgs.GetUltimoValorVODocument.GetUltimoValorVO)get_store().find_element_user(GETULTIMOVALORVO$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "getUltimoValorVO" element
     */
    public void setGetUltimoValorVO(was_p.wssgs.services.fachadawssgs.GetUltimoValorVODocument.GetUltimoValorVO getUltimoValorVO)
    {
        generatedSetterHelperImpl(getUltimoValorVO, GETULTIMOVALORVO$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "getUltimoValorVO" element
     */
    public was_p.wssgs.services.fachadawssgs.GetUltimoValorVODocument.GetUltimoValorVO addNewGetUltimoValorVO()
    {
        synchronized (monitor())
        {
            check_orphaned();
            was_p.wssgs.services.fachadawssgs.GetUltimoValorVODocument.GetUltimoValorVO target = null;
            target = (was_p.wssgs.services.fachadawssgs.GetUltimoValorVODocument.GetUltimoValorVO)get_store().add_element_user(GETULTIMOVALORVO$0);
            return target;
        }
    }
    /**
     * An XML getUltimoValorVO(@https://was-p/wssgs/services/FachadaWSSGS).
     *
     * This is a complex type.
     */
    public static class GetUltimoValorVOImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements was_p.wssgs.services.fachadawssgs.GetUltimoValorVODocument.GetUltimoValorVO
    {
        private static final long serialVersionUID = 1L;
        
        public GetUltimoValorVOImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName IN0$0 = 
            new javax.xml.namespace.QName("", "in0");
        
        
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
    }
}
