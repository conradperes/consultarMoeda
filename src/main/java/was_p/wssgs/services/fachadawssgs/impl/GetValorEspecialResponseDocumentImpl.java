/*
 * An XML document type.
 * Localname: getValorEspecialResponse
 * Namespace: https://was-p/wssgs/services/FachadaWSSGS
 * Java type: was_p.wssgs.services.fachadawssgs.GetValorEspecialResponseDocument
 *
 * Automatically generated - do not modify.
 */
package was_p.wssgs.services.fachadawssgs.impl;
/**
 * A document containing one getValorEspecialResponse(@https://was-p/wssgs/services/FachadaWSSGS) element.
 *
 * This is a complex type.
 */
public class GetValorEspecialResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements was_p.wssgs.services.fachadawssgs.GetValorEspecialResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetValorEspecialResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETVALORESPECIALRESPONSE$0 = 
        new javax.xml.namespace.QName("https://was-p/wssgs/services/FachadaWSSGS", "getValorEspecialResponse");
    
    
    /**
     * Gets the "getValorEspecialResponse" element
     */
    public was_p.wssgs.services.fachadawssgs.GetValorEspecialResponseDocument.GetValorEspecialResponse getGetValorEspecialResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            was_p.wssgs.services.fachadawssgs.GetValorEspecialResponseDocument.GetValorEspecialResponse target = null;
            target = (was_p.wssgs.services.fachadawssgs.GetValorEspecialResponseDocument.GetValorEspecialResponse)get_store().find_element_user(GETVALORESPECIALRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "getValorEspecialResponse" element
     */
    public void setGetValorEspecialResponse(was_p.wssgs.services.fachadawssgs.GetValorEspecialResponseDocument.GetValorEspecialResponse getValorEspecialResponse)
    {
        generatedSetterHelperImpl(getValorEspecialResponse, GETVALORESPECIALRESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "getValorEspecialResponse" element
     */
    public was_p.wssgs.services.fachadawssgs.GetValorEspecialResponseDocument.GetValorEspecialResponse addNewGetValorEspecialResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            was_p.wssgs.services.fachadawssgs.GetValorEspecialResponseDocument.GetValorEspecialResponse target = null;
            target = (was_p.wssgs.services.fachadawssgs.GetValorEspecialResponseDocument.GetValorEspecialResponse)get_store().add_element_user(GETVALORESPECIALRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML getValorEspecialResponse(@https://was-p/wssgs/services/FachadaWSSGS).
     *
     * This is a complex type.
     */
    public static class GetValorEspecialResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements was_p.wssgs.services.fachadawssgs.GetValorEspecialResponseDocument.GetValorEspecialResponse
    {
        private static final long serialVersionUID = 1L;
        
        public GetValorEspecialResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName GETVALORESPECIALRETURN$0 = 
            new javax.xml.namespace.QName("", "getValorEspecialReturn");
        
        
        /**
         * Gets the "getValorEspecialReturn" element
         */
        public org.xmlsoap.schemas.soap.encoding.Decimal getGetValorEspecialReturn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.xmlsoap.schemas.soap.encoding.Decimal target = null;
                target = (org.xmlsoap.schemas.soap.encoding.Decimal)get_store().find_element_user(GETVALORESPECIALRETURN$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Tests for nil "getValorEspecialReturn" element
         */
        public boolean isNilGetValorEspecialReturn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.xmlsoap.schemas.soap.encoding.Decimal target = null;
                target = (org.xmlsoap.schemas.soap.encoding.Decimal)get_store().find_element_user(GETVALORESPECIALRETURN$0, 0);
                if (target == null) return false;
                return target.isNil();
            }
        }
        
        /**
         * Sets the "getValorEspecialReturn" element
         */
        public void setGetValorEspecialReturn(org.xmlsoap.schemas.soap.encoding.Decimal getValorEspecialReturn)
        {
            generatedSetterHelperImpl(getValorEspecialReturn, GETVALORESPECIALRETURN$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "getValorEspecialReturn" element
         */
        public org.xmlsoap.schemas.soap.encoding.Decimal addNewGetValorEspecialReturn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.xmlsoap.schemas.soap.encoding.Decimal target = null;
                target = (org.xmlsoap.schemas.soap.encoding.Decimal)get_store().add_element_user(GETVALORESPECIALRETURN$0);
                return target;
            }
        }
        
        /**
         * Nils the "getValorEspecialReturn" element
         */
        public void setNilGetValorEspecialReturn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.xmlsoap.schemas.soap.encoding.Decimal target = null;
                target = (org.xmlsoap.schemas.soap.encoding.Decimal)get_store().find_element_user(GETVALORESPECIALRETURN$0, 0);
                if (target == null)
                {
                    target = (org.xmlsoap.schemas.soap.encoding.Decimal)get_store().add_element_user(GETVALORESPECIALRETURN$0);
                }
                target.setNil();
            }
        }
    }
}
