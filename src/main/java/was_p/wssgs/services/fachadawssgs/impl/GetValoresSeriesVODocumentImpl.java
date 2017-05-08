/*
 * An XML document type.
 * Localname: getValoresSeriesVO
 * Namespace: https://was-p/wssgs/services/FachadaWSSGS
 * Java type: was_p.wssgs.services.fachadawssgs.GetValoresSeriesVODocument
 *
 * Automatically generated - do not modify.
 */
package was_p.wssgs.services.fachadawssgs.impl;
/**
 * A document containing one getValoresSeriesVO(@https://was-p/wssgs/services/FachadaWSSGS) element.
 *
 * This is a complex type.
 */
public class GetValoresSeriesVODocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements was_p.wssgs.services.fachadawssgs.GetValoresSeriesVODocument
{
    private static final long serialVersionUID = 1L;
    
    public GetValoresSeriesVODocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETVALORESSERIESVO$0 = 
        new javax.xml.namespace.QName("https://was-p/wssgs/services/FachadaWSSGS", "getValoresSeriesVO");
    
    
    /**
     * Gets the "getValoresSeriesVO" element
     */
    public was_p.wssgs.services.fachadawssgs.GetValoresSeriesVODocument.GetValoresSeriesVO getGetValoresSeriesVO()
    {
        synchronized (monitor())
        {
            check_orphaned();
            was_p.wssgs.services.fachadawssgs.GetValoresSeriesVODocument.GetValoresSeriesVO target = null;
            target = (was_p.wssgs.services.fachadawssgs.GetValoresSeriesVODocument.GetValoresSeriesVO)get_store().find_element_user(GETVALORESSERIESVO$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "getValoresSeriesVO" element
     */
    public void setGetValoresSeriesVO(was_p.wssgs.services.fachadawssgs.GetValoresSeriesVODocument.GetValoresSeriesVO getValoresSeriesVO)
    {
        generatedSetterHelperImpl(getValoresSeriesVO, GETVALORESSERIESVO$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "getValoresSeriesVO" element
     */
    public was_p.wssgs.services.fachadawssgs.GetValoresSeriesVODocument.GetValoresSeriesVO addNewGetValoresSeriesVO()
    {
        synchronized (monitor())
        {
            check_orphaned();
            was_p.wssgs.services.fachadawssgs.GetValoresSeriesVODocument.GetValoresSeriesVO target = null;
            target = (was_p.wssgs.services.fachadawssgs.GetValoresSeriesVODocument.GetValoresSeriesVO)get_store().add_element_user(GETVALORESSERIESVO$0);
            return target;
        }
    }
    /**
     * An XML getValoresSeriesVO(@https://was-p/wssgs/services/FachadaWSSGS).
     *
     * This is a complex type.
     */
    public static class GetValoresSeriesVOImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements was_p.wssgs.services.fachadawssgs.GetValoresSeriesVODocument.GetValoresSeriesVO
    {
        private static final long serialVersionUID = 1L;
        
        public GetValoresSeriesVOImpl(org.apache.xmlbeans.SchemaType sType)
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
